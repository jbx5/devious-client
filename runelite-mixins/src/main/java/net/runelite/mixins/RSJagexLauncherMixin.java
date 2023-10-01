package net.runelite.mixins;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Properties;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class RSJagexLauncherMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("insecureWriteCredentials")
	private boolean insecureWriteCredentials;

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("runeLiteDir")
	private File runeLiteDir;

	@Inject
	private File credentialsFile;

	@Inject
	private Properties credentialsProperties;

	@Inject
	private boolean storeCredentials;

	@Inject
	@Override
	public String getCredentialsProperty(String var1)
	{
		if (this.credentialsProperties == null)
		{
			this.credentialsFile = new File(this.runeLiteDir, System.getProperty("runelite.credentials.path", "credentials.properties"));
			this.credentialsProperties = new Properties();
			if (this.insecureWriteCredentials)
			{
				String[] propertyKeys = new String[]{"JX_ACCESS_TOKEN", "JX_REFRESH_TOKEN", "JX_CHARACTER_ID", "JX_SESSION_ID", "JX_DISPLAY_NAME"};
				int length = propertyKeys.length;

				for (int i = 0; i < length; ++i)
				{
					String key = propertyKeys[i];
					String value = (String) System.getenv().get(key);
					if (value != null)
					{
						this.credentialsProperties.setProperty(key, value);
					}
				}

				this.storeCredentials = true;
			}

			if (this.credentialsProperties.isEmpty() && this.credentialsFile.exists())
			{
				try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.credentialsFile), StandardCharsets.UTF_8))
				{
					this.credentialsProperties.load(inputStreamReader);
				}
				catch (IOException e)
				{
					client.getLogger().warn("unable to load credentials from disk", e);
				}

				if (this.credentialsProperties.size() > 0)
				{
					client.getLogger().info("read {} credentials from disk", this.credentialsProperties.size());
				}
			}
			else if (this.insecureWriteCredentials)
			{
				client.getLogger().info("writing {} credentials to disk", this.credentialsProperties.size());
				this.writeCredentials();
			}
		}

		String property = (String) System.getenv().get(var1);
		if (property == null)
		{
			property = this.credentialsProperties.getProperty(var1);
			if (property != null && "JX_REFRESH_TOKEN".equals(var1))
			{
				this.storeCredentials = true;
			}
		}
		return property;
	}

	@Inject
	@Override
	public Properties getCredentialsProperties()
	{
		return credentialsProperties;
	}

	@Inject
	@Override
	public boolean storeCredentials()
	{
		return storeCredentials;
	}

	@Inject
	@Override
	public void writeCredentials()
	{
		try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(this.credentialsFile.toPath()), StandardCharsets.UTF_8))
		{
			this.credentialsProperties.store(outputStreamWriter, "Do not share this file with anyone");
		}
		catch (IOException e)
		{
			client.getLogger().warn("unable to write credentials to disk", e);
		}
	}

	@Inject
	@FieldHook("refreshToken")
	public static void onRefreshToken(int var0)
	{
		if (client.storeCredentials())
		{
			client.getCredentialsProperties().setProperty("JX_ACCESS_TOKEN", client.getAccessToken() == null ? "" : client.getAccessToken());
			client.getCredentialsProperties().setProperty("JX_REFRESH_TOKEN", client.getRefreshToken() == null ? "" : client.getRefreshToken());
			client.writeCredentials();
		}
	}

	@Copy("initCredentials")
	@Replace("initCredentials")
	public static void initCredentials()
	{
		client.setAccessToken(client.getCredentialsProperty("JX_ACCESS_TOKEN"));
		client.setRefreshToken(client.getCredentialsProperty("JX_REFRESH_TOKEN"));
		client.setSessionId(client.getCredentialsProperty("JX_SESSION_ID"));
		client.setCharacterId(client.getCredentialsProperty("JX_CHARACTER_ID"));
		String displayName = client.getCredentialsProperty("JX_DISPLAY_NAME");
		String var1;
		if (displayName != null && !displayName.isEmpty() && displayName.charAt(0) != '#')
		{
			var1 = displayName;
		}
		else
		{
			var1 = "";
		}
		client.setDisplayName(var1);
	}
}
