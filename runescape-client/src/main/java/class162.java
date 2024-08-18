import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class162 extends class148 {
	@ObfuscatedName("wo")
	@ObfuscatedGetter(
		intValue = 1747484211
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -629620383
	)
	int field1773;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class162(class151 var1) {
		this.this$0 = var1;
		this.field1773 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1773 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3446(this.field1773);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256997390"
	)
	public static void method3526() {
		class246.field2100.clear();
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIII)I",
		garbageValue = "1284755731"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}
}
