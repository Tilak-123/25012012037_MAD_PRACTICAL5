package com.example.a25012012037_mad_practical5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a25012012037_mad_practical5.ui.theme._24012011206_Dipendra_prac5_MadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _24012011206_Dipendra_prac5_MadTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    _24012011206_Dipendra_prac5_MadTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    _24012011206_Dipendra_prac5_MadTheme {
        RegistrationScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun CheckBoxLevelScreenPreview() {
    _24012011206_Dipendra_prac5_MadTheme {
        CheckBoxLevelScreen()
    }
}