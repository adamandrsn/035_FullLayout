package com.example.weather_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather_app.ui.theme.Weather_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_appTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Adam Anderson Yuniarto",
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "20210140035",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.padding(5.dp))
        BoxHeader()
        Spacer(modifier = Modifier.padding(15.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(20.dp))
        Keterangan()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Gray))
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){
                Image(painter = painterResource(id = R.drawable.background), contentDescription = "", modifier = Modifier.size(200.dp))
                Text(
                    text = "Rain",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Lokasi(){
    Text(text = "-19°C",
        fontSize = 64.sp,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold)
    Row {
    Image(painter = painterResource(id = R.drawable.locationicon),
        contentDescription = "",
        modifier = Modifier.size(50.dp)
    )
        Spacer(modifier = Modifier.padding(5.dp))
    Text(
        text = "Temanggung",
        fontSize = 40.sp,
        fontFamily = FontFamily.Monospace
    )
    }
    Text(text = "Kec.Temanggung II, Kab.Temanggung, Central Java",
        textAlign = TextAlign.Center,
        color = Color.Gray)
}

@Composable
fun Keterangan(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Gray)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){
            Row {
                Text(
                    text = "Humidity",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(20.dp))
                Text(
                    text = "UV index",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(10.dp))
            }
            Row {
                Text(
                    text = "98%",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 30.dp, 0.dp)
                )
                Spacer(modifier = Modifier.padding(20.dp))
                Text(
                    text = "9/10",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .padding(30.dp, 0.dp, 0.dp, 0.dp)
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Text(
                    text = "Sunrise",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(10.dp))
                Spacer(modifier = Modifier.padding(55.dp, 0.dp, 0.dp, 0.dp))
                Text(
                    text = "Sunset",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(10.dp))
            }
            Row {
                Text(
                    text = "05.00 AM",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 20.dp))
                Spacer(modifier = Modifier.padding(15.dp))
                Text(
                    text = "05.40 PM",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 0.dp))
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Weather_appTheme {
        Surface(
            color = Color.LightGray,
            modifier = Modifier.fillMaxSize()
        ) {
            Home()
        }
    }
}