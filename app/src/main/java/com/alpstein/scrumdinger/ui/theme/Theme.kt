package com.alpstein.scrumdinger.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
  primary = Purple200,
  primaryVariant = Purple700,
  secondary = Teal200
)

private val LightColorPalette = lightColors(
  primary = Purple500,
  primaryVariant = Purple700,
  secondary = Teal200

  /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

enum class Theme(private val rawValue: Color) {
  Bubblegum(bubblegumColor),
  Indigo(indigoColor),
  Lavender(lavenderColor),
  Magenta(magentaColor),
  Navy(navyColor),
  Orange(orangeColor),
  Oxblood(oxbloodColor),
  Periwinkle(periwinkleColor),
  Poppy(poppy),
  Purple(purpleColor),
  Sky(skyColor),
  Tan(tanColor),
  Teal(tealColor),
  Yellow(yellowColor);

  val accentColor: Color
    get() {
      return when (this) {
        Bubblegum, Lavender, Orange, Periwinkle, Poppy, Sky, Tan, Teal, Yellow -> Color.Black
        Indigo, Magenta, Navy, Oxblood, Purple -> Color.White
      }
    }

  val mainColor: Color
    get() {
      return rawValue
    }
}


@Composable
fun ScrumdingerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}