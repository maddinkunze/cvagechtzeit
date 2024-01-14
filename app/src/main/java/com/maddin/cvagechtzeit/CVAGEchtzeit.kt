package com.maddin.cvagechtzeit

import android.app.Application
import com.maddin.echtzeyt.ECHTZEYT_CONFIGURATION
import com.maddin.transportapi.impl.germany.VMS

class CVAGEchtzeit : Application() {
    override fun onCreate() {
        super.onCreate()
        ECHTZEYT_CONFIGURATION.load(VMS("Chemnitz"))
    }
}