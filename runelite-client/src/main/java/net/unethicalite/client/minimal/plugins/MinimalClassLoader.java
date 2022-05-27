package net.unethicalite.client.minimal.plugins;

import lombok.Getter;
import lombok.Setter;
import net.runelite.client.util.ReflectUtil;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLClassLoader;

public class MinimalClassLoader extends URLClassLoader implements ReflectUtil.PrivateLookupableClassLoader
{
	@Getter
	@Setter
	private MethodHandles.Lookup lookup;

	public MinimalClassLoader(URL[] urls)
	{
		super(urls, MinimalClassLoader.class.getClassLoader());
		ReflectUtil.installLookupHelper(this);
	}

	@Override
	public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError
	{
		return super.defineClass(name, b, off, len);
	}
}
