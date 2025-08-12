
package app.revanced.patches.googlemaps.weird_route

import app.revanced.patcher.patch.resourcePatch
import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patches.all.misc.resources.addResources
import app.revanced.patches.all.misc.resources.addResourcesPatch
import app.revanced.util.ResourceGroup
import app.revanced.util.copyResources
// import app.revanced.patches.googlemaps.gms.gmsCoreSupportResourcePatch
// import app.revanced.patches.googlemaps.permissions.renamePermissionsPatch
// import app.revanced.patches.googlemaps.certificate.bypassCertificateChecksPatch


private val weirdRouteResourcePatch = resourcePatch {
    dependsOn(
        addResourcesPatch,
    )

    execute {
        addResources("googlemaps", "weird_route.weirdRouteResourcePatch")
        // Overwrite the rerouting sound by providing a file with the same name as the original
        copyResources(
            "googlemaps",
            ResourceGroup("raw", "da_traffic_report_dring_dring.ogg"),
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
        // gmsCoreSupportResourcePatch,
        // renamePermissionsPatch,
        // bypassCertificateChecksPatch,
    )

    compatibleWith(
        "com.google.android.apps.maps"(
            "25.32.00.790560726",
            "10.62.1",
        )
    )

    execute {
    }
}