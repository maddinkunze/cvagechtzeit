package com.maddin.cvagechtzeit

import com.maddin.echtzeyt.ECHTZEYT_CONFIGURATION
import com.maddin.echtzeyt.EchtzeytApplication
import com.maddin.echtzeyt.components.DefaultMOTTypeResolver
import com.maddin.echtzeyt.randomcode.IconLineDrawable
import com.maddin.transportapi.impl.germany.CVAG
import com.maddin.transportapi.impl.germany.ChemnitzBahn
import com.maddin.transportapi.impl.germany.VMS
import com.maddin.transportapi.impl.germany.VMSandCVAG

class CVAGEchtzeit : EchtzeytApplication() {

    override fun configure() {
        //ECHTZEYT_CONFIGURATION.load(VMS("Chemnitz"))
        //ECHTZEYT_CONFIGURATION.load(CVAG())
        ECHTZEYT_CONFIGURATION.load(VMSandCVAG())
        ECHTZEYT_CONFIGURATION.activityMap = MapActivity::class.java
    }

    override fun addMOTTypeBadges() {
        (ECHTZEYT_CONFIGURATION.motTypeResolver as? DefaultMOTTypeResolver)?.let { resolver ->
            resolver.add({ it is ChemnitzBahn }, drawable=IconLineDrawable(this, R.color.lineBackgroundChemnitzBahn, R.color.lineForegroundChemnitzBahn, R.color.lineForegroundHintDark, R.drawable.ic_chemnitz_bahn).apply { iconSize = 1.1; iconGravityVertical = 0.7; iconPaddingLeft = 0.25 }, numberResolver={ _, line, variant -> (variant?.name?:line.name)?.trimStart { c -> c.lowercaseChar() == 'c' }})
        }
        super.addMOTTypeBadges()
    }

    private fun migrateSettings() {
        
    }
}