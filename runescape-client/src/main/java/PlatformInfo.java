import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1904420251
	)
	@Export("os")
	int os;
	@ObfuscatedName("bs")
	@Export("field4518")
	boolean field4518;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 264065611
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1187086541
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -187483369
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -996711977
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1640138069
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bp")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1266013031
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 518352535
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1184785821
	)
	@Export("field4527")
	int field4527;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1985636101
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bi")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bz")
	@Export("field4514")
	String field4514;
	@ObfuscatedName("bx")
	@Export("field4528")
	String field4528;
	@ObfuscatedName("bn")
	@Export("field4532")
	String field4532;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1565841435
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1567483585
	)
	@Export("field4534")
	int field4534;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1642110207
	)
	@Export("field4535")
	int field4535;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -632448413
	)
	@Export("field4530")
	int field4530;
	@ObfuscatedName("cf")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("cm")
	@Export("field4538")
	String field4538;
	@ObfuscatedName("cn")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -742143585
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cx")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("cr")
	@Export("field4542")
	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4539 = new int[3];
		this.os = var1;
		this.field4518 = var2;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "77"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.os);
		var1.writeByte(this.field4518 ? 1 : 0);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1863641013"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4536;
		int var3 = var4.length() + 2;
		int var26 = var3 + var1;
		String var7 = this.field4514;
		int var6 = var7.length() + 2;
		var26 += var6;
		String var10 = this.field4528;
		int var9 = var10.length() + 2;
		var26 += var9;
		String var13 = this.field4532;
		int var12 = var13.length() + 2;
		var26 += var12;
		String var16 = this.field4537;
		int var15 = var16.length() + 2;
		var26 += var15;
		String var19 = this.field4538;
		int var18 = var19.length() + 2;
		var26 += var18;
		String var22 = this.field4541;
		int var21 = var22.length() + 2;
		var26 += var21;
		String var25 = this.field4542;
		int var24 = var25.length() + 2;
		var26 += var24;
		return var26;
	}
}
