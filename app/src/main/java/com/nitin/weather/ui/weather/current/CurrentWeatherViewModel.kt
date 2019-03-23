package com.nitin.weather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.UnitSystem
import com.nitin.weather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC  //later we will get it from settings
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
