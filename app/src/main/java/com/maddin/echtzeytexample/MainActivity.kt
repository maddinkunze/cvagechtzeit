package com.maddin.echtzeytexample // <CUSTOMIZE>

class MainActivity : com.maddin.echtzeyt.EchtzeytActivity() {
    init {
        // <CUSTOMIZE>
        // Set the api that should be used. You can create your own api, see com.maddin.transportapi for more details.
        setTransportAPI(com.maddin.transportapi.impl.ExampleAPI())
    }
}