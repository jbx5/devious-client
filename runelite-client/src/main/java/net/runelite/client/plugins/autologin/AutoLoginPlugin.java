package net.runelite.client.plugins.autologin;

import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.events.LobbyWorldSelectToggled;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.events.WorldHopped;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.script.blocking_events.WelcomeScreenEvent;
import net.unethicalite.api.widgets.Widgets;
import org.jboss.aerogear.security.otp.Totp;
import org.pf4j.Extension;

@PluginDescriptor(name = "JRC Auto Login", enabledByDefault = false)
@Extension
@Slf4j
public class AutoLoginPlugin extends Plugin
{
    @Inject
    private AutoLoginConfig config;

    @Inject
    private Client client;

    @Inject
    private ConfigManager configManager;

    @Provides
    public AutoLoginConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(AutoLoginConfig.class);
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged e)
    {
        if(e.getGameState() == GameState.LOGIN_SCREEN && client.getLoginIndex() == 0)
        {
            prepareLogin();
        }
    }

    @Subscribe
    private void onLoginStateChanged(LoginStateChanged e)
    {
        switch(e.getIndex())
        {
            case 2:
                login();
                break;
            case 4:
                enterAuth();
                break;
            case 24:
                prepareLogin();
                client.getCallbacks().post(new LoginStateChanged(2));
                break;
        }
    }

    @Subscribe
    private void onWorldHopped(WorldHopped e)
    {
        if(config.lastWorld())
        {
            configManager.setConfiguration("autologin", "world", e.getWorldId());
        }
    }

    @Subscribe
    private void onWidgetHiddenChanged(WidgetLoaded e)
    {
        if(!config.welcomeScreen())
        {
            return;
        }

        int group = e.getGroupId();
        if(group == 378 || group == 413)
        {
            Widget playButton = WelcomeScreenEvent.getPlayButton();
            if(Widgets.isVisible(playButton))
            {
                client.invokeWidgetAction(1, playButton.getId(), -1, -1, "");
            }
        }
    }

    @Subscribe
    private void onLobbyWorldIdSelectToggled(LobbyWorldSelectToggled e)
    {
        if(e.isOpened())
        {
            client.setWorldSelectOpen(false);

            if(config.useWorld())
            {
                World selectedWorld = Worlds.getFirst(config.world());
                if(selectedWorld != null)
                {
                    client.changeWorld(selectedWorld);
                }
            }
        }

        client.promptCredentials(false);
    }

    @Subscribe
    private void onPluginChanged(PluginChanged e)
    {
        if(e.getPlugin() != this)
        {
            return;
        }

        if (e.isLoaded() && Game.getState() == GameState.LOGIN_SCREEN)
        {
            prepareLogin();
            client.getCallbacks().post(new LoginStateChanged(2));
        }
    }

    private void prepareLogin()
    {
        if(config.useWorld() && client.getWorld() != config.world())
        {
            client.loadWorlds();
        }
        else
        {
            client.promptCredentials(false);
        }
    }

    private void login()
    {
        client.setUsername(config.username());
        client.setPassword((config.password()));
        Keyboard.sendEnter();
        //Mouse.click(299,322,true);
    }

    private void enterAuth()
    {
        client.setOtp(new Totp(config.auth()).now());
        Keyboard.sendEnter();
    }

}
