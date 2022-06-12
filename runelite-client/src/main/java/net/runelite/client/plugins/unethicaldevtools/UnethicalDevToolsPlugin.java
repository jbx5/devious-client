package net.runelite.client.plugins.unethicaldevtools;

import com.google.inject.Provides;
import net.runelite.api.DialogOption;
import net.runelite.api.events.DialogProcessed;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.client.eventbus.EventBus;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.PacketSent;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
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
	private OverlayManager overlayManager;

	@Inject
	private EventBus eventBus;

	@Override
	public void startUp()
	{
		overlayManager.add(overlay);
		overlayManager.add(regionOverlay);
		overlayManager.add(interactionOverlay);

		eventBus.register(regionOverlay);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(regionOverlay);
		overlayManager.remove(interactionOverlay);

		eventBus.unregister(regionOverlay);
	}

	@Provides
	public UnethicalDevToolsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(UnethicalDevToolsConfig.class);
	}

	@Subscribe
	public void onPacketSent(PacketSent e)
	{
		if (!config.packets())
		{
			return;
		}

		if (!config.opcodes().isBlank())
		{
			List<Integer> opcodes = Arrays.stream(config.opcodes().split(","))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			if (!opcodes.isEmpty())
			{
				PacketBufferNode packetBufferNode = e.getPacketBufferNode();
				int opcode = packetBufferNode.getClientPacket() != null ? packetBufferNode.getClientPacket().getId() : -1;
				if (!opcodes.contains(opcode))
				{
					return;
				}
			}
		}

		log.info(e.hexDump());
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

			log.debug("[Automated] {}", debug);
		}
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
					+ " | P1=" + e.getParam1();
			log.debug("[Menu Action] {}", action);
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
			log.debug("Dialog processed {}", dialogOption);
		}
		else
		{
			log.debug("Unknown or unmapped dialog {}", e);
		}
	}
}
