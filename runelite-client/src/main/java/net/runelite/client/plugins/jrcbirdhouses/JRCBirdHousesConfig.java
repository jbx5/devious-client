package net.runelite.client.plugins.jrcbirdhouses;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.plugins.jrcbirdhouses.model.BirdHouseType;
import net.runelite.client.plugins.jrcbirdhouses.model.SeedType;

@ConfigGroup("jrcbirdhouses")
public interface JRCBirdHousesConfig extends Config
{
    @ConfigItem(
            keyName = "type",
            name = "Birdhouse Type",
            description = ""
    )
    default BirdHouseType type()
    {
        return BirdHouseType.NORMAL;
    }

    @ConfigItem(
            keyName = "seedType",
            name = "Seed Type",
            description = ""
    )
    default SeedType seedType()
    {
        return SeedType.BARLEY_SEED;
    }

    @ConfigItem(
            keyName = "logout",
            name = "Log out when idle",
            description = ""
    )
    default boolean logout()
    {
        return true;
    }
}