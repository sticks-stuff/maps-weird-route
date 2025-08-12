// package app.revanced.patches.googlemaps.permissions

// import app.revanced.patcher.patch.PatchException
// import app.revanced.patcher.patch.resourcePatch
// import app.revanced.util.asSequence
// import app.revanced.util.getNode
// import org.w3c.dom.Element

// @Suppress("unused")
// val renamePermissionsPatch = resourcePatch(
//     name = "Rename shared permissions",
//     description = "Rename certain permissions shared across Google Maps and its clones. " +
//             "Applying this patch can fix installation errors when changing the package name.",
//     use = true
// ) {
//     compatibleWith("com.google.android.apps.maps")

//     execute {
//         document("AndroidManifest.xml").use { document ->
//             val manifest = document.getNode("manifest") as Element

//             val permissions = manifest
//                 .getElementsByTagName("permission")
//                 .asSequence()
//                 .map { Pair(it as Element, it.getAttribute("android:name")) }
//                 .filter { (_, name) -> name.startsWith("com.google.android.apps.maps.permission.") }

//             if (permissions.none()) throw PatchException("Could not find any permissions to rename")

//             permissions.forEach { (element, name) ->
//                 element.setAttribute("android:name", "revanced.$name")
//             }
//         }
//     }
// }
