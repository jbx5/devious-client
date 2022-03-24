import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	857425217)

	int field4433;
	@ObfuscatedName("ae")
	boolean field4431;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	-2119911943)

	int field4428;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	-712766327)

	int field4448;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	2135911943)

	int field4430;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 
	1474931891)

	int field4443;
	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 
	-1685554017)

	int field4432;
	@ObfuscatedName("ao")
	boolean field4442;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	-1843869685)

	int field4418;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 
	464330657)

	int field4435;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 
	-1641777413)

	int field4436;
	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 
	475952813)

	int field4437;
	@ObfuscatedName("al")
	String field4438;
	@ObfuscatedName("ak")
	String field4439;
	@ObfuscatedName("az")
	String field4440;
	@ObfuscatedName("ag")
	String field4441;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	381879925)

	int field4427;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 
	-409359365)

	int field4434;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 
	-317460353)

	int field4444;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 
	-1030786911)

	int field4445;
	@ObfuscatedName("bz")
	String field4426;
	@ObfuscatedName("bl")
	String field4447;
	@ObfuscatedName("be")
	int[] field4446;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 
	1178087619)

	int field4449;
	@ObfuscatedName("ba")
	String field4450;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4446 = new int[3];
		this.field4433 = var1;
		this.field4431 = var2;
		this.field4428 = var3;
		this.field4448 = var4;
		this.field4430 = var5;
		this.field4443 = var6;
		this.field4432 = var7;
		this.field4442 = var8;
		this.field4418 = var9;
		this.field4435 = var10;
		this.field4436 = var11;
		this.field4437 = var12;
		this.field4438 = var13;
		this.field4439 = var14;
		this.field4440 = var15;
		this.field4441 = var16;
		this.field4427 = var17;
		this.field4434 = var18;
		this.field4444 = var19;
		this.field4445 = var20;
		this.field4426 = var21;
		this.field4447 = var22;
		this.field4446 = var23;
		this.field4449 = var24;
		this.field4450 = var25;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"1")

	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4433);
		var1.writeByte(this.field4431 ? 1 : 0);
		var1.writeShort(this.field4428);
		var1.writeByte(this.field4448);
		var1.writeByte(this.field4430);
		var1.writeByte(this.field4443);
		var1.writeByte(this.field4432);
		var1.writeByte(this.field4442 ? 1 : 0);
		var1.writeShort(this.field4418);
		var1.writeByte(this.field4435);
		var1.writeMedium(this.field4436);
		var1.writeShort(this.field4437);
		var1.writeStringCp1252NullCircumfixed(this.field4438);
		var1.writeStringCp1252NullCircumfixed(this.field4439);
		var1.writeStringCp1252NullCircumfixed(this.field4440);
		var1.writeStringCp1252NullCircumfixed(this.field4441);
		var1.writeByte(this.field4434);
		var1.writeShort(this.field4427);
		var1.writeStringCp1252NullCircumfixed(this.field4426);
		var1.writeStringCp1252NullCircumfixed(this.field4447);
		var1.writeByte(this.field4444);
		var1.writeByte(this.field4445);

		for (int var2 = 0; var2 < this.field4446.length; ++var2) {
			var1.writeInt(this.field4446[var2]);
		}

		var1.writeInt(this.field4449);
		var1.writeStringCp1252NullCircumfixed(this.field4450);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1632205942")

	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4438;
		int var3 = var4.length() + 2;
		int var23 = var1 + var3;
		String var7 = this.field4439;
		int var6 = var7.length() + 2;
		var23 += var6;
		String var10 = this.field4440;
		int var9 = var10.length() + 2;
		var23 += var9;
		String var13 = this.field4441;
		int var12 = var13.length() + 2;
		var23 += var12;
		String var16 = this.field4426;
		int var15 = var16.length() + 2;
		var23 += var15;
		String var19 = this.field4447;
		int var18 = var19.length() + 2;
		var23 += var18;
		String var22 = this.field4450;
		int var21 = var22.length() + 2;
		var23 += var21;
		return var23;
	}
}