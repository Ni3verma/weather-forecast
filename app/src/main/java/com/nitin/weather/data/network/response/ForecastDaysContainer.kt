package com.nitin.weather.data.network.response

import com.google.gson.annotations.SerializedName
import com.nitin.weather.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)