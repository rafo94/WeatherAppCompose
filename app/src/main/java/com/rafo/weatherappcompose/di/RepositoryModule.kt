package com.rafo.weatherappcompose.di

import com.rafo.weatherappcompose.data.location.DefaultLocationTracker
import com.rafo.weatherappcompose.data.repository.WeatherRepositoryImpl
import com.rafo.weatherappcompose.domain.location.LocationTracker
import com.rafo.weatherappcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository

}