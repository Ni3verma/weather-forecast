package com.nitin.weather.data.repository

import androidx.lifecycle.LiveData
import com.nitin.weather.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}