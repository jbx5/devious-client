package net.runelite.client.plugins.unethicaldevtools;

import net.unethicalite.client.managers.InputManager;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Robot;

@Singleton
@Slf4j
public class InteractionOverlay extends Overlay
{
	private final UnethicalDevToolsConfig config;
	private final InputManager inputManager;

	@Inject
	public InteractionOverlay(UnethicalDevToolsConfig config, InputManager inputManager)
	{
		this.config = config;
		this.inputManager = inputManager;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);
	}

	private static Robot robot;
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

	@Override
	public Dimension render(Graphics2D g)
	{
		if (config.drawMouse())
		{
			if (!config.mousePositionOverlay())
			{
				g.setFont(new Font("Tahoma", Font.BOLD, 18));
			}

			OverlayUtil.renderTextLocation(g, new Point(inputManager.getLastClickX() - (g.getFont().getSize() / 3),
				inputManager.getLastClickY() + (g.getFont().getSize() / 3)), "X", Color.WHITE);

			OverlayUtil.renderTextLocation(g,
				new Point(inputManager.getLastMoveX() - (g.getFont().getSize() / 3),
					inputManager.getLastMoveY() + (g.getFont().getSize() / 3)), "X", Color.GREEN);
		}

		if (config.mousePositionOverlay())
		{
			final int lastMoveX = inputManager.getLastMoveX();
			final int lastMoveY = inputManager.getLastMoveY();

			// Render mouse position
			OverlayUtil.renderTextLocation(g,
				new Point(lastMoveX, lastMoveY),
				"x: " + lastMoveX + " y: " + lastMoveY,
				Color.YELLOW);

			// Render hex color
			if (robot != null)
			{
				Color color = robot.getPixelColor(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
				OverlayUtil.renderTextLocation(g,
					new Point(lastMoveX, lastMoveY - 10),
					"hex: " + String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()),
					Color.YELLOW);
			}
		}

		return null;
	}
}
