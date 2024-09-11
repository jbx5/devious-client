import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static AbstractArchive field2138;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -85803837
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -837058601
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1968454127
	)
	public int field2147;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -871143537
	)
	int field2148;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -245521601
	)
	int field2149;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1788230501
	)
	int field2150;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1901572133
	)
	int field2151;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -947496363
	)
	public int field2152;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -423842625
	)
	public int field2153;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1664801495
	)
	public int field2154;
	@ObfuscatedName("aj")
	String field2155;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1805135413
	)
	public int field2139;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1559184019
	)
	public int field2157;
	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1917956383
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1198102477
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	public HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2147 = 70;
		this.field2148 = -1;
		this.field2149 = -1;
		this.field2150 = -1;
		this.field2151 = -1;
		this.field2152 = 0;
		this.field2153 = 0;
		this.field2154 = -1;
		this.field2155 = "";
		this.field2139 = -1;
		this.field2157 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-1307140675"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-824928349"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2148 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2150 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2149 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2151 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2152 = var1.readShort();
		} else if (var2 == 8) {
			this.field2155 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2147 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2153 = var1.readShort();
		} else if (var2 == 11) {
			this.field2154 = 0;
		} else if (var2 == 12) {
			this.field2139 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2157 = var1.readShort();
		} else if (var2 == 14) {
			this.field2154 = var1.readUnsignedShort();
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
		descriptor = "(I)Lhs;",
		garbageValue = "-2019467005"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = LoginPacket.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		if (var2 != -1) {
			HitSplatDefinition var4 = (HitSplatDefinition)HitSplatDefinition_cached.get((long)var2);
			HitSplatDefinition var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = HitSplatDefinition_archive.takeFile(32, var2);
				var4 = new HitSplatDefinition();
				if (var5 != null) {
					var4.decode(new Buffer(var5));
				}

				HitSplatDefinition_cached.put(var4, (long)var2);
				var3 = var4;
			}

			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2155;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + ClanSettings.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Lvv;",
		garbageValue = "-12803"
	)
	public SpritePixels method4134() {
		if (this.field2148 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2148);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field2138, this.field2148, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2148);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "1179871107"
	)
	public SpritePixels method4150() {
		if (this.field2149 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2149);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field2138, this.field2149, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2149);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "-1552353576"
	)
	public SpritePixels method4156() {
		if (this.field2150 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2150);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field2138, this.field2150, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2150);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "185619092"
	)
	public SpritePixels method4135() {
		if (this.field2151 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2151);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field2138, this.field2151, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2151);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lqu;",
		garbageValue = "-17086"
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
				AbstractArchive var3 = field2138;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!HttpJsonRequestBody.method9207(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, HttpAuthenticationHeader.SpriteBuffer_xOffsets, Login.SpriteBuffer_yOffsets, GrandExchangeEvents.SpriteBuffer_spriteWidths, ModelData0.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, MusicPatchPcmStream.SpriteBuffer_pixels);
						class151.method3492();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;IS)V",
		garbageValue = "20012"
	)
	public static void method4155(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1618940646"
	)
	public static boolean method4158() {
		if (!class334.field3620.isEmpty()) {
			return true;
		} else {
			return !class334.musicSongs.isEmpty() && class334.musicSongs.get(0) != null && ((MusicSong)class334.musicSongs.get(0)).midiPcmStream != null ? ((MusicSong)class334.musicSongs.get(0)).midiPcmStream.isReady() : false;
		}
	}
}
