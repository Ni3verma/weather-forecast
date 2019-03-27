package com.nitin.weather.data.provider

import com.nitin.weather.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}