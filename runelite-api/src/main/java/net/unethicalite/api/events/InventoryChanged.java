package net.unethicalite.api.events;

import lombok.Value;

@Value
public class InventoryChanged
{
	ChangeType changeType;
	int itemId;
	int amount;

	public enum ChangeType
	{
		ITEM_ADDED, ITEM_REMOVED
	}
}
