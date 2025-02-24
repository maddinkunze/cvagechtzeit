package com.maddin.cvagechtzeit

import com.maddin.echtzeyt.activities.MapActivity
import com.maddin.echtzeyt.randomcode.InstanceData
import com.maddin.echtzeyt.randomcode.ModelLayer
import com.maddin.echtzeyt.randomcode.WavefrontModel
import org.oscim.core.GeoPoint
import kotlin.concurrent.thread


class MapActivity : MapActivity() {
    override fun initCustomModels(layer: ModelLayer) {
        super.initCustomModels(layer)

        thread(start=true, isDaemon=true) {
            val model = WavefrontModel(resources.openRawResource(R.raw.lulatsch), resources.openRawResource(R.raw.lulatschmtl))
            model.initNonGlThread()
            val instance = InstanceData(GeoPoint(50.857770, 12.923902), scale=1.4)
            layer.createModelInstance(model, instance)
        }
    }
}