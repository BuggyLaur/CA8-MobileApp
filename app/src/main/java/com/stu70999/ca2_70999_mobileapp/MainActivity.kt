package com.stu70999.ca2_70999_mobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.stu70999.ca2_70999_mobileapp.ui.theme.AppNavigation
import com.stu70999.ca2_70999_mobileapp.ui.theme.Ca270999MobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ca270999MobileAppTheme {

                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ){

                }
                AppNavigation()

            }
        }
    }
}