package com.openosrs.client;

import com.google.common.base.Strings;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Properties;
import java.util.UUID;

@Slf4j
public class OpenOSRS
{
	public static final File OPENOSRS_DIR = new File(System.getProperty("user.home"), ".openosrs");
	public static final File EXTERNALPLUGIN_DIR = new File(OPENOSRS_DIR, "plugins");
	public static final String PLUGIN_DEVELOPMENT_PATH = "plugin.development.path";
	public static final String SYSTEM_VERSION;
	public static final String SYSTEM_API_VERSION;

	@Getter(AccessLevel.PACKAGE)
	private static final Properties properties = new Properties();

	public static String uuid = UUID.randomUUID().toString();

	static
	{
		try
		{
			properties.load(OpenOSRS.class.getResourceAsStream("/openosrs.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		SYSTEM_VERSION = properties.getProperty("oprs.version", "0.0.0");
		SYSTEM_API_VERSION = properties.getProperty("oprs.api.version");
	}

	public static String[] getPluginDevelopmentPath()
	{
		// First check if property supplied as environment variable PLUGIN_DEVELOPMENT_PATHS
		String developmentPluginPaths = System.getenv(PLUGIN_DEVELOPMENT_PATH.replace('.', '_').toUpperCase());

		if (Strings.isNullOrEmpty(developmentPluginPaths))
		{
			// Otherwise check the property file
			developmentPluginPaths = properties.getProperty(PLUGIN_DEVELOPMENT_PATH);
		}

		return Strings.isNullOrEmpty(developmentPluginPaths) ? new String[0] : developmentPluginPaths.split(";");
	}

	public static void preload()
	{
		/**
		 * Use rl login block data
		 *
		 * This uses the rl login block instead of the myloginBlock byte array stored in random.dat
		 */
		//byte[] myLoginBlock = new byte[] {-124, -92, -35, -7, 38, 12, 74, -4, -34, -16, 116, 56, 9, -68, 50, 84, -32, -93, -104, 92, -128, -40, -50, -56};
		final byte[] rlLoginBlock = new byte[] {-35, -91, -50, -47, -12, 24, 52, -102, 123, -32, 118, 92, -77, 48, 100, 12, -52, -79, -106, 34, -102, 91, -19, 121};
		final File randomDatFile = new File(OPENOSRS_DIR + File.separator + "random.dat");
		try
		{
			Files.write(randomDatFile.toPath(), rlLoginBlock, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
			log.info("Successfully wrote rl login block {} to {}", rlLoginBlock, randomDatFile.getAbsolutePath());
		}
		catch (IOException e)
		{
			log.error("Failed to write rl login block data to: {}", randomDatFile, e);
		}
	}
}
