// package app.revanced.patches.googlemaps.certificate

// import app.revanced.patcher.patch.bytecodePatch
// import app.revanced.util.returnEarly
// import app.revanced.patches.googlemaps.fingerprint.checkCertificateFingerprint

// @Suppress("unused")
// val bypassCertificateChecksPatch = bytecodePatch(
//     name = "Bypass certificate checks",
//     description = "Bypasses certificate checks which prevent Google Maps from running when the package name or signature is changed.",
// ) {
//     compatibleWith(
//         "com.google.android.apps.maps"(
//             "25.32.00.790560726",
//         )
//     )

//     execute {
//         checkCertificateFingerprint.method.returnEarly(true)
//     }
// }
