import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1673888759
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1653840161
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1700689837
	)
	public int field2069;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 557001285
	)
	int field2077;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 592905727
	)
	int field2070;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1605107977
	)
	int field2079;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -655035943
	)
	int field2080;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1939700811
	)
	public int field2081;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1755108669
	)
	public int field2089;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2132813117
	)
	public int field2083;
	@ObfuscatedName("ah")
	String field2084;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1693287957
	)
	public int field2071;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1308115619
	)
	public int field2086;
	@ObfuscatedName("al")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 599341453
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1673135647
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
		this.field2069 = 70;
		this.field2077 = -1;
		this.field2070 = -1;
		this.field2079 = -1;
		this.field2080 = -1;
		this.field2081 = 0;
		this.field2089 = 0;
		this.field2083 = -1;
		this.field2084 = "";
		this.field2071 = -1;
		this.field2086 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "-10"
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
		descriptor = "(Luk;II)V",
		garbageValue = "179043462"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2077 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2079 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2070 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2080 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2081 = var1.readShort();
		} else if (var2 == 8) {
			this.field2084 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2069 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2089 = var1.readShort();
		} else if (var2 == 11) {
			this.field2083 = 0;
		} else if (var2 == 12) {
			this.field2071 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2086 = var1.readShort();
		} else if (var2 == 14) {
			this.field2083 = var1.readUnsignedShort();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lhy;",
		garbageValue = "-31584"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class59.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class192.method3790(var2) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-54"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2084;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + GrandExchangeOfferAgeComparator.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "-141713078"
	)
	public SpritePixels method3927() {
		if (this.field2077 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2077);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2077, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2077);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-54"
	)
	public SpritePixels method3902() {
		if (this.field2070 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2070);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2070, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2070);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-84"
	)
	public SpritePixels method3903() {
		if (this.field2079 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2079);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2079, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2079);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-66"
	)
	public SpritePixels method3904() {
		if (this.field2080 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2080);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2080, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2080);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "-638036171"
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
				AbstractArchive var3 = GrandExchangeOfferWorldComparator.field4417;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Varcs.method2829(var3, var5, 0)) {
					var2 = null;
				} else {
					var2 = class72.fontFromBytes(var4.takeFile(var5, 0));
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "-451861694"
	)
	public static void method3901(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}
}
