package com.xtrateapps.pawame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.xtrateapps.pawame.ui.components.CreditCardSection
import com.xtrateapps.pawame.ui.components.HeaderSection
import com.xtrateapps.pawame.ui.components.LatestTransactionsSection
import com.xtrateapps.pawame.ui.components.QuickActionsSection
import com.xtrateapps.pawame.ui.theme.PawameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PawameTheme {
                PawameApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun PawameApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach { destination ->
                item(
                    icon = { Icon(destination.icon, contentDescription = destination.label) },
                    label = { Text(destination.label) },
                    selected = destination == currentDestination,
                    onClick = { currentDestination = destination }
                )
            }
        }
    ) {
        // --- AQUÍ VA EL CONTENIDO ---
        // Usamos un Scaffold genérico para manejar los paddings del sistema
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                // Dependiendo de 'currentDestination', mostramos una función u otra
                when (currentDestination) {
                    AppDestinations.HOME -> HomeScreen() // <--- LLAMAS A TU NUEVA PANTALLA
                    AppDestinations.FAVORITES -> Text("Pantalla de Favoritos")
                    AppDestinations.PROFILE -> Text("Tu Perfil")
                }
            }
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Home", Icons.Default.Home),
    FAVORITES("Favorites", Icons.Default.Favorite),
    PROFILE("Profile", Icons.Default.AccountBox),
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PawameTheme {
        Greeting("Android")
    }
}

//Nuevas
@Composable
fun HomeScreen() {
    // Aquí es donde metemos toda la magia del diseño de Dribbble
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)) // Fondo gris clarito
            .padding(horizontal = 20.dp)
    ) {
        item { HeaderSection() } // Tu saludo
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { CreditCardSection() } // Tu tarjeta negra
        item { QuickActionsSection() } // Botones Send/Request
        item { LatestTransactionsSection() } // Lista de gastos
    }
}