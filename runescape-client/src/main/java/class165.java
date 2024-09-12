import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class165 extends class150 {
	@ObfuscatedName("wc")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1146938620143981425L
	)
	long field1810;
	@ObfuscatedName("ae")
	String field1808;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1843206009
	)
	int field1807;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class165(class153 var1) {
		this.this$0 = var1;
		this.field1810 = -1L;
		this.field1808 = null;
		this.field1807 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1810 = var1.readLong();
		}

		this.field1808 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1807 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3603(this.field1810, this.field1808, this.field1807);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIIIII)V",
		garbageValue = "-1812243666"
	)
	static void method3680(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.pendingSpawns;
		PendingSpawn var12 = null;

		for (PendingSpawn var13 = (PendingSpawn)var11.last(); var13 != null; var13 = (PendingSpawn)var11.previous()) {
			if (var13.plane == var1 && var2 == var13.x && var3 == var13.y && var4 == var13.type) {
				var12 = var13;
				break;
			}
		}

		if (var12 == null) {
			var12 = new PendingSpawn();
			var12.plane = var1;
			var12.type = var4;
			var12.x = var2;
			var12.y = var3;
			var12.field1221 = -1;
			class254.method5223(var0, var12);
			var11.addFirst(var12);
		}

		var12.field1215 = var5;
		var12.field1214 = var6;
		var12.field1212 = var7;
		var12.delay = var9;
		var12.hitpoints = var10;
		var12.method2628(var8);
	}
}
