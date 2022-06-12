package net.unethicalite.api.commons;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import net.unethicalite.client.config.UnethicaliteProperties;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@Slf4j
public class HttpUtil
{
	private static final Gson GSON = new GsonBuilder().create();

	public static <T> T readJson(String url, Class<T> expectedType)
	{
		try
		{
			URL httpUrl = new URL(url);
			URLConnection conn = httpUrl.openConnection();

			conn.setConnectTimeout(UnethicaliteProperties.getConnectionTimeout());
			conn.setReadTimeout(UnethicaliteProperties.getReadTimeout());

			try (InputStream stream = conn.getInputStream())
			{
				return GSON.fromJson(new String(stream.readAllBytes()), expectedType);
			}
			catch (IOException e)
			{
				log.error("Failed to read data", e);
				return null;
			}
		}
		catch (IOException e)
		{
			log.error("Failed to connect to url", e);
			return null;
		}
	}

	public static byte[] readBytes(String url)
	{
		try
		{
			URL httpUrl = new URL(url);
			URLConnection conn = httpUrl.openConnection();

			conn.setConnectTimeout(UnethicaliteProperties.getConnectionTimeout());
			conn.setReadTimeout(UnethicaliteProperties.getReadTimeout());

			try (InputStream stream = conn.getInputStream())
			{
				return stream.readAllBytes();
			}
			catch (IOException e)
			{
				log.error("Failed to read data", e);
				return null;
			}
		}
		catch (IOException e)
		{
			log.error("Failed to connect to url", e);
			return null;
		}
	}
}
