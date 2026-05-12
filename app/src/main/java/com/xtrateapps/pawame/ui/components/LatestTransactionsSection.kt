package com.xtrateapps.pawame.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun LatestTransactionsSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Latest Transactions",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        // Aquí puedes simular una lista o usar datos reales luego
        TransactionItem(title = "Restaurant", date = "May 5th • 14:28", amount = "-$124.20", icon = Icons.Default.Restaurant)
        TransactionItem(title = "Public Transport", date = "May 3rd • 22:56", amount = "-$5.00", icon = Icons.Default.DirectionsBus)
        TransactionItem(title = "Utilities", date = "May 2nd • 08:02", amount = "-$213.00", icon = Icons.Default.Receipt)
    }
}


