group = "app.revanced"

patches {
    about {
        name = "Maps Deltarune Weird Route Jingle"
        description = "Replace rerouting sound with Deltarune weird route jingle"
        source = "git@github.com:sticks-stuff/maps-weird-route.git"
        author = "sharlot"
        contact = "@stick_twt"
        website = "https://twitter.com/stick_twt"
        license = "GNU General Public License v3.0"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}