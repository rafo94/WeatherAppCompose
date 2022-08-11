package com.rafo.weatherappcompose.data.remote

import com.squareup.moshi.Json

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
