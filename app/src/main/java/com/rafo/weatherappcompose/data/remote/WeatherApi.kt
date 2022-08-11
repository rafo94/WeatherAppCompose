package com.rafo.weatherappcompose.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
interface WeatherApi {

    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") lng: Double,
    ): WeatherDto
}