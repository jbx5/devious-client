import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("PlatformInfo")
public class PlatformInfo extends Node implements class115 {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1443411709
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bg")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -848330753
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 667260975
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1469332107
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -485504683
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 880016047
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bw")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1454507281
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -439330597
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1024146357
	)
	@Export("field5105")
	int field5105;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 839691755
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bh")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bq")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("bd")
	@Export("field5103")
	String field5103;
	@ObfuscatedName("bz")
	@Export("field5110")
	String field5110;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1722479495
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2146477359
	)
	@Export("field5112")
	int field5112;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2145527819
	)
	@Export("field5089")
	int field5089;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1429426761
	)
	@Export("field5114")
	int field5114;
	@ObfuscatedName("cv")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("cl")
	@Export("field5116")
	String field5116;
	@ObfuscatedName("cm")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 722566405
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cu")
	@Export("field5119")
	String field5119;
	@ObfuscatedName("cn")
	@Export("field5120")
	String field5120;

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
		this.field5105 = var11;
		this.clockSpeed = var12;
		this.field4536 = var13;
		this.field4541 = var14;
		this.field5103 = var15;
		this.field5110 = var16;
		this.field4512 = var17;
		this.field5112 = var18;
		this.field5089 = var19;
		this.field5114 = var20;
		this.field4537 = var21;
		this.field5116 = var22;
		this.field4539 = var23;
		this.field4540 = var24;
		this.field5119 = var25;
		this.field5120 = var26;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1687880854"
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
		var1.writeMedium(this.field5105);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4536);
		var1.writeStringCp1252NullCircumfixed(this.field4541);
		var1.writeStringCp1252NullCircumfixed(this.field5103);
		var1.writeStringCp1252NullCircumfixed(this.field5110);
		var1.writeByte(this.field5112);
		var1.writeShort(this.field4512);
		var1.writeStringCp1252NullCircumfixed(this.field4537);
		var1.writeStringCp1252NullCircumfixed(this.field5116);
		var1.writeByte(this.field5089);
		var1.writeByte(this.field5114);

		for (int var2 = 0; var2 < this.field4539.length; ++var2) {
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540);
		var1.writeStringCp1252NullCircumfixed(this.field5119);
		var1.writeStringCp1252NullCircumfixed(this.field5120);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4536;
		int var3 = var4.length() + 2;
		int var26 = var3 + var1;
		String var7 = this.field4541;
		int var6 = var7.length() + 2;
		var26 += var6;
		String var10 = this.field5103;
		int var9 = var10.length() + 2;
		var26 += var9;
		String var13 = this.field5110;
		int var12 = var13.length() + 2;
		var26 += var12;
		String var16 = this.field4537;
		int var15 = var16.length() + 2;
		var26 += var15;
		String var19 = this.field5116;
		int var18 = var19.length() + 2;
		var26 += var18;
		String var22 = this.field5119;
		int var21 = var22.length() + 2;
		var26 += var21;
		String var25 = this.field5120;
		int var24 = var25.length() + 2;
		var26 += var24;
		return var26;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1007469139"
	)
	@Export("getDeviceId")
	public String getDeviceId(int var1) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch(var1) {
		case 1:
			var2 = "wmic csproduct get UUID";
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
			break;
		case 3:
			var2 = "cat /etc/machine-id";
			break;
		default:
			return "Unknown";
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2);
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
			StringBuilder var6 = new StringBuilder();

			String var7;
			while ((var7 = var5.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (var1 == 1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (var1 == 2) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var6.length() == 33) {
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
				}

				if (var6.length() == 32) {
					var6.insert(20, "-");
					var6.insert(16, "-");
					var6.insert(12, "-");
					var6.insert(8, "-");
					var3 = var6.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (IOException var9) {
		}

		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZS)V",
		garbageValue = "9342"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class357.World_worlds[var6];
			class357.World_worlds[var6] = class357.World_worlds[var1];
			class357.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class76.method2162(class357.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class357.World_worlds[var9];
					class357.World_worlds[var9] = class357.World_worlds[var7];
					class357.World_worlds[var7++] = var10;
				}
			}

			class357.World_worlds[var1] = class357.World_worlds[var7];
			class357.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
