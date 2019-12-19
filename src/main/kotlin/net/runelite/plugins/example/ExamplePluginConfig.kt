package net.runelite.plugins.example

import net.runelite.client.config.ConfigItem
import net.runelite.client.config.Config
import net.runelite.client.config.ConfigGroup
import net.runelite.client.config.ConfigTitleSection
import net.runelite.client.config.Title

@ConfigGroup("kotlin")
public interface ExamplePluginConfig : Config {
    @ConfigTitleSection(
        keyName = "kotlinConfig",
        position = 0,
        name = "Kotlin Config",
        description = ""
    )
    fun kotlinConfig() = Title()

    @ConfigItem(
        position = 1,
        keyName = "enabled",
        name = "Enabled",
        description = ""
    )
    fun enabled() = true
}