
package app.revanced.patches.googlemaps.weird_route

import app.revanced.patcher.patch.resourcePatch
import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patches.all.misc.resources.addResources
import app.revanced.patches.all.misc.resources.addResourcesPatch
import app.revanced.util.ResourceGroup
import app.revanced.util.copyResources

private val weirdRouteResourcePatch = resourcePatch {
    dependsOn(
        addResourcesPatch,
    )

    execute {
        addResources("googlemaps", "weird_route.weirdRouteResourcePatch")
        copyResources(
            "googlemaps",
            ResourceGroup("raw", "snd_ominous.ogg"),
        )
    }
}

@Suppress("unused")
val weirdRouteJinglePatch = bytecodePatch(
    name = "Maps Deltarune Weird Route Jingle",
    description = "Replace rerouting sound with Deltarune weird route jingle"
) {
    dependsOn(
        weirdRouteResourcePatch,
    )

    compatibleWith(
        "com.google.android.apps.maps"(
            "25.32.00",
        )
    )

    execute {
    }
}