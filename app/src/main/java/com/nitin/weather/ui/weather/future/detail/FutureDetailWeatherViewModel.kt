package com.nitin.weather.ui.weather.future.detail

import com.nitin.weather.data.provider.UnitProvider
import com.nitin.weather.data.repository.ForecastRepository
import com.nitin.weather.internal.lazyDeferred
import com.nitin.weather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {
    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
