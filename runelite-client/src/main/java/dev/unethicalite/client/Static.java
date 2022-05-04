package dev.unethicalite.client;

import dev.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import dev.unethicalite.api.script.paint.Paint;
import dev.unethicalite.managers.DefinitionManager;
import dev.unethicalite.managers.interaction.InteractionManager;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.WorldService;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Static
{
	@Getter
	@Setter
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
	private static Paint paint;
}
