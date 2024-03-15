package net.unethicalite.api.movement.pathfinder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.unethicalite.api.movement.pathfinder.model.IgnoredDoor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Slf4j
public class IgnoredDoorLoader
{
	List<IgnoredDoor> ignoredDoors = new ArrayList<>();

	public IgnoredDoorLoader()
	{
		try (InputStream stream = Walker.class.getResourceAsStream("/ignoredDoors.json"))
		{
			if (stream == null)
			{
				return;
			}
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			IgnoredDoor[] ignoredDoors = gson.fromJson(new String(stream.readAllBytes()), IgnoredDoor[].class);
			this.ignoredDoors.addAll(Arrays.asList(ignoredDoors));

		}
		catch (IOException e)
		{
			log.error("Error loading ignored doors", e);
		}
		log.info("Loaded {} ignored doors", ignoredDoors.size());
	}

}
