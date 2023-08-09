package com.maddin.cvagechtzeit

class WidgetActivity : com.maddin.echtzeyt.EchtzeytWidget() {
    init {
        setTransportAPI(TRANSPORT_API)
    }
}

class WidgetConfigureActivity : com.maddin.echtzeyt.EchtzeytWidgetConfigureActivity() {
    init {
        setStationAPI(TRANSPORT_API)
        widgetClass = WIDGET_CLASS // This is the name of the class that will be notified after the configuration was changed
    }
}