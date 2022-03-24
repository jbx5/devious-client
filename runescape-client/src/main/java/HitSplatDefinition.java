




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1926287649)

	@Export("fontId")
	int fontId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1728432001)

	@Export("textColor")
	public int textColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	670201833)

	public int field2025;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-2088614137)

	int field2018;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-1486126739)

	int field2015;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	463403451)

	int field2014;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-1913451591)

	int field2003;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-1607995829)

	public int field2016;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	304686181)

	public int field2017;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	686533415)

	public int field2005;
	@ObfuscatedName("y")
	String field2019;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	-731376779)

	public int field2020;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-1728160459)

	public int field2021;
	@ObfuscatedName("t")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1797964889)

	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	602971365)

	@Export("transformVarp")
	int transformVarp;
	static 
	{
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2025 = 70;
		this.field2018 = -1;
		this.field2015 = -1;
		this.field2014 = -1;
		this.field2003 = -1;
		this.field2016 = 0;
		this.field2017 = 0;
		this.field2005 = -1;
		this.field2019 = "";
		this.field2020 = -1;
		this.field2021 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-766688511")

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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"-907720149")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2018 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2014 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2015 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2003 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2016 = var1.readShort();
		} else if (var2 == 8) {
			this.field2019 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2025 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2017 = var1.readShort();
		} else if (var2 == 11) {
			this.field2005 = 0;
		} else if (var2 == 12) {
			this.field2020 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2021 = var1.readShort();
		} else if (var2 == 14) {
			this.field2005 = var1.readUnsignedShort();
		} else if ((var2 == 17) || (var2 == 18)) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)Lgj;", garbageValue = 
	"-1523162219")

	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != (-1)) {
			var1 = WorldMapRegion.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != (-1)) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != (-1) ? GameEngine.method589(var2) : null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"-2040807148")

	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2019;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = (var2.substring(0, var3) + JagexCache.intToString(var1, false)) + var2.substring(var3 + 2);
		} 
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Lql;", garbageValue = 
	"-817208999")

	public SpritePixels method3611() {
		if (this.field2018 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2018)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2018, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2018)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(S)Lql;", garbageValue = 
	"6554")

	public SpritePixels method3620() {
		if (this.field2015 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2015)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2015, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2015)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(S)Lql;", garbageValue = 
	"8947")

	public SpritePixels method3613() {
		if (this.field2014 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2014)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2014, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2014)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)Lql;", garbageValue = 
	"-2026619889")

	public SpritePixels method3614() {
		if (this.field2003 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2003)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2003, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2003)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(B)Lmr;", garbageValue = 
	"95")

	@Export("getFont")
	public Font getFont() {
		if (this.fontId == (-1)) {
			return null;
		} else {
			Font var1 = ((Font) (HitSplatDefinition_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class19.method319(class20.field101, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, ((long) (this.fontId)));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfy;", garbageValue = 
	"346076354")

	public static HealthBarDefinition method3619(int var0) {
		HealthBarDefinition var1 = ((HealthBarDefinition) (HealthBarDefinition.HealthBarDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lkj;", garbageValue = 
	"945276935")

	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{ PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field3919, PlayerType.field3931, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.field3926, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman };
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-213160896")

	static int method3642(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (MusicPatch.loadWorlds()) ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = FloorDecoration.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.id;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var9.activity;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.location;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.population;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = WallDecoration.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.id;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var9.activity;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.location;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var9.population;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.id;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var7.activity;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.location;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.population;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class295.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3] == 1;
					FriendsList.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class295.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var5 = class182.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class9.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class9.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class295.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var5 = class182.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class116.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class116.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class295.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var5 = class182.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class67.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class67.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class295.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var5 = class182.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class114.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class114.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Client.onMobile) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--ChatChannel.Interpreter_stringStackSize;
							--class295.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--ChatChannel.Interpreter_stringStackSize;
							--class295.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.field486;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					if ((var3 >= 0) && (var3 < World.World_count)) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.id;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var7.activity;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.location;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.population;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}