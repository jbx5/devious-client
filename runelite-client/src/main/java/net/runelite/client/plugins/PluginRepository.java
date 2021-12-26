package net.runelite.client.plugins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lombok.Getter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.UpdateRepository;
import org.pf4j.update.util.LenientDateTypeAdapter;
import org.pf4j.update.verifier.CompoundVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PluginRepository implements UpdateRepository
{
	@Getter
	private final String token;

	public PluginRepository(String id, URL url, String token)
	{
		this(id, url, DEFAULT_PLUGINS_JSON_FILENAME, token);
	}

	public PluginRepository(String id, URL url, String pluginsJsonFileName, String token)
	{
		this.token = token;
		this.id = id;
		this.url = url;
		this.pluginsJsonFileName = pluginsJsonFileName;
	}


	private static final String DEFAULT_PLUGINS_JSON_FILENAME = "plugins.json";
	private static final Logger log = LoggerFactory.getLogger(org.pf4j.update.DefaultUpdateRepository.class);

	private String id;
	private URL url;
	private String pluginsJsonFileName;

	private Map<String, PluginInfo> plugins;

	@Override
	public String getId()
	{
		return id;
	}

	@Override
	public URL getUrl()
	{
		return url;
	}

	@Override
	public Map<String, PluginInfo> getPlugins()
	{
		if (plugins == null)
		{
			initPlugins();
		}

		return plugins;
	}

	@Override
	public PluginInfo getPlugin(String id)
	{
		return getPlugins().get(id);
	}

	private void initPlugins()
	{
		Reader pluginsJsonReader;
		try
		{
			URL pluginsUrl = new URL(getUrl(), getPluginsJsonFileName());
			OkHttpClient okHttpClient = new OkHttpClient();
			Request request = new Request.Builder()
				.addHeader("Authorization", "Bearer " + token)
				.url(pluginsUrl)
				.get()
				.build();

			log.debug("Read plugins of '{}' repository from '{}'", id, pluginsUrl);
			try (Response response = okHttpClient.newCall(request).execute())
			{
				pluginsJsonReader = new InputStreamReader(Objects.requireNonNull(response.body()).byteStream());
				Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new LenientDateTypeAdapter()).create();
				PluginInfo[] items = gson.fromJson(pluginsJsonReader, PluginInfo[].class);
				plugins = new HashMap<>(items.length);
				for (PluginInfo p : items)
				{
					for (PluginInfo.PluginRelease r : p.releases)
					{
						try
						{
							r.url = new URL(getUrl(), r.url).toString();
							if (r.date.getTime() == 0)
							{
								log.warn("Illegal release date when parsing {}@{}, setting to epoch", p.id, r.version);
							}
						}
						catch (MalformedURLException e)
						{
							log.warn("Skipping release {} of plugin {} due to failure to build valid absolute URL. Url was {}{}", r.version, p.id, getUrl(), r.url);
						}
					}
					p.setRepositoryId(getId());
					plugins.put(p.id, p);
				}
				log.debug("Found {} plugins in repository '{}'", plugins.size(), id);
			}
		}
		catch (Exception e)
		{
			log.error(e.getMessage(), e);
			plugins = Collections.emptyMap();
			return;
		}
	}

	/**
	 * Causes {@code plugins.json} to be read again to look for new updates from repositories.
	 */
	@Override
	public void refresh()
	{
		plugins = null;
	}

	/**
	 * Gets a file verifier to execute on the downloaded file for it to be claimed valid.
	 * May be a CompoundVerifier in order to chain several verifiers.
	 *
	 * @return list of {@link FileVerifier}s
	 */
	@Override
	public FileVerifier getFileVerifier()
	{
		return new CompoundVerifier();
	}

	/**
	 * Gets the plugins json file name. Returns {@code plugins.json} if null.
	 *
	 * @return the plugins json file name
	 */
	public String getPluginsJsonFileName()
	{
		if (pluginsJsonFileName == null)
		{
			pluginsJsonFileName = DEFAULT_PLUGINS_JSON_FILENAME;
		}

		return pluginsJsonFileName;
	}

	/**
	 * Choose another file name than {@code plugins.json}.
	 *
	 * @param pluginsJsonFileName the name (relative) of plugins.json file.
	 *                            If null, will default to {@code plugins.json}
	 */
	public void setPluginsJsonFileName(String pluginsJsonFileName)
	{
		this.pluginsJsonFileName = pluginsJsonFileName;
	}


	@Override
	public FileDownloader getFileDownloader()
	{
		return new UnethicalFileDownloader(token);
	}
}
