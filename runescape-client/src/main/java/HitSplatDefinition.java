import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 307488927
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 863940283
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 329926987
	)
	public int field2708;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1775170639
	)
	int field2710;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1756671859
	)
	int field2716;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1696121347
	)
	int field2709;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -304665395
	)
	int field2712;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1913003207
	)
	public int field2714;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1107141803
	)
	public int field2715;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1045858705
	)
	public int field2703;
	@ObfuscatedName("ap")
	String field2717;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 479098585
	)
	public int field2718;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1733687873
	)
	public int field2719;
	@ObfuscatedName("at")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1432261469
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -712838023
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
		this.field2708 = 70;
		this.field2710 = -1;
		this.field2716 = -1;
		this.field2709 = -1;
		this.field2712 = -1;
		this.field2714 = 0;
		this.field2715 = 0;
		this.field2703 = -1;
		this.field2717 = "";
		this.field2718 = -1;
		this.field2719 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-2137073069"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IB)V",
		garbageValue = "36"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2710 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2709 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2716 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2712 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2714 = var1.readShort();
		} else if (var2 == 8) {
			this.field2717 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2708 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2715 = var1.readShort();
		} else if (var2 == 11) {
			this.field2703 = 0;
		} else if (var2 == 12) {
			this.field2718 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2719 = var1.readShort();
		} else if (var2 == 14) {
			this.field2703 = var1.readUnsignedShort();
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "-26"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class143.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class499.method8944(var2) : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1953569943"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2717;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + WorldMapAreaData.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "1303115700"
	)
	public SpritePixels method5076() {
		if (this.field2710 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2710);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class195.SpriteBuffer_getSprite(class139.field1624, this.field2710, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2710);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "-3"
	)
	public SpritePixels method5092() {
		if (this.field2716 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2716);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class195.SpriteBuffer_getSprite(class139.field1624, this.field2716, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2716);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "-40"
	)
	public SpritePixels method5071() {
		if (this.field2709 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2709);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class195.SpriteBuffer_getSprite(class139.field1624, this.field2709, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2709);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "-1656932432"
	)
	public SpritePixels method5079() {
		if (this.field2712 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field2712);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class195.SpriteBuffer_getSprite(class139.field1624, this.field2712, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2712);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "1362058470"
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
				var1 = MouseHandler.method658(class139.field1624, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1722349334"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		WorldMapSectionType.updateItemPile2(class328.worldView, var0, var1, var2);
	}
}
