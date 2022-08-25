package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPlatformInfo
{

	@Import("vendor")
	int getVendor();

	@Import("maxMemory")
	int getMaxMemory();

	@Import("clockSpeed")
	int getClockSpeed();

	@Import("cpuCores")
	int getCpuCores();

	@Import("osVersion")
	int getOsVersion();

	@Import("os")
	int getOs();

	@Import("javaMajor")
	int getJavaMajor();

	@Import("javaMinor")
	int getJavaMinor();

	@Import("javaPatch")
	int getJavaPatch();

	@Import("vendor")
	void setVendor(int vendor);

	@Import("maxMemory")
	void setMaxMemory(int maxMemory);

	@Import("clockSpeed")
	void setClockSpeed(int clockSpeed);

	@Import("cpuCores")
	void setCpuCores(int cpuCores);

	@Import("osVersion")
	void setOsVersion(int osVersion);

	@Import("os")
	void setOs(int os);

	@Import("javaMajor")
	void setJavaMajor(int javaMajor);

	@Import("javaMinor")
	void setJavaMinor(int javaMinor);

	@Import("javaPatch")
	void setJavaPatch(int javaPatch);
}
