package com.triviagenai.triviagen.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = DarkPurple,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = RoyalPurple
)

private val LightColorScheme = lightColorScheme(
    primary = DarkPurple,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = RoyalPurple
)

@Composable
fun TriviaGenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}