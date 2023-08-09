package com.maddin.cvagechtzeit

val TRANSPORT_API = com.maddin.transportapi.impl.ExampleAPI() // <CUSTOMIZE>
val WIDGET_CLASS = WidgetActivity::class.java

class MainActivity : com.maddin.echtzeyt.EchtzeytActivity() {
    init {
        setTransportAPI(TRANSPORT_API)
        widgetClasses.add(WIDGET_CLASS)
    }
}