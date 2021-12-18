package net.runelite.client.plugins;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.update.SimpleFileDownloader;

@Slf4j
public class UnethicalFileDownloader extends SimpleFileDownloader
{
	private final String token;

	public UnethicalFileDownloader(String token)
	{
		this.token = token;
	}

	@Override
	protected Path downloadFileHttp(URL fileUrl) throws IOException
	{
		Path destination = Files.createTempDirectory("pf4j-update-downloader");
		destination.toFile().deleteOnExit();

		String path = fileUrl.getPath();
		String fileName = path.substring(path.lastIndexOf('/') + 1);
		Path file = destination.resolve(fileName);

		// set up the URL connection
		URLConnection connection = fileUrl.openConnection();
		connection.addRequestProperty("Authorization", token);

		// connect to the remote site (may takes some time)
		connection.connect();

		// check for http authorization
		HttpURLConnection httpConnection = (HttpURLConnection) connection;
		if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_UNAUTHORIZED)
		{
			throw new ConnectException("HTTP Authorization failure");
		}

		// try to get the server-specified last-modified date of this artifact
		long lastModified = httpConnection.getHeaderFieldDate("Last-Modified", System.currentTimeMillis());

		// try to get the input stream (three times)
		InputStream is = null;
		for (int i = 0; i < 3; i++)
		{
			try
			{
				is = connection.getInputStream();
				break;
			}
			catch (IOException e)
			{
				log.error(e.getMessage(), e);
			}
		}
		if (is == null)
		{
			throw new ConnectException("Can't get '" + fileUrl + " to '" + file + "'");
		}

		// reade from remote resource and write to the local file
		FileOutputStream fos = new FileOutputStream(file.toFile());
		byte[] buffer = new byte[1024];
		int length;
		while ((length = is.read(buffer)) >= 0)
		{
			fos.write(buffer, 0, length);
		}
		fos.close();
		is.close();

		log.debug("Set last modified of '{}' to '{}'", file, lastModified);
		Files.setLastModifiedTime(file, FileTime.fromMillis(lastModified));

		return file;
	}
}
