package com.nitin.weather.ui.weather.future.list

import com.nitin.weather.data.provider.UnitProvider
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.lazyDeferred
import com.nitin.weather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
