package net.unethicalite.api.movement;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.util.Comparator;
import java.util.List;

@Slf4j
public class Movement
{
	private static final int STAMINA_VARBIT = 25;
	private static final int RUN_VARP = 173;


	public static void setDestination(int sceneX, int sceneY)
	{
		Static.getClient().setSelectedSceneTileX(sceneX);
		Static.getClient().setSelectedSceneTileY(sceneY);
		Static.getClient().setViewportWalking(true);
	}

	public static WorldPoint getDestination()
	{
		Client client = Static.getClient();
		if (client.getDestinationX() == 0 && client.getDestinationY() == 0)
		{
			return null;
		}

		return new WorldPoint(
				client.getDestinationX() + client.getBaseX(),
				client.getDestinationY() + client.getBaseY(),
				client.getPlane()
		);
	}

	public static boolean isWalking()
	{
		Player local = Players.getLocal();
		WorldPoint destination = getDestination();
		return local.isMoving()
				&& destination != null
				&& destination.distanceTo(local) > 4;
	}

	public static void walk(WorldPoint worldPoint)
	{
		Client client = Static.getClient();
		Player local = client.getLocalPlayer();
		if (local == null)
		{
			return;
		}

		WorldPoint walkPoint = worldPoint;
		Tile destinationTile = Tiles.getAt(worldPoint);
		// Check if tile is in loaded client scene
		if (destinationTile == null)
		{
			log.debug("Destination {} is not in scene", worldPoint);
			Tile nearestInScene = Tiles.getAll()
					.stream()
					.min(Comparator.comparingInt(x -> x.getWorldLocation().distanceTo(local.getWorldLocation())))
					.orElse(null);
			if (nearestInScene == null)
			{
				log.debug("Couldn't find nearest walkable tile");
				return;
			}

			walkPoint = nearestInScene.getWorldLocation();
		}

		int sceneX = walkPoint.getX() - client.getBaseX();
		int sceneY = walkPoint.getY() - client.getBaseY();
		Point canv = Perspective.localToCanvas(client, LocalPoint.fromScene(sceneX, sceneY), client.getPlane());
		int x = canv != null ? canv.getX() : -1;
		int y = canv != null ? canv.getY() : -1;

		client.interact(
				0,
				MenuAction.WALK.getId(),
				sceneX,
				sceneY,
				x,
				y
		);
	}

	public static boolean walkTo(WorldArea worldArea)
	{
		return Walker.walkTo(worldArea);
	}

	public static void walk(Locatable locatable)
	{
		walk(locatable.getWorldLocation());
	}

	public static boolean walkTo(WorldPoint worldPoint)
	{
		return Walker.walkTo(worldPoint);
	}

	public static boolean walkTo(Locatable locatable)
	{
		return walkTo(locatable.getWorldLocation());
	}

	public static boolean walkTo(BankLocation bankLocation)
	{
		return walkTo(bankLocation.getArea());
	}

	public static boolean walkTo(int x, int y)
	{
		return walkTo(x, y, Static.getClient().getPlane());
	}

	public static boolean walkTo(int x, int y, int plane)
	{
		return walkTo(new WorldPoint(x, y, plane));
	}

	public static boolean walkToInteract(Actor actor, String action)
	{
		if (actor == null)
			return false;
		return walkToInteract(actor, action, actor.getWorldLocation());
	}

	public static boolean walkToInteract(Actor actor, String action, WorldPoint worldPoint)
	{
		return walkToInteract(actor, action, worldPoint.toWorldArea());
	}

	public static boolean walkToInteract(Actor actor, String action, WorldArea worldArea)
	{
		Player local = Players.getLocal();

		// Interact if possible and not already
		if (actor != null && Reachable.isInteractable(actor) && local.getInteracting() == null)
		{
			actor.interact(action);
			return true;
		}

		// walkTo if not reachable or far away
		if (actor == null || actor.distanceTo(local) > 20 || !Reachable.isInteractable(actor))
		{
			return Movement.walkTo(worldArea);
		}
		return true;
	}

	public static boolean walkToInteract(TileObject tileObject, String action)
	{
		if (tileObject == null)
			return false;
		return walkToInteract(tileObject, action, tileObject.getWorldLocation());
	}

	public static boolean walkToInteract(TileObject tileObject, String action, WorldPoint worldPoint)
	{
		return walkToInteract(tileObject, action, worldPoint.toWorldArea());
	}

	public static boolean walkToInteract(TileObject tileObject, String action, WorldArea worldArea)
	{
		Player local = Players.getLocal();

		// Cancel walkTo when interactable
		if (tileObject != null && Reachable.isInteractable(tileObject) && local.isIdle())
		{
			tileObject.interact(action);
			return true;
		}

		// walkTo if not reachable or far away
		if (tileObject == null || tileObject.distanceTo(local) > 20 || !Reachable.isInteractable(tileObject))
		{
			return Movement.walkTo(worldArea);
		}
		return true;
	}

	public static boolean isRunEnabled()
	{
		return Vars.getVarp(RUN_VARP) == 1;
	}

	public static void toggleRun()
	{
		Widget widget = Widgets.get(WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
		if (widget != null)
		{
			widget.interact("Toggle Run");
		}
	}

	public static boolean isStaminaBoosted()
	{
		return Vars.getBit(STAMINA_VARBIT) == 1;
	}

	public static int getRunEnergy()
	{
		return Static.getClient().getEnergy() / 100;
	}

	public static int calculateDistance(WorldArea destination)
	{
		return Walker.calculatePath(destination).size();
	}

	public static int calculateDistance(WorldPoint start, WorldArea destination)
	{
		return calculateDistance(List.of(start), destination);
	}

	public static int calculateDistance(List<WorldPoint> start, WorldArea destination)
	{
		return Walker.calculatePath(start, destination).size();
	}

	public static int calculateDistance(WorldPoint destination)
	{
		return calculateDistance(destination.toWorldArea());
	}

	public static int calculateDistance(WorldPoint start, WorldPoint destination)
	{
		return calculateDistance(start, destination.toWorldArea());
	}

	public static int calculateDistance(List<WorldPoint> start, WorldPoint destination)
	{
		return calculateDistance(start, destination.toWorldArea());
	}
}
