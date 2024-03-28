import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class150 extends class160 {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 1865203712
	)
	static int field1714;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 332451705
	)
	int field1712;
	@ObfuscatedName("ah")
	byte field1708;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1037364917
	)
	int field1709;
	@ObfuscatedName("at")
	String field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class150(class161 var1) {
		this.this$0 = var1;
		this.field1712 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1712 = var1.readUnsignedShort();
		this.field1708 = var1.readByte();
		this.field1709 = var1.readUnsignedShort();
		var1.readLong();
		this.field1711 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1712);
		var2.rank = this.field1708;
		var2.world = this.field1709;
		var2.username = new Username(this.field1711);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)Ljava/lang/String;",
		garbageValue = "-1195308716"
	)
	static String method3199(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class352.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = Tiles.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lix;B)V",
		garbageValue = "22"
	)
	static final void method3200(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) {
			for (var12 = 0; var12 < 8; ++var12) {
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0);

		for (var12 = 0; var12 < 4; ++var12) {
			for (int var13 = 0; var13 < 64; ++var13) {
				for (int var14 = 0; var14 < 64; ++var14) {
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) {
						int var15 = var2 + GameEngine.method621(var13 & 7, var14 & 7, var7);
						int var18 = var13 & 7;
						int var19 = var14 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}

						int var21 = var17 + var3;
						int var22 = (var13 & 7) + var8 + var2;
						int var23 = var3 + (var14 & 7) + var9;
						FriendSystem.loadTerrain(var24, var1, var15, var21, var22, var23, var7);
					} else {
						FriendSystem.loadTerrain(var24, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1804184647"
	)
	static void method3201() {
		FloorDecoration.compass = null;
		class315.redHintArrowSprite = null;
		CollisionMap.mapSceneSprites = null;
		class91.headIconPkSprites = null;
		class334.headIconPrayerSprites = null;
		class137.headIconHintSprites = null;
		class33.mapDotSprites = null;
		class286.crossSprites = null;
		KeyHandler.field115 = null;
		FriendSystem.scrollBarSprites = null;
		class168.field1834 = null;
	}
}
