package com.example.a25012012037_mad_practical5

import androidx.compose.runtime.Composable

@Composable
fun CheckBoxScreen(
    onLogout: () -> Unit = {}
) {
    CheckBoxLevelScreen(onLogout = onLogout)
}