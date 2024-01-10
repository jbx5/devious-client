import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -237812389
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bn")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 174577155
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 978944667
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1533166283
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2069770939
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1764080435
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bv")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1703677853
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 377173555
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1057434447
	)
	@Export("field4527")
	int field4527;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 883555335
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bi")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bu")
	@Export("field4514")
	String field4514;
	@ObfuscatedName("be")
	@Export("field4528")
	String field4528;
	@ObfuscatedName("bs")
	@Export("field4532")
	String field4532;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 573776175
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -710207929
	)
	@Export("field4534")
	int field4534;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1040819083
	)
	@Export("field4535")
	int field4535;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 834107987
	)
	@Export("field4530")
	int field4530;
	@ObfuscatedName("cb")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("ci")
	@Export("field4538")
	String field4538;
	@ObfuscatedName("cv")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1353395511
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cp")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("cq")
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1357663767"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1952660625"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class244.method4942(this.field4536);
		var2 += class244.method4942(this.field4514);
		var2 += class244.method4942(this.field4528);
		var2 += class244.method4942(this.field4532);
		var2 += class244.method4942(this.field4537);
		var2 += class244.method4942(this.field4538);
		var2 += class244.method4942(this.field4541);
		var2 += class244.method4942(this.field4542);
		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-412168738"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Ljava/lang/String;Ljava/lang/String;I)Lpv;",
		garbageValue = "659683137"
	)
	@Export("getFont")
	public static Font getFont(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			Font var6;
			if (!Varcs.method2829(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = class72.fontFromBytes(var1.takeFile(var4, var5));
			}

			return var6;
		}
	}
}
