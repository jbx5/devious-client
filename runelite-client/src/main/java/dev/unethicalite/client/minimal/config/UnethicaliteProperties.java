package dev.unethicalite.client.minimal.config;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

public class UnethicaliteProperties
{
	private static final String API_URL;

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
	}

	public static String getApiUrl()
	{
		return API_URL;
	}
}
