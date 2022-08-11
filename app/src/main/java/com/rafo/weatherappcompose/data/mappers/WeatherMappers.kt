package com.rafo.weatherappcompose.data.mappers

import com.rafo.weatherappcompose.data.remote.WeatherDataDto
import com.rafo.weatherappcompose.data.remote.WeatherDto
import com.rafo.weatherappcompose.domain.werather.WeatherData
import com.rafo.weatherappcompose.domain.werather.WeatherInfo
import com.rafo.weatherappcompose.domain.werather.WeatherType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Created by Rafik Gasparyan on 08/10/22
 */

private data class IndexWeatherData(
    val index: Int,
    val data: WeatherData
)

fun WeatherDataDto.toWeatherDataMap(): Map<Int, List<WeatherData>> {
    return time.mapIndexed { index, time ->
        val temperature = temperatures[index]
        val weatherCode = weatherCodes[index]
        val windSpeed = windSpeeds[index]
        val pressure = pressures[index]
        val humidity = humidities[index]
        IndexWeatherData(
            index = index,
            data = WeatherData(
                time = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME),
                temperatureCelsius = temperature,
                pressure = pressure,
                windSpeed = windSpeed,
                humidity = humidity,
                weatherType = WeatherType.fromWHO(weatherCode)
            )
        )
    }.groupBy {
        it.index / 24
    }.mapValues { value ->
        value.value.map { it.data }
    }
}

fun WeatherDto.toWeatherInfo(): WeatherInfo {
    val weatherDataMap = weatherData.toWeatherDataMap()
    val now = LocalDateTime.now()
    val currentWeatherData = weatherDataMap[0]?.find {
        val hour = if (now.minute < 30) now.hour else now.hour + 1
        it.time.hour == hour
    }
    return WeatherInfo(
        weatherDataPerDay = weatherDataMap,
        currentWeatherData = currentWeatherData
    )
}