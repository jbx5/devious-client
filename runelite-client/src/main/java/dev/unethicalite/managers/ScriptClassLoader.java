package dev.unethicalite.managers;

import lombok.Getter;
import lombok.Setter;
import net.runelite.client.util.ReflectUtil;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLClassLoader;

public class ScriptClassLoader extends URLClassLoader implements ReflectUtil.PrivateLookupableClassLoader
{
	@Getter
	@Setter
	private MethodHandles.Lookup lookup;

	public ScriptClassLoader(URL[] urls)
	{
		super(urls, ScriptClassLoader.class.getClassLoader());
		ReflectUtil.installLookupHelper(this);
	}

	@Override
	public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError
	{
		return super.defineClass(name, b, off, len);
	}
}
