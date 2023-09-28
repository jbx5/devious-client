package net.unethicalite.api.game;

import com.openosrs.client.game.WorldLocation;
import net.runelite.api.coords.WorldPoint;

public class House
{
	public static final int HOUSE_LOCATION_VARBIT = 2187;
	public static final WorldLocation[] HOUSE_LOCATIONS = {
		WorldLocation.RIMMINGTON_PORTAL,
		WorldLocation.TAVERLY_POH_PORTAL,
		WorldLocation.POLLNIVNEACH_POH_PORTAL,
		WorldLocation.RELLEKKA_POH_PORTAL,
		WorldLocation.BRIMHAVEN_POH_PORTAL,
		WorldLocation.YANILLE_POH_PORTAL,
		WorldLocation.PRIFDDINAS_POH_PORTAL,
		WorldLocation.HOSIDIUS_POH_PORTAL
	};

	public static WorldPoint getOutsideLocation()
	{
		if (!Game.isLoggedIn())
		{
			return null;
		}

		int idx = Vars.getBit(HOUSE_LOCATION_VARBIT);
		if (idx >= HOUSE_LOCATIONS.length || idx <= 0)
		{
			return null;
		}

		return HOUSE_LOCATIONS[idx - 1].getWorldArea().getCenter();
	}

}
