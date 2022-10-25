package com.example.temitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.res.painterResource
import com.robotemi.sdk.Robot

//import com.robotemi.sdk.*
//import com.robotemi.sdk.Robot.*
import com.robotemi.sdk.Robot.Companion.getInstance
import com.robotemi.sdk.navigation.model.SpeedLevel

//import com.robotemi.sdk.TtsRequest.Companion.create
//import com.robotemi.sdk.activitystream.ActivityStreamObject
//import com.robotemi.sdk.activitystream.ActivityStreamPublishMessage
//import com.robotemi.sdk.constants.*
//import com.robotemi.sdk.exception.OnSdkExceptionListener
//import com.robotemi.sdk.exception.SdkException
//import com.robotemi.sdk.face.ContactModel
//import com.robotemi.sdk.face.OnContinuousFaceRecognizedListener
//import com.robotemi.sdk.face.OnFaceRecognizedListener
//import com.robotemi.sdk.listeners.*
//import com.robotemi.sdk.map.Floor
//import com.robotemi.sdk.map.MapModel
//import com.robotemi.sdk.map.OnLoadFloorStatusChangedListener
//import com.robotemi.sdk.map.OnLoadMapStatusChangedListener
//import com.robotemi.sdk.model.CallEventModel
//import com.robotemi.sdk.model.DetectionData
//import com.robotemi.sdk.navigation.listener.OnCurrentPositionChangedListener
//import com.robotemi.sdk.navigation.listener.OnDistanceToDestinationChangedListener
//import com.robotemi.sdk.navigation.listener.OnDistanceToLocationChangedListener
//import com.robotemi.sdk.navigation.listener.OnReposeStatusChangedListener
//import com.robotemi.sdk.navigation.model.Position
//import com.robotemi.sdk.navigation.model.SafetyLevel
//import com.robotemi.sdk.navigation.model.SpeedLevel
//import com.robotemi.sdk.permission.OnRequestPermissionResultListener
//import com.robotemi.sdk.permission.Permission
//import com.robotemi.sdk.sequence.OnSequencePlayStatusChangedListener
//import com.robotemi.sdk.sequence.SequenceModel
//import com.robotemi.sdk.telepresence.CallState
//import com.robotemi.sdk.voice.ITtsService
//import com.robotemi.sdk.voice.model.TtsVoice

class MainActivity : ComponentActivity() {

    private lateinit var robot: Robot

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        robot = getInstance()

        robot.goTo(location = "home base", backwards = true, noBypass = false, speedLevel = SpeedLevel.HIGH)

        setContent {
            TemiTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Yellow) {
                    Greeting("Temi")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val hintergrund = painterResource(id = R.drawable.androidparty)

    Surface(color = Color.Cyan) {
        Image(painter = hintergrund, contentDescription = null, modifier = Modifier.fillMaxHeight())
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