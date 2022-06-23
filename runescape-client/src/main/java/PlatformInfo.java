import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("os")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 1580091961)
	int field4486;

	@ObfuscatedName("ae")
	boolean field4480;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = -1628861631)
	int field4481;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 1799182673)
	int field4487;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1323987311)
	int field4483;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -1460214999)
	int field4484;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 2121235893)
	int field4485;

	@ObfuscatedName("ar")
	boolean field4476;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -1677230917)
	int field4499;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 1325520739)
	int field4488;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = -1528943489)
	int field4489;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = -819514533)
	int field4471;

	@ObfuscatedName("az")
	String field4491;

	@ObfuscatedName("av")
	String field4492;

	@ObfuscatedName("aw")
	String field4493;

	@ObfuscatedName("au")
	String field4494;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -2110844387)
	int field4495;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = -698136029)
	int field4496;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1588093075)
	int field4497;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 488512067)
	int field4498;

	@ObfuscatedName("bz")
	String field4479;

	@ObfuscatedName("bp")
	String field4500;

	@ObfuscatedName("bf")
	int[] field4501;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = 306566493)
	int field4502;

	@ObfuscatedName("br")
	String field4503;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4501 = new int[3];
		this.field4486 = var1;
		this.field4480 = var2;
		this.field4481 = var3;
		this.field4487 = var4;
		this.field4483 = var5;
		this.field4484 = var6;
		this.field4485 = var7;
		this.field4476 = var8;
		this.field4499 = var9;
		this.field4488 = var10;
		this.field4489 = var11;
		this.field4471 = var12;
		this.field4491 = var13;
		this.field4492 = var14;
		this.field4493 = var15;
		this.field4494 = var16;
		this.field4495 = var17;
		this.field4496 = var18;
		this.field4497 = var19;
		this.field4498 = var20;
		this.field4479 = var21;
		this.field4500 = var22;
		this.field4501 = var23;
		this.field4502 = var24;
		this.field4503 = var25;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;S)V", garbageValue = "-6227")
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4486);
		var1.writeByte(this.field4480 ? 1 : 0);
		var1.writeShort(this.field4481);
		var1.writeByte(this.field4487);
		var1.writeByte(this.field4483);
		var1.writeByte(this.field4484);
		var1.writeByte(this.field4485);
		var1.writeByte(this.field4476 ? 1 : 0);
		var1.writeShort(this.field4499);
		var1.writeByte(this.field4488);
		var1.writeMedium(this.field4489);
		var1.writeShort(this.field4471);
		var1.writeStringCp1252NullCircumfixed(this.field4491);
		var1.writeStringCp1252NullCircumfixed(this.field4492);
		var1.writeStringCp1252NullCircumfixed(this.field4493);
		var1.writeStringCp1252NullCircumfixed(this.field4494);
		var1.writeByte(this.field4496);
		var1.writeShort(this.field4495);
		var1.writeStringCp1252NullCircumfixed(this.field4479);
		var1.writeStringCp1252NullCircumfixed(this.field4500);
		var1.writeByte(this.field4497);
		var1.writeByte(this.field4498);
		for (int var2 = 0; var2 < this.field4501.length; ++var2) {
			var1.writeInt(this.field4501[var2]);
		}
		var1.writeInt(this.field4502);
		var1.writeStringCp1252NullCircumfixed(this.field4503);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "379416083")
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + BuddyRankComparator.method2620(this.field4491);
		var2 += BuddyRankComparator.method2620(this.field4492);
		var2 += BuddyRankComparator.method2620(this.field4493);
		var2 += BuddyRankComparator.method2620(this.field4494);
		var2 += BuddyRankComparator.method2620(this.field4479);
		var2 += BuddyRankComparator.method2620(this.field4500);
		var2 += BuddyRankComparator.method2620(this.field4503);
		return var2;
	}
}