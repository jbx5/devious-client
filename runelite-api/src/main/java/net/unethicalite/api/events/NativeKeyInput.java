package net.unethicalite.api.events;

import lombok.Value;

@Value
public class NativeKeyInput
{
	char keyChar;
	int keyCode;
	int keyLocation;
	Type type;

	public enum Type
	{
		TYPED, PRESSED, RELEASED
	}
}
