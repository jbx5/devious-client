import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ch")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 117287947
	)
	static int field498;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("worldMap")
	static WorldMap worldMap;

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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lms;",
		garbageValue = "-1382208535"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3496, ServerPacket.field3537, ServerPacket.field3438, ServerPacket.field3439, ServerPacket.field3440, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3442, ServerPacket.field3437, ServerPacket.LOGOUT, ServerPacket.REBUILD_REGION, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3447, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3518, ServerPacket.field3450, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3453, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.SET_PLAYER_OP, ServerPacket.field3485, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3487, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.IF_CLOSESUB, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3466, ServerPacket.field3464, ServerPacket.field3465, ServerPacket.field3524, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3468, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3449, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3473, ServerPacket.field3474, ServerPacket.CAM_SETANGLE, ServerPacket.CAM_MOVETO, ServerPacket.field3477, ServerPacket.field3478, ServerPacket.field3558, ServerPacket.field3480, ServerPacket.field3481, ServerPacket.field3482, ServerPacket.MESSAGE_GAME, ServerPacket.PROJECTILE_SPAWN_OLD, ServerPacket.field3577, ServerPacket.VARP_LARGE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3488, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3490, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3492, ServerPacket.IF_SETHIDE, ServerPacket.IF_SETCOLOUR, ServerPacket.IF_SETMODEL, ServerPacket.field3497, ServerPacket.UPDATE_UID192, ServerPacket.field3498, ServerPacket.PLAYER_INFO, ServerPacket.field3475, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3513, ServerPacket.field3503, ServerPacket.LOGOUT_FULL, ServerPacket.field3505, ServerPacket.UPDATE_STAT, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3509, ServerPacket.field3510, ServerPacket.field3511, ServerPacket.field3512, ServerPacket.field3455, ServerPacket.REFLECTION_CHECKER, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3516, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.SET_PRIVCHATMODE, ServerPacket.NPC_SPOTANIM, ServerPacket.MIDI_SONG, ServerPacket.field3521, ServerPacket.field3527, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3541, ServerPacket.field3551, ServerPacket.field3526, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3528, ServerPacket.field3529, ServerPacket.field3530, ServerPacket.HINT_ARROW, ServerPacket.MINIMAP_TOGGLE, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.URL_OPEN, ServerPacket.field3536, ServerPacket.VARP_SMALL, ServerPacket.field3538, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3540, ServerPacket.field3463, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3506, ServerPacket.CAM_LOOKAT, ServerPacket.REBUILD_NORMAL, ServerPacket.field3546, ServerPacket.field3547, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3479, ServerPacket.IF_SETOBJECT, ServerPacket.IF_SETNPCHEAD, ServerPacket.PLAYER_SPOTANIM, ServerPacket.IF_SETPOSITION, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3555, ServerPacket.field3436, ServerPacket.CAM_RESET, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3559, ServerPacket.IF_SETANGLE, ServerPacket.field3561, ServerPacket.field3562, ServerPacket.field3504, ServerPacket.field3564, ServerPacket.field3574, ServerPacket.field3566, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.field3569, ServerPacket.field3570, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3572, ServerPacket.field3573, ServerPacket.field3563, ServerPacket.field3539, ServerPacket.field3576, ServerPacket.field3458, ServerPacket.field3578, ServerPacket.field3579};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lqt;",
		garbageValue = "-1289893197"
	)
	public static class426 method1296(float var0, float var1, float var2) {
		synchronized(class426.field4768) {
			if (class426.field4770 == 0) {
				return new class426(var0, var1, var2);
			} else {
				class426.field4768[--class426.field4770].method8200(var0, var1, var2);
				return class426.field4768[class426.field4770];
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZS)V",
		garbageValue = "-25518"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (KeyHandler.method384(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var10;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-2000882784"
	)
	static int method1294(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			var4 = class416.widgetDefinition.method6911(var3);
		} else {
			var4 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class96.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
			class110.invalidateWidget(var4);
			Projectile.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class96.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
			class110.invalidateWidget(var4);
			Projectile.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class110.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZS)I",
		garbageValue = "1151"
	)
	static int method1297(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			var3 = class416.widgetDefinition.method6911(var4);
		} else {
			var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class96.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class359 var17 = var3.method7304();
				if (var17 != null && var17.method7252(var23, var16)) {
					class110.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height * -1662542495) {
					var3.scrollY = var3.scrollHeight - var3.height * -1662542495;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class110.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class96.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 5];
			class110.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class110.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			class110.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class359 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7304();
					if (var21 != null && var21.method7065()) {
						var21.method7012(var15);
					} else {
						var3.text = var15;
					}

					class110.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					class110.invalidateWidget(var3);
				}

				return 1;
			} else {
				class359 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7304();
						if (var19 != null) {
							var19.method7026();
						}
					}

					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class96.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7304();
						if (var19 != null) {
							var19.method7207(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
							var19.method7112(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
					}

					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class96.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					class110.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					GameBuild.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class110.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					FillMode var22 = (FillMode)class177.findEnumerated(WorldMap.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						class110.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						var3.field3912 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3915 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
						class110.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7295(Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize], "", class278.urlRequester, class135.getUserId());
						return 1;
					} else if (var0 == 1131) {
						class96.Interpreter_intStackSize -= 2;
						var3.method7310(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7311(Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
						return 1;
					} else {
						class353 var20;
						if (var0 == 1133) {
							--class96.Interpreter_intStackSize;
							var20 = var3.method7325();
							if (var20 != null) {
								var20.field3794 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--class96.Interpreter_intStackSize;
							var20 = var3.method7325();
							if (var20 != null) {
								var20.field3793 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class208.Interpreter_stringStackSize;
							var19 = var3.method7304();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--class96.Interpreter_intStackSize;
							var20 = var3.method7325();
							if (var20 != null) {
								var20.field3795 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null && var19.method7016(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize])) {
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null && var19.method7226(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize])) {
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null && var19.method7018(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize])) {
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							Client.field754.method5617();
							var21 = var3.method7304();
							if (var21 != null && var21.method7215(var14)) {
								if (var14) {
									Client.field754.method5615(var3);
								}

								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field754.method5630() == var3) {
								Client.field754.method5617();
								class110.invalidateWidget(var3);
							}

							var21 = var3.method7304();
							if (var21 != null) {
								var21.method7011(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							class96.Interpreter_intStackSize -= 2;
							var19 = var3.method7304();
							if (var19 != null && var19.method7157(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1])) {
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null && var19.method7157(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize])) {
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null) {
								var19.method7023(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
								class110.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null) {
								var19.method7022(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null) {
								var19.method7025(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class96.Interpreter_intStackSize;
							var19 = var3.method7304();
							if (var19 != null) {
								var19.method7024(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
								class110.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								class96.Interpreter_intStackSize -= 2;
								var18 = var3.method7326();
								if (var18 != null) {
									var18.method393(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class96.Interpreter_intStackSize -= 2;
								var18 = var3.method7326();
								if (var18 != null) {
									var18.method398((char)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7341(Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize], class278.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class208.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 2];
								long var8 = class135.getUserId();
								long var10 = KeyHandler.getUserHash();
								String var12 = class36.getPlatformInfo().getDeviceId(class36.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7308(var15, var13, var7, var12, Long.toString(var10), class278.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class216 var5 = var3.method7320();
									boolean var6 = var5 != null && var5.method4430() && class417.method8077().method4568(var5.method4424());
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lie;",
		garbageValue = "1976033991"
	)
	public static Clock method1290() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "67627297"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class416.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class416.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						GraphicsObject.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1552281144"
	)
	static boolean method1291() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
