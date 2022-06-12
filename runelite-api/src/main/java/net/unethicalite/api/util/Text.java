package net.unethicalite.api.util;

public class Text
{
	public static String sanitize(String string)
	{
		if (string == null)
		{
			return null;
		}

		String tagsRemoved = net.runelite.api.util.Text.removeTags(string);
		if (tagsRemoved == null)
		{
			return null;
		}

		return net.runelite.api.util.Text.sanitize(tagsRemoved);
	}
}
