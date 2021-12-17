package dev.hoot.api.game;

import dev.hoot.api.commons.Rand;
import dev.hoot.api.commons.Time;
import dev.hoot.api.input.Mouse;
import dev.hoot.api.widgets.Dialog;
import dev.hoot.api.widgets.Tab;
import dev.hoot.api.widgets.Tabs;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.WorldService;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Worlds {
    private static final Point LOBBY_WORLD_SELECTOR = new Point(20, 475);
    private static final Point CLOSE_LOBBY_SELECTOR = new Point(715, 10);
    private static final Logger logger = LoggerFactory.getLogger(Worlds.class);

    @Inject
    private static Client client;

    @Inject
    private static WorldService worldService;

    private static List<World> lookup() {
        List<World> out = new ArrayList<>();
        WorldResult lookup = worldService.getWorlds();
        if (lookup == null) {
            return Collections.emptyList();
        }

        lookup.getWorlds().forEach(w -> {
            World world = client.createWorld();
            world.setActivity(w.getActivity());
            world.setAddress(w.getAddress());
            world.setId(w.getId());
            world.setPlayerCount(w.getPlayers());
            world.setLocation(w.getLocation());
            world.setTypes(WorldUtil.toWorldTypes(w.getTypes()));
            out.add(world);
        });

        return out;
    }

    public static List<World> getAll(Predicate<World> filter) {
        List<World> out = new ArrayList<>();
        List<World> loadedWorlds;

        try {
            World[] worlds = Game.getClient().getWorldList();
            if (worlds == null) {
                loadWorlds();
                return out;
            }

            loadedWorlds = Arrays.asList(worlds);
        } catch (Exception e) {
            logger.warn("Game couldn't load worlds, falling back to RuneLite API.");
            loadedWorlds = lookup();
        }

        for (World world : loadedWorlds) {
            if (filter.test(world)) {
                out.add(world);
            }
        }

        return out;
    }

    public static World getFirst(Predicate<World> filter) {
        return getAll(filter)
                .stream()
                .findFirst()
                .orElse(null);
    }

    public static World getFirst(int id) {
        return getFirst(x -> x.getId() == id);
    }

    public static World getRandom(Predicate<World> filter) {
        List<World> all = getAll(filter);
        return all.get(Rand.nextInt(0, all.size()));
    }

    public static int getCurrentId() {
        return Game.getClient().getWorld();
    }

    public static void hopTo(World world) {
        hopTo(world, false);
    }

    public static void hopTo(World world, boolean spam) {
        if (!isHopperOpen()) {
            openHopper();
            Time.sleepUntil(Worlds::isHopperOpen, 3000);
        }

        Widget rememberOption = Dialog.getOptions().stream()
                .filter(x -> x.getText().contains("Yes. In future, only warn about"))
                .findFirst()
                .orElse(null);
        if (rememberOption != null && !GameThread.invokeLater(rememberOption::isHidden)) {
            Dialog.chooseOption(2);
            Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
            return;
        }

        Game.getClient().hopToWorld(world);
        if (!spam) {
            Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
        }

        if (Dialog.isViewingOptions()) {
            Dialog.chooseOption(2);
            Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
        }
    }

    public static World getCurrentWorld() {
        return getFirst(Game.getClient().getWorld());
    }

    public static boolean inMembersWorld() {
        return lookup().stream().filter(x -> x.getId() == getCurrentId())
                .findFirst()
                .get().isMembers();
    }

    public static void loadWorlds() {
        if (Game.isOnLoginScreen()) {
            Game.getClient().loadWorlds();
            Time.sleep(200);
            closeLobbyWorlds();
            return;
        }

        if (Game.isLoggedIn()) {
            openHopper();
        }
    }

    public static void openHopper() {
        if (!Tabs.isOpen(Tab.LOG_OUT)) {
            Tabs.open(Tab.LOG_OUT);
        }

        Game.getClient().openWorldHopper();
    }

    public static void openLobbyWorlds() {
        Mouse.click(LOBBY_WORLD_SELECTOR, true);
    }

    public static void closeLobbyWorlds() {
        Mouse.click(CLOSE_LOBBY_SELECTOR, true);
    }

    public static boolean isHopperOpen() {
        Widget hopper = Widgets.get(WidgetInfo.WORLD_SWITCHER_LIST);
        return hopper != null && !GameThread.invokeLater(hopper::isHidden);
    }
}
