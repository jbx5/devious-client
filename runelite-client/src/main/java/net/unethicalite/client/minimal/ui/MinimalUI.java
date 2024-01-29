/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.unethicalite.client.minimal.ui;

import com.google.common.base.Strings;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.ui.ClientPanel;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ContainableFrame;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.OSType;
import net.runelite.client.util.OSXUtil;
import net.runelite.client.util.WinUtil;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * Client UI.
 */
@Slf4j
@Singleton
public class MinimalUI
{
	public static final BufferedImage ICON = ImageUtil.loadImageResource(ClientUI.class, "openosrs_128.png");
	private static final String CONFIG_GROUP = "runelite";
	private static final String PLUS_CONFIG_GROUP = "runelite";
	private static final String CONFIG_CLIENT_BOUNDS = "clientBounds";
	private static final String CONFIG_CLIENT_MAXIMIZED = "clientMaximized";
	private static final String CONFIG_OPACITY = "enableOpacity";
	private static final String CONFIG_OPACITY_AMOUNT = "opacityPercentage";
	private static final int CLIENT_WELL_HIDDEN_MARGIN = 160;
	private static final int CLIENT_WELL_HIDDEN_MARGIN_TOP = 10;
	public static boolean allowInput = false;

	@Getter
	public static ContainableFrame frame;

	private final RuneLiteConfig config;
	private final Applet client;
	private final ConfigManager configManager;
	private final Provider<ClientThread> clientThreadProvider;
	private final EventBus eventBus;
	private JPanel container;
	private Dimension lastClientSize;
	private Field opacityField;
	private Field peerField;
	private Method setOpacityMethod;
	private Cursor defaultCursor;

	@Inject
	private MinimalToolbar minimalToolbar;

	@Inject
	private UnethicaliteConfig minimalConfig;

	@Inject
	private MinimalUI(
			RuneLiteConfig config,
			@Nullable Applet client,
			ConfigManager configManager,
			Provider<ClientThread> clientThreadProvider,
			EventBus eventbus
	)
	{
		this.config = config;
		this.client = client;
		this.configManager = configManager;
		this.clientThreadProvider = clientThreadProvider;
		this.eventBus = eventbus;
	}

	public static int getX()
	{
		return frame.getX();
	}

	public static int getY()
	{
		return frame.getY();
	}

	public static void setupDefaults()
	{
		// Force heavy-weight popups/tooltips.
		// Prevents them from being obscured by the game applet.
		ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
		ToolTipManager.sharedInstance().setInitialDelay(300);
		JPopupMenu.setDefaultLightWeightPopupEnabled(false);

		// Do not render shadows under popups/tooltips.
		// Fixes black boxes under popups that are above the game applet.
		System.setProperty("jgoodies.popupDropShadowEnabled", "false");

		// Do not fill in background on repaint. Reduces flickering when
		// the applet is resized.
		System.setProperty("sun.awt.noerasebackground", "true");
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(CONFIG_GROUP)
				&& !(event.getGroup().equals(PLUS_CONFIG_GROUP)
				&& event.getKey().equals(CONFIG_OPACITY) ||
				event.getKey().equals(CONFIG_OPACITY_AMOUNT)) ||
				event.getKey().equals(CONFIG_CLIENT_MAXIMIZED) ||
				event.getKey().equals(CONFIG_CLIENT_BOUNDS))
		{
			return;
		}

		SwingUtilities.invokeLater(() -> updateFrameConfig(event.getKey().equals("lockWindowSize")));
	}

	@Subscribe
	private void onGameStateChanged(final GameStateChanged event)
	{
		if (event.getGameState() != GameState.LOGGED_IN || !(client instanceof Client) || !config.usernameInTitle())
		{
			return;
		}

		final Client client = (Client) this.client;
		final ClientThread clientThread = clientThreadProvider.get();

		// Keep scheduling event until we get our name
		clientThread.invokeLater(() ->
		{
			if (client.getGameState() != GameState.LOGGED_IN)
			{
				return true;
			}

			final Player player = client.getLocalPlayer();

			if (player == null)
			{
				return false;
			}

			final String name = player.getName();

			if (Strings.isNullOrEmpty(name))
			{
				return false;
			}

			frame.setTitle(RuneLiteProperties.getTitle() + " - " + name);
			return true;
		});
	}

	/**
	 * Initialize UI.
	 *
	 * @throws Exception exception that can occur during creation of the UI
	 */
	public void init() throws Exception
	{
		SwingUtilities.invokeAndWait(() ->
		{
			setupDefaults();

			// Create main window
			frame = new ContainableFrame();

			// Try to enable fullscreen on OSX
			OSXUtil.tryEnableFullscreen(frame);

			frame.setTitle(RuneLiteProperties.getTitle());
			frame.setIconImage(ICON);
			frame.getLayeredPane().setCursor(Cursor.getDefaultCursor()); // Prevent substance from using a resize cursor for pointing

			frame.setResizable(true);

			container = new JPanel();
			container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
			container.add(new ClientPanel(client));

			frame.setJMenuBar(minimalToolbar);

			frame.add(container);

			frame.addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					shutdownClient();
				}
			});

			frame.setUndecorated(false);

			// Update config
			updateFrameConfig(true);
		});
	}

	private void shutdownClient()
	{
		log.debug("Shutting down client!");
		saveClientBoundsConfig();
		ClientShutdown csev = new ClientShutdown();
		eventBus.post(csev);
		new Thread(() ->
		{
			if (client != null)
			{
				int clientShutdownWaitMS;
				if (client instanceof Client)
				{
					((Client) client).stopNow();
					clientShutdownWaitMS = 1000;
				}
				else
				{
					client.stop();
					frame.setVisible(false);
					clientShutdownWaitMS = 6000;
				}

				try
				{
					Thread.sleep(clientShutdownWaitMS);
				}
				catch (InterruptedException ignored)
				{
				}
			}

			System.exit(0);
		}, "Unethicalite Shutdown").start();
	}

	public void show()
	{
		SwingUtilities.invokeLater(() ->
		{
			// Layout frame
			frame.pack();
			frame.revalidateMinimumSize();

			// Move frame around (needs to be done after frame is packed)
			if (config.rememberScreenBounds())
			{
				try
				{
					Rectangle clientBounds = configManager.getConfiguration(
							CONFIG_GROUP, CONFIG_CLIENT_BOUNDS, Rectangle.class);
					if (clientBounds != null)
					{
						frame.revalidateMinimumSize();
						frame.setLocation(clientBounds.getLocation());
					}
					else
					{
						frame.setLocationRelativeTo(frame.getOwner());
					}

					if (configManager.getConfiguration(CONFIG_GROUP, CONFIG_CLIENT_MAXIMIZED) != null)
					{
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					}
				}
				catch (Exception ex)
				{
					log.warn("Failed to set window bounds", ex);
					frame.setLocationRelativeTo(frame.getOwner());
				}
			}
			else
			{
				frame.setLocationRelativeTo(frame.getOwner());
			}

			// If the frame is well hidden (e.g. unplugged 2nd screen),
			// we want to move it back to default position as it can be
			// hard for the user to reposition it themselves otherwise.
			Rectangle clientBounds = frame.getBounds();
			Rectangle screenBounds = frame.getGraphicsConfiguration().getBounds();
			if (clientBounds.x + clientBounds.width - CLIENT_WELL_HIDDEN_MARGIN < screenBounds.getX() ||
					clientBounds.x + CLIENT_WELL_HIDDEN_MARGIN > screenBounds.getX() + screenBounds.getWidth() ||
					clientBounds.y + CLIENT_WELL_HIDDEN_MARGIN_TOP < screenBounds.getY() ||
					clientBounds.y + CLIENT_WELL_HIDDEN_MARGIN > screenBounds.getY() + screenBounds.getHeight())
			{
				frame.setLocationRelativeTo(frame.getOwner());
			}

			// Show frame
			frame.setVisible(true);
			if (minimalConfig.minimized())
			{
				frame.setState(Frame.ICONIFIED);
			}
			else
			{
				frame.toFront();
				requestFocus();
				giveClientFocus();
			}
		});

		// Show out of date dialog if needed
		if (client != null && !(client instanceof Client))
		{
			SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(frame,
					"OpenOSRS has not yet been updated to work with the latest\n"
							+ "game update, it will work with reduced functionality until then.",
					"RuneLite is outdated", INFORMATION_MESSAGE));
		}
	}

	/**
	 * Paint this component to target graphics
	 *
	 * @param graphics the graphics
	 */
	public void paint(final Graphics graphics)
	{
		assert SwingUtilities.isEventDispatchThread() : "paint must be called on EDT";
		frame.paint(graphics);
	}

	/**
	 * Gets component width.
	 *
	 * @return the width
	 */
	public int getWidth()
	{
		return frame.getWidth();
	}

	/**
	 * Gets component height.
	 *
	 * @return the height
	 */
	public int getHeight()
	{
		return frame.getHeight();
	}

	/**
	 * Returns true if this component has focus.
	 *
	 * @return true if component has focus
	 */
	public boolean isFocused()
	{
		return frame.isFocused();
	}

	/**
	 * Request focus on this component and then on client component
	 */
	public void requestFocus()
	{
		// The workaround for Windows is to minimise and then un-minimise the client to bring
		// it to the front because java.awt.Window#toFront doesn't work reliably.
		// See https://stackoverflow.com/questions/309023/how-to-bring-a-window-to-the-front/7435722#7435722
		if (OSType.getOSType() == OSType.Windows && !frame.isFocused())
		{
			SwingUtilities.invokeLater(() ->
			{
				if ((frame.getExtendedState() & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH)
				{
					frame.setExtendedState(JFrame.ICONIFIED);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				else
				{
					// If the client is snapped to the top and bottom edges of the screen, setExtendedState will
					// will reset it so setSize and setLocation ensure that the client doesn't move or resize.
					// It is done this way because Windows does not support JFrame.MAXIMIZED_VERT
					int x = frame.getLocation().x;
					int y = frame.getLocation().y;
					int width = frame.getWidth();
					int height = frame.getHeight();
					frame.setExtendedState(JFrame.ICONIFIED);
					frame.setExtendedState(JFrame.NORMAL);
					frame.setLocation(x, y);
					frame.setSize(width, height);
				}
			});
		}

		frame.requestFocus();
		giveClientFocus();
	}

	/**
	 * Get offset of game canvas in game window
	 *
	 * @return game canvas offset
	 */
	public Point getCanvasOffset()
	{
		if (client instanceof Client)
		{
			final Canvas canvas = ((Client) client).getCanvas();
			if (canvas != null)
			{
				final java.awt.Point point = SwingUtilities.convertPoint(canvas, 0, 0, frame);
				return new Point(point.x, point.y);
			}
		}

		return new Point(0, 0);
	}

	public GraphicsConfiguration getGraphicsConfiguration()
	{
		return frame.getGraphicsConfiguration();
	}

	private void giveClientFocus()
	{
		if (client instanceof Client)
		{
			final Canvas c = ((Client) client).getCanvas();
			if (c != null)
			{
				c.requestFocusInWindow();
			}
		}
		else if (client != null)
		{
			client.requestFocusInWindow();
		}
	}

	private void updateFrameConfig(boolean updateResizable)
	{
		if (frame == null)
		{
			return;
		}

		if (config.usernameInTitle() && (client instanceof Client))
		{
			final Player player = ((Client) client).getLocalPlayer();

			if (player != null && player.getName() != null)
			{
				frame.setTitle(RuneLiteProperties.getTitle() + " - " + player.getName());
			}
		}
		else
		{
			frame.setTitle(RuneLiteProperties.getTitle());
		}

		if (frame.isAlwaysOnTopSupported())
		{
			frame.setAlwaysOnTop(config.gameAlwaysOnTop());
		}

		if (updateResizable)
		{
			frame.setResizable(!config.lockWindowSize());
		}

		frame.setContainedInScreen(config.containInScreen());

		if (!config.rememberScreenBounds())
		{
			configManager.unsetConfiguration(CONFIG_GROUP, CONFIG_CLIENT_MAXIMIZED);
			configManager.unsetConfiguration(CONFIG_GROUP, CONFIG_CLIENT_BOUNDS);
		}

		Boolean opacity = configManager.getConfiguration(PLUS_CONFIG_GROUP, CONFIG_OPACITY, boolean.class);

		if (opacity != null && opacity)
		{
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();

			if (gd.isWindowTranslucencySupported(TRANSLUCENT))
			{
				setOpacity();
			}
			else
			{
				log.warn("Opacity isn't supported on your system!");
				configManager.setConfiguration(PLUS_CONFIG_GROUP, CONFIG_OPACITY, false);
			}
		}
		else if (frame.getOpacity() != 1F)
		{
			frame.setOpacity(1F);
		}

		if (client == null)
		{
			return;
		}

		// The upper bounds are defined by the applet's max size
		// The lower bounds are defined by the client's fixed size
		int width = Math.max(Math.min(config.gameSize().width, 7680), Constants.GAME_FIXED_WIDTH);
		int height = Math.max(Math.min(config.gameSize().height, 2160), Constants.GAME_FIXED_HEIGHT);
		final Dimension size = new Dimension(width, height);

		if (!size.equals(lastClientSize))
		{
			lastClientSize = size;
			client.setSize(size);
			client.setPreferredSize(size);
			client.getParent().setPreferredSize(size);
			client.getParent().setSize(size);

			if (frame.isVisible())
			{
				frame.pack();
			}
		}
	}

	private void saveClientBoundsConfig()
	{
		if ((frame.getExtendedState() & JFrame.MAXIMIZED_BOTH) != 0)
		{
			configManager.setConfiguration(CONFIG_GROUP, CONFIG_CLIENT_MAXIMIZED, true);
		}
		else
		{
			final Rectangle bounds = frame.getBounds();
			configManager.unsetConfiguration(CONFIG_GROUP, CONFIG_CLIENT_MAXIMIZED);
			configManager.setConfiguration(CONFIG_GROUP, CONFIG_CLIENT_BOUNDS, bounds);
		}
	}

	private void setOpacity()
	{
		SwingUtilities.invokeLater(() ->
		{
			try
			{
				if (opacityField == null)
				{
					opacityField = Window.class.getDeclaredField("opacity");
					opacityField.setAccessible(true);
				}
				if (peerField == null)
				{
					peerField = Component.class.getDeclaredField("peer");
					peerField.setAccessible(true);
				}
				if (setOpacityMethod == null)
				{
					setOpacityMethod = Class.forName("java.awt.peer.WindowPeer").getDeclaredMethod("setOpacity", float.class);
				}


				final float opacity = Float.parseFloat(configManager.getConfiguration(PLUS_CONFIG_GROUP, CONFIG_OPACITY_AMOUNT)) / 100F;
				assert opacity > 0F && opacity <= 1F : "I don't know who you are, I don't know why you tried, and I don't know how you tried, but this is NOT what you're supposed to do and you should honestly feel terrible about what you did, so I want you to take a nice long amount of time to think about what you just tried to do so you are not gonna do this in the future.";

				opacityField.setFloat(frame, opacity);
				setOpacityMethod.invoke(peerField.get(frame), opacity);

			}
			catch (NoSuchFieldException | NoSuchMethodException | ClassNotFoundException | IllegalAccessException |
				   InvocationTargetException | NullPointerException e)
			{
				// e.printStackTrace();
			}
		});
	}

	public void resetCursor()
	{
		if (container == null)
		{
			return;
		}

		defaultCursor = null;
		container.setCursor(Cursor.getDefaultCursor());
	}

	public void setCursor(final BufferedImage image, final String name)
	{
		if (container == null)
		{
			return;
		}

		final java.awt.Point hotspot = new java.awt.Point(0, 0);
		final Cursor cursorAwt = Toolkit.getDefaultToolkit().createCustomCursor(image, hotspot, name);
		defaultCursor = cursorAwt;
		setCursor(cursorAwt);
	}

	/**
	 * Changes cursor for client window. Requires ${@link MinimalUI#init()} to be called first.
	 *
	 * @param cursor awt cursor
	 */
	public void setCursor(final Cursor cursor)
	{
		container.setCursor(cursor);
	}

	public void forceFocus()
	{
		switch (OSType.getOSType())
		{
			case MacOS:
				OSXUtil.requestForeground();
				break;
			case Windows:
				WinUtil.requestForeground(frame);
				break;
			default:
				frame.requestFocus();
				break;
		}

		giveClientFocus();
	}

	/**
	 * Returns current cursor set on game container
	 *
	 * @return awt cursor
	 */
	public Cursor getCurrentCursor()
	{
		return container.getCursor();
	}

	/**
	 * Returns current custom cursor or default system cursor if cursor is not set
	 *
	 * @return awt cursor
	 */
	public Cursor getDefaultCursor()
	{
		return defaultCursor != null ? defaultCursor : Cursor.getDefaultCursor();
	}

	public void setTitle(String title)
	{
		frame.setTitle(title);
	}
}
