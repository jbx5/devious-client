package net.runelite.client;

import com.google.inject.Inject;
import com.google.inject.Injector;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.script.Script;
import net.runelite.api.script.ScriptState;

public class BotService {

    @Inject
    private Client client;

    @Inject
    private Injector injector;

    @Setter
    @Getter
    private int mainSleep = 100;

    @Setter
    @Getter
    private boolean running = true;

    @SneakyThrows
    public void runScripts(final Script... scripts) {
        while (client.getGameState() == GameState.LOADING) {
            Thread.sleep(100);
        }

        while (isRunning()) {
            for (final ScriptState state : ScriptState.values()) {
                for (final Script script : scripts) {
                    Script s = script;
                    Script delegate = script.getDelegate();

                    if (delegate != null)
                        injector.injectMembers(delegate);

                    while (delegate != null && delegate.getDelegate() != null) {
                        s = delegate;
                        delegate = delegate.getDelegate();
                        injector.injectMembers(delegate);
                    }

                    if (delegate != null) {
                        final Runnable task = delegate.getExecQueue(state).remove();

                        if (delegate.getState() == ScriptState.STOP) {
                            s.yield(null);
                        }

                        if (task != null) {
                            task.run();
                        }
                        continue;
                    }

                    final Runnable task = script.getExecQueue(state).remove();

                    if (task != null) {
                        task.run();
                    }
                }
            }

            Thread.sleep(mainSleep);
        }
    }
}
