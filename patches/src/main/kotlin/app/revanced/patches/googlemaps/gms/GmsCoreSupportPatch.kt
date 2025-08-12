package app.revanced.patches.googlemaps.gms

import app.revanced.patcher.patch.Option
import app.revanced.patches.all.misc.resources.addResources
import app.revanced.patches.all.misc.resources.addResourcesPatch
import app.revanced.patches.shared.misc.gms.gmsCoreSupportResourcePatch

@Suppress("unused")
val gmsCoreSupportResourcePatch = gmsCoreSupportResourcePatch(
    fromPackageName = "com.google.android.apps.maps",
    toPackageName = "app.revanced.android.apps.maps",
    gmsCoreVendorGroupIdOption = app.revanced.patcher.patch.stringOption(
        key = "gmsCoreVendorGroupId",
        default = "app.revanced"
    ),
    spoofedPackageSignature = "24bb24c05e47e0aefa68a58a766179d9b613a600", // microG signature
    executeBlock = {
        addResources("googlemaps", "gmsCoreSupportResourcePatch")
    },
) {
    dependsOn(addResourcesPatch)

	compatibleWith(
        "com.google.android.apps.maps"(
            "25.32.00.790560726",
        )
    )
}

private fun gmsCoreSupportResourcePatch(
    gmsCoreVendorGroupIdOption: Option<String>,
) = app.revanced.patches.shared.misc.gms.gmsCoreSupportResourcePatch(
    fromPackageName = "com.google.android.apps.maps",
    toPackageName = "app.revanced.android.apps.maps",
    gmsCoreVendorGroupIdOption = gmsCoreVendorGroupIdOption,
    spoofedPackageSignature = "24bb24c05e47e0aefa68a58a766179d9b613a600", // microG signature
    executeBlock = {
        addResources("googlemaps", "gmsCoreSupportResourcePatch")
    },
) {
    dependsOn(addResourcesPatch)
}
