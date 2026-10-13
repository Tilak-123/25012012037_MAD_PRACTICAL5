package com.example.a25012012037_mad_practical5

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
 * 2CEIT5PE18: MOBILE APPLICATION DEVELOPMENT
 * Practical: 5
 * Enrollment No: 24012011206
 * Name: Dipendra pandit
 * Pages: 65 - 68
 */

@Composable
fun LoginScreen(
    onNavigateToRegister: () -> Unit = {},
    onLoginSuccess: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F5FB))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(45.dp))

        // GUNI Logo Text
        Text(
            text = "GUNI",
            color = Color(0xFFD91A60),
            fontSize = 46.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // Main Light Purple-Gray Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE0E3F3)
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp, horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                FormField(
                    label = "Email",
                    value = email,
                    onValueChange = { email = it },
                    placeholder = "Enter Email",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )

                Spacer(modifier = Modifier.height(4.dp))

                FormField(
                    label = "Password",
                    value = password,
                    onValueChange = { password = it },
                    placeholder = "Enter Password",
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Text(
                    text = "Forgot Password?",
                    color = Color(0xFF555770),
                    fontSize = 13.sp,
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = 8.dp, bottom = 24.dp)
                        .clickable { /* Forgot Password action */ }
                )

                Button(
                    onClick = { onLoginSuccess() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(46.dp),
                    shape = RoundedCornerShape(23.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0052CC)
                    )
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Bottom SIGN UP link
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Don't have an account? ",
                color = Color(0xFF333333),
                fontSize = 14.sp
            )
            Text(
                text = "SIGN UP",
                color = Color(0xFFD91A60),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    onNavigateToRegister()
                }
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}