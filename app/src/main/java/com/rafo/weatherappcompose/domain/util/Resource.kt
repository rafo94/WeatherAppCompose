package com.rafo.weatherappcompose.domain.util

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data = data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data = data, message = message)
}