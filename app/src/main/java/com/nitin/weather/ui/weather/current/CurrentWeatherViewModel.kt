package com.nitin.weather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.nitin.weather.data.provider.UnitProvider
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.UnitSystem
import com.nitin.weather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
