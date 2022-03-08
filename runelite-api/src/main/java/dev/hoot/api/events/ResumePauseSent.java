package dev.hoot.api.events;

import lombok.Data;

@Data
public class ResumePauseSent
{
	int var0;
	int var1;

	public ResumePauseSent(int v0, int v1)
	{
		var0 = v0;
		var1 = v1;
	}
}
