# external-plugin-example
An exanple external plugin for OpenOSRS written in Kotlin. At the moment the easiest way to implement the OpenOSRS dependencies is by 
making sure that they are in your local Maven repo by runnig the publishToLocal task on the main project. Once your dependencies are in order 
just build the jar and drag it to your external plugins folder. You will know that everything worked right if you see the plugin's config
after re-launching OPRS.
