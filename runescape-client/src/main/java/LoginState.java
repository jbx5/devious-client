import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field497;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -2061426685
	)
	static int field477;

	static {
		SHUTDOWN_PREVIOUS_CONNECTION = new LoginState();
		INIT_MOUSEHANDLER_SOCKET = new LoginState();
		UNMAPPED_20 = new LoginState();
		READ_LOGIN_STATUS = new LoginState();
		READ_RANDOM_VERIFICATION_NUMBER = new LoginState();
		WRITE_INITIAL_LOGIN_PACKET = new LoginState();
		READ_CLIENT_INFO_STATUS = new LoginState();
		READ_DIGEST_PARSER_PACKET_SIZE = new LoginState();
		SUBMIT_DIGEST_PARSER_TASK = new LoginState();
		WRITE_DIGEST_PARSER_RESULT = new LoginState();
		READ_STATE_11_PACKET_SIZE = new LoginState();
		UNMAPPED_11 = new LoginState();
		READ_PROFILE_TRANSFER_TIME = new LoginState();
		PROFILE_TRANSFER = new LoginState();
		UNMAPPED = new LoginState();
		READ_ACCOUNT_INFO = new LoginState();
		SET_SERVER_PROTOCOL = new LoginState();
		UPDATE_PLAYER_AND_LOAD_REGIONS = new LoginState();
		UNMAPPED_17 = new LoginState();
		UNMAPPED_18 = new LoginState();
		UNMAPPED_19 = new LoginState();
		REFRESHING_TOKEN = new LoginState();
		TOKEN_RESPONSE = new LoginState();
		UNMAPPED_21 = new LoginState();
		READ_ACCOUNT_INFO_PACKET_SIZE = new LoginState();
	}

	LoginState() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqu;FFFB)F",
		garbageValue = "1"
	)
	static float method1249(class426 var0, float var1, float var2, float var3) {
		float var4 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var1);
		if (Math.abs(var4) < class131.field1544) {
			return var1;
		} else {
			float var5 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var2);
			if (Math.abs(var5) < class131.field1544) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = class131.field1539 * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var12 * var17 * 2.0F;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F));
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (var9 * 2.0F < 3.0F * var17 * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var10 * 0.5F * var12)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-647009043"
	)
	static int method1247(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemDefinition_get(var3).name;
			return 1;
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				class130.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = class164.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class130.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = class164.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					var4 = class164.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					var4 = class164.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					var4 = class164.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					var4 = class164.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
					var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					class6.findItemDefinitions(var7, var6 == 1);
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = InterfaceParent.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						MenuAction.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var6 = class164.ItemDefinition_get(var3).getShiftClickIndex();
						if (var6 == -1) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var4 = class164.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.field2258;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (WorldMapLabelSize.foundItemIds != null && MenuAction.foundItemIndex < InterfaceParent.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapLabelSize.foundItemIds[++MenuAction.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "-78"
	)
	static String method1248(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (AsyncHttpResponse.field81 != null) {
			var3 = "/p=" + AsyncHttpResponse.field81;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + BuddyRankComparator.clientLanguage + "/a=" + SpotAnimationDefinition.field2083 + var3 + "/";
	}
}
