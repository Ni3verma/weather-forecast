package com.nitin.weather.ui.base

import androidx.lifecycle.ViewModel
import com.nitin.weather.data.provider.UnitProvider
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.UnitSystem
import com.nitin.weather.internal.lazyDeferred

abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}