package com.nitin.weather.data.provider

import com.nitin.weather.data.db.entity.WeatherLocation

// for now we will have default behaviour
class LocationProviderImpl : LocationProvider {
    override suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean {
        return true
    }

    override suspend fun getPreferredLocationString(): String {
        return "India"
    }
}