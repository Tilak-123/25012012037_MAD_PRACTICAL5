package com.example.a25012012037_mad_practical5

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
 * 2CEIT5PE18: MOBILE APPLICATION DEVELOPMENT
 * Practical: 5
 * Enrollment No: 24012011206
 * Name: Dipendra pandit
 * Pages: 62 - 64
 */

@Composable
fun FormField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            color = Color(0xFF555770),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(0.38f)
        )

        Box(
            modifier = Modifier
                .weight(0.62f)
                .height(42.dp)
                .background(Color(0xFFD8DBED), shape = RoundedCornerShape(4.dp))
                .border(1.dp, Color(0xFF80839A), shape = RoundedCornerShape(4.dp))
                .padding(horizontal = 10.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            if (value.isEmpty()) {
                Text(
                    text = placeholder,
                    color = Color(0xFF6B6D82),
                    fontSize = 13.sp
                )
            }

            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                singleLine = true,
                visualTransformation = visualTransformation,
                keyboardOptions = keyboardOptions,
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    color = Color(0xFF1A1C2E),
                    fontWeight = FontWeight.Normal
                ),
                cursorBrush = SolidColor(Color(0xFF1A1C2E)),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}