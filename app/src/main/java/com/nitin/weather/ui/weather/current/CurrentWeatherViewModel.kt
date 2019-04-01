package com.nitin.weather.ui.weather.current

import com.nitin.weather.data.provider.UnitProvider
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.lazyDeferred
import com.nitin.weather.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
