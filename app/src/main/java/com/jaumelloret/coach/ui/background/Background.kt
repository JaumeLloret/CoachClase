package com.jaumelloret.coach.ui.background

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.jaumelloret.coach.R

@Composable
fun BackgroundCenter() {
    Image(
        painter = painterResource(id = R.drawable.bg_base_center),
        contentDescription = "Background Center",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun BackgroundArea() {
    Image(
        painter = painterResource(id = R.drawable.bg_base_top),
        contentDescription = "Background Area",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun BackgroundAreaReverse() {
    Image(
        painter = painterResource(id = R.drawable.bg_base_top),
        contentDescription = "Background Area",
        modifier = Modifier.fillMaxSize().rotate(180F),
        contentScale = ContentScale.FillBounds,
    )
}