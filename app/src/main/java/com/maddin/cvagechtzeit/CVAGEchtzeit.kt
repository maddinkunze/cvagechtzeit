package com.maddin.cvagechtzeit

import android.app.Application
import com.maddin.echtzeyt.ECHTZEYT_CONFIGURATION
import com.maddin.echtzeyt.EchtzeytApplication
import com.maddin.echtzeyt.components.DefaultVehicleTypeResolver
import com.maddin.echtzeyt.randomcode.IconLineDrawable
import com.maddin.transportapi.impl.germany.VMS

class CVAGEchtzeit : EchtzeytApplication() {
    override fun configure() {
        ECHTZEYT_CONFIGURATION.load(VMS("Chemnitz"))
        (ECHTZEYT_CONFIGURATION.vehicleTypeResolver as? DefaultVehicleTypeResolver)?.let {
            it.add(VMS.VT_CHEMNITZ_BAHN, drawable=IconLineDrawable(this, R.color.lineBackgroundChemnitzBahn, R.color.lineForegroundChemnitzBahn, R.drawable.ic_chemnitz_bahn).apply { iconSize = 1.1; iconGravityVertical = 0.7; iconPaddingLeft = 0.25 }, numberResolver={_, line -> line.name.trimStart { c -> c.lowercaseChar() == 'c' }})
        }
    }
}