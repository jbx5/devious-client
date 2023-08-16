import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field2146;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static EvictingDualNodeHashTable field2149;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1641369831
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -353032379
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1107259027
	)
	public int field2161;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -939008145
	)
	int field2155;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1847013657
	)
	int field2156;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 469843281
	)
	int field2157;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2023924639
	)
	int field2158;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1524117065
	)
	public int field2159;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1267425507
	)
	public int field2153;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 814951375
	)
	public int field2147;
	@ObfuscatedName("ay")
	String field2162;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1072885703
	)
	public int field2154;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1421046467
	)
	public int field2163;
	@ObfuscatedName("aw")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1813030183
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1293075215
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		field2149 = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2161 = 70;
		this.field2155 = -1;
		this.field2156 = -1;
		this.field2157 = -1;
		this.field2158 = -1;
		this.field2159 = 0;
		this.field2153 = 0;
		this.field2147 = -1;
		this.field2162 = "";
		this.field2154 = -1;
		this.field2163 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-96"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "-17"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2155 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2157 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2156 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2158 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2159 = var1.readShort();
		} else if (var2 == 8) {
			this.field2162 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2161 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2153 = var1.readShort();
		} else if (var2 == 11) {
			this.field2147 = 0;
		} else if (var2 == 12) {
			this.field2154 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2163 = var1.readShort();
		} else if (var2 == 14) {
			this.field2147 = var1.readUnsignedShort();
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
		descriptor = "(I)Lhm;",
		garbageValue = "-478851441"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ClientPreferences.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapCacheName.method5560(var2) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "85"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2162;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class60.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "2088271438"
	)
	public SpritePixels method3850() {
		if (this.field2155 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2149.get((long)this.field2155);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2155, 0);
				if (var1 != null) {
					field2149.put(var1, (long)this.field2155);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "1718225131"
	)
	public SpritePixels method3846() {
		if (this.field2156 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2149.get((long)this.field2156);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2156, 0);
				if (var1 != null) {
					field2149.put(var1, (long)this.field2156);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-816789070"
	)
	public SpritePixels method3852() {
		if (this.field2157 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2149.get((long)this.field2157);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2157, 0);
				if (var1 != null) {
					field2149.put(var1, (long)this.field2157);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;",
		garbageValue = "3"
	)
	public SpritePixels method3853() {
		if (this.field2158 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2149.get((long)this.field2158);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2158, 0);
				if (var1 != null) {
					field2149.put(var1, (long)this.field2158);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "1628284483"
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
				var1 = LoginPacket.method5712(field2146, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "731414958"
	)
	static int method3887(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldh;",
		garbageValue = "10"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapIcon_1.method5088(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1014 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}
}
