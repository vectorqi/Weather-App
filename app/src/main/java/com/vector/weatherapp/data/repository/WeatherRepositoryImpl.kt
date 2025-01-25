package com.vector.weatherapp.data.repository

import com.vector.weatherapp.data.api.WeatherApi
import com.vector.weatherapp.data.db.WeatherDao
import com.vector.weatherapp.data.db.WeatherRecord
import com.vector.weatherapp.data.models.WeatherResponse
import com.vector.weatherapp.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi,
    private val weatherDao: WeatherDao
) : WeatherRepository {
    override suspend fun fetchWeather(location: String): WeatherResponse {
        return weatherApi.getCurrentWeather(location, "3b7ce88280f8bf51e625cd32d4196f71")
    }

    override suspend fun insertWeatherRecord(record: WeatherRecord) {
        weatherDao.insertWeatherRecord(record)
    }

    override fun getAllWeatherRecords(): Flow<List<WeatherRecord>> {
        return weatherDao.getAllWeatherRecords()
    }

    override suspend fun updateWeatherRecord(record: WeatherRecord) {
        weatherDao.updateWeatherRecord(record)
    }

    override suspend fun deleteWeatherRecord(record: WeatherRecord) {
        weatherDao.deleteWeatherRecord(record)
    }
}
