package dev.hoot.api.movement;

import dev.hoot.api.commons.Rand;
import dev.hoot.api.entities.Players;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import dev.hoot.api.movement.pathfinder.*;
import dev.hoot.api.packets.MovementPackets;
import dev.hoot.api.scene.Tiles;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.ui.overlay.OverlayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Movement {
    private static final Logger logger = LoggerFactory.getLogger(Movement.class);
    private static final Color TILE_BLOCKED_COLOR = new Color(0, 128, 255, 128);
    private static final Color TRANSPORT_COLOR = new Color(0, 255, 0, 128);

    private static final int STAMINA_VARBIT = 25;
    private static final int RUN_VARP = 173;

    public static void setDestination(int worldX, int worldY) {
        MovementPackets.sendMovement(worldX, worldY, Movement.isRunEnabled());
        Game.getClient().setDestinationX(worldX - Game.getClient().getBaseX());
        Game.getClient().setDestinationY(worldY - Game.getClient().getBaseY());
    }

    public static WorldPoint getDestination() {
        LocalPoint local = Game.getClient().getLocalDestinationLocation();
        if (local == null) {
            return null;
        }

        return WorldPoint.fromLocal(Game.getClient(), local);
    }

    public static boolean isWalking() {
        Player local = Players.getLocal();
        LocalPoint destination = Game.getClient().getLocalDestinationLocation();
        return local.isMoving()
                && destination != null
                && destination.distanceTo(local.getLocalLocation()) > 4;
    }

    public static void walk(Point point) {
        Game.getClient().interact(0, MenuAction.WALK.getId(), point.getX(), point.getY());
    }

    public static void walk(WorldPoint worldPoint) {
        Player local = Game.getClient().getLocalPlayer();
        if (local == null) {
            return;
        }

        WorldPoint walkPoint = worldPoint;
        Tile destinationTile = Tiles.getAt(worldPoint);
        // Check if tile is in loaded client scene
        if (destinationTile == null) {
            logger.debug("Destination {} is not in scene", worldPoint);
            Tile nearestInScene = Tiles.getTiles()
                    .stream()
                    .min(Comparator.comparingInt(x -> x.getWorldLocation().distanceTo(local.getWorldLocation())))
                    .orElse(null);
            if (nearestInScene == null) {
                logger.debug("Couldn't find nearest walkable tile");
                return;
            }

            walkPoint = nearestInScene.getWorldLocation();
        }

        Game.getClient().interact(0, MenuAction.WALK.getId(), walkPoint.getX(), walkPoint.getY());
    }

    public static void walk(WorldArea worldArea) {
        Player local = Players.getLocal();

        if (worldArea.contains(local.getWorldLocation())) {
            return;
        }

        List<WorldPoint> walkPointList = worldArea.toWorldPointList();
        List<WorldPoint> losPoints = new ArrayList<>();

        for (WorldPoint point : walkPointList) {
            if (!Reachable.isWalkable(point)) {
                continue;
            }
            losPoints.add(point);
        }
        WorldPoint walkPoint = losPoints.get(Rand.nextInt(0, walkPointList.size()-1));
        Movement.walk(walkPoint);
    }

    public static void walk(Locatable locatable) {
        walk(locatable.getWorldLocation());
    }

    public static boolean walkTo(WorldPoint worldPoint, int radius) {
        WorldPoint wp = new WorldPoint(
                worldPoint.getX() + Rand.nextInt(-radius, radius),
                worldPoint.getY() + Rand.nextInt(-radius, radius),
                worldPoint.getPlane());
        return Walker.walkTo(wp, false);
    }

    public static boolean walkTo(WorldArea worldArea) {
        List<WorldPoint> wpList = worldArea.toWorldPointList();
        WorldPoint wp = wpList.get(Rand.nextInt(0, wpList.size()-1));
        return Walker.walkTo(wp, false);
    }

    public static boolean walkTo(WorldPoint worldPoint) {
        return Walker.walkTo(worldPoint, false);
    }

    public static boolean walkTo(Locatable locatable) {
        return walkTo(locatable.getWorldLocation());
    }

    public static boolean walkTo(BankLocation bankLocation) {
        return walkTo(bankLocation.getArea().toWorldPoint());
    }

    public static boolean walkTo(int x, int y) {
        return walkTo(x, y, Game.getClient().getPlane());
    }

    public static boolean walkTo(int x, int y, int plane) {
        return walkTo(new WorldPoint(x, y, plane));
    }

    public static boolean isRunEnabled() {
        return Game.getClient().getVarpValue(RUN_VARP) == 1;
    }

    public static void drawPath(Graphics2D graphics2D, WorldPoint destination) {
        drawPath(graphics2D, destination, false);
    }

    public static void drawPath(Graphics2D graphics2D, WorldPoint destination, boolean localRegion) {
        Walker.buildPath(destination, localRegion)
                .forEach(tile -> tile.outline(Game.getClient(), graphics2D, Color.RED, null));
        destination.outline(Game.getClient(), graphics2D, Color.GREEN, "Destination");
    }

    public static void drawCollisions(Graphics2D graphics2D, CollisionMap collisionMap) {
        Client client = Game.getClient();
        List<Tile> tiles = Tiles.getTiles();

        if (tiles.isEmpty()) {
            return;
        }

        List<Transport> transports = TransportLoader.buildTransports();

        for (Transport transport : transports) {
            OverlayUtil.fillTile(graphics2D, client, transport.getSource(), TRANSPORT_COLOR);
            Point center = Perspective.tileCenter(client, transport.getSource());
            if (center == null) {
                continue;
            }

            Point linkCenter = Perspective.tileCenter(client, transport.getDestination());
            if (linkCenter == null) {
                continue;
            }

            graphics2D.drawLine(center.getX(), center.getY(), linkCenter.getX(), linkCenter.getY());
        }

        if (collisionMap == null) {
            return;
        }

        for (Tile tile : tiles) {
            Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
            if (poly == null) {
                continue;
            }

            StringBuilder sb = new StringBuilder("");
            graphics2D.setColor(Color.WHITE);
            if (!collisionMap.n(tile.getWorldLocation())) {
                sb.append("n");
            }

            if (!collisionMap.s(tile.getWorldLocation())) {
                sb.append("s");
            }

            if (!collisionMap.w(tile.getWorldLocation())) {
                sb.append("w");
            }

            if (!collisionMap.e(tile.getWorldLocation())) {
                sb.append("e");
            }

            String s = sb.toString();
            if (s.isEmpty()) {
                continue;
            }

            if (!s.equals("nswe")) {
                graphics2D.setColor(Color.WHITE);
                if (s.contains("n")) {
                    graphics2D.drawLine(poly.xpoints[3], poly.ypoints[3], poly.xpoints[2], poly.ypoints[2]);
                }

                if (s.contains("s")) {
                    graphics2D.drawLine(poly.xpoints[0], poly.ypoints[0], poly.xpoints[1], poly.ypoints[1]);
                }

                if (s.contains("w")) {
                    graphics2D.drawLine(poly.xpoints[0], poly.ypoints[0], poly.xpoints[3], poly.ypoints[3]);
                }

                if (s.contains("e")) {
                    graphics2D.drawLine(poly.xpoints[1], poly.ypoints[1], poly.xpoints[2], poly.ypoints[2]);
                }

                continue;
            }

            graphics2D.setColor(TILE_BLOCKED_COLOR);
            graphics2D.fill(poly);
        }
    }

    public static void drawCollisions(Graphics2D graphics2D) {
        drawCollisions(graphics2D, Game.getGlobalCollisionMap());
    }

    public static void toggleRun() {
        Widget widget = Widgets.get(WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
        if (widget != null) {
            widget.interact("Toggle Run");
        }
    }

    public static boolean isStaminaBoosted() {
        return Vars.getBit(STAMINA_VARBIT) == 1;
    }

    public static int calculateDistance(WorldPoint destination) {
        return calculateDistance(destination, false);
    }

    public static int calculateDistance(WorldPoint destination, boolean localRegion) {
        List<WorldPoint> path = Walker.buildPath(destination, localRegion);

        if (path.size() < 2) {
            return 0;
        }

        Iterator<WorldPoint> it = path.iterator();
        WorldPoint prev = it.next();
        WorldPoint current;
        int distance = 0;

        // WorldPoint#distanceTo() returns max int when planes are different, but since the pathfinder can traverse
        // obstacles, we just add one to the distance to account for whatever obstacle is in between the current point
        // and the next.
        while (it.hasNext()) {
            current = it.next();
            if (prev.getPlane() != current.getPlane()) {
                distance += 1;
            } else {
                distance += Math.max(Math.abs(prev.getX() - current.getX()), Math.abs(prev.getY() - current.getY()));
            }
        }
        return distance;
    }

    /**
     * Uses the regional collisionmap
     */
    public static class Local {
        public static boolean walkTo(WorldPoint worldPoint) {
            return Walker.walkTo(worldPoint, true);
        }

        public static boolean walkTo(Locatable locatable) {
            return walkTo(locatable.getWorldLocation());
        }

        public static boolean walkTo(BankLocation bankLocation) {
            return walkTo(bankLocation.getArea().toWorldPoint());
        }

        public static boolean walkTo(int x, int y) {
            return walkTo(x, y, Game.getClient().getPlane());
        }

        public static boolean walkTo(int x, int y, int plane) {
            return walkTo(new WorldPoint(x, y, plane));
        }
    }
}
