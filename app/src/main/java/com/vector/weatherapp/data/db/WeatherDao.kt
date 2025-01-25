package com.vector.weatherapp.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeatherRecord(record: WeatherRecord)

    @Query("SELECT * FROM weather_records")
    fun getAllWeatherRecords(): Flow<List<WeatherRecord>>

    @Update
    suspend fun updateWeatherRecord(record: WeatherRecord)

    @Delete
    suspend fun deleteWeatherRecord(record: WeatherRecord)
}
