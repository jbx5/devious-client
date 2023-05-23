package net.runelite.client.plugins.unethicaldevtools;

import com.google.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

public class MemoryUsageOverlay extends OverlayPanel
{
	private final UnethicalDevToolsConfig config;

	@Inject
	private MemoryUsageOverlay(UnethicalDevToolsConfig config)
	{
		this.config = config;
		setPosition(OverlayPosition.TOP_LEFT);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	private String getMemoryUsage()
	{
		MemoryUsage memoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
		long memoryUsed = (long) (memoryUsage.getUsed() / 1000000.00);
		long totalMemory = (long) (memoryUsage.getMax() / 1000000.00);
		long usedPercent = memoryUsed * 100 / totalMemory;
		return memoryUsed + " / " + totalMemory + " MB " + usedPercent + "%";
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.memoryUsage())
		{
			return null;
		}

		panelComponent.getChildren().add(LineComponent.builder()
			.left(getMemoryUsage())
			.leftColor(Color.YELLOW)
			.build());

		return super.render(graphics);
	}
}
