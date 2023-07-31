package com.maddin.cvagechtzeit

class MainActivity : com.maddin.echtzeyt.EchtzeytActivity() {
    init {
        setTransportAPI(com.maddin.transportapi.impl.germany.VMS("Chemnitz"))
    }
}