package com.vector.weatherapp.ui.viewmodel
//View state 
sealed class WeatherState {
    object Loading : WeatherState() // 表示加载状态
    data class Success(val data: com.vector.weatherapp.data.models.WeatherResponse) : WeatherState() // 表示成功状态
    data class Error(val message: String) : WeatherState() // 表示错误状态
}
