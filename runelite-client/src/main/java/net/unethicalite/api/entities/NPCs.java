package net.unethicalite.api.entities;

import net.unethicalite.api.query.entities.NPCQuery;
import net.unethicalite.client.Static;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class NPCs extends Entities<NPC>
{
	private NPCs()
	{
	}

	private static final NPCs NPCS = new NPCs();

	@Override
	protected List<NPC> all(Predicate<? super NPC> filter)
	{
		List<NPC> out = new ArrayList<>();
		List<NPC> npcs = Static.getClient().getNpcs();
		for (NPC npc : npcs)
		{
			if (filter.test(npc))
			{
				out.add(npc);
			}
		}

		return out;
	}

	public static NPCQuery query()
	{
		return query(NPCs::getAll);
	}

	public static NPCQuery query(Supplier<List<NPC>> supplier)
	{
		return new NPCQuery(supplier);
	}

	public static List<NPC> getAll()
	{
		return getAll(x -> true);
	}

	public static List<NPC> getAll(Predicate<NPC> filter)
	{
		return NPCS.all(filter);
	}

	public static List<NPC> getAll(int... ids)
	{
		return NPCS.all(ids);
	}

	public static List<NPC> getAll(String... names)
	{
		return NPCS.all(names);
	}

	public static NPC getNearest(WorldPoint to, Predicate<NPC> filter)
	{
		return NPCS.nearest(to, filter);
	}

	public static NPC getNearest(WorldPoint to, int... ids)
	{
		return NPCS.nearest(to, ids);
	}

	public static NPC getNearest(WorldPoint to, String... names)
	{
		return NPCS.nearest(to, names);
	}

	public static NPC getNearest(Predicate<NPC> filter)
	{
		return getNearest(Players.getLocal().getWorldLocation(), filter);
	}

	public static NPC getNearest(int... ids)
	{
		return getNearest(Players.getLocal().getWorldLocation(), ids);
	}

	public static NPC getNearest(String... names)
	{
		return getNearest(Players.getLocal().getWorldLocation(), names);
	}
}
