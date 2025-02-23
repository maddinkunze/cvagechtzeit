package com.maddin.cvagechtzeit

import com.maddin.echtzeyt.activities.MapActivity
import com.maddin.echtzeyt.randomcode.InstanceData
import com.maddin.echtzeyt.randomcode.ModelSubLayer
import com.maddin.echtzeyt.randomcode.WavefrontModel
import org.oscim.core.GeoPoint


class MapActivity : MapActivity() {
    override fun initCustomModels(layer: ModelSubLayer) {
        super.initCustomModels(layer)
        val model = WavefrontModel(resources.openRawResource(R.raw.lulatsch), resources.openRawResource(R.raw.lulatschmtl))
        val instance = InstanceData(GeoPoint(50.857770, 12.923902), scale=1.4)
        layer.createModelInstance(model, instance)
    }
}