import java.util.Date;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("v")
	@Export("text")
	String text;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-748694571)

	@Export("width")
	int width;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	703588799)

	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lgp;")

	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;IILgp;)V")

	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfq;", garbageValue = 
	"-1327829114")

	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = ((KitDefinition) (KitDefinition.KitDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-1060633923")

	static int method4354(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class122.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3 + ItemLayer.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					long var13 = (11745L + ((long) (var10))) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (((var6 + "-") + Interpreter.Interpreter_MONTHS[var17]) + "-") + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class122.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClanChannelMember.method2869(PlayerType.compareStrings(Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1], Skills.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var11 = class166.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var11 = class166.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class122.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3 + ((char) (var9));
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (ClientPreferences.isCharPrintable(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class131.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (SoundSystem.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (WorldMapElement.isDigit(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class122.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class122.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
					if ((GrandExchangeEvents.localPlayer.appearance != null) && GrandExchangeEvents.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"-543558308")

	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if ((((var3 >= 0) && (var4 >= 0)) && (var3 <= 103)) && (var4 <= 103)) {
			int var5 = var2;
			if ((var2 < 3) && ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2)) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (((128 - var6) * Tiles.Tiles_heights[var5][var3][var4]) + (Tiles.Tiles_heights[var5][var3 + 1][var4] * var6)) >> 7;
			int var9 = ((var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1]) + (Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6))) >> 7;
			return ((var7 * var9) + (var8 * (128 - var7))) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1796221797")

	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class143.method3072();

		for (ObjectSound var1 = ((ObjectSound) (ObjectSound.objectSounds.last())); var1 != null; var1 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = class134.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					KitDefinition.method3453(0.9);
				}

				if (var2 == 2) {
					KitDefinition.method3453(0.8);
				}

				if (var2 == 3) {
					KitDefinition.method3453(0.7);
				}

				if (var2 == 4) {
					KitDefinition.method3453(0.6);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					class1.method11(255);
				}

				if (var2 == 1) {
					class1.method11(192);
				}

				if (var2 == 2) {
					class1.method11(128);
				}

				if (var2 == 3) {
					class1.method11(64);
				}

				if (var2 == 4) {
					class1.method11(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					class126.method2824(127);
				}

				if (var2 == 1) {
					class126.method2824(96);
				}

				if (var2 == 2) {
					class126.method2824(64);
				}

				if (var2 == 3) {
					class126.method2824(32);
				}

				if (var2 == 4) {
					class126.method2824(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
				Client.field524 = var2;
			}

			if (var3 == 10) {
				if (var2 == 0) {
					class127.method2830(127);
				}

				if (var2 == 1) {
					class127.method2830(96);
				}

				if (var2 == 2) {
					class127.method2830(64);
				}

				if (var2 == 3) {
					class127.method2830(32);
				}

				if (var2 == 4) {
					class127.method2830(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = ((AttackOption) (MusicPatchPcmStream.findEnumerated(FriendSystem.method1743(), var2)));
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == (-1)) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = ((AttackOption) (MusicPatchPcmStream.findEnumerated(FriendSystem.method1743(), var2)));
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}