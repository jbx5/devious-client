import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1389523943
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1495121389
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 164290565
	)
	public int field2092;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1945997287
	)
	int field2093;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -515149013
	)
	int field2101;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 43163485
	)
	int field2095;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 575268709
	)
	int field2091;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1379000083
	)
	public int field2100;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1488620997
	)
	public int field2098;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -713617535
	)
	public int field2099;
	@ObfuscatedName("ae")
	String field2094;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2106251763
	)
	public int field2084;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1528397051
	)
	public int field2090;
	@ObfuscatedName("av")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2100411401
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -71327981
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
		this.field2092 = 70;
		this.field2093 = -1;
		this.field2101 = -1;
		this.field2095 = -1;
		this.field2091 = -1;
		this.field2100 = 0;
		this.field2098 = 0;
		this.field2099 = -1;
		this.field2094 = "";
		this.field2084 = -1;
		this.field2090 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1154428416"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-60"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2093 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2095 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2101 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2091 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2100 = var1.readShort();
		} else if (var2 == 8) {
			this.field2094 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2092 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2098 = var1.readShort();
		} else if (var2 == 11) {
			this.field2099 = 0;
		} else if (var2 == 12) {
			this.field2084 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2090 = var1.readShort();
		} else if (var2 == 14) {
			this.field2099 = var1.readUnsignedShort();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "-595200334"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Language.method7357(var2) : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-888520122"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2094;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + WorldMapData_1.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "246967295"
	)
	public SpritePixels method3914() {
		if (this.field2093 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2093);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2093, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2093);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-1401368236"
	)
	public SpritePixels method3884() {
		if (this.field2101 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2101);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2101, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2101);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "1946262257"
	)
	public SpritePixels method3904() {
		if (this.field2095 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2095);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2095, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2095);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Lvd;",
		garbageValue = "-10688"
	)
	public SpritePixels method3886() {
		if (this.field2091 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2091);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2091, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2091);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "-1"
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
				AbstractArchive var3 = class17.field81;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class130.method3074(var3, var5, 0)) {
					var2 = null;
				} else {
					var2 = class529.fontFromBytes(var4.takeFile(var5, 0));
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "204166137"
	)
	static final void method3917(String var0) {
		PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3244, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
