package net.runelite.client.plugins.unethicalite.regions;

import dev.unethicalite.api.SceneEntity;
import dev.unethicalite.api.entities.Entities;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.scene.Tiles;
import dev.unethicalite.client.minimal.config.UnethicaliteProperties;
import dev.unethicalite.managers.RegionManager;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.GameState;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.eventbus.Subscribe;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Singleton
public class AddTransportDialog extends JFrame
{
	private static final ScheduledExecutorService EXECUTOR = Executors.newSingleThreadScheduledExecutor();
	private static final Logger logger = LoggerFactory.getLogger(AddTransportDialog.class);

	private final JTextField fromText;

	private final JTextField toText;

	private final JTextField actionText;
	private final JTextField objNameText;
	private final JTextField objIdText;

	private final DefaultListModel<TransportLink> listModel;

	@Inject
	private OkHttpClient okHttpClient;

	public AddTransportDialog()
	{

		setLayout(new GridLayout(1, 2));
		setMinimumSize(new Dimension(550, 350));

		listModel = new DefaultListModel<>();

		JPanel configPanel = new JPanel(new MigLayout("fill"));
		configPanel.setBorder(new TitledBorder("Config"));
		configPanel.setMinimumSize(new Dimension(250, 350));

		JPanel listPanel = new JPanel(new MigLayout());
		listPanel.setBorder(new TitledBorder("Links"));
		listPanel.setMinimumSize(new Dimension(400, 350));

		add(configPanel);
		add(listPanel);

		configPanel.add(new JLabel("Source tile: "));
		configPanel.add(fromText = new JTextField(), "growx");
		JButton fromButton = new JButton("...");
		configPanel.add(fromButton, "wrap");

		configPanel.add(new JLabel("Destination tile: "));
		configPanel.add(toText = new JTextField(), "growx");
		JButton toButton = new JButton("...");
		configPanel.add(toButton, "wrap");

		JButton selectObject = new JButton("Select object");
		configPanel.add(selectObject, "spanx 2, wrap");
		configPanel.add(new JLabel("Action: "));
		configPanel.add(actionText = new JTextField(), "growx, wrap");

		configPanel.add(new JLabel("Object name: "));
		configPanel.add(objNameText = new JTextField(), "growx, wrap");

		configPanel.add(new JLabel("Object id: "));
		configPanel.add(objIdText = new JTextField(), "growx, wrap");

		JButton addLink = new JButton("Add link");
		configPanel.add(addLink, "growx, skip");

		JScrollPane listScroll = new JScrollPane(new JList<>(listModel));

		listPanel.add(listScroll, "grow, push, wrap");
		JButton submit = new JButton("Submit");
		listPanel.add(submit);

		fromButton.addActionListener(a -> RegionHandler.selectingSourceTile = true);
		toButton.addActionListener(a -> RegionHandler.selectingDestinationTile = true);
		selectObject.addActionListener(a -> RegionHandler.selectingObject = true);

		addLink.addActionListener(a -> addLink());
		submit.addActionListener(a -> submit());

		pack();
	}

	private void addLink()
	{
		listModel.addElement(new TransportLink(
				fromText.getText(),
				toText.getText(),
				actionText.getText(),
				objNameText.getText(),
				Integer.parseInt(objIdText.getText())
		));

		fromText.setText(null);
		toText.setText(null);
		actionText.setText(null);
		objNameText.setText(null);
		objIdText.setText(null);
	}

	private void submit()
	{
		if (Game.getState() != GameState.LOGGED_IN)
		{
			return;
		}

		List<TransportLink> out = new ArrayList<>();
		Enumeration<TransportLink> links = listModel.elements();
		while (links.hasMoreElements())
		{
			out.add(links.nextElement());
		}

		EXECUTOR.schedule(() ->
		{
			String json = RegionManager.GSON.toJson(out);
			RequestBody body = RequestBody.create(RegionManager.JSON_MEDIATYPE, json);
			Request request = new Request.Builder()
					.post(body)
					.header("api-key", "f0bbb47b-839a-43f7-b907-eff4ab131231")
					.url(UnethicaliteProperties.getApiUrl() + "/transports")
					.build();

			try (Response response = okHttpClient.newCall(request).execute())
			{
				int code = response.code();
				if (code != 200)
				{
					logger.error("Request was unsuccessful: {}", code);
					return;
				}

				listModel.clear();
				logger.debug("Transports saved successfully");
			}
			catch (Exception e)
			{
				logger.error("Failed to POST: {}", e.getMessage());
				e.printStackTrace();
			}
		}, 1_000, TimeUnit.MILLISECONDS);
	}

	public void display()
	{
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		RegionHandler.selectingSourceTile = false;
		RegionHandler.selectingDestinationTile = false;
		RegionHandler.selectingObject = false;

		if (e.getId() == RegionHandler.TileSelection.SOURCE.getId())
		{
			e.consume();
			Tile hovered = Tiles.getHoveredTile();
			if (hovered == null)
			{
				return;
			}

			WorldPoint coord = hovered.getWorldLocation();

			fromText.setText(coord.getX() + " " + coord.getY() + " " + coord.getPlane());
			return;
		}

		if (e.getId() == RegionHandler.TileSelection.DESTINATION.getId())
		{
			e.consume();
			Tile hovered = Tiles.getHoveredTile();
			if (hovered == null)
			{
				return;
			}

			WorldPoint coord = hovered.getWorldLocation();

			toText.setText(coord.getX() + " " + coord.getY() + " " + coord.getPlane());
			return;
		}

		if (e.getId() == RegionHandler.TileSelection.OBJECT.getId())
		{
			e.consume();
			List<? extends SceneEntity> entities = Entities.getHoveredEntities();
			if (entities.isEmpty())
			{
				return;
			}

			SceneEntity transport = entities.stream().filter(o -> o.getActions() != null
							&& o.hasAction(Objects::nonNull))
					.findFirst().orElse(null);
			if (transport == null)
			{
				return;
			}

			objNameText.setText(transport.getName());
			objIdText.setText(String.valueOf(transport.getId()));

			Arrays.stream(transport.getActions()).filter(Objects::nonNull).findFirst().ifPresent(actionText::setText);
		}
	}
}
