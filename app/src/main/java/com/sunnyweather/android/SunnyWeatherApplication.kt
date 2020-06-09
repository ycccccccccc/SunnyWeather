package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "f5zPGPP8obXhBVoF"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}