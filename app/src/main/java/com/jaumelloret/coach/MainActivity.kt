package com.jaumelloret.coach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jaumelloret.coach.singin.ui.SignInScreen
import com.jaumelloret.coach.singin.ui.SignInViewModel
import com.jaumelloret.coach.ui.background.BackgroundArea
import com.jaumelloret.coach.ui.background.BackgroundAreaReverse
import com.jaumelloret.coach.ui.theme.CoachTheme

class MainActivity : ComponentActivity() {
    private val signInViewModel : SignInViewModel = SignInViewModel();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoachTheme {
                BackgroundArea()
                SignInScreen(signInViewModel = signInViewModel)
            }
        }
    }
}