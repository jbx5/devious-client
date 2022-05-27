package net.unethicalite.client.plugins;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import org.pf4j.update.SimpleFileDownloader;

@Slf4j
public class PrivateFileDownloader extends SimpleFileDownloader
{
	private final String token;

	public PrivateFileDownloader(String token)
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

		OkHttpClient okHttpClient = new OkHttpClient();
		Request request = new Request.Builder()
			.addHeader("Authorization", "Bearer " + token)
			.url(fileUrl)
			.get()
			.build();

		try (Response response = okHttpClient.newCall(request).execute())
		{
			long lastModified = System.currentTimeMillis();
			if (response.headers().getDate("Last-Modified") != null)
			{
				lastModified = response.headers().getDate("Last-Modified").toInstant().toEpochMilli();
			}


			try (BufferedSource bufferedSource = response.body().source())
			{
				BufferedSink bufferedSink = Okio.buffer(Okio.sink(file));
				bufferedSink.writeAll(bufferedSource);
				bufferedSink.close();
			}

			log.debug("Set last modified of '{}' to '{}'", file, lastModified);
			Files.setLastModifiedTime(file, FileTime.fromMillis(lastModified));

			return file;
		}
		catch (Exception e)
		{
			log.error("Exception", e);
			throw new IOException(e);
		}
	}
}
