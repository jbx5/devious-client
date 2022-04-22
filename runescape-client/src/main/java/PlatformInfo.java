import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 
	359254147)

	int field4422;
	@ObfuscatedName("al")
	boolean field4423;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	-1214181177)

	int field4429;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	2123313943)

	int field4425;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	-293463653)

	int field4433;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	-290319841)

	int field4440;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 
	114996927)

	int field4428;
	@ObfuscatedName("ah")
	boolean field4426;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	1292539811)

	int field4430;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	-598233409)

	int field4431;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	2084134641)

	int field4417;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	200679177)

	int field4436;
	@ObfuscatedName("ai")
	String field4434;
	@ObfuscatedName("ax")
	String field4435;
	@ObfuscatedName("ar")
	String field4444;
	@ObfuscatedName("ap")
	String field4437;
	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 
	800300679)

	int field4420;
	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 
	-562728499)

	int field4439;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	2035566047)

	int field4446;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 
	-995431815)

	int field4441;
	@ObfuscatedName("bm")
	String field4427;
	@ObfuscatedName("br")
	String field4443;
	@ObfuscatedName("bo")
	int[] field4442;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 
	-123804323)

	int field4424;
	@ObfuscatedName("be")
	String field4432;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4442 = new int[3];
		this.field4422 = var1;
		this.field4423 = var2;
		this.field4429 = var3;
		this.field4425 = var4;
		this.field4433 = var5;
		this.field4440 = var6;
		this.field4428 = var7;
		this.field4426 = var8;
		this.field4430 = var9;
		this.field4431 = var10;
		this.field4417 = var11;
		this.field4436 = var12;
		this.field4434 = var13;
		this.field4435 = var14;
		this.field4444 = var15;
		this.field4437 = var16;
		this.field4420 = var17;
		this.field4439 = var18;
		this.field4446 = var19;
		this.field4441 = var20;
		this.field4427 = var21;
		this.field4443 = var22;
		this.field4442 = var23;
		this.field4424 = var24;
		this.field4432 = var25;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"1752573389")

	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4422);
		var1.writeByte(this.field4423 ? 1 : 0);
		var1.writeShort(this.field4429);
		var1.writeByte(this.field4425);
		var1.writeByte(this.field4433);
		var1.writeByte(this.field4440);
		var1.writeByte(this.field4428);
		var1.writeByte(this.field4426 ? 1 : 0);
		var1.writeShort(this.field4430);
		var1.writeByte(this.field4431);
		var1.writeMedium(this.field4417);
		var1.writeShort(this.field4436);
		var1.writeStringCp1252NullCircumfixed(this.field4434);
		var1.writeStringCp1252NullCircumfixed(this.field4435);
		var1.writeStringCp1252NullCircumfixed(this.field4444);
		var1.writeStringCp1252NullCircumfixed(this.field4437);
		var1.writeByte(this.field4439);
		var1.writeShort(this.field4420);
		var1.writeStringCp1252NullCircumfixed(this.field4427);
		var1.writeStringCp1252NullCircumfixed(this.field4443);
		var1.writeByte(this.field4446);
		var1.writeByte(this.field4441);

		for (int var2 = 0; var2 < this.field4442.length; ++var2) {
			var1.writeInt(this.field4442[var2]);
		}

		var1.writeInt(this.field4424);
		var1.writeStringCp1252NullCircumfixed(this.field4432);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1283677650")

	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4434;
		int var3 = var4.length() + 2;
		int var23 = var3 + var1;
		String var7 = this.field4435;
		int var6 = var7.length() + 2;
		var23 += var6;
		String var10 = this.field4444;
		int var9 = var10.length() + 2;
		var23 += var9;
		String var13 = this.field4437;
		int var12 = var13.length() + 2;
		var23 += var12;
		String var16 = this.field4427;
		int var15 = var16.length() + 2;
		var23 += var15;
		String var19 = this.field4443;
		int var18 = var19.length() + 2;
		var23 += var18;
		String var22 = this.field4432;
		int var21 = var22.length() + 2;
		var23 += var21;
		return var23;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lbb;B)V", garbageValue = 
	"-99")

	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			ClanSettings.method3033(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			class260.method5174(class145.archive8, var0.properties);
		}

		class17.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		SecureRandomFuture.worldPort = (Client.gameBuild == 0) ? 43594 : var0.id + 40000;
		UserComparator9.js5Port = (Client.gameBuild == 0) ? 443 : var0.id + 50000;
		class329.currentPort = SecureRandomFuture.worldPort;
	}
}