package com.example.cursoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursoandroid.ui.theme.CursoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CursoAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyColumn()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun DefaultPreview() {
    CursoAndroidTheme {
        MyColumn()
    }
}

//This function is a example from box Layout
@Composable
fun MyBox(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .background(Color.Cyan),
            contentAlignment = Alignment.BottomCenter) {
            Text("Hi $name This is a Text in a box")
        }
    }
}

//this function is a examplo from Column Layout
@Composable
fun MyColumn(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
        Text(text = "Holaa1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp), textAlign = TextAlign.Center)
    }
}

