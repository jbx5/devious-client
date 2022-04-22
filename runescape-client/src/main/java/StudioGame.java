import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("s")
	@Export("name")
	public final String name;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	589131085)

	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-741989728")

	static void method5776() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != (-1)) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue = 
	"-184961670")

	public static String method5780(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(descriptor = 
	"(ZLpz;B)V", garbageValue = 
	"1")

	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShortAdd();
			int var4 = var1.readUnsignedShort();
			WorldMapSectionType.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapSectionType.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class21.regions = new int[var4];
			VarpDefinition.regionMapArchiveIds = new int[var4];
			class133.regionLandArchiveIds = new int[var4];
			Varcs.regionLandArchives = new byte[var4][];
			DynamicObject.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field553) {
				if ((((var2 / 8) == 48) || ((var2 / 8) == 49)) && ((var3 / 8) == 48)) {
					var16 = true;
				}

				if (((var2 / 8) == 48) && ((var3 / 8) == 148)) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= ((var2 + 6) / 8); ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= ((var3 + 6) / 8); ++var7) {
					var8 = var7 + (var6 << 8);
					if ((!var16) || (((((var7 != 49) && (var7 != 149)) && (var7 != 147)) && (var6 != 50)) && ((var6 != 49) || (var7 != 47)))) {
						class21.regions[var4] = var8;
						VarpDefinition.regionMapArchiveIds[var4] = Players.archive5.getGroupId((("m" + var6) + "_") + var7);
						class133.regionLandArchiveIds[var4] = Players.archive5.getGroupId((("l" + var6) + "_") + var7);
						++var4;
					}
				}
			}

			FloorDecoration.method4591(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedShortLE();
			boolean var15 = var1.readUnsignedByte() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			WorldMapSectionType.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapSectionType.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class21.regions = new int[var5];
			VarpDefinition.regionMapArchiveIds = new int[var5];
			class133.regionLandArchiveIds = new int[var5];
			Varcs.regionLandArchives = new byte[var5][];
			DynamicObject.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != (-1)) {
							int var10 = (var9 >> 14) & 1023;
							int var11 = (var9 >> 3) & 2047;
							int var12 = ((var10 / 8) << 8) + (var11 / 8);

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class21.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != (-1)) {
								class21.regions[var5] = var12;
								var13 = (var12 >> 8) & 255;
								int var14 = var12 & 255;
								VarpDefinition.regionMapArchiveIds[var5] = Players.archive5.getGroupId((("m" + var13) + "_") + var14);
								class133.regionLandArchiveIds[var5] = Players.archive5.getGroupId((("l" + var13) + "_") + var14);
								++var5;
							}
						}
					}
				}
			}

			FloorDecoration.method4591(var3, var2, !var15);
		}

	}}