import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class167 extends class143 {
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1928445647
	)
	int field1791;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5933219131196010131L
	)
	long field1789;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class167(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1791 = var1.readInt();
		this.field1789 = var1.readLong();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3354(this.field1791, this.field1789);
	}

	@ObfuscatedName("ag")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public static String method3535(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				char var6;
				if (var5 != 181 && var5 != 402) {
					var6 = Character.toTitleCase(var5);
				} else {
					var6 = var5;
				}

				var5 = var6;
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "2039050057"
	)
	static String method3532(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1926744742"
	)
	static boolean method3538(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class368.field4292.field4296) {
			BoundaryObject var7 = GrandExchangeOfferOwnWorldComparator.scene.method5404(var0, var1, var2);
			if (var7 != null) {
				var8 = Entity_unpackID(var7.tag);
				if (var3 == WorldMapDecorationType.field3886.id) {
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1);
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2);
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1);
				}

				return true;
			}
		} else if (var5 == class368.field4293.field4296) {
			WallDecoration var9 = GrandExchangeOfferOwnWorldComparator.scene.method5469(var0, var1, var2);
			if (var9 != null) {
				var8 = Entity_unpackID(var9.tag);
				if (var3 != WorldMapDecorationType.field3889.id && var3 != WorldMapDecorationType.field3900.id) {
					if (var3 == WorldMapDecorationType.field3891.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3892.id) {
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3898.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2);
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1);
				}

				return true;
			}
		} else if (var5 == class368.field4294.field4296) {
			GameObject var10 = GrandExchangeOfferOwnWorldComparator.scene.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field3905.id) {
				var3 = WorldMapDecorationType.field3904.id;
			}

			if (var10 != null) {
				var10.renderable = new DynamicObject(Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable);
				return true;
			}
		} else if (var5 == class368.field4295.field4296) {
			FloorDecoration var11 = GrandExchangeOfferOwnWorldComparator.scene.getFloorDecoration(var0, var1, var2);
			if (var11 != null) {
				var11.renderable = new DynamicObject(Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		}

		return false;
	}
}
