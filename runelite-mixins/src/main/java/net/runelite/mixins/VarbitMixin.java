package net.runelite.mixins;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import net.runelite.api.VarbitComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSVarbitComposition;

import java.util.Map;

@Mixin(RSClient.class)
public abstract class VarbitMixin implements RSClient
{
	private static final int VARBITS_GROUP = 14;

	@Shadow("client")
	private static RSClient client;

	@Inject
	private Cache<Integer, RSVarbitComposition> varbitCache = CacheBuilder.newBuilder()
		.maximumSize(128)
		.build();

	@Inject
	VarbitMixin()
	{
	}

	@Inject
	@Override
	public int getVar(int varbit)
	{
		return getVarbitValue(getVarps(), varbit);
	}

	@Inject
	@Override
	public int getVarbitValue(int varbitId)
	{
		return getVarbitValue(getVarps(), varbitId);
	}

	@Inject
	@Override
	public void setVarbit(int varbit, int value)
	{
		setVarbitValue(getVarps(), varbit, value);
	}

	@Inject
	@Override
	public RSVarbitComposition getVarbitComposition(int id)
	{
		assert client.isClientThread() : "getVarbitDefinition must be called on client thread";

		RSVarbitComposition varbit = varbitCache.getIfPresent(id);

		if (varbit == null)
		{
			client.getLogger().trace("Cache miss for varbit {}", id);
			client.rs$getVarbit(id); // preload varbit
			varbit = (RSVarbitComposition) getVarbitCache().get(id);
			varbitCache.put(id, varbit);
		}

		return varbit.getIndex() == 0 && varbit.getLeastSignificantBit() == 0 && varbit.getMostSignificantBit() == 0 ? null : varbit;
	}

	@Inject
	@Override
	public int getVarbitValue(int[] varps, int varbitId)
	{
		assert client.isClientThread() : "getVarbitValue must be called on client thread";

		RSVarbitComposition v = getVarbitComposition(varbitId);
		if (v == null)
		{
			throw new IndexOutOfBoundsException("Varbit " + varbitId + " does not exist!"); // oob for "backwards compatibility lol"
		}

		int value = varps[v.getIndex()];
		int lsb = v.getLeastSignificantBit();
		int msb = v.getMostSignificantBit();
		int mask = (1 << ((msb - lsb) + 1)) - 1;
		return (value >> lsb) & mask;
	}

	@Inject
	@Override
	public void setVarbitValue(int[] varps, int varbitId, int value)
	{
		RSVarbitComposition v = getVarbitComposition(varbitId);
		if (v == null)
		{
			throw new IndexOutOfBoundsException(String.format("Varbit %d does not exist!", varbitId)); // oob for "backwards compatibility lol"
		}

		int lsb = v.getLeastSignificantBit();
		int msb = v.getMostSignificantBit();
		int mask = (1 << ((msb - lsb) + 1)) - 1;
		varps[v.getIndex()] = (varps[v.getIndex()] & ~(mask << lsb)) | ((value & mask) << lsb);
	}

	@Inject
	@Override
	public int getVarcIntValue(int varcIntId)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		Object object = varcmap.get(varcIntId);
		return object instanceof Integer ? (Integer) object : 0;
	}

	@Inject
	@Override
	public void setVarcIntValue(int varc, int value)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		varcmap.put(varc, value);
	}

	@Inject
	@Override
	public String getVarcStrValue(int varcStrId)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		Object var2 = varcmap.get(varcStrId);
		return var2 instanceof String ? (String) var2 : "";
	}

	@Inject
	@Override
	public void setVarcStrValue(int varc, String value)
	{
		Map<Integer, Object> varcmap = getVarcMap();
		varcmap.put(varc, value);
	}

	@Inject
	@Override
	public Map<Integer, Object> getVarcMap()
	{
		return getVarcs().getVarcMap();
	}

	@Inject
	@Override
	public VarbitComposition getVarbit(int id)
	{
		return getVarbitComposition(id);
	}
}
