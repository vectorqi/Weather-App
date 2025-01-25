package com.vector.weatherapp.domain.repository

import com.vector.weatherapp.data.db.WeatherRecord
import com.vector.weatherapp.data.models.WeatherResponse
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    suspend fun fetchWeather(location: String): WeatherResponse
    suspend fun insertWeatherRecord(record: WeatherRecord)
    fun getAllWeatherRecords(): Flow<List<WeatherRecord>>
    suspend fun updateWeatherRecord(record: WeatherRecord)
    suspend fun deleteWeatherRecord(record: WeatherRecord)
}
