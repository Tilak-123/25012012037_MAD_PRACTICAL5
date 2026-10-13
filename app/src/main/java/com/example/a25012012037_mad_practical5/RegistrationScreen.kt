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
 * Pages: 69 - 73
 */

@Composable
fun RegistrationScreen(
    onNavigateToLogin: () -> Unit = {},
    onRegisterSuccess: () -> Unit = {}
) {
    var name by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F5FB))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(35.dp))

        // GUNI Logo Text
        Text(
            text = "GUNI",
            color = Color(0xFFD91A60),
            fontSize = 46.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

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
                    .padding(vertical = 20.dp, horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                FormField(
                    label = "Name",
                    value = name,
                    onValueChange = { name = it },
                    placeholder = "Enter Name"
                )

                FormField(
                    label = "Phone Number",
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    placeholder = "Enter Phone Number",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )

                FormField(
                    label = "City",
                    value = city,
                    onValueChange = { city = it },
                    placeholder = "Enter City"
                )

                FormField(
                    label = "Email",
                    value = email,
                    onValueChange = { email = it },
                    placeholder = "Enter Email",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )

                FormField(
                    label = "Password",
                    value = password,
                    onValueChange = { password = it },
                    placeholder = "Enter Password",
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                FormField(
                    label = "Confirm Password",
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    placeholder = "Enter Confirm Password",
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { onRegisterSuccess() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(46.dp),
                    shape = RoundedCornerShape(23.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0052CC)
                    )
                ) {
                    Text(
                        text = "Register",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Bottom LOGIN link
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Do you have an account? ",
                color = Color(0xFF333333),
                fontSize = 14.sp
            )
            Text(
                text = "LOGIN",
                color = Color(0xFFD91A60),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    onNavigateToLogin()
                }
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}