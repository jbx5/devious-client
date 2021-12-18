package net.runelite.client.plugins;

import java.net.URL;
import org.pf4j.update.DefaultUpdateRepository;
import org.pf4j.update.FileDownloader;

public class PluginRepository extends DefaultUpdateRepository
{
	private final String token;

	public PluginRepository(String id, URL url, String token)
	{
		super(id, url);
		this.token = token;
	}

	public PluginRepository(String id, URL url, String pluginsJsonFileName, String token)
	{
		super(id, url, pluginsJsonFileName);
		this.token = token;
	}


	@Override
	public FileDownloader getFileDownloader()
	{
		return new UnethicalFileDownloader(token);
	}
}
