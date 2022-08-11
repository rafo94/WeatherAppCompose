package com.rafo.weatherappcompose.presentation

import com.rafo.weatherappcompose.domain.util.Resource
import com.rafo.weatherappcompose.domain.werather.WeatherInfo

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
