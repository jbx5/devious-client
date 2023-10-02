package net.runelite.client.plugins.unethicaldevtools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuAction;
import net.runelite.api.Tile;
import net.runelite.api.DialogOption;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.Point;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.DialogProcessed;
import net.runelite.api.events.Draw;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.PacketSent;
import net.unethicalite.api.events.ServerPacketReceived;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.dto.TransportDto;
import net.unethicalite.api.movement.pathfinder.model.requirement.Requirements;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.utils.MessageUtils;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.InputManager;
import org.apache.commons.lang3.tuple.Pair;

import javax.inject.Inject;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@PluginDescriptor(
		name = "Unethical Dev Tools",
		description = "Shows entity information",
		enabledByDefault = false
)
@Slf4j
public class UnethicalDevToolsPlugin extends Plugin
{
	@Inject
	private UnethicalDevToolsConfig config;

	@Inject
	private UnethicalDevToolsOverlay overlay;

	@Inject
	private RegionOverlay regionOverlay;

	@Inject
	private InteractionOverlay interactionOverlay;

	@Inject
	private MemoryUsageOverlay memoryUsageOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private EventBus eventBus;

	@Inject
	private Client client;

	@Inject
	private InputManager inputManager;

	private WorldPoint sourceTile;
	private Pair<String, Integer> transportObject;
	private boolean selectingSource = true;
	private boolean selectingDestination;
	private boolean selectingObject;
	private ArrayList<TransportDto> tempTransports;

	@Override
	public void startUp()
	{
		overlayManager.add(overlay);
		overlayManager.add(regionOverlay);
		overlayManager.add(interactionOverlay);
		overlayManager.add(memoryUsageOverlay);

		eventBus.register(regionOverlay);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(regionOverlay);
		overlayManager.remove(interactionOverlay);
		overlayManager.remove(memoryUsageOverlay);

		eventBus.unregister(regionOverlay);
	}

	@Provides
	public UnethicalDevToolsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(UnethicalDevToolsConfig.class);
	}

	@Subscribe
	public void onMenuAutomated(MenuAutomated e)
	{
		if (config.debugMenuActions())
		{
			String debug = "O=" + e.getOption()
					+ " | T=" + e.getTarget()
					+ " | ID=" + e.getIdentifier()
					+ " | OP=" + e.getOpcode().getId()
					+ " | P0=" + e.getParam0()
					+ " | P1=" + e.getParam1()
					+ " | X=" + e.getClickX()
					+ " | Y=" + e.getClickY();

			log.info("[Automated] {}", debug);
		}
	}

	@Subscribe
	public void onMenuOpened(MenuOpened e)
	{
		if (config.transportCreator())
		{
			createTransportMenuOptions(e);
		}
	}

	private void createTransportMenuOptions(MenuOpened e)
	{
		boolean validTile = false;
		Map<String, TileObject> objectOptions = new HashMap<>(3);
		for (MenuEntry entry : e.getMenuEntries())
		{
			if (entry.getOption().equals("Walk here"))
			{
				validTile = true;
			}
			if (selectingObject)
			{
				if (entry.getOption().equalsIgnoreCase("examine"))
				{
					continue;
				}
				String target = entry.getTarget().replaceFirst("<.*>", "");
				TileObject obj = TileObjects.getNearest(Tiles.getHoveredTile().getWorldLocation(),
						target);
				if (obj != null)
				{
					objectOptions.put(entry.getOption(), obj);
				}
			}
		}
		if (selectingSource & validTile)
		{
			client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("Select source")
					.setType(MenuAction.RUNELITE)
					.onClick(x ->
					{
						Tile clickPoint = Tiles.getHoveredTile();
						if (clickPoint == null)
						{
							return;
						}
						sourceTile = clickPoint.getWorldLocation();
						selectingSource = false;
						selectingObject = true;
					});
		}
		if (selectingObject)
		{
			objectOptions.forEach((action, object) ->
				client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("Select " + action + " " + object.getName())
					.setType(MenuAction.RUNELITE)
					.onClick(x ->
					{
						transportObject = Pair.of(action, object.getId());
						selectingObject = false;
						selectingDestination = true;
					}));
		}
		if (selectingDestination & validTile)
		{
			client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("Select destination")
					.setType(MenuAction.RUNELITE)
					.onClick(x ->
					{
						Tile clickPoint = Tiles.getHoveredTile();
						if (clickPoint == null)
						{
							return;
						}
						TransportDto transport = new TransportDto(
							sourceTile,
							clickPoint.getWorldLocation(),
							transportObject.getKey(),
							transportObject.getValue(),
							new Requirements()
						);
						if (tempTransports == null)
						{
							tempTransports = new ArrayList<>();
						}
						tempTransports.add(transport);
						if (config.useCreatedTransports())
						{
							TransportLoader.updateTempTransports(tempTransports.stream().map(TransportDto::toTransport).collect(Collectors.toList()));
						}
						selectingDestination = false;
						selectingSource = true;
						sourceTile = null;
						transportObject = null;
					});
		}
		if (sourceTile != null || transportObject != null)
		{
			client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("<col=ff0000>Reset current</col>")
					.setType(MenuAction.RUNELITE)
					.onClick(x ->
					{
						sourceTile = null;
						transportObject = null;
						selectingSource = true;
						selectingDestination = false;
						selectingObject = false;
					});
		}
		if (tempTransports != null && !tempTransports.isEmpty())
		{
			client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("Export")
					.setType(MenuAction.RUNELITE)
					.onClick(x -> exportTransports());
			client.createMenuEntry(1)
					.setOption("<col=00ff00>Transport Creator:</col>")
					.setTarget("<col=ff0000>Clear list</col>")
					.setType(MenuAction.RUNELITE)
					.onClick(x ->
					{
						tempTransports = null;
						TransportLoader.clearTempTransports();
					});
		}
	}
	private void exportTransports()
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		StringBuilder output = new StringBuilder();
		for (TransportDto transportDto : tempTransports)
		{
			JsonObject transportObj = gson.toJsonTree(transportDto).getAsJsonObject();
			transportObj.add("requirements", new JsonObject());
			String transport = gson.toJson(transportObj);
			output.append(transport).append(",\n");
		}
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection(output.toString());
		clipboard.setContents(stringSelection, null);
		MessageUtils.addMessage("Transports copied to clipboard!");
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		if (config.debugMenuActions())
		{
			String action = "O=" + e.getMenuOption()
					+ " | T=" + e.getMenuTarget()
					+ " | ID=" + e.getId()
					+ " | OP=" + e.getMenuAction().getId()
					+ " | P0=" + e.getParam0()
					+ " | P1=" + e.getParam1()
					+ " | ITEM=" + e.getItemId();
			log.info("[Menu Action] {}", action);
		}
	}

	@Subscribe
	public void onDialogProcessed(DialogProcessed e)
	{
		if (!config.debugDialogs())
		{
			return;
		}

		DialogOption dialogOption = DialogOption.of(e.getDialogOption().getWidgetUid(), e.getDialogOption().getMenuIndex());
		if (dialogOption != null)
		{
			log.info("Dialog processed {}", dialogOption);
		}
		else
		{
			log.warn("Unknown or unmapped dialog {}", e);
		}
	}

	@Subscribe
	public void onPacketSent(PacketSent e)
	{
		if (!config.packets())
		{
			return;
		}

		PacketBufferNode packetBufferNode = e.getPacketBufferNode();
		int opcode = packetBufferNode.getClientPacket() != null ? packetBufferNode.getClientPacket().getId() : -1;

		if (!config.opcodes().isBlank())
		{
			List<Integer> opcodes = Arrays.stream(config.opcodes().split(","))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			if (!opcodes.isEmpty())
			{
				if (!opcodes.contains(opcode))
				{
					return;
				}
			}
		}

		ClientPacket packet = packetBufferNode.getClientPacket();
		if (packet == null)
		{
			return;
		}

		String packetName = Static.getClientPacket().getClientPackets().get(packet);
		String id = packetName != null ? packetName : String.valueOf(opcode);

		log.info("Packet sent: [{}] {}, length: {}", opcode, id, e.getPacketBufferNode().getClientPacket().getLength());
		if (config.hexDump())
		{
			log.info(e.hexDump());
		}
	}

	@Subscribe
	public void onServerPacketReceived(ServerPacketReceived e)
	{
		if (!config.serverPackets())
		{
			return;
		}

		ServerPacket serverPacket = e.getServerPacket();
		if (!config.opcodes().isBlank())
		{
			List<Integer> opcodes = Arrays.stream(config.opcodes().split(","))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			if (!opcodes.isEmpty())
			{
				if (!opcodes.contains(serverPacket.getId()))
				{
					return;
				}
			}
		}

		String packetName = Static.getServerPacket().getServerPackets().get(serverPacket);
		String id = packetName != null ? packetName : String.valueOf(serverPacket.getId());

		log.info("Packet received: [{}] {}, length: {}", serverPacket.getId(), id, e.getLength());
		if (config.hexDump())
		{
			log.info(e.hexDump());
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged e)
	{
		if (!e.getGroup().equals("entityinspector"))
		{
			return;
		}

		if ("staffLevel".equals(e.getKey()))
		{
			client.setStaffModLevel(Integer.parseInt(e.getNewValue()));
		}

		if ("useCreatedTransports".equals(e.getKey()))
		{
			if (config.useCreatedTransports())
			{
				TransportLoader.updateTempTransports(tempTransports.stream().map(TransportDto::toTransport).collect(Collectors.toList()));
			}
			else
			{
				TransportLoader.clearTempTransports();
			}
		}
	}

	private static Robot robot;
	private final Point p = new Point(0, 10);
	private final Point p2 = new Point(0, 20);
	static
	{
		try
		{
			robot = new Robot();
		}
		catch (AWTException e)
		{
			log.error("", e);
		}
	}

	@Subscribe
	public void onDraw(Draw event)
	{
		if (!config.mousePositionOverlay())
		{
			return;
		}

		final Graphics2D graphics = (Graphics2D) event.getGraphics();

		if (graphics != null)
		{
			final int lastMoveX = inputManager.getLastMoveX();
			final int lastMoveY = inputManager.getLastMoveY();

			// Render mouse position
			OverlayUtil.renderTextLocation(graphics,
				p,
				"x: " + lastMoveX + " y: " + lastMoveY,
				Color.YELLOW);

			// Render hex color
			if (robot != null)
			{
				Color color = robot.getPixelColor(MouseInfo.getPointerInfo().getLocation().x,
					MouseInfo.getPointerInfo().getLocation().y);

				OverlayUtil.renderTextLocation(graphics,
					p2,
					"hex: " + String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()),
					Color.YELLOW);
			}
		}
	}

	@Subscribe
	private void onConfigButtonPressed(ConfigButtonClicked configButtonClicked)
	{
		if (!configButtonClicked.getGroup().equalsIgnoreCase("entityinspector"))
		{
			return;
		}

		if (configButtonClicked.getKey().equals("printStackTrace"))
		{
			for (Map.Entry <Thread, StackTraceElement []> entry:
					Thread.getAllStackTraces().entrySet ())
			{
				System.out.println (entry.getKey ().getName () + ":");
				for (StackTraceElement element: entry.getValue ())
					System.out.println ("\t" + element);
			}
		}
	}
}
