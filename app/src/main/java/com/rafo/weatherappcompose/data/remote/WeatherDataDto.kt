package com.rafo.weatherappcompose.data.remote

import com.squareup.moshi.Json

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
data class WeatherDataDto(
    val time: List<String>,
    @field:Json(name = "temperature_2m")
    val temperatures: List<Double>,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,
    @field:Json(name = "windspeed_10m")
    val windSpeeds: List<Double>,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
)
