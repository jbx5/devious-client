package net.unethicalite.client;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import net.unethicalite.client.minimal.MinimalClient;

import javax.swing.JOptionPane;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;

import static net.runelite.client.RuneLite.CACHE_DIR;
import static net.runelite.client.RuneLite.OPENOSRS;

@Slf4j
public class Unethicalite
{
	public static final File CLIENT_DIR = new File(System.getProperty("user.home"), ".openosrs");

	public static void main(String[] args) throws Exception
	{
		if (!CACHE_DIR.exists())
		{
			JOptionPane.showMessageDialog(null,
					"Please first run RuneLite on this device before using Unethicalite!",
					"Error loading cache",
					JOptionPane.ERROR_MESSAGE
			);

			System.exit(0);
			return;
		}

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
