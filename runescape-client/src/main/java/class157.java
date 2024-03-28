import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class157 extends class160 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -328409965
	)
	int field1765;
	@ObfuscatedName("ah")
	byte field1762;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -64697969
	)
	int field1761;
	@ObfuscatedName("at")
	String field1764;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class157(class161 var1) {
		this.this$0 = var1;
		this.field1765 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		var1.readUnsignedByte();
		this.field1765 = var1.readUnsignedShort();
		this.field1762 = var1.readByte();
		this.field1761 = var1.readUnsignedShort();
		var1.readLong();
		this.field1764 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1765);
		var2.rank = this.field1762;
		var2.world = this.field1761;
		var2.username = new Username(this.field1764);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1638966210"
	)
	public static void method3326() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1928784895"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}
}
