import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oo")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = -1504444763)
	int os;

	@ObfuscatedName("au")
	boolean field4508;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 445223555)
	int osVersion;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = -233505363)
	int vendor;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = -199706051)
	int javaMajor;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 2076327411)
	int javaMinor;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -610401671)
	int javaPatch;

	@ObfuscatedName("af")
	boolean field4486;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -822666267)
	int maxMemory;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 828949577)
	int cpuCores;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 414932851)
	int field4495;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1216080859)
	int clockSpeed;

	@ObfuscatedName("ah")
	String field4497;

	@ObfuscatedName("aa")
	String field4498;

	@ObfuscatedName("am")
	String field4499;

	@ObfuscatedName("ao")
	String field4500;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 891233991)
	int field4483;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -736208085)
	int field4501;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 433011061)
	int field4503;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = -204682335)
	int field4504;

	@ObfuscatedName("bn")
	String field4505;

	@ObfuscatedName("bl")
	String field4506;

	@ObfuscatedName("bv")
	int[] field4507 = new int[3];

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = -1067289661)
	int field4487;

	@ObfuscatedName("bb")
	String field4492;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.os = var1;
		this.field4508 = var2;
		this.osVersion = var3;
		this.vendor = var4;
		this.javaMajor = var5;
		this.javaMinor = var6;
		this.javaPatch = var7;
		this.field4486 = var8;
		this.maxMemory = var9;
		this.cpuCores = var10;
		this.field4495 = var11;
		this.clockSpeed = var12;
		this.field4497 = var13;
		this.field4498 = var14;
		this.field4499 = var15;
		this.field4500 = var16;
		this.field4483 = var17;
		this.field4501 = var18;
		this.field4503 = var19;
		this.field4504 = var20;
		this.field4505 = var21;
		this.field4506 = var22;
		this.field4507 = var23;
		this.field4487 = var24;
		this.field4492 = var25;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-121")
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.os);
		var1.writeByte(this.field4508 ? 1 : 0);
		var1.writeShort(this.osVersion);
		var1.writeByte(this.vendor);
		var1.writeByte(this.javaMajor);
		var1.writeByte(this.javaMinor);
		var1.writeByte(this.javaPatch);
		var1.writeByte(this.field4486 ? 1 : 0);
		var1.writeShort(this.maxMemory);
		var1.writeByte(this.cpuCores);
		var1.writeMedium(this.field4495);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4497);
		var1.writeStringCp1252NullCircumfixed(this.field4498);
		var1.writeStringCp1252NullCircumfixed(this.field4499);
		var1.writeStringCp1252NullCircumfixed(this.field4500);
		var1.writeByte(this.field4501);
		var1.writeShort(this.field4483);
		var1.writeStringCp1252NullCircumfixed(this.field4505);
		var1.writeStringCp1252NullCircumfixed(this.field4506);
		var1.writeByte(this.field4503);
		var1.writeByte(this.field4504);
		for (int var2 = 0; var2 < this.field4507.length; ++var2) {
			var1.writeInt(this.field4507[var2]);
		}
		var1.writeInt(this.field4487);
		var1.writeStringCp1252NullCircumfixed(this.field4492);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-992171392")
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class145.method3015(this.field4497);
		var2 += class145.method3015(this.field4498);
		var2 += class145.method3015(this.field4499);
		var2 += class145.method3015(this.field4500);
		var2 += class145.method3015(this.field4505);
		var2 += class145.method3015(this.field4506);
		var2 += class145.method3015(this.field4492);
		return var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;", garbageValue = "1568227992")
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class341.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}
					var6 = var7;
				}
				var3[var4++] = ((char) (var6));
			}
		}
		return new String(var3, 0, var4);
	}
}