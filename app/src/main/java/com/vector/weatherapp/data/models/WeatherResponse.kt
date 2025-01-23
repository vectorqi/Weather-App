package com.vector.weatherapp.data.models

data class WeatherResponse(
    val name: String, // Address Name
    val main: Main,
    val weather: List<WeatherCondition>
)

data class Main(
    val temp: Float,  // current temperature
    val humidity: Int //current humidity
)

data class WeatherCondition(
    val description: String, // weather description
    val icon: String         // Icon ID
)
