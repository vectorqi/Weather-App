package com.vector.weatherapp.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_records")
data class WeatherRecord(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val location: String,
    val dateRange: String,
    val weatherData: String
)
