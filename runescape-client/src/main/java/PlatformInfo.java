import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 180468389
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bk")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1525358399
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -382850923
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -561302681
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1703628029
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -5008815
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bn")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 293556831
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1434028233
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -978084925
	)
	@Export("field4527")
	int field4527;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -512283169
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bc")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bz")
	@Export("field4514")
	String field4514;
	@ObfuscatedName("bh")
	@Export("field4528")
	String field4528;
	@ObfuscatedName("bs")
	@Export("field4532")
	String field4532;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 482849939
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1971283421
	)
	@Export("field4534")
	int field4534;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1206311181
	)
	@Export("field4535")
	int field4535;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1980466983
	)
	@Export("field4530")
	int field4530;
	@ObfuscatedName("ch")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("co")
	@Export("field4538")
	String field4538;
	@ObfuscatedName("cd")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -2016058655
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cn")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("cz")
	@Export("field4542")
	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4539 = new int[3];
		this.os = var1;
		this.arch64 = var2;
		this.osVersion = var3;
		this.vendor = var4;
		this.javaMajor = var5;
		this.javaMinor = var6;
		this.javaPatch = var7;
		this.field4524 = var8;
		this.maxMemory = var9;
		this.cpuCores = var10;
		this.field4527 = var11;
		this.clockSpeed = var12;
		this.field4536 = var13;
		this.field4514 = var14;
		this.field4528 = var15;
		this.field4532 = var16;
		this.field4512 = var17;
		this.field4534 = var18;
		this.field4535 = var19;
		this.field4530 = var20;
		this.field4537 = var21;
		this.field4538 = var22;
		this.field4539 = var23;
		this.field4540 = var24;
		this.field4541 = var25;
		this.field4542 = var26;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1274102943"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.os);
		var1.writeByte(this.arch64 ? 1 : 0);
		var1.writeShort(this.osVersion);
		var1.writeByte(this.vendor);
		var1.writeByte(this.javaMajor);
		var1.writeByte(this.javaMinor);
		var1.writeByte(this.javaPatch);
		var1.writeByte(this.field4524 ? 1 : 0);
		var1.writeShort(this.maxMemory);
		var1.writeByte(this.cpuCores);
		var1.writeMedium(this.field4527);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4536);
		var1.writeStringCp1252NullCircumfixed(this.field4514);
		var1.writeStringCp1252NullCircumfixed(this.field4528);
		var1.writeStringCp1252NullCircumfixed(this.field4532);
		var1.writeByte(this.field4534);
		var1.writeShort(this.field4512);
		var1.writeStringCp1252NullCircumfixed(this.field4537);
		var1.writeStringCp1252NullCircumfixed(this.field4538);
		var1.writeByte(this.field4535);
		var1.writeByte(this.field4530);

		for (int var2 = 0; var2 < this.field4539.length; ++var2) {
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540);
		var1.writeStringCp1252NullCircumfixed(this.field4541);
		var1.writeStringCp1252NullCircumfixed(this.field4542);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "930770389"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class174.method3546(this.field4536);
		var2 += class174.method3546(this.field4514);
		var2 += class174.method3546(this.field4528);
		var2 += class174.method3546(this.field4532);
		var2 += class174.method3546(this.field4537);
		var2 += class174.method3546(this.field4538);
		var2 += class174.method3546(this.field4541);
		var2 += class174.method3546(this.field4542);
		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-525384882"
	)
	@Export("getDeviceId")
	public String getDeviceId(int var1) {
		String var2 = "";
		String var3 = "";
		switch(var1) {
		case 1:
			var2 = "wmic csproduct get UUID";
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2);
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
			StringBuffer var6 = new StringBuffer();

			String var7;
			while ((var7 = var5.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (var1 == 1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (var1 == 2) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			}
		} catch (IOException var9) {
			var9.printStackTrace();
		}

		return var3;
	}
}
