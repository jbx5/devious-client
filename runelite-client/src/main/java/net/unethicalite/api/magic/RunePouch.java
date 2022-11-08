package net.unethicalite.api.magic;

import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import static net.runelite.api.Varbits.RUNE_POUCH_AMOUNT1;
import static net.runelite.api.Varbits.RUNE_POUCH_AMOUNT2;
import static net.runelite.api.Varbits.RUNE_POUCH_AMOUNT3;
import static net.runelite.api.Varbits.RUNE_POUCH_AMOUNT4;
import static net.runelite.api.Varbits.RUNE_POUCH_RUNE1;
import static net.runelite.api.Varbits.RUNE_POUCH_RUNE2;
import static net.runelite.api.Varbits.RUNE_POUCH_RUNE3;
import static net.runelite.api.Varbits.RUNE_POUCH_RUNE4;

@Slf4j
public class RunePouch
{
	public enum RuneSlot
	{
		FIRST(RUNE_POUCH_RUNE1, RUNE_POUCH_AMOUNT1),
		SECOND(RUNE_POUCH_RUNE2, RUNE_POUCH_AMOUNT2),
		THIRD(RUNE_POUCH_RUNE3, RUNE_POUCH_AMOUNT3),
		FOURTH(RUNE_POUCH_RUNE4, RUNE_POUCH_AMOUNT4);

		private final int type;
		private final int quantityVarbitIdx;

		private final LoadingCache<Integer, Integer> VARBIT_CACHE = CacheBuilder.newBuilder()
				.expireAfterWrite(1, TimeUnit.SECONDS)
				.build(new CacheLoader<>()
				{
					@Override
					public Integer load(@NotNull Integer type)
					{
						return Vars.getBit(type);
					}
				});

		RuneSlot(int type, int quantityVarbitIdx)
		{
			this.type = type;
			this.quantityVarbitIdx = quantityVarbitIdx;
		}

		public int getType()
		{
			return type;
		}

		public int getQuantityVarbitIdx()
		{
			return quantityVarbitIdx;
		}

		public int getVarbit()
		{
			try
			{
				return VARBIT_CACHE.get(type);
			}
			catch (ExecutionException e)
			{
				log.error("Failed to get cached varbit", e);
				return 0;
			}
		}

		public String getRuneName()
		{
			switch (getVarbit())
			{
				case 1:
					return "Air rune";
				case 2:
					return "Water rune";
				case 3:
					return "Earth rune";
				case 4:
					return "Fire rune";
				case 5:
					return "Mind rune";
				case 6:
					return "Chaos rune";
				case 7:
					return "Death rune";
				case 8:
					return "Blood rune";
				case 9:
					return "Cosmic rune";
				case 10:
					return "Nature rune";
				case 11:
					return "Law rune";
				case 12:
					return "Body rune";
				case 13:
					return "Soul rune";
				case 14:
					return "Astral rune";
				case 15:
					return "Mist rune";
				case 16:
					return "Mud rune";
				case 17:
					return "Dust rune";
				case 18:
					return "Lava rune";
				case 19:
					return "Steam rune";
				case 20:
					return "Smoke rune";
				default:
					return null;
			}
		}

		public int getQuantity()
		{
			return Vars.getBit(quantityVarbitIdx);
		}
	}

	public static int getQuantity(Rune rune)
	{
		if (!hasPouch())
		{
			return 0;
		}

		RuneSlot runeSlot =
				Arrays.stream(RuneSlot.values()).filter(x -> Arrays.stream(rune.getRuneNames())
								.anyMatch(name -> x.getRuneName() != null && x.getRuneName().startsWith(name)))
						.findFirst()
						.orElse(null);

		if (runeSlot == null)
		{
			return 0;
		}

		return runeSlot.getQuantity();
	}

	public static boolean hasPouch()
	{
		return Inventory.getFirst("Rune pouch", "Divine rune pouch") != null;
	}
}
