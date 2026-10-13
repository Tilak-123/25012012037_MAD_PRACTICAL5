package com.example.a25012012037_mad_practical5

sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Registration : Screen("registration")
    data object CheckBoxLevel : Screen("checkbox_level")
}