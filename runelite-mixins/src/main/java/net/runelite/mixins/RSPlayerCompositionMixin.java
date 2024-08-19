package net.runelite.mixins;

import net.runelite.api.kit.KitType;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSPlayerComposition;

@Mixin(RSPlayerComposition.class)
public abstract class RSPlayerCompositionMixin implements RSPlayerComposition
{
	private static final int ITEM_OFFSET = 2048;
	private static final int KIT_OFFSET = 256;

	@Inject
	@Override
	public boolean isFemale()
	{
		return getGender() == 1;
	}

	@Inject
	@Override
	public int getEquipmentId(KitType type)
	{
		int id = getEquipmentIds()[type.getIndex()];
		if (id < ITEM_OFFSET)
		{
			return -1; // not an item
		}
		return id - ITEM_OFFSET;
	}

	@Inject
	@Override
	public int getKitId(KitType type)
	{
		int id = getEquipmentIds()[type.getIndex()];
		if (id < KIT_OFFSET || id >= ITEM_OFFSET)
		{
			return -1; // not a kit
		}
		return id - KIT_OFFSET;
	}
}
