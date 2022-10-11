package net.runelite.http.api.telemetry;

import lombok.Data;

@Data
public class Telemetry
{
	private String javaVendor;
	private String javaVersion;
	private String osName;
	private String osVersion;
	private String osArch;
	private String launcherVersion;
	private long totalMemory;
}