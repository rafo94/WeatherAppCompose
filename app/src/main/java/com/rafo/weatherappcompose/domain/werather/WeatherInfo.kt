package com.rafo.weatherappcompose.domain.werather

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?,
)
