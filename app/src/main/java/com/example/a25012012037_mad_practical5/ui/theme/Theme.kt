package com.example.a25012012037_mad_practical5.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF0052CC),
    secondary = Color(0xFFD91A60),
    background = Color(0xFFF4F5FB),
    surface = Color(0xFFE0E3F3)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF0052CC),
    secondary = Color(0xFFD91A60),
    background = Color(0xFFF4F5FB),
    surface = Color(0xFFE0E3F3)
)

@Composable
fun _24012011206_Dipendra_prac5_MadTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    _24012011206_Dipendra_prac5_MadTheme(darkTheme = darkTheme, content = content)
}