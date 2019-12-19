package net.runelite.plugins.example

import com.google.inject.Inject
import com.google.inject.Provides
import net.runelite.client.config.ConfigManager
import net.runelite.client.eventbus.Subscribe
import net.runelite.client.events.ConfigChanged
import net.runelite.client.plugins.Plugin
import net.runelite.client.plugins.PluginDescriptor
import net.runelite.client.plugins.PluginType
import org.pf4j.Extension

@Extension

@PluginDescriptor(
        name = "Example Kotlin Plugin",
        description = "",
        developerPlugin = false,
        type = PluginType.EXTERNAL,
        tags = ["kotlin", "poop", "blaze", "my butt"]
)
public class ExampleKotlinPlugin : Plugin() {

    @Inject
    lateinit var configManager: ConfigManager

    @Provides
    fun getConfig(configManager: ConfigManager): ExamplePluginConfig {
        return configManager.getConfig(ExamplePluginConfig::class.java)
    }

    override fun startUp() {
        println("${javaClass.name} has started")
    }

    @Subscribe
    fun onConfigChanged(event: ConfigChanged) {
        when (event.group == "kotlin") {
            true -> println("Yo thats our config")
            else -> return
        }
    }

    override fun shutDown() {
        println("${javaClass.name} is shutting down")
    }


}