package com.rafo.weatherappcompose.domain.location

import android.location.Location

/**
 * Created by Rafik Gasparyan on 08/10/22
 */
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}