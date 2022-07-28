import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ou")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 1829594595)
	int field4495;

	@ObfuscatedName("al")
	boolean field4496;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 1190689719)
	int field4509;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 20581817)
	int field4498;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 448571837)
	int field4521;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 2094209953)
	int field4500;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 576772987)
	int field4502;

	@ObfuscatedName("at")
	boolean field4494;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -411038485)
	int field4503;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1620105907)
	int field4512;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -1817578949)
	int field4505;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 1465280651)
	int field4497;

	@ObfuscatedName("ae")
	String field4507;

	@ObfuscatedName("ay")
	String field4508;

	@ObfuscatedName("ak")
	String field4516;

	@ObfuscatedName("ao")
	String field4510;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 2085430325)
	int field4518;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 547885147)
	int field4504;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 1655451941)
	int field4513;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = -451142221)
	int field4514;

	@ObfuscatedName("bs")
	String field4515;

	@ObfuscatedName("bg")
	String field4501;

	@ObfuscatedName("bv")
	int[] field4517 = new int[3];

	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 190975605)
	int field4511;

	@ObfuscatedName("bd")
	String field4485;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4495 = var1;
		this.field4496 = var2;
		this.field4509 = var3;
		this.field4498 = var4;
		this.field4521 = var5;
		this.field4500 = var6;
		this.field4502 = var7;
		this.field4494 = var8;
		this.field4503 = var9;
		this.field4512 = var10;
		this.field4505 = var11;
		this.field4497 = var12;
		this.field4507 = var13;
		this.field4508 = var14;
		this.field4516 = var15;
		this.field4510 = var16;
		this.field4518 = var17;
		this.field4504 = var18;
		this.field4513 = var19;
		this.field4514 = var20;
		this.field4515 = var21;
		this.field4501 = var22;
		this.field4517 = var23;
		this.field4511 = var24;
		this.field4485 = var25;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "-70")
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4495);
		var1.writeByte(this.field4496 ? 1 : 0);
		var1.writeShort(this.field4509);
		var1.writeByte(this.field4498);
		var1.writeByte(this.field4521);
		var1.writeByte(this.field4500);
		var1.writeByte(this.field4502);
		var1.writeByte(this.field4494 ? 1 : 0);
		var1.writeShort(this.field4503);
		var1.writeByte(this.field4512);
		var1.writeMedium(this.field4505);
		var1.writeShort(this.field4497);
		var1.writeStringCp1252NullCircumfixed(this.field4507);
		var1.writeStringCp1252NullCircumfixed(this.field4508);
		var1.writeStringCp1252NullCircumfixed(this.field4516);
		var1.writeStringCp1252NullCircumfixed(this.field4510);
		var1.writeByte(this.field4504);
		var1.writeShort(this.field4518);
		var1.writeStringCp1252NullCircumfixed(this.field4515);
		var1.writeStringCp1252NullCircumfixed(this.field4501);
		var1.writeByte(this.field4513);
		var1.writeByte(this.field4514);
		for (int var2 = 0; var2 < this.field4517.length; ++var2) {
			var1.writeInt(this.field4517[var2]);
		}
		var1.writeInt(this.field4511);
		var1.writeStringCp1252NullCircumfixed(this.field4485);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-927828161")
	@Export("size")
	public int size() {
		int var1 = 39;
		var1 += class150.method3143(this.field4507);
		var1 += class150.method3143(this.field4508);
		var1 += class150.method3143(this.field4516);
		var1 += class150.method3143(this.field4510);
		var1 += class150.method3143(this.field4515);
		var1 += class150.method3143(this.field4501);
		var1 += class150.method3143(this.field4485);
		return var1;
	}
}