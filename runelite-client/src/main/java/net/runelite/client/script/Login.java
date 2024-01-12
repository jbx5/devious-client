package net.runelite.client.script;

import lombok.SneakyThrows;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.script.PollingScript;
import net.runelite.api.script.ScriptManifest;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.WorldClient;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.http.api.worlds.WorldType;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import javax.inject.Inject;
import java.io.IOException;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;

@ScriptManifest(
    name = "Login",
    desc = "Login"
)
public class Login extends PollingScript {

    @Inject
    private WorldService worldService;

    @Inject
    private ClientThread clientThread;

    public Login() {
        super(0);
    }

    @Override
    @SneakyThrows
    public void poll() {
        client.setUsername((String)getProperty("USERNAME"));
        client.setPassword((String)getProperty("PASSWORD"));

        final World world = getGameWorld();

        if (world != null && client.getGameState() != GameState.LOGGING_IN) {
            client.changeWorld(world);
            clientThread.invoke(() -> {
                client.setGameState(GameState.LOGGING_IN);
            });
        } else if (world == null) {
            System.err.println("No game world found!");
        }
        sleep(6000);
    }

    @Override
    public boolean validate() {
        return client.getGameState() == GameState.LOGIN_SCREEN && getProperty("USERNAME") != null && getProperty("PASSWORD") != null;
    }

    private World getGameWorld() {

        Optional<net.runelite.http.api.worlds.World> optional = worldService.getWorlds().getWorlds().stream().filter(Objects::nonNull)
                .filter(w -> w.getId() == 421)
                .filter(w -> w.getTypes().contains(WorldType.MEMBERS))
                .filter(w -> !w.getTypes().contains(WorldType.PVP))
                .filter(w -> !w.getTypes().contains(WorldType.DEADMAN))
//                .filter(w -> !w.getTypes().contains(WorldType.SKILL_TOTAL))
                .filter(w -> !w.getTypes().contains(WorldType.HIGH_RISK))
                .findFirst();
//                    .filter(w -> "true".equals(getProperty("member")) == w.getTypes().contains(WorldType.MEMBERS))
//                    .filter(w -> w.getTypes().contains(WorldType.PVP))
//                    .filter(w -> !w.getTypes().contains(WorldType.DEADMAN))
//                    .filter(w -> !w.getTypes().contains(WorldType.SKILL_TOTAL))
//                    .filter(w -> !w.getTypes().contains(WorldType.HIGH_RISK));

//                    .min(Comparator.comparingInt(net.runelite.http.api.worlds.World::getPlayers));

        if (optional.isPresent()) {
            net.runelite.http.api.worlds.World w = optional.get();

            World world = client.createWorld();
            world.setId(w.getId());
            world.setAddress(w.getAddress());
            world.setActivity(w.getActivity());
            world.setPlayerCount(w.getPlayers());
            world.setLocation(w.getLocation());
            world.setTypes(convertTypes(w.getTypes()));

            return world;
        }

        return null;
    }

    private EnumSet<net.runelite.api.WorldType> convertTypes(final EnumSet<WorldType> types) {
        final EnumSet<net.runelite.api.WorldType> set = EnumSet.noneOf(net.runelite.api.WorldType.class);

        for (final WorldType type : types) {
            set.add(net.runelite.api.WorldType.valueOf(type.name()));
        }

        return set;
    }
}
