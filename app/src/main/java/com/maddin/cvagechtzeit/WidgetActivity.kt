package com.maddin.cvagechtzeit

class WidgetActivity : com.maddin.echtzeyt.EchtzeytWidget() {
    override val transportRealtimeAPI = TRANSPORT_API
    override val transportSearchStationAPI = TRANSPORT_API
}

class WidgetConfigureActivity : com.maddin.echtzeyt.EchtzeytWidgetConfigureActivity() {
    override val transportSearchStationAPI = TRANSPORT_API
    override val widgetClass = WIDGET_CLASS
}