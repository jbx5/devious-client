import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
@Implements("Login")
public class Login {
	@ObfuscatedName("aw")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2069137
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static IndexedSprite field944;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -710649007
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1581314349
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("aa")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1658478237
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1866840143
	)
	static int field938;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1064901707
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cb")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cd")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ci")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cn")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("co")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cf")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -518849387
	)
	static int field930;
	@ObfuscatedName("cv")
	static String[] field943;
	@ObfuscatedName("cx")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cw")
	static boolean field956;
	@ObfuscatedName("ca")
	static boolean field947;
	@ObfuscatedName("ck")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1298053951
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dr")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 245615341
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1142916259
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -131043533
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		longValue = -8485463411094184791L
	)
	static long field937;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = -7429349422363448111L
	)
	static long field957;
	@ObfuscatedName("dp")
	static String[] field958;
	@ObfuscatedName("dy")
	static String[] field959;
	@ObfuscatedName("do")
	static String[] field960;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive13")
	static Archive archive13;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field938 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field930 = 0;
		field943 = new String[8];
		displayName = "";
		field956 = false;
		field947 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class141();
		field937 = -1L;
		field957 = -1L;
		field958 = new String[]{"title.jpg"};
		field959 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field960 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "31"
	)
	public static void method2410(AbstractArchive var0) {
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1689587864"
	)
	static int method2376(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
			if (var0 != ScriptOpcodes.DB_FINDNEXT) {
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) {
					class96.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
					var20 = Fonts.method9730(var19);
					var7 = ObjectSound.method2083(var19);
					int var21 = BuddyRankComparator.method3340(var19);
					DbRowType var26 = class300.getDbRowType(var3);
					DbTableType var27 = GameBuild.getDbTableType(var20);
					int[] var28 = var27.types[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}

						var12 = var21;
						var13 = var21 + 1;
					}

					Object[] var14 = var26.getColumnType(var7);
					if (var14 == null && var27.defaultValues != null) {
						var14 = var27.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class544 var22 = JagexCache.method4512(var16);
							if (var22 == class544.field5381) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class416.method8060(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class544 var18 = JagexCache.method4512(var28[var16]);
								if (var18 == class544.field5381) {
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = Fonts.method9730(var19);
					var7 = ObjectSound.method2083(var19);
					DbRowType var25 = class300.getDbRowType(var3);
					DbTableType var9 = GameBuild.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						DbRowType var24 = class300.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var19 = -1;
						if (class88.field1087 != null && var3 >= 0 && var3 < class88.field1087.size()) {
							var19 = (Integer)class88.field1087.get(var3);
						}

						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = class93.method2593(var3);
						var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var6 = ClanChannel.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (Fonts.method9730(var5) != Client.field792) {
							throw new RuntimeException();
						} else if (class88.field1087 == null && class88.field1087.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = BuddyRankComparator.method3340(var5);
							List var8 = var6.method9978(var4, var7);
							class88.field1087 = new LinkedList(class88.field1087);
							if (var8 != null) {
								class88.field1087.retainAll(var8);
							} else {
								class88.field1087.clear();
							}

							class213.field2345 = class88.field1087.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class88.field1087.size();
							}

							return 1;
						}
					}
				} else {
					--class96.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					DbTable var23 = VarbitComposition.method4129(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class88.field1087 = var23.method9978(0, 0);
						var5 = 0;
						if (class88.field1087 != null) {
							Client.field792 = var3;
							class213.field2345 = class88.field1087.iterator();
							var5 = class88.field1087.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class213.field2345 != null && class213.field2345.hasNext()) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (Integer)class213.field2345.next();
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			var4 = class93.method2593(var3);
			var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			var6 = ClanChannel.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = BuddyRankComparator.method3340(var5);
				class88.field1087 = var6.method9978(var4, var7);
				if (class88.field1087 != null) {
					Client.field792 = Fonts.method9730(var5);
					class213.field2345 = class88.field1087.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class88.field1087.size();
					}
				} else {
					Client.field792 = -1;
					class213.field2345 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)V",
		garbageValue = "-34"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			GrandExchangeEvent.method7784(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = class227.Widget_getSpellActionName(var0);
			if (var1 != null) {
				GrandExchangeEvent.method7784(var1, class204.colorStartTag(65280) + var0.field4013, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class368.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class368.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class368.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class368.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var2;
			boolean var8;
			if (Client.isSpellSelected) {
				var2 = class171.getWidgetFlags(var0);
				var8 = (var2 >> 21 & 1) != 0;
				if (var8 && (class373.selectedSpellFlags & 32) == 32) {
					GrandExchangeEvent.method7784(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var10 = 9; var10 >= 0; --var10) {
					String var9;
					if (var10 == var0.field3925 * 1061067755) {
						var9 = class227.Widget_getSpellActionName(var0);
						if (var9 != null) {
							GrandExchangeEvent.method7784(var9, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
						}
					}

					var9 = Ignored.method9125(var0, var10);
					if (var9 != null) {
						int var3;
						short var4;
						if (var10 > var0.field3925 * 1061067755) {
							var4 = 1007;
							var3 = GrandExchangeEvent.method7784(var9, var0.dataText, var4, var10 + 1, var0.childIndex, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = AsyncRestClient.insertMenuItem(var9, var0.dataText, var4, var10 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field3964 != null && var10 < var0.field3964.length && var0.field3964[var10] != null) {
							String[] var5 = var0.field3964[var10];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var10 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									MoveSpeed.method5809(var3, var5[var6], "", var4, var7, var0.childIndex, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				var2 = class171.getWidgetFlags(var0);
				var8 = (var2 & 1) != 0;
				if (var8) {
					class368.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
