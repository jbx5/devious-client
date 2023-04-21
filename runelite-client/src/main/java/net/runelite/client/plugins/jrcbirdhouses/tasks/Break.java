package net.runelite.client.plugins.jrcbirdhouses.tasks;

import net.unethicalite.api.game.Game;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesPlugin;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesConfig;

import javax.inject.Inject;

public class Break extends BirdHouseTask
{
    @Inject
    private JRCBirdHousesConfig config;

    public Break(JRCBirdHousesPlugin context)
    {
        super(context);
    }

    @Override
    public boolean validate()
    {
        return config.logout();
    }

    @Override
    public int execute()
    {
        if (Game.isLoggedIn())
        {
            Game.logout();
        }

        return -1;
    }
}
