package net.unethicalite.api.events;

import lombok.Value;

@Value
public class ItemObtained
{
	int itemId;
	int amount;
}
