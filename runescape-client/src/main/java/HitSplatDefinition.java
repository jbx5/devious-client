import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -631717437
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -565863545
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -538662199
	)
	public int field2261;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 454376969
	)
	int field2256;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 195324281
	)
	int field2257;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 749458873
	)
	int field2258;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 473683161
	)
	int field2250;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1101850635
	)
	public int field2260;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -195964665
	)
	public int field2245;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1953791301
	)
	public int field2259;
	@ObfuscatedName("ai")
	String field2263;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1693933327
	)
	public int field2264;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -457163199
	)
	public int field2265;
	@ObfuscatedName("ar")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1937269977
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -404429649
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
		this.field2261 = 70;
		this.field2256 = -1;
		this.field2257 = -1;
		this.field2258 = -1;
		this.field2250 = -1;
		this.field2260 = 0;
		this.field2245 = 0;
		this.field2259 = -1;
		this.field2263 = "";
		this.field2264 = -1;
		this.field2265 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-824668981"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "-29"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2256 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2258 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2257 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2250 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2260 = var1.readShort();
		} else if (var2 == 8) {
			this.field2263 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2261 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2245 = var1.readShort();
		} else if (var2 == 11) {
			this.field2259 = 0;
		} else if (var2 == 12) {
			this.field2264 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2265 = var1.readShort();
		} else if (var2 == 14) {
			this.field2259 = var1.readUnsignedShort();
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "1066180193"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ClientPacket.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? AsyncHttpResponse.method260(var2) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-219640332"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2263;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + UserComparator10.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "-2125798006"
	)
	public SpritePixels method4140() {
		if (this.field2256 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2256);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(class332.field3636, this.field2256, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2256);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "1833905787"
	)
	public SpritePixels method4139() {
		if (this.field2257 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2257);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(class332.field3636, this.field2257, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2257);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "-17"
	)
	public SpritePixels method4142() {
		if (this.field2258 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2258);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(class332.field3636, this.field2258, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2258);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "1"
	)
	public SpritePixels method4143() {
		if (this.field2250 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2250);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class542.SpriteBuffer_getSprite(class332.field3636, this.field2250, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2250);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lqb;",
		garbageValue = "0"
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
				AbstractArchive var3 = class332.field3636;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class108.method2769(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, SpriteBufferProperties.SpriteBuffer_spriteHeights, UrlRequest.SpriteBuffer_spritePalette, PlayerCompositionColorTextureOverride.SpriteBuffer_pixels);
						SpriteBufferProperties.SpriteBuffer_xOffsets = null;
						SpriteBufferProperties.SpriteBuffer_yOffsets = null;
						SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
						SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
						UrlRequest.SpriteBuffer_spritePalette = null;
						PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lin;",
		garbageValue = "-963396313"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "([Lnb;IIIZI)V",
		garbageValue = "-2094526064"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class352.alignWidgetSize(var6, var2, var3, var4);
				class7.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class148.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
