# weather-forecast
android app written completely in kotlin using MVVM design pattern. It uses all of the latest android architecture components such as 
View model, Live data, bottom navigation, Room persistance library. 

This app displays today's weather and forecast of 7 days. User can either set the custom location or his current location will 
be used to get weather data.

App uses [Apixu API](https://www.apixu.com/api.aspx) to fetch weather data of a location.

It uses following libraries
* Retrofit
* Room
* Kodein
* Kotlin coroutines
* Glide
* Android Navigation

# Building the app
* Get your API key. Get it from [here](https://www.apixu.com/api.aspx) 
* make **API_KEY.xml** file in CodeTime/app/src/main/res/values
* inside this file write this code and replace `KEY_HERE` with your own API KEY
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="API_KEY">KEY_HERE</string>
</resources>
```

# Screenshots
<img src="https://github.com/Ni3verma/weather-forecast/blob/master/ss/today.png" alt="Today" width="200px" height="250px">
<img src="https://github.com/Ni3verma/weather-forecast/blob/master/ss/forecast.png" alt="Forecast" width="200px" height="250px">
<img src="https://github.com/Ni3verma/weather-forecast/blob/master/ss/settings.png" alt="Settings" width="200px" height="250px">
