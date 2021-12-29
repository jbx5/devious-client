/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package dev.hoot.bot.config;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableMap;
import dev.hoot.bot.Bot;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.*;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.util.ColorUtil;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@Singleton
@Slf4j
public class BotConfigManager
{
	public static final String RSPROFILE_GROUP = "rsprofile";

	private static final int KEY_SPLITTER_GROUP = 0;
	private static final int KEY_SPLITTER_PROFILE = 1;
	private static final int KEY_SPLITTER_KEY = 2;

	private final EventBus eventBus;

	private final BotConfigInvocationHandler handler = new BotConfigInvocationHandler(this);

	private final Map<String, Properties> propertiesMap;
	private final Map<String, String> pendingChanges = new HashMap<>();

	@Inject
	public BotConfigManager(
			EventBus eventBus
	)
	{
		this.eventBus = eventBus;
		this.propertiesMap = new HashMap<>();
		for (Map.Entry<String, File> entry : Bot.CONFIG_FILES.entrySet())
		{
			Properties properties = new Properties();
			propertiesMap.put(entry.getKey(), properties);
		}
	}

	public void load()
	{
		loadFromFile();
	}

	private synchronized void loadFromFile()
	{
		handler.invalidate();
		propertiesMap.values().forEach(Properties::clear);

		for (Map.Entry<String, File> entry : Bot.CONFIG_FILES.entrySet())
		{
			File propertiesFile = entry.getValue();

			try (FileInputStream in = new FileInputStream(propertiesFile))
			{
				propertiesMap.get(entry.getKey()).load(new InputStreamReader(in, StandardCharsets.UTF_8));
			}
			catch (FileNotFoundException ex)
			{
				log.debug("Unable to load settings - no such file");
			}
			catch (IllegalArgumentException | IOException ex)
			{
				log.warn("Unable to load settings", ex);
			}

			try
			{
				Map<String, String> copy = (Map) ImmutableMap.copyOf(propertiesMap.get(entry.getKey()));
				copy.forEach((wholeKey, value) ->
				{
					String[] split = splitKey(wholeKey);
					if (split == null)
					{
						log.debug("Properties key malformed!: {}", wholeKey);
						propertiesMap.get(entry.getKey()).remove(wholeKey);
						return;
					}

					String groupName = split[KEY_SPLITTER_GROUP];
					String profile = split[KEY_SPLITTER_PROFILE];
					String key = split[KEY_SPLITTER_KEY];

					ConfigChanged configChanged = new ConfigChanged();
					configChanged.setGroup(groupName);
					configChanged.setProfile(profile);
					configChanged.setKey(key);
					configChanged.setOldValue(null);
					configChanged.setNewValue(value);
					eventBus.post(configChanged);
				});
			}
			catch (Exception ex)
			{
				log.warn("Error posting config events", ex);
			}
		}
	}

	private void saveToFile(final String group, final File propertiesFile) throws IOException
	{
		File parent = propertiesFile.getParentFile();

		parent.mkdirs();

		File tempFile = File.createTempFile(group, null, parent);

		try (FileOutputStream out = new FileOutputStream(tempFile))
		{
			out.getChannel().lock();
			propertiesMap.get(group).store(new OutputStreamWriter(out, StandardCharsets.UTF_8), group + " configuration");
			// FileOutputStream.close() closes the associated channel, which frees the lock
		}

		try
		{
			Files.move(tempFile.toPath(), propertiesFile.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
		}
		catch (AtomicMoveNotSupportedException ex)
		{
			log.debug("atomic move not supported", ex);
			Files.move(tempFile.toPath(), propertiesFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}
	}

	public <T extends Config> T getConfig(Class<T> clazz)
	{
		if (!Modifier.isPublic(clazz.getModifiers()))
		{
			throw new RuntimeException("Non-public configuration classes can't have default methods invoked");
		}

		T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]
				{
						clazz
				}, handler);

		return t;
	}

	public static String getWholeKey(String groupName, String profile, String key)
	{
		if (profile == null)
		{
			return groupName + "." + key;
		}
		else
		{
			return groupName + "." + profile + "." + key;
		}
	}

	public String getConfiguration(String groupName, String key)
	{
		return getConfiguration(groupName, null, key);
	}

	public String getConfiguration(String groupName, String profile, String key)
	{
		return propertiesMap.get(groupName).getProperty(getWholeKey(groupName, profile, key));
	}

	public <T> T getConfiguration(String groupName, String key, Type type)
	{
		return getConfiguration(groupName, null, key, type);
	}

	public <T> T getConfiguration(String groupName, String profile, String key, Type type)
	{
		String value = getConfiguration(groupName, profile, key);
		if (!Strings.isNullOrEmpty(value))
		{
			try
			{
				return (T) stringToObject(value, type);
			}
			catch (Exception e)
			{
				log.warn("Unable to unmarshal {} ", getWholeKey(groupName, profile, key), e);
			}
		}
		return null;
	}

	public void setConfiguration(String groupName, String key, String value)
	{
		setConfiguration(groupName, null, key, value);
	}

	public void setConfiguration(String groupName, String profile, String key, String value)
	{
		if (Strings.isNullOrEmpty(groupName) || Strings.isNullOrEmpty(key))
		{
			throw new IllegalArgumentException();
		}

		assert !key.startsWith(RSPROFILE_GROUP + ".");
		String wholeKey = getWholeKey(groupName, profile, key);
		String oldValue = (String) propertiesMap.get(groupName).setProperty(wholeKey, value);

		if (Objects.equals(oldValue, value))
		{
			return;
		}

		log.debug("Setting configuration value for {} to {}", wholeKey, value);
		handler.invalidate();

		synchronized (pendingChanges)
		{
			pendingChanges.put(wholeKey, value);
		}

		ConfigChanged configChanged = new ConfigChanged();
		configChanged.setGroup(groupName);
		configChanged.setProfile(profile);
		configChanged.setKey(key);
		configChanged.setOldValue(oldValue);
		configChanged.setNewValue(value);

		eventBus.post(configChanged);

		try
		{
			saveToFile(groupName, Bot.CONFIG_FILES.get(groupName));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void setConfiguration(String groupName, String profile, String key, Object value)
	{
		setConfiguration(groupName, profile, key, objectToString(value));
	}

	public void setConfiguration(String groupName, String key, Object value)
	{
		setConfiguration(groupName, null, key, value);
	}

	public void unsetConfiguration(String groupName, String key)
	{
		unsetConfiguration(groupName, null, key);
	}

	public void unsetConfiguration(String groupName, String profile, String key)
	{
		assert !key.startsWith(RSPROFILE_GROUP + ".");
		String wholeKey = getWholeKey(groupName, profile, key);
		String oldValue = (String) propertiesMap.get(groupName).remove(wholeKey);

		if (oldValue == null)
		{
			return;
		}

		log.debug("Unsetting configuration value for {}", wholeKey);
		handler.invalidate();

		synchronized (pendingChanges)
		{
			pendingChanges.put(wholeKey, null);
		}

		ConfigChanged configChanged = new ConfigChanged();
		configChanged.setGroup(groupName);
		configChanged.setKey(key);
		configChanged.setOldValue(oldValue);

		eventBus.post(configChanged);

		try
		{
			saveToFile(groupName, Bot.CONFIG_FILES.get(groupName));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public ConfigDescriptor getConfigDescriptor(Config configurationProxy)
	{
		Class<?> inter = configurationProxy.getClass().getInterfaces()[0];
		ConfigGroup group = inter.getAnnotation(ConfigGroup.class);

		if (group == null)
		{
			throw new IllegalArgumentException("Not a config group");
		}

		final List<ConfigSectionDescriptor> sections = Arrays.stream(inter.getDeclaredFields())
				.filter(m -> m.isAnnotationPresent(ConfigSection.class) && m.getType() == String.class)
				.map(m ->
				{
					try
					{
						return new ConfigSectionDescriptor(
								String.valueOf(m.get(inter)),
								m.getDeclaredAnnotation(ConfigSection.class)
						);
					}
					catch (IllegalAccessException e)
					{
						log.warn("Unable to load section {}::{}", inter.getSimpleName(), m.getName());
						return null;
					}
				})
				.filter(Objects::nonNull)
				.sorted((a, b) -> ComparisonChain.start()
						.compare(a.getSection().position(), b.getSection().position())
						.compare(a.getSection().name(), b.getSection().name())
						.result())
				.collect(Collectors.toList());

		final List<ConfigTitleDescriptor> titles = Arrays.stream(inter.getDeclaredFields())
				.filter(m -> m.isAnnotationPresent(ConfigTitle.class) && m.getType() == String.class)
				.map(m ->
				{
					try
					{
						return new ConfigTitleDescriptor(
								String.valueOf(m.get(inter)),
								m.getDeclaredAnnotation(ConfigTitle.class)
						);
					}
					catch (IllegalAccessException e)
					{
						log.warn("Unable to load title {}::{}", inter.getSimpleName(), m.getName());
						return null;
					}
				})
				.filter(Objects::nonNull)
				.sorted((a, b) -> ComparisonChain.start()
						.compare(a.getTitle().position(), b.getTitle().position())
						.compare(a.getTitle().name(), b.getTitle().name())
						.result())
				.collect(Collectors.toList());

		final List<ConfigItemDescriptor> items = Arrays.stream(inter.getMethods())
				.filter(m -> m.getParameterCount() == 0 && m.isAnnotationPresent(ConfigItem.class))
				.map(m -> new ConfigItemDescriptor(
						m.getDeclaredAnnotation(ConfigItem.class),
						m.getReturnType(),
						m.getDeclaredAnnotation(Range.class),
						m.getDeclaredAnnotation(Alpha.class),
						m.getDeclaredAnnotation(Units.class)
				))
				.sorted((a, b) -> ComparisonChain.start()
						.compare(a.getItem().position(), b.getItem().position())
						.compare(a.getItem().name(), b.getItem().name())
						.result())
				.collect(Collectors.toList());

		return new ConfigDescriptor(group, sections, titles, items);
	}

	/**
	 * Initialize the configuration from the default settings
	 *
	 * @param proxy
	 */
	public void setDefaultConfiguration(Object proxy, boolean override)
	{
		Class<?> clazz = proxy.getClass().getInterfaces()[0];
		ConfigGroup group = clazz.getAnnotation(ConfigGroup.class);

		if (group == null)
		{
			return;
		}

		for (Method method : clazz.getDeclaredMethods())
		{
			ConfigItem item = method.getAnnotation(ConfigItem.class);

			// only apply default configuration for methods which read configuration (0 args)
			if (item == null || method.getParameterCount() != 0)
			{
				continue;
			}

			if (!method.isDefault())
			{
				if (override)
				{
					String current = getConfiguration(group.value(), item.keyName());
					// only unset if already set
					if (current != null)
					{
						unsetConfiguration(group.value(), item.keyName());
					}
				}
				continue;
			}

			if (!override)
			{
				// This checks if it is set and is also unmarshallable to the correct type; so
				// we will overwrite invalid config values with the default
				Object current = getConfiguration(group.value(), item.keyName(), method.getReturnType());
				if (current != null)
				{
					continue; // something else is already set
				}
			}

			Object defaultValue;
			try
			{
				defaultValue = BotConfigInvocationHandler.callDefaultMethod(proxy, method, null);
			}
			catch (Throwable ex)
			{
				log.warn(null, ex);
				continue;
			}

			String current = getConfiguration(group.value(), item.keyName());
			String valueString = objectToString(defaultValue);
			// null and the empty string are treated identically in sendConfig and treated as an unset
			// If a config value defaults to "" and the current value is null, it will cause an extra
			// unset to be sent, so treat them as equal
			if (Objects.equals(current, valueString) || (Strings.isNullOrEmpty(current) && Strings.isNullOrEmpty(valueString)))
			{
				continue; // already set to the default value
			}

			log.debug("Setting default configuration value for {}.{} to {}", group.value(), item.keyName(), defaultValue);

			setConfiguration(group.value(), item.keyName(), valueString);
		}
	}

	static Object stringToObject(String str, Type type)
	{
		if (type == boolean.class || type == Boolean.class)
		{
			return Boolean.parseBoolean(str);
		}
		if (type == int.class)
		{
			return Integer.parseInt(str);
		}
		if (type == Color.class)
		{
			return ColorUtil.fromString(str);
		}
		if (type == Dimension.class)
		{
			String[] splitStr = str.split("x");
			int width = Integer.parseInt(splitStr[0]);
			int height = Integer.parseInt(splitStr[1]);
			return new Dimension(width, height);
		}
		if (type == Point.class)
		{
			String[] splitStr = str.split(":");
			int width = Integer.parseInt(splitStr[0]);
			int height = Integer.parseInt(splitStr[1]);
			return new Point(width, height);
		}
		if (type == Rectangle.class)
		{
			String[] splitStr = str.split(":");
			int x = Integer.parseInt(splitStr[0]);
			int y = Integer.parseInt(splitStr[1]);
			int width = Integer.parseInt(splitStr[2]);
			int height = Integer.parseInt(splitStr[3]);
			return new Rectangle(x, y, width, height);
		}
		if (type instanceof Class && ((Class<?>) type).isEnum())
		{
			return Enum.valueOf((Class<? extends Enum>) type, str);
		}
		if (type == Instant.class)
		{
			return Instant.parse(str);
		}
		if (type == Keybind.class || type == ModifierlessKeybind.class)
		{
			String[] splitStr = str.split(":");
			int code = Integer.parseInt(splitStr[0]);
			int mods = Integer.parseInt(splitStr[1]);
			if (type == ModifierlessKeybind.class)
			{
				return new ModifierlessKeybind(code, mods);
			}
			return new Keybind(code, mods);
		}
		if (type == WorldPoint.class)
		{
			String[] splitStr = str.split(":");
			int x = Integer.parseInt(splitStr[0]);
			int y = Integer.parseInt(splitStr[1]);
			int plane = Integer.parseInt(splitStr[2]);
			return new WorldPoint(x, y, plane);
		}
		if (type == Duration.class)
		{
			return Duration.ofMillis(Long.parseLong(str));
		}
		if (type == byte[].class)
		{
			return Base64.getUrlDecoder().decode(str);
		}
		return str;
	}

	@Nullable
	static String objectToString(Object object)
	{
		if (object instanceof Color)
		{
			return String.valueOf(((Color) object).getRGB());
		}
		if (object instanceof Enum)
		{
			return ((Enum) object).name();
		}
		if (object instanceof Dimension)
		{
			Dimension d = (Dimension) object;
			return d.width + "x" + d.height;
		}
		if (object instanceof Point)
		{
			Point p = (Point) object;
			return p.x + ":" + p.y;
		}
		if (object instanceof Rectangle)
		{
			Rectangle r = (Rectangle) object;
			return r.x + ":" + r.y + ":" + r.width + ":" + r.height;
		}
		if (object instanceof Instant)
		{
			return ((Instant) object).toString();
		}
		if (object instanceof Keybind)
		{
			Keybind k = (Keybind) object;
			return k.getKeyCode() + ":" + k.getModifiers();
		}
		if (object instanceof WorldPoint)
		{
			WorldPoint wp = (WorldPoint) object;
			return wp.getX() + ":" + wp.getY() + ":" + wp.getPlane();
		}
		if (object instanceof Duration)
		{
			return Long.toString(((Duration) object).toMillis());
		}
		if (object instanceof byte[])
		{
			return Base64.getUrlEncoder().encodeToString((byte[]) object);
		}
		return object == null ? null : object.toString();
	}

	@Subscribe(priority = 100)
	private void onClientShutdown(ClientShutdown e)
	{
		Future<Void> f = sendConfig();
		if (f != null)
		{
			e.waitFor(f);
		}
	}

	@Nullable
	private CompletableFuture<Void> sendConfig()
	{
		CompletableFuture<Void> future = null;

		try
		{
			for (Map.Entry<String, File> entry : Bot.CONFIG_FILES.entrySet())
			{
				saveToFile(entry.getKey(), entry.getValue());
			}
		}
		catch (IOException ex)
		{
			log.warn("unable to save configuration file", ex);
		}

		return future;
	}

	/**
	 * Split a config key into (group, profile, key)
	 *
	 * @param key in form group.(rsprofile.profile.)?key
	 * @return an array of {group, profile, key}
	 */
	@VisibleForTesting
	@Nullable
	static String[] splitKey(String key)
	{
		int i = key.indexOf('.');
		if (i == -1)
		{
			// all keys must have a group and key
			return null;
		}

		String group = key.substring(0, i);
		String profile = null;
		key = key.substring(i + 1);
		if (key.startsWith(RSPROFILE_GROUP + "."))
		{
			i = key.indexOf('.', RSPROFILE_GROUP.length() + 2); // skip . after RSPROFILE_GROUP
			profile = key.substring(0, i);
			key = key.substring(i + 1);
		}
		return new String[]{group, profile, key};
	}
}
