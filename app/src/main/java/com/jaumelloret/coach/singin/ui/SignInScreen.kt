package com.jaumelloret.coach.singin.ui

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jaumelloret.coach.R
import com.jaumelloret.coach.singin.ui.components.CircularButton
import com.jaumelloret.coach.singin.ui.components.RoundedButton
import com.jaumelloret.coach.singin.ui.components.TextButton
import com.jaumelloret.coach.ui.theme.BrownCoach

@Composable
fun SignInScreen(signInViewModel: SignInViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, top = 15.dp, end = 30.dp, bottom = 15.dp)
    ) {
        Header(modifier = Modifier.align(Alignment.TopCenter))
        Body(modifier= Modifier.align(Alignment.Center), signInViewModel)
    }
}

@Composable
fun Header(modifier: Modifier) {
    val activity = LocalContext.current as Activity

    Box(modifier = modifier.fillMaxWidth()) {
        Icon(
            imageVector = Icons.Default.Close,
            modifier = Modifier
                .size(42.dp)
                .align(Alignment.TopEnd)
                .clickable { activity.finish() },
            contentDescription = stringResource(id = R.string.close),
            tint = BrownCoach
        )
        ImageLogo(modifier = Modifier.align(Alignment.TopCenter))
    }
}

@Composable
fun ImageLogo(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "logo",
        modifier = modifier
            .clip(
                CircleShape
            )
            .size(160.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Body(modifier: Modifier, signInViewModel: SignInViewModel) {
    val emailOrPhone: String = ""
    val password: String = ""
    val isSignInEnabled : Boolean = true

    Column(modifier = modifier.fillMaxWidth()) {

    }
}

@Composable
fun SigInButton() {
    RoundedButton(text = stringResource(id = R.string.sign_in), enabled = true) {
        Log.i("DAM", "SignIn")
    }
}

@Composable
fun OAuthButtons() {
    Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
        CircularButton(
            icon = painterResource(id = R.drawable.ic_facebook),
            color = Color.Blue,
            text = "Facebook"
        ) {
            Log.i("DAM", "Facebook")
        }
        CircularButton(
            icon = painterResource(id = R.drawable.ic_github), color = Color.Black, text = "Github"
        ) {
            Log.i("DAM", "Github")
        }
        CircularButton(
            icon = painterResource(id = R.drawable.ic_google), color = Color.Red, text = "Google"
        ) {
            Log.i("DAM", "Google")
        }
    }
}

@Composable
fun SignUpButton() {
    TextButton(onClick = { /*TODO*/ }, text = "asdsadsadsa")
}