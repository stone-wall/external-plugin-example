# External Open-OSRS Plugin - Kotlin 

## Dependency Setup
Add the following repository to your gradle build script:
`     maven("https://dl.bintray.com/oprs/")`

That will allow you to resolve the OpenOSRS dependencies as such:
``     implementation("open-osrs:runelite-api:1.5.44")
    implementation("open-osrs:runelite-client:1.5.44")``
An example external plugin for OpenOSRS written in Kotlin. ~~At the moment the easiest way to implement the OpenOSRS dependencies is by 
making sure that they are in your local Maven repo by runnig the publishToLocal task on the main project.~~ Once your dependencies are in order 
just build the jar and drag it to your external plugins folder. You will know that everything worked right if you see the plugin's config
after re-launching OPRS.
