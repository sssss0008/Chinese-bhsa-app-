package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = ImperialRed,
    onPrimary = Color.White,
    primaryContainer = RedContainer,
    onPrimaryContainer = OnRedContainer,
    secondary = AmberAccent,
    onSecondary = Color(0xFF3E2723),
    secondaryContainer = GoldContainer,
    onSecondaryContainer = OnGoldContainer,
    tertiary = JadeGreen,
    onTertiary = Color.White,
    tertiaryContainer = LightJadeContainer,
    onTertiaryContainer = OnJadeContainer,
    background = ParchmentWhite,
    onBackground = InkBlack,
    surface = ParchmentSurface,
    onSurface = InkBlack,
    surfaceVariant = Color(0xFFF7EFE9),
    onSurfaceVariant = InkCharcoal,
    outline = WarmBorder,
    outlineVariant = Color(0xFFE8DDD6)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFEF5350),
    onPrimary = Color(0xFF3F0000),
    primaryContainer = Color(0xFF7F0000),
    onPrimaryContainer = Color(0xFFFFCDD2),
    secondary = LightGold,
    onSecondary = Color(0xFF3E2723),
    secondaryContainer = Color(0xFF5D4037),
    onSecondaryContainer = Color(0xFFFFECB3),
    tertiary = Color(0xFF80CBC4),
    onTertiary = Color(0xFF00332C),
    tertiaryContainer = Color(0xFF004D40),
    onTertiaryContainer = Color(0xFFB2DFDB),
    background = DarkBackground,
    onBackground = DarkTextPrimary,
    surface = DarkSurface,
    onSurface = DarkTextPrimary,
    surfaceVariant = DarkCard,
    onSurfaceVariant = DarkTextSecondary,
    outline = DarkCardBorder,
    outlineVariant = Color(0xFF4E3D3D)
)

@Composable
fun ChineseBhasaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
