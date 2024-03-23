package net.unethicalite.api.movement.pathfinder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.model.IgnoredDoor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class IgnoredDoorLoader
{
	public static final Map<WorldPoint, IgnoredDoor> IGNORED_DOORS = new HashMap<>();

	public static void init()
	{
		log.info("Loading ignored doors");
		try (InputStream stream = Walker.class.getResourceAsStream("/ignoredDoors.json"))
		{
			if (stream == null)
			{
				log.error("Failed to load ignored doors");
				return;
			}
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			IgnoredDoor[] ignoredDoors = gson.fromJson(new String(stream.readAllBytes()), IgnoredDoor[].class);
			Arrays.stream(ignoredDoors).forEach(door -> IGNORED_DOORS.put(door.getLocation(), door));

		}
		catch (IOException e)
		{
			log.error("Error loading ignored doors", e);
		}
		log.info("Loaded {} ignored doors", IGNORED_DOORS.size());
	}

	public static Map<WorldPoint, IgnoredDoor> getIgnoredDoors()
	{
		return IGNORED_DOORS;
	}

}
