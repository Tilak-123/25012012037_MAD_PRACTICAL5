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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckBoxLevelScreen(
    onLogout: () -> Unit = {}
) {
    var isMadChecked by remember { mutableStateOf(false) }
    var isWebChecked by remember { mutableStateOf(false) }
    var isDsaChecked by remember { mutableStateOf(false) }

    var isBeginnerChecked by remember { mutableStateOf(true) }
    var isIntermediateChecked by remember { mutableStateOf(false) }
    var isAdvancedChecked by remember { mutableStateOf(false) }

    var isTermsAgreed by remember { mutableStateOf(false) }

    val isAllChecked = isMadChecked && isWebChecked && isDsaChecked

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
            fontSize = 44.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "CheckBox Level Selection",
            color = Color(0xFF1A1C2E),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Card 1: Multi-level Subject Checkboxes
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E3F3)),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Select Subjects",
                    color = Color(0xFFD91A60),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Select All Checkbox
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAllChecked,
                        onCheckedChange = { checked ->
                            isMadChecked = checked
                            isWebChecked = checked
                            isDsaChecked = checked
                        },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFD91A60),
                            uncheckedColor = Color(0xFF555770)
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Select All Subjects",
                        color = Color(0xFF1A1C2E),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                // Sub Checkboxes
                Column(modifier = Modifier.padding(start = 24.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isMadChecked,
                            onCheckedChange = { isMadChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFF0052CC),
                                uncheckedColor = Color(0xFF555770)
                            )
                        )
                        Text(
                            text = "Mobile Application Development",
                            color = Color(0xFF333333),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isWebChecked,
                            onCheckedChange = { isWebChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFF0052CC),
                                uncheckedColor = Color(0xFF555770)
                            )
                        )
                        Text(
                            text = "Web Development",
                            color = Color(0xFF333333),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isDsaChecked,
                            onCheckedChange = { isDsaChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFF0052CC),
                                uncheckedColor = Color(0xFF555770)
                            )
                        )
                        Text(
                            text = "Data Structures & Algorithms",
                            color = Color(0xFF333333),
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Card 2: Skill Levels
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E3F3)),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Select Level",
                    color = Color(0xFFD91A60),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isBeginnerChecked,
                        onCheckedChange = { isBeginnerChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF0052CC),
                            uncheckedColor = Color(0xFF555770)
                        )
                    )
                    Text(
                        text = "Beginner",
                        color = Color(0xFF333333),
                        fontSize = 14.sp
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isIntermediateChecked,
                        onCheckedChange = { isIntermediateChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF0052CC),
                            uncheckedColor = Color(0xFF555770)
                        )
                    )
                    Text(
                        text = "Intermediate",
                        color = Color(0xFF333333),
                        fontSize = 14.sp
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAdvancedChecked,
                        onCheckedChange = { isAdvancedChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF0052CC),
                            uncheckedColor = Color(0xFF555770)
                        )
                    )
                    Text(
                        text = "Advanced",
                        color = Color(0xFF333333),
                        fontSize = 14.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Terms Checkbox
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isTermsAgreed,
                onCheckedChange = { isTermsAgreed = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xFFD91A60),
                    uncheckedColor = Color(0xFF555770)
                )
            )
            Text(
                text = "I agree to the Terms & Conditions",
                color = Color(0xFF333333),
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* Submit Action */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp),
            enabled = isTermsAgreed,
            shape = RoundedCornerShape(23.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0052CC),
                disabledContainerColor = Color(0xFFA0B2D6)
            )
        ) {
            Text(
                text = "Submit Selection",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "LOGOUT",
            color = Color(0xFFD91A60),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable { onLogout() }
        )

        Spacer(modifier = Modifier.height(30.dp))
    }
}