package com.yueping.timetable

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        app = this
    }

    companion object {
        lateinit var appContext: Context
        lateinit var app: App
    }
}