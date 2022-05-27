package net.unethicalite.api.commons;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.runelite.client.RuneLite;
import net.runelite.client.plugins.Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileUtil
{
	private static final Logger log = LoggerFactory.getLogger(FileUtil.class);
	private static final File DATA_DIR = new File(RuneLite.RUNELITE_DIR, "data");
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	public static void serialize(Plugin plugin, String fileName, Serializable data)
	{
		serialize(plugin.getClass().getSimpleName(), fileName, data);
	}

	public static void serialize(String dirName, String fileName, Serializable data)
	{
		try (FileOutputStream fos = new FileOutputStream(new File(getDirectory(dirName), fileName));
			 ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			oos.writeObject(data);
			oos.flush();
		}
		catch (IOException e)
		{
			log.error("Error serializing file: {}", e.getMessage());
		}
	}

	public static <T> T deserialize(Plugin plugin, String fileName)
	{
		return deserialize(plugin.getClass().getSimpleName(), fileName);
	}

	public static <T> T deserialize(String dirName, String fileName)
	{
		try (FileInputStream fis = new FileInputStream(new File(getDirectory(dirName), fileName));
			 ObjectInputStream ois = new ObjectInputStream(fis))
		{
			return (T) ois.readObject();
		}
		catch (IOException | ClassNotFoundException e)
		{
			log.error("Error deserializing file: {}", e.getMessage());
			return null;
		}
	}

	public static void writeJson(Plugin plugin, String fileName, Object data)
	{
		writeJson(plugin.getClass().getSimpleName(), fileName, data);
	}

	public static void writeJson(String dirName, String fileName, Object data)
	{
		try (FileWriter writer = new FileWriter(new File(getDirectory(dirName), fileName)))
		{
			GSON.toJson(data, writer);
			writer.flush();
		}
		catch (IOException e)
		{
			log.error("Error writing json: {}", e.getMessage());
		}
	}

	public static <T> T readJson(Plugin plugin, String fileName, Class<T> type)
	{
		return readJson(plugin.getClass().getSimpleName(), fileName, type);
	}

	public static <T> T readJson(String dirName, String fileName, Class<T> type)
	{
		return readJson(dirName, fileName, TypeToken.get(type));
	}

	public static <T> T readJson(Plugin plugin, String fileName, TypeToken<T> type)
	{
		return readJson(plugin.getClass().getSimpleName(), fileName, type);
	}

	public static <T> T readJson(String dirName, String fileName, TypeToken<T> type)
	{
		try (FileReader reader = new FileReader(new File(getDirectory(dirName), fileName)))
		{
			return GSON.fromJson(reader, type.getType());
		}
		catch (IOException e)
		{
			log.error("Error reading json: {}", e.getMessage());
			return null;
		}
	}

	public static boolean exists(Plugin plugin, String fileName)
	{
		return exists(plugin.getClass().getSimpleName(), fileName);
	}

	public static boolean exists(String dirName, String fileName)
	{
		File pluginDir = new File(DATA_DIR, dirName);
		return new File(pluginDir, fileName).exists();
	}

	public static File getPluginDirectory(Plugin plugin)
	{
		return getDirectory(plugin.getClass().getSimpleName());
	}

	public static File getDirectory(String dirName)
	{
		File dir = new File(DATA_DIR, dirName);
		dir.mkdirs();
		return dir;
	}
}
