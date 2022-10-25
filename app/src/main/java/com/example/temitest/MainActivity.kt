package com.example.temitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.temitest.ui.theme.TemiTestTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TemiTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Temi")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val hintergrund = painterResource(id = R.drawable.tom)

    Surface(color = Color.Cyan) {
        Image(painter = hintergrund, contentDescription = "tom",
        modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
            )
        Text(text = "Hello, my name is $name!", modifier = Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TemiTestTheme {
        Greeting("Rafael")
    }
}