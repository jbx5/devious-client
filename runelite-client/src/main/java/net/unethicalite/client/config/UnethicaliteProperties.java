package net.unethicalite.client.config;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

public class UnethicaliteProperties
{
	private static final String API_URL;
	private static final int CONNECTION_TIMEOUT;
	private static final int READ_TIMEOUT;

	@Getter
	private static final Properties properties = new Properties();

	static
	{
		try
		{
			properties.load(UnethicaliteProperties.class.getResourceAsStream("unethicalite.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		API_URL = properties.getProperty("unethicalite.api.url");
		CONNECTION_TIMEOUT = Integer.parseInt(properties.getProperty("unethicalite.api.connection-timeout"));
		READ_TIMEOUT = Integer.parseInt(properties.getProperty("unethicalite.api.read-timeout"));
	}

	public static String getApiUrl()
	{
		return API_URL;
	}

	public static int getConnectionTimeout()
	{
		return CONNECTION_TIMEOUT;
	}

	public static int getReadTimeout()
	{
		return READ_TIMEOUT;
	}
}
