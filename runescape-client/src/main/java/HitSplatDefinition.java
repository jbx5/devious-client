import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2219;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 202913933
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1666641871
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1025631065
	)
	public int field2227;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 859305317
	)
	int field2228;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 333321025
	)
	int field2239;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1569624883
	)
	int field2236;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -880343937
	)
	int field2231;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2000647835
	)
	public int field2232;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 17647215
	)
	public int field2233;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1697905215
	)
	public int field2234;
	@ObfuscatedName("aq")
	String field2230;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -671612445
	)
	public int field2229;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 59333765
	)
	public int field2237;
	@ObfuscatedName("ae")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1191707337
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1670704337
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
		this.field2227 = 70;
		this.field2228 = -1;
		this.field2239 = -1;
		this.field2236 = -1;
		this.field2231 = -1;
		this.field2232 = 0;
		this.field2233 = 0;
		this.field2234 = -1;
		this.field2230 = "";
		this.field2229 = -1;
		this.field2237 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-4"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2228 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2236 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2239 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2231 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2232 = var1.readShort();
		} else if (var2 == 8) {
			this.field2230 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2227 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2233 = var1.readShort();
		} else if (var2 == 11) {
			this.field2234 = 0;
		} else if (var2 == 12) {
			this.field2229 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2237 = var1.readShort();
		} else if (var2 == 14) {
			this.field2234 = var1.readUnsignedShort();
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lio;",
		garbageValue = "-1692863694"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class193.method3723(var2) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "116"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2230;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + UrlRequest.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "349330862"
	)
	public SpritePixels method4048() {
		if (this.field2228 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2228);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2228, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2228);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "55"
	)
	public SpritePixels method4049() {
		if (this.field2239 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2239);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2239, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2239);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "279658060"
	)
	public SpritePixels method4050() {
		if (this.field2236 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2236);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2236, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2236);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-113"
	)
	public SpritePixels method4062() {
		if (this.field2231 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2231);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2231, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2231);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-419460677"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2219;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				byte[] var7 = var3.takeFile(var5, 0);
				boolean var6;
				if (var7 == null) {
					var6 = false;
				} else {
					HttpQueryParams.SpriteBuffer_decode(var7);
					var6 = true;
				}

				Font var2;
				if (!var6) {
					var2 = null;
				} else {
					byte[] var8 = var4.takeFile(var5, 0);
					Font var10;
					if (var8 == null) {
						var10 = null;
					} else {
						Font var9 = new Font(var8, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						SpriteBufferProperties.SpriteBuffer_xOffsets = null;
						SpriteBufferProperties.SpriteBuffer_yOffsets = null;
						SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
						Ignored.SpriteBuffer_spriteHeights = null;
						class126.SpriteBuffer_spritePalette = null;
						SpriteBufferProperties.SpriteBuffer_pixels = null;
						var10 = var9;
					}

					var2 = var10;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "1490347660"
	)
	static void method4073(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < SecureRandomSSLSocket.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = class195.KitDefinition_get(var3);
			if (var4 != null && !var4.nonSelectable && var2 + (var0 == 1 ? 7 : 0) == var4.bodypartID) {
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
				break;
			}
		}

	}
}
