package com.jaumelloret.coach.singin.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jaumelloret.coach.ui.theme.BlackCoach
import com.jaumelloret.coach.ui.theme.BrownCoach
import com.jaumelloret.coach.ui.theme.WhiteCoach
import com.jaumelloret.coach.ui.theme.YellowCoach

@Composable
fun RoundedButton(
    text: String, enabled: Boolean, onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier
            .fillMaxWidth()
            .height(62.dp),
        colors = if (isSystemInDarkTheme()) {
            ButtonDefaults.buttonColors(
                containerColor = YellowCoach,
                contentColor = BrownCoach,
                disabledContainerColor = BlackCoach,
                disabledContentColor = WhiteCoach
            )
        } else {
            ButtonDefaults.buttonColors(
                containerColor = BrownCoach,
                contentColor = YellowCoach,
                disabledContainerColor = BlackCoach,
                disabledContentColor = WhiteCoach
            )
        }
    ) {
        Text(
            text = text, fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CircularButton(icon: ImageVector , text: String, color: Color, onClick: () -> Unit) {
    IconButton(
        onClick = {onClick},
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .background(color)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icon, contentDescription = text, tint = Color.White)
        }
    }
}

@Composable
fun CircularButton(icon: Painter , text: String, color: Color, onClick: () -> Unit) {
    IconButton(
        onClick = {onClick},
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .background(color)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = icon, contentDescription = text, tint = Color.White)
        }
    }
}

@Composable
fun TextButton(
    onClick: () -> Unit, text: String
) {
    Text(text = text, modifier = Modifier.clickable { onClick })
}