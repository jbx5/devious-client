package net.unethicalite.api.events;

import lombok.Value;

@Value
public class ServerPacketReceived
{
	int id;
	int length;
}
