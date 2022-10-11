import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	public static AbstractArchive field2049;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("hl")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2001871895
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 218720599
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1685268435
	)
	public int field2051;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 322428637
	)
	int field2052;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1435364683
	)
	int field2048;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1740610341
	)
	int field2054;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1485190159
	)
	int field2055;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 43363931
	)
	public int field2056;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1958672999
	)
	public int field2057;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1450944369
	)
	public int field2064;
	@ObfuscatedName("y")
	String field2059;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -427333119
	)
	public int field2060;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 374547575
	)
	public int field2053;
	@ObfuscatedName("z")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1122498811
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1552964073
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2051 = 70; // L: 28
		this.field2052 = -1; // L: 29
		this.field2048 = -1; // L: 30
		this.field2054 = -1; // L: 31
		this.field2055 = -1; // L: 32
		this.field2056 = 0; // L: 33
		this.field2057 = 0; // L: 34
		this.field2064 = -1; // L: 35
		this.field2059 = ""; // L: 36
		this.field2060 = -1; // L: 37
		this.field2053 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-1847906835"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-821157503"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2052 = var1.readNullableLargeSmart();
		} else if (var2 == 4) { // L: 67
			this.field2054 = var1.readNullableLargeSmart();
		} else if (var2 == 5) { // L: 68
			this.field2048 = var1.readNullableLargeSmart();
		} else if (var2 == 6) { // L: 69
			this.field2055 = var1.readNullableLargeSmart();
		} else if (var2 == 7) { // L: 70
			this.field2056 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2059 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2051 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2057 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2064 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2060 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2053 = var1.readShort();
		} else if (var2 == 14) {
			this.field2064 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lgx;",
		garbageValue = "940413338"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = UserComparator8.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class126.method2973(var2) : null; // L: 106 107
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1760340181"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2059; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class347.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "1041234730"
	)
	public SpritePixels method3754() {
		if (this.field2052 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2052); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = class114.SpriteBuffer_getSprite(field2049, this.field2052, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2052); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "857338442"
	)
	public SpritePixels method3755() {
		if (this.field2048 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2048); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class114.SpriteBuffer_getSprite(field2049, this.field2048, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2048); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1623316573"
	)
	public SpritePixels method3756() {
		if (this.field2054 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2054); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = class114.SpriteBuffer_getSprite(field2049, this.field2054, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2054); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "-19"
	)
	public SpritePixels method3757() {
		if (this.field2055 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2055); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = class114.SpriteBuffer_getSprite(field2049, this.field2055, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2055); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "-102"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = class448.method8182(field2049, Username.HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) { // L: 165
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lkw;B)Lkw;",
		garbageValue = "3"
	)
	static Widget method3782(Widget var0) {
		int var1 = WorldMapSectionType.method5075(class97.getWidgetFlags(var0)); // L: 12030
		if (var1 == 0) { // L: 12031
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12032
				var0 = SpotAnimationDefinition.getWidget(var0.parentId); // L: 12033
				if (var0 == null) { // L: 12034
					return null;
				}
			}

			return var0; // L: 12036
		}
	}
}
