import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field2123;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 740567617
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -886926797
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1750332237
	)
	public int field2131;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1801737031
	)
	int field2132;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -290743515
	)
	int field2122;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -510782169
	)
	int field2134;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2141591761
	)
	int field2135;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1456549433
	)
	public int field2128;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 590461861
	)
	public int field2137;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1345009173
	)
	public int field2138;
	@ObfuscatedName("aw")
	String field2139;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 506293749
	)
	public int field2140;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1372659175
	)
	public int field2141;
	@ObfuscatedName("am")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1141721607
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1111852629
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
		this.field2131 = 70;
		this.field2132 = -1;
		this.field2122 = -1;
		this.field2134 = -1;
		this.field2135 = -1;
		this.field2128 = 0;
		this.field2137 = 0;
		this.field2138 = -1;
		this.field2139 = "";
		this.field2140 = -1;
		this.field2141 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "48"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "113"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2132 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2134 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2122 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2135 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2128 = var1.readShort();
		} else if (var2 == 8) {
			this.field2139 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2131 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2137 = var1.readShort();
		} else if (var2 == 11) {
			this.field2138 = 0;
		} else if (var2 == 12) {
			this.field2140 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2141 = var1.readShort();
		} else if (var2 == 14) {
			this.field2138 = var1.readUnsignedShort();
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "73"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class162.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapSectionType.method4961(var2) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "9"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2139;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class201.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1822100421"
	)
	public SpritePixels method3879() {
		if (this.field2132 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2132);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2132, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2132);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1402217327"
	)
	public SpritePixels method3880() {
		if (this.field2122 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2122);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2122, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2122);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "-1874709059"
	)
	public SpritePixels method3881() {
		if (this.field2134 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2134);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2134, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2134);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-91"
	)
	public SpritePixels method3882() {
		if (this.field2135 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2135);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2135, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2135);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "1"
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
				var1 = class148.method3275(field2123, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lvg;",
		garbageValue = "-1601288293"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class164.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class164.ItemDefinition_get(var10);
			}
		}

		Model var20 = var9.getModel(1);
		if (var20 == null) {
			return null;
		} else {
			SpritePixels var21 = null;
			if (var9.noteTemplate != -1) {
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var21 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var21 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var21 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.field5435;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method5259(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.method5307(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var20.calculateBoundsCylinder();
			var20.drawFrustum(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method5259(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				class136.ItemDefinition_fontPlain11.draw(class108.method2810(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5259(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}
}
