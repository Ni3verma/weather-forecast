package com.nitin.weather.data.network.response

import com.google.gson.annotations.SerializedName
import com.nitin.weather.data.db.entity.CurrentWeatherEntry
import com.nitin.weather.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: WeatherLocation
)