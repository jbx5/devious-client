package net.unethicalite.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import net.runelite.client.RuneLite;
import static net.runelite.client.RuneLite.OPENOSRS;
import net.unethicalite.client.minimal.MinimalClient;

@Slf4j
public class Unethicalite
{
	public static final File CLIENT_DIR = new File(System.getProperty("user.home"), ".openosrs");

	private static String[] getClientArgs()
	{
		final File clientArgsFile = new File(CLIENT_DIR, "client-args.properties");
		final Properties clientArgsProperties = new Properties();
		if (!clientArgsFile.exists())
		{
			clientArgsProperties.setProperty("clientArgs", "");
			try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(clientArgsFile.toPath()), StandardCharsets.UTF_8))
			{
				clientArgsProperties.store(outputStreamWriter, "client arguments");
			}
			catch (IOException e)
			{
				log.error("unable to create client args file", e);
			}
		}

		try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(clientArgsFile), StandardCharsets.UTF_8))
		{
			clientArgsProperties.load(inputStreamReader);
		}
		catch (IOException e)
		{
			log.warn("unable to load client arguments from disk", e);
		}

		String clientArgs = clientArgsProperties.getProperty("clientArgs");
		return clientArgs != null ? clientArgs.split(" ") : null;
	}

	public static void main(String[] args) throws Exception
	{
		args = ArrayUtils.addAll(args, getClientArgs());

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
