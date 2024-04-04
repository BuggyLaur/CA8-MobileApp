package com.stu70999.ca2_70999_mobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
        }     // A surface container using the 'background' color from the theme
    }
}