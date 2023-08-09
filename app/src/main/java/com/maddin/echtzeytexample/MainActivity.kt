package com.maddin.echtzeytexample

import com.maddin.echtzeyt.EchtzeytWidget

// <CUSTOMIZE>

val TRANSPORT_API = com.maddin.transportapi.impl.ExampleAPI() // <CUSTOMIZE>
val WIDGET_CLASS = WidgetActivity::class.java

class MainActivity : com.maddin.echtzeyt.EchtzeytActivity() {
    init {
        // <CUSTOMIZE>
        // Set the api that should be used. You can create your own api, see com.maddin.transportapi for more details.
        setTransportAPI(TRANSPORT_API)
        widgetClasses.add(WIDGET_CLASS)
    }
}