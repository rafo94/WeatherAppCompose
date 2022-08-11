package com.rafo.weatherappcompose.domain.werather

import java.time.LocalDateTime

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
