import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 573770851
	)
	@Export("os")
	int os;
	@ObfuscatedName("ba")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1183795873
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1769216281
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 22239183
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1727264349
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 169278833
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bo")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1737818385
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1827301789
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -944630579
	)
	@Export("field4527")
	int field4527;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2071056303
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bc")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bs")
	@Export("field4514")
	String field4514;
	@ObfuscatedName("bx")
	@Export("field4528")
	String field4528;
	@ObfuscatedName("bb")
	@Export("field4532")
	String field4532;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1248614073
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1619244905
	)
	@Export("field4534")
	int field4534;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2095679823
	)
	@Export("field4535")
	int field4535;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1054492559
	)
	@Export("field4530")
	int field4530;
	@ObfuscatedName("cg")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("cv")
	@Export("field4538")
	String field4538;
	@ObfuscatedName("cx")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1805875485
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("ce")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("ci")
	@Export("field4542")
	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1412255226"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2077819620"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4536;
		int var3 = var4.length() + 2;
		int var26 = var1 + var3;
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
