import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("gi")
public class class193 {
	@ObfuscatedName("f")
	@Export("directions")
	public static int[][] directions = new int[128][128];

	@ObfuscatedName("u")
	@Export("distances")
	public static int[][] distances = new int[128][128];

	@ObfuscatedName("j")
	@Export("bufferX")
	public static int[] bufferX = new int[4096];

	@ObfuscatedName("h")
	@Export("bufferY")
	public static int[] bufferY = new int[4096];

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-829025129")
	public static boolean method3908(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field137[var0] : false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "470828910")
	static int method3906(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + ModeWhere.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var7;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					long var13 = (11745L + ((long) (var10))) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					var7 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.method7221(class238.compareStrings(Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1], class21.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							TaskHandler.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var11 = class1.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							TaskHandler.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var11 = class1.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3 + ((char) (var9));
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (KeyHandler.isCharPrintable(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (UrlRequest.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class147.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (GameObject.isDigit(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							TaskHandler.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;
							for (var6 = 0; var6 < var3.length(); ++var6) {
								var7 = var3.charAt(var6);
								if (var7 == 60) {
									var16 = true;
								} else if (var7 == 62) {
									var16 = false;
								} else if (!var16) {
									var15.append(((char) (var7)));
								}
							}
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1];
					if (class28.localPlayer.appearance != null && class28.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3;
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(descriptor = "(Lcs;I)V", garbageValue = "-1647783699")
	static final void method3909(Actor var0) {
		if (var0.field1197 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - '耀'];
				}
				if (var1 != null) {
					int var2 = var0.x - ((Actor) (var1)).x;
					int var3 = var0.y - ((Actor) (var1)).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = ((int) (Math.atan2(((double) (var2)), ((double) (var3))) * 325.949)) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}
			if (var0.field1164 != -1 && (var0.pathLength == 0 || var0.field1142 > 0)) {
				var0.orientation = var0.field1164;
				var0.field1164 = -1;
			}
			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
			if (var4 != 0) {
				++var0.field1196;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= (var0.field1152) ? var4 : var0.field1197;
					var6 = true;
					if (var4 < var0.field1197 || var4 > 2048 - var0.field1197) {
						var0.rotation = var0.orientation;
						var6 = false;
					}
					if (!var0.field1152 && var0.movementSequence == var0.idleSequence && (var0.field1196 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += (var0.field1152) ? var4 : var0.field1197;
					var6 = true;
					if (var4 < var0.field1197 || var4 > 2048 - var0.field1197) {
						var0.rotation = var0.orientation;
						var6 = false;
					}
					if (!var0.field1152 && var0.idleSequence == var0.movementSequence && (var0.field1196 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}
				var0.rotation &= 2047;
				var0.field1152 = false;
			} else {
				var0.field1196 = 0;
			}
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V", garbageValue = "1768018543")
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;
		for (int var4 = 0; var4 < Buddy.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class258.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class127.foundItemIdCount = -1;
					WorldMapData_1.foundItemIds = null;
					return;
				}
				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];
					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}
					var2 = var6;
				}
				var2[var3++] = ((short) (var4));
			}
		}
		WorldMapData_1.foundItemIds = var2;
		WorldMapSection2.foundItemIndex = 0;
		class127.foundItemIdCount = var3;
		String[] var8 = new String[class127.foundItemIdCount];
		for (int var5 = 0; var5 < class127.foundItemIdCount; ++var5) {
			var8[var5] = class258.ItemDefinition_get(var2[var5]).name;
		}
		short[] var10 = WorldMapData_1.foundItemIds;
		WorldMapID.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}