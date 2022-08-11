package com.rafo.weatherappcompose.domain.repository

import com.rafo.weatherappcompose.domain.util.Resource
import com.rafo.weatherappcompose.domain.werather.WeatherInfo

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo>
}