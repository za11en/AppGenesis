package com.appgenesis.ui
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val NeonMint = Color(0xFF00FF9D)
val DeepSpace = Color(0xFF0F0F12)

@Composable
fun AppGenesisTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(primary = NeonMint, background = DeepSpace, surface = Color(0xFF1A1A1E)),
        content = content
    )
}
