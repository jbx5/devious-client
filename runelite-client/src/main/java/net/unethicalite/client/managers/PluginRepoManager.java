package net.unethicalite.client.managers;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Singleton
@Slf4j
public class PluginRepoManager
{
	private List<String> pluginRepoUrls = new ArrayList<>();

	@Inject
	PluginRepoManager(
			@Named("unethicalite.api.url")
			String apiUrl,
			OkHttpClient okHttpClient
	)
	{
		String endPoint = apiUrl + "/malicious-repos";

		Request request = new Request.Builder()
				.get()
				.url(endPoint)
				.build();

		try (Response response = okHttpClient.newCall(request).execute())
		{
			int code = response.code();
			if (code != 200)
			{
				log.error("Request unsuccessful: {}", code);
				return;
			}

			ResponseBody body = response.body();
			if (body == null)
			{
				log.error("Response body is null");
				return;
			}

			Gson gson = new Gson();
			pluginRepoUrls = Arrays.asList(gson.fromJson(body.string(), String[].class));
		}
		catch (Exception e)
		{
			log.error("Failed to GET", e);
		}
	}

	public boolean isRepoMalicious(String owner)
	{
		return pluginRepoUrls.contains(owner);
	}
}
