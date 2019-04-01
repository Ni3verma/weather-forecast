package com.nitin.weather.data.network.response

import com.google.gson.annotations.SerializedName
import com.nitin.weather.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)