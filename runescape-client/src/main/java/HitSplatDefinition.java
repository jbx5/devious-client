import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static EvictingDualNodeHashTable field2112;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1409880651
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1290128945
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1094796461
	)
	public int field2123;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -74059523
	)
	int field2114;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1193764327
	)
	int field2124;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 998933783
	)
	int field2122;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -343153479
	)
	int field2121;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1244067827
	)
	public int field2129;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1262270147
	)
	public int field2125;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2118543057
	)
	public int field2126;
	@ObfuscatedName("ak")
	String field2127;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2012550267
	)
	public int field2131;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1800726421
	)
	public int field2109;
	@ObfuscatedName("ai")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1025493681
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -948379165
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		field2112 = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2123 = 70;
		this.field2114 = -1;
		this.field2124 = -1;
		this.field2122 = -1;
		this.field2121 = -1;
		this.field2129 = 0;
		this.field2125 = 0;
		this.field2126 = -1;
		this.field2127 = "";
		this.field2131 = -1;
		this.field2109 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "17891601"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1627766366"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2114 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2122 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2124 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2121 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2129 = var1.readShort();
		} else if (var2 == 8) {
			this.field2127 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2123 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2125 = var1.readShort();
		} else if (var2 == 11) {
			this.field2126 = 0;
		} else if (var2 == 12) {
			this.field2131 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2109 = var1.readShort();
		} else if (var2 == 14) {
			this.field2126 = var1.readUnsignedShort();
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-517578279"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WallDecoration.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class177.method3541(var2) : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1987893545"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2127;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class509.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "6"
	)
	public SpritePixels method3878() {
		if (this.field2114 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2112.get((long)this.field2114);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2114, 0);
				if (var1 != null) {
					field2112.put(var1, (long)this.field2114);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "-36"
	)
	public SpritePixels method3882() {
		if (this.field2124 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2112.get((long)this.field2124);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2124, 0);
				if (var1 != null) {
					field2112.put(var1, (long)this.field2124);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "122"
	)
	public SpritePixels method3883() {
		if (this.field2122 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2112.get((long)this.field2122);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2122, 0);
				if (var1 != null) {
					field2112.put(var1, (long)this.field2122);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1252714259"
	)
	public SpritePixels method3884() {
		if (this.field2121 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2112.get((long)this.field2121);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2121, 0);
				if (var1 != null) {
					field2112.put(var1, (long)this.field2121);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "-1649845453"
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
				var1 = ConcurrentMidiTask.method7672(class387.field4438, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}
}
