package net.unethicalite.client;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import static net.runelite.client.RuneLite.OPENOSRS;
import net.unethicalite.client.minimal.MinimalClient;

@Slf4j
public class Unethicalite
{
	public static final File CLIENT_DIR = new File(System.getProperty("user.home"), ".openosrs");

	public static void main(String[] args) throws Exception
	{

		if (Arrays.asList(args).contains("--minimal"))
		{
			System.setProperty("unethicalite.minimal", "true");
			MinimalClient.main(args);
		}
		else
		{
			RuneLite.main(args);
		}
	}

	private static String getCacheDir()
	{
		var dir = System.getProperty("unethicalite.cache-dir");
		if (dir != null)
		{
			return dir;
		}

		return OPENOSRS;
	}

	public static File getCacheDirectory()
	{
		var dir = getCacheDir();
		if (Objects.equals(dir, OPENOSRS))
		{
			return new File(CLIENT_DIR, "jagexcache");
		}

		var cacheDirs = new File(CLIENT_DIR, "custom-cache");
		return new File(cacheDirs, dir);
	}
}
