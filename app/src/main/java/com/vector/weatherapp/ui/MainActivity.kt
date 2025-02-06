package com.vector.weatherapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vector.weatherapp.data.models.WeatherResponse
import com.vector.weatherapp.ui.viewmodel.WeatherState
import com.vector.weatherapp.ui.viewmodel.WeatherViewModel
//Main activity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(viewModel: WeatherViewModel = hiltViewModel()) {
    var location by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Enter Location") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { viewModel.fetchWeather(location) }) {
            Text("Get Weather")
        }
        Spacer(modifier = Modifier.height(16.dp))

        val state by viewModel.weatherState.collectAsState()
        when (state) {
            is WeatherState.Loading -> CircularProgressIndicator()
            is WeatherState.Success -> Text("Weather: ${(state as WeatherState.Success).data}")
            is WeatherState.Error -> Text("Error: ${(state as WeatherState.Error).message}")
        }
    }
}
