package net.runelite.client.plugins.hootoneclick;

import com.google.inject.Inject;
import com.google.inject.Provides;
import dev.hoot.api.EntityNameable;
import dev.hoot.api.Interactable;
import dev.hoot.api.SceneEntity;
import dev.hoot.api.entities.*;
import dev.hoot.api.game.Game;
import dev.hoot.api.items.Inventory;
import dev.hoot.api.widgets.Widgets;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@PluginDescriptor(
		name = "Hoot One Click"
)
@Slf4j
public class HootOneClickPlugin extends Plugin
{
	@Inject
	private HootOneClickConfig config;

	@Inject
	private Client client;

	private static final List<Integer> GAME_OBJECT_OPCODES = List.of(1, 2, 3, 4, 5, 6, 1001);
	private static final List<Integer> NPC_OPCODES = List.of(7, 8, 9, 10, 11, 12, 13);
	private static final List<Integer> GROUND_ITEM_OPCODES = List.of(18, 19, 20, 21, 22);
	private static final List<Integer> WIDGET_OPCODES = List.of(24, 25, 26, 28, 29, 30, 39, 40, 41, 42, 43);
	private static final List<Integer> ITEM_OPCODES = List.of(33, 34, 35, 36, 37, 38);
	private static final List<Integer> PLAYER_OPCODES = List.of(44, 45, 46, 47, 48, 49, 50, 51);

	private final Map<String, String> gameObjectConfigs = new HashMap<>();
	private final Map<String, String> npcConfigs = new HashMap<>();
	private final Map<String, String> groundItemConfigs = new HashMap<>();
	private final Map<String, String> widgetConfigs = new HashMap<>();
	private final Map<String, String> itemConfigs = new HashMap<>();
	private final Map<String, String> playerConfigs = new HashMap<>();

	@Provides
	public HootOneClickConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(HootOneClickConfig.class);
	}

	@Subscribe
	private void onClientTick(ClientTick e)
	{
		MenuEntry[] entries = client.getMenuEntries();
		if (entries.length <= 1)
		{
			return;
		}

		List<? extends SceneEntity> hovered = Entities.getHoveredEntities();
		if (hovered.isEmpty())
		{
			return;
		}

		SceneEntity top = hovered.stream().filter(x -> isConfigured(x.getName(), gameObjectConfigs) ||
						isConfigured(x.getName(), npcConfigs) || isConfigured(x.getName(), groundItemConfigs) ||
						isConfigured(x.getName(), playerConfigs))
				.findFirst()
				.orElse(null);
		if (top == null)
		{
			return;
		}

		if (top.getActions().stream().anyMatch(Objects::nonNull))
		{
			return;
		}

		if (top instanceof GameObject)
		{
			client.insertMenuItem(
					"Hoot One Click",
					"",
					MenuAction.GAME_OBJECT_FIRST_OPTION.getId(),
					top.getId(),
					((GameObject) top).menuPoint().getX(),
					((GameObject) top).menuPoint().getY(),
					true
			);
			return;
		}

		if (top instanceof TileItem)
		{
			client.insertMenuItem(
					"Hoot One Click",
					"",
					MenuAction.GROUND_ITEM_FIRST_OPTION.getId(),
					top.getId(),
					((TileItem) top).getTile().getSceneLocation().getX(),
					((TileItem) top).getTile().getSceneLocation().getY(),
					true
			);
			return;
		}

		if (top instanceof NPC)
		{
			client.insertMenuItem("Hoot One Click", "", MenuAction.NPC_FIRST_OPTION.getId(), ((NPC) top).getIndex(), 0,
					0, true);
			return;
		}

		if (top instanceof Player)
		{
			client.insertMenuItem("Hoot One Click", "", MenuAction.PLAYER_FIRST_OPTION.getId(), ((Player) top).getIndex(), 0, 0, true);
			return;
		}

		log.info("wtf {}", top.getClass());
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged e)
	{
		if (!e.getGroup().equals("hootoneclick"))
		{
			return;
		}

		clearConfigs();

		parseConfigs(config.gameObjectConfig(), gameObjectConfigs);
		parseConfigs(config.npcConfig(), npcConfigs);
		parseConfigs(config.groundItemConfig(), groundItemConfigs);
		parseConfigs(config.widgetConfig(), widgetConfigs);
		parseConfigs(config.itemConfig(), itemConfigs);
		parseConfigs(config.playerConfig(), playerConfigs);
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		int opcode = e.getMenuAction().getId();

		if (!gameObjectConfigs.isEmpty() && GAME_OBJECT_OPCODES.contains(opcode))
		{
			Tile tile = Game.getClient().getScene().getTiles()[Game.getClient().getPlane()][e.getParam0()][e.getParam1()];
			TileObject obj = TileObjects.getFirstAt(tile, e.getId());
			if (replace(gameObjectConfigs, obj, e))
			{
				return;
			}
		}

		if (!npcConfigs.isEmpty() && NPC_OPCODES.contains(opcode))
		{
			NPC npc = NPCs.getNearest(x -> x.getIndex() == e.getId());
			if (replace(npcConfigs, npc, e))
			{
				return;
			}
		}

		if (!groundItemConfigs.isEmpty() && GROUND_ITEM_OPCODES.contains(opcode))
		{
			Tile tile = Game.getClient().getScene().getTiles()[Game.getClient().getPlane()][e.getParam0()][e.getParam1()];
			TileItem item = TileItems.getFirstAt(tile, e.getId());
			if (replace(groundItemConfigs, item, e))
			{
				return;
			}
		}

		if (!itemConfigs.isEmpty() && ITEM_OPCODES.contains(opcode))
		{
			Item item = Inventory.getFirst(e.getId());
			if (replace(itemConfigs, item, e))
			{
				return;
			}
		}

		if (!playerConfigs.isEmpty() && PLAYER_OPCODES.contains(opcode))
		{
			Player player = Players.getNearest(x -> x.getIndex() == e.getId());
			if (replace(playerConfigs, player, e))
			{
				return;
			}
		}

		if (!widgetConfigs.isEmpty() && WIDGET_OPCODES.contains(opcode))
		{
			String action = Text.removeTags(e.getMenuOption()) + " " + Text.removeTags(e.getMenuTarget());
			Widget widget = Widgets.fromId(e.getParam1());
			if (widget != null && widgetConfigs.containsKey(action))
			{
				String replaced = widgetConfigs.get(action);
				e.consume();

				if (isUseOn(replaced))
				{
					Item usedItem = getUsedItem(replaced);
					if (usedItem != null)
					{
						usedItem.useOn(widget);
					}

					return;
				}

				widget.interact(replaced);
			}
		}
	}

	private <T extends Interactable> boolean replace(Map<String, String> replacements, T t, MenuOptionClicked event)
	{
		if (!(t instanceof EntityNameable))
		{
			return false;
		}

		if ((!config.exactEntityNames() || !replacements.containsKey(((EntityNameable) t).getName()))
				&& replacements.keySet().stream().noneMatch(x -> ((EntityNameable) t).getName().toLowerCase().contains(x.toLowerCase())))
		{
			return false;
		}

		event.consume();

		String replacement;
		if (config.exactEntityNames())
		{
			replacement = replacements.get(((EntityNameable) t).getName());
		}
		else
		{
			String key = replacements.keySet().stream()
					.filter(x -> ((EntityNameable) t).getName().toLowerCase().contains(x.toLowerCase()))
					.findFirst()
					.orElse(null);
			replacement = replacements.get(key);
		}

		if (replacement == null)
		{
			return false;
		}

		if (isUseOn(replacement))
		{
			Item usedItem = getUsedItem(replacement);
			if (usedItem != null)
			{
				usedItem.useOn(t);
			}

			return true;
		}

		t.interact(replacement);
		return true;
	}

	private Item getUsedItem(String action)
	{
		return Inventory.getFirst(x ->
		{
			if (config.exactItemNames())
			{
				return x.getName().equals(action.substring(4));
			}

			return x.getName().toLowerCase().contains(action.substring(4).toLowerCase());
		});
	}

	private boolean isUseOn(String action)
	{
		return action.contains("Use ") && action.split(" ").length >= 2;
	}

	private void parseConfigs(String text, Map<String, String> configs)
	{
		if (text.isBlank())
		{
			return;
		}

		String[] items = text.split(",");

		for (String i : items)
		{
			String[] pairs = i.split(":");
			if (pairs.length < 2)
			{
				continue;
			}

			configs.put(pairs[0], pairs[1]);
		}
	}

	private boolean isConfigured(String entityName, Map<String, String> configs)
	{
		if (config.exactEntityNames())
		{
			return configs.containsKey(entityName);
		}

		return configs.keySet().stream().anyMatch(x -> entityName.toLowerCase().contains(x.toLowerCase()));
	}

	private void clearConfigs()
	{
		gameObjectConfigs.clear();
		npcConfigs.clear();
		groundItemConfigs.clear();
		widgetConfigs.clear();
		itemConfigs.clear();
		playerConfigs.clear();
	}
}
