import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field2167;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 396661887
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1701009289
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1699613375
	)
	public int field2175;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1528136211
	)
	int field2178;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -550294639
	)
	int field2185;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 413657557
	)
	int field2184;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2096084383
	)
	int field2179;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 805623967
	)
	public int field2180;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 787520217
	)
	public int field2171;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2031749663
	)
	public int field2182;
	@ObfuscatedName("aq")
	String field2176;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 299765549
	)
	public int field2177;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1307541621
	)
	public int field2173;
	@ObfuscatedName("af")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -79738007
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -752791003
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2175 = 70;
		this.field2178 = -1;
		this.field2185 = -1;
		this.field2184 = -1;
		this.field2179 = -1;
		this.field2180 = 0;
		this.field2171 = 0;
		this.field2182 = -1;
		this.field2176 = "";
		this.field2177 = -1;
		this.field2173 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;S)V",
		garbageValue = "7501"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1630340273"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2178 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2184 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2185 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2179 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2180 = var1.readShort();
		} else if (var2 == 8) {
			this.field2176 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2175 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2171 = var1.readShort();
		} else if (var2 == 11) {
			this.field2182 = 0;
		} else if (var2 == 12) {
			this.field2177 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2173 = var1.readShort();
		} else if (var2 == 14) {
			this.field2182 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-588472147"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class36.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class191.method3627(var2) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1312743018"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2176;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + AbstractWorldMapData.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "-580598117"
	)
	public SpritePixels method3973() {
		if (this.field2178 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2178);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2178, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2178);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1894874204"
	)
	public SpritePixels method3974() {
		if (this.field2185 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2185);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2185, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2185);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "-3"
	)
	public SpritePixels method3975() {
		if (this.field2184 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2184);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2184, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2184);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "-1859973859"
	)
	public SpritePixels method3976() {
		if (this.field2179 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2179);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2179, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2179);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lpu;",
		garbageValue = "36"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font) HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2167;
				AbstractArchive var4 = class135.HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class164.method3376(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class326.SpriteBuffer_xOffsets, ModelData0.SpriteBuffer_yOffsets, class59.SpriteBuffer_spriteWidths, class544.SpriteBuffer_spriteHeights, class372.SpriteBuffer_spritePalette, AddRequestTask.SpriteBuffer_pixels);
						class407.method7453();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}
}
