package com.nitin.weather.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nitin.weather.data.db.entity.WeatherLocation

@Dao
interface WeatherLocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherLocation: WeatherLocation)

    @Query("select * from weather_location")
    fun getLocation(): LiveData<WeatherLocation>
}