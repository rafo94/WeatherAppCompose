package com.rafo.weatherappcompose.data.repository

import com.rafo.weatherappcompose.data.mappers.toWeatherInfo
import com.rafo.weatherappcompose.data.remote.WeatherApi
import com.rafo.weatherappcompose.domain.repository.WeatherRepository
import com.rafo.weatherappcompose.domain.util.Resource
import com.rafo.weatherappcompose.domain.werather.WeatherInfo
import javax.inject.Inject

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lng = lng
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}