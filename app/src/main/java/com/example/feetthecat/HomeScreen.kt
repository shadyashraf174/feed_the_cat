package com.example.feetthecat

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondary,
                    titleContentColor = MaterialTheme.colorScheme.onSecondary,
                ),
                title = {
                    Text("FeedTheCat")
                }
            )
        },
        content = {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start
            ) {

                Row(
                    modifier = Modifier.offset(x = 250.dp, y = 96.dp)
                ) {
                    Text(
                        text = "Satiety ",
                        fontSize = 25.sp,

                        )
                    Text(
                        text = " 10",
                        fontSize = 27.sp,
                    )
                }

                Image(
                    modifier = Modifier
                        .size(width = 170.dp, height = 170.dp)
                        .offset(x = 112.dp, y = 300.dp),

                    painter = painterResource(id = R.drawable.cat_feel_in_love),
                    contentDescription = null
                )

                val context = LocalContext.current

                Button(
                    modifier = Modifier
                        .size(width = 100.dp, height = 49.dp)
                        .offset(x = 140.dp, y = 470.dp),
                    shape = RoundedCornerShape(10),
                    onClick = {
                        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
                    }) {
                    Text("FEED", color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }
    )
}