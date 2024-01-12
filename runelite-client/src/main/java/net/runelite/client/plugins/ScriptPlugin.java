package net.runelite.client.plugins;

import com.google.inject.Injector;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.script.Script;
import net.runelite.client.BotService;
import net.runelite.client.eventbus.EventBus;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public abstract class ScriptPlugin extends Plugin {
    @Inject
    private volatile Client client;

    public final Map<String, Object> properties = new HashMap<>();

    final ThreadGroup group = new ThreadGroup("main");

    BotService botService;

    private void init(Map<String, Object> properties, final Class<? extends Script>... classes)
    {
        botService = new BotService();
        injector.injectMembers(botService);

        final Injector childInjector = injector.createChildInjector();
        final Script[] scripts = new Script[classes.length];
        try {
            for (int i = 0; i < classes.length; i++) {
                final Script script = classes[i].newInstance();
                childInjector.injectMembers(script);
                injector.getInstance(EventBus.class).register(script);
                scripts[i] = script;
            }

            for (final Script script : scripts) {
                script.addProperties(properties);
            }

            botService.runScripts(scripts);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    protected void startBot(Map<String, Object> properties, final Class<? extends Script>... classes)
    {

        final Thread thread = new Thread(group, () -> {
            init(properties, classes);
        });
        thread.start();
    }

    protected void stopBot()
    {
        group.interrupt();
        if(botService != null) {
            botService.setRunning(false);
        }

    }
}
