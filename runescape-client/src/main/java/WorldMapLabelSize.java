import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1026433701
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 912835647
	)
	final int field2493;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 46594647
	)
	final int field2492;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -13257785
	)
	final int field2490;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2493 = var1;
		this.field2492 = var2;
		this.field2490 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "166533408"
	)
	boolean method4620(float var1) {
		return var1 >= (float)this.field2490;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1769906721"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljh;",
		garbageValue = "-1654301488"
	)
	static WorldMapLabelSize method4621(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2492) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "2"
	)
	static ArrayList method4627() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class321.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			var0.add(var2);
		}

		return var0;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "1431043748"
	)
	static final void method4623(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1279 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0.sequence);
				if (var0.field1280 > 0 && var1.field2271 == 0) {
					++var0.field1279;
					return;
				}

				if (var0.field1280 <= 0 && var1.field2273 == 0) {
					++var0.field1279;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1212 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1212 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			class233 var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1249 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1279 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1279;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1279 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1279;
					}
				}

				if (var5 == class233.field2472) {
					var8 <<= 1;
				} else if (var5 == class233.field2469) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1219 != -1) {
						var0.movementSequence = var0.field1219;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1220 != -1) {
						var0.movementSequence = var0.field1220;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1221 != -1) {
						var0.movementSequence = var0.field1221;
					}
				} else if (var8 <= 2) {
					if (var0.movementSequence == var0.walkSequence && var0.field1222 != -1) {
						var0.movementSequence = var0.field1222;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1216 != -1) {
						var0.movementSequence = var0.field1216;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1224 != -1) {
						var0.movementSequence = var0.field1224;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1225 != -1) {
						var0.movementSequence = var0.field1225;
					}
				}

				if (var10 != var3 || var2 != var4) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1280 > 0) {
						--var0.field1280;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1280 > 0) {
					--var0.field1280;
				}

			}
		}
	}
}
