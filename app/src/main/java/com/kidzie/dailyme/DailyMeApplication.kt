package com.kidzie.dailyme

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DailyMeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}