package com.example.temitest

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.temitest.ui.theme.TemiTestTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.robotemi.sdk.Robot

import com.robotemi.sdk.*
import com.robotemi.sdk.Robot.*
import com.robotemi.sdk.Robot.Companion.getInstance
import com.robotemi.sdk.navigation.model.SpeedLevel

import com.robotemi.sdk.TtsRequest.Companion.create
import com.robotemi.sdk.activitystream.ActivityStreamObject
import com.robotemi.sdk.activitystream.ActivityStreamPublishMessage
import com.robotemi.sdk.constants.*
import com.robotemi.sdk.exception.OnSdkExceptionListener
import com.robotemi.sdk.exception.SdkException
import com.robotemi.sdk.face.ContactModel
import com.robotemi.sdk.face.OnContinuousFaceRecognizedListener
import com.robotemi.sdk.face.OnFaceRecognizedListener
import com.robotemi.sdk.listeners.*
import com.robotemi.sdk.map.Floor
import com.robotemi.sdk.map.MapModel
import com.robotemi.sdk.map.OnLoadFloorStatusChangedListener
import com.robotemi.sdk.map.OnLoadMapStatusChangedListener
import com.robotemi.sdk.model.CallEventModel
import com.robotemi.sdk.model.DetectionData
import com.robotemi.sdk.navigation.listener.OnCurrentPositionChangedListener
import com.robotemi.sdk.navigation.listener.OnDistanceToDestinationChangedListener
import com.robotemi.sdk.navigation.listener.OnDistanceToLocationChangedListener
import com.robotemi.sdk.navigation.listener.OnReposeStatusChangedListener
import com.robotemi.sdk.navigation.model.Position
import com.robotemi.sdk.navigation.model.SafetyLevel
import com.robotemi.sdk.permission.OnRequestPermissionResultListener
import com.robotemi.sdk.permission.Permission
import com.robotemi.sdk.sequence.OnSequencePlayStatusChangedListener
import com.robotemi.sdk.sequence.SequenceModel
import com.robotemi.sdk.telepresence.CallState
import com.robotemi.sdk.voice.ITtsService
import com.robotemi.sdk.voice.model.TtsVoice


class MainActivity : ComponentActivity() {

    private lateinit var robot: Robot

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        robot = getInstance()

        setContent {
            TemiTestTheme {
                Navigation()
                robot.goTo(location = "home base", backwards = true, noBypass = false, speedLevel = SpeedLevel.HIGH)
            }

        }
    }
}

// Function to generate a Toast
private fun mToast(context: Context){
    Toast.makeText(context, "This is a Sample Toast", Toast.LENGTH_LONG).show()
}

@Composable
fun Greeting(name: String) {
    val hintergrund = painterResource(id = R.drawable.tom)

    Surface(color = Color.Cyan) {

        Image(
            painter = hintergrund, contentDescription = "tom",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
            )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(50.dp),
            ) {
            Text(text = "Navigate")
        }

        Text(text = "Hello, my name is $name!", modifier = Modifier.padding(24.dp))
    }
}


@Composable
fun Navigation( ){
    val wc_icon = painterResource(id = R.drawable.wc_icon)
    val mContext = LocalContext.current

    Column {
        Button(
            onClick = {
                /*TODO*/
            },
            modifier = Modifier.height(60.dp)
        ) {
            Text(text = "Das ist ein Testbutton")
        }

        Button(
            onClick = {
                mToast(mContext)
                 },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.Red),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp
            )
//            modifier = Modifier.height(60.dp)
        ) {
            Image(
                painter = wc_icon,
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp))
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TemiTestTheme {
        Navigation( )
    }
}