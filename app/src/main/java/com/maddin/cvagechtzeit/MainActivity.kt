package com.maddin.cvagechtzeit

val TRANSPORT_API = com.maddin.transportapi.impl.germany.VMS("Chemnitz")
val WIDGET_CLASS = WidgetActivity::class.java

class MainActivity : com.maddin.echtzeyt.EchtzeytActivity() {
    override val transportSearchStationAPI = TRANSPORT_API
    override val transportRealtimeAPI = TRANSPORT_API
    override val activitySettings = SettingsActivity::class.java
    override val activityMap = MapActivity::class.java

    init {
        addWidgetClass(WIDGET_CLASS)
    }
}