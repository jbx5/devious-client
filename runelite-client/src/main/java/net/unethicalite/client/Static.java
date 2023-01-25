package net.unethicalite.client;

import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.game.WorldService;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.script.paint.Paint;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.devtools.EntityRenderer;
import net.unethicalite.client.managers.DefinitionManager;
import net.unethicalite.client.managers.InventoryManager;
import net.unethicalite.client.managers.NativeInputManager;
import net.unethicalite.client.managers.NeverLogManager;
import net.unethicalite.client.managers.PluginRepoManager;
import net.unethicalite.client.managers.QuestManager;
import net.unethicalite.client.managers.RegionManager;
import net.unethicalite.client.managers.SettingsManager;
import net.unethicalite.client.managers.interaction.InteractionManager;

@Singleton
public class Static
{
	@Getter
	private static String[] scriptArgs = new String[0];

	@Inject
	@Getter
	private static EventBus eventBus;

	@Inject
	@Getter
	private static ClientThread clientThread;

	@Inject
	@Getter
	private static Client client;

	@Inject
	@Getter
	private static ItemManager itemManager;

	@Inject
	@Getter
	private static WorldService worldService;

	@Inject
	@Getter
	private static ChatMessageManager chatMessageManager;

	@Inject
	@Getter
	private static ClientPacket clientPacket;

	@Inject
	@Getter
	private static ServerPacket serverPacket;

	@Inject
	private static GlobalCollisionMap globalCollisionMap;

	@Inject
	@Getter
	private static PluginManager pluginManager;

	@Inject
	@Getter
	private static ConfigManager configManager;

	@Inject
	@Getter
	private static KeyManager keyManager;

	@Inject
	@Getter
	private static DefinitionManager definitionManager;

	@Inject
	@Getter
	private static InteractionManager interactionManager;

	@Inject
	@Getter
	private static NativeInputManager nativeInputManager;

	@Inject
	@Getter
	private static Paint paint;

	@Inject
	@Getter
	private static UnethicaliteConfig unethicaliteConfig;

	@Inject
	@Getter
	private static NeverLogManager neverLogManager;

	@Inject
	@Getter
	private static EntityRenderer entityRenderer;

	@Inject
	@Getter
	private static OverlayManager overlayManager;

	@Inject
	@Getter
	private static ClientToolbar clientToolbar;

	@Inject
	@Getter
	private static RegionManager regionManager;

	@Inject
	@Getter
	private static InventoryManager inventoryManager;

	@Inject
	@Getter
	private static QuestManager questManager;

	@Inject
	@Getter
	private static SpriteManager spriteManager;

	@Inject
	private static SettingsManager settingsManager;

	public static void setScriptArgs(String[] scriptArgs)
	{
		Static.scriptArgs = scriptArgs;
	}

	public static CollisionMap getGlobalCollisionMap()
	{
		return getClient().isInInstancedRegion() ? globalCollisionMap.withLocalCollisions() : globalCollisionMap;
	}
}
