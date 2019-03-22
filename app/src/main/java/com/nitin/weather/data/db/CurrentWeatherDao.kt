package com.nitin.weather.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.nitin.weather.data.db.entity.CurrentWeatherEntry
import com.nitin.weather.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.nitin.weather.data.db.unitlocalized.MetricCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}