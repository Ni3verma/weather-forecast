package com.nitin.weather.data.repository

import androidx.lifecycle.LiveData
import com.nitin.weather.data.db.entity.WeatherLocation
import com.nitin.weather.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.nitin.weather.data.db.unitlocalized.future.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
    suspend fun getFutureWeatherList(
        startDate: LocalDate,
        metric: Boolean
    ): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>
}