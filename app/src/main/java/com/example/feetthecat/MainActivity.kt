@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.feetthecat


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.feetthecat.ui.theme.FeetTheCatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeetTheCatTheme {
                HomeScreen()
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FeetTheCatTheme {
        HomeScreen()
    }
}

