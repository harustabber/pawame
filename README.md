# Pawame - Banking App Interface (Android / Jetpack Compose)

¡Hola! Este es un proyecto **Demo de Interfaz** diseñado para demostrar el dominio de **Jetpack Compose**, **Material 3** y arquitecturas adaptativas en Android nativo. 

El objetivo principal de este repositorio es servir como pieza de portfolio, mostrando la capacidad de traducir diseños complejos (Pixel Perfect) desde Dribbble a código funcional y moderno.

## 🚀 Tecnologías y Herramientas
* **Kotlin**: Lenguaje principal.
* **Jetpack Compose**: UI declarativa moderna.
* **NavigationSuiteScaffold**: Implementación de navegación adaptativa (Mobile / Tablet / Desktop).
* **Material 3**: Estándares de diseño de última generación.
* **Iconos Extendidos**: Uso de la librería `material-icons-extended` para una experiencia visual rica.

## ✨ Características de la Interfaz
* **Navegación Inteligente**: Menú inferior que se adapta según el dispositivo.
* **Custom Credit Card**: Diseño de tarjeta de crédito premium con detalles de saldo y numeración.
* **Sección de Acciones Rápidas**: Botones de interacción con elevación y sombras suaves.
* **Historial de Transacciones**: Lista detallada de movimientos con iconos categorizados y estados visuales (positivo/negativo).

## 📂 Estructura del Proyecto
* `MainActivity.kt`: Punto de entrada con la lógica de `NavigationSuiteScaffold`.
* `HomeScreen.kt`: Composable principal que orquesta todas las secciones del Dashboard.
* `Components/`: Desglose de piezas reutilizables como `HeaderSection`, `CreditCardSection` y `TransactionItem`.

## ⚠️ Nota Importante
Este repositorio es una **Demo de Interfaz (UI-Only)**. Actualmente:
1.  No posee integración con APIs reales (Frontend puramente visual).
2.  No incluye lógica de persistencia de datos o seguridad bancaria.
3.  Los datos que se visualizan están declarados directamente en los Composables para fines de demostración estética.

---
Hecho con pasión por el código y ganas de construir experiencias digitales de alto nivel.
