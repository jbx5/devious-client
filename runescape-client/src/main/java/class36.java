import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bu")
public class class36 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1216571294"
	)
	static int method698(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class13.Interpreter_intStackSize -= 3;
			class453.queueSoundEffect(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				class13.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				Canvas.method307(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				class13.Interpreter_intStackSize -= 2;
				class27.method414(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class92 var10;
				class91 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var4 = 0;
							class92 var19 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var3);
							if (var19 != null) {
								var4 = var19 != class92.field1131 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var4 = 0;
							class91 var13 = (class91)MenuAction.findEnumerated(Friend.method8592(), var3);
							if (var13 != null) {
								var4 = var13 != class91.field1115 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class13.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
								Skills.method7123(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								class13.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								Canvas.method307(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								class13.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
								FloorUnderlayDefinition.method4067(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class92.field1131;
							var11 = class91.field1115;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								var10 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								var11 = (class91)MenuAction.findEnumerated(Friend.method8592(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1115) {
								switch(var10.field1130) {
								case 1:
								case 2:
								case 3:
									var18 = 0;
									var6 = 1;
									break;
								case 4:
									var18 = 0;
									var6 = Integer.MAX_VALUE;
									break;
								case 5:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString());
									throw new RuntimeException(var12);
								}
							} else {
								switch(var11.field1122) {
								case 1:
									var18 = 0;
									var6 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString());
									throw new RuntimeException(var12);
								}
							}

							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class92.field1131;
						var11 = class91.field1115;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var10 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var11 = (class91)MenuAction.findEnumerated(Friend.method8592(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var10 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var6);
							if (var10 == null) {
								var11 = (class91)MenuAction.findEnumerated(Friend.method8592(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class92.field1127;
						} else if (var0 == 3204) {
							var11 = class91.field1120;
						} else if (var0 == 3206) {
							var11 = class91.field1118;
						} else if (var0 == 3208) {
							var11 = class91.field1119;
						}

						if (var11 == class91.field1115) {
							switch(var10.field1130) {
							case 1:
								var5 = class459.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class459.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class459.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class459.clientPreferences.method2618();
								break;
							case 5:
								var5 = MouseHandler.method690();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1122) {
							case 1:
								var5 = class459.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class459.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class459.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class459.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class92.field1131;
					var11 = class91.field1115;
					var5 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var10 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = (class91)MenuAction.findEnumerated(Friend.method8592(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var10 = (class92)MenuAction.findEnumerated(ActorSpotAnim.method8787(), var6);
						if (var10 == null) {
							var11 = (class91)MenuAction.findEnumerated(Friend.method8592(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class92.field1127;
					} else if (var0 == 3203) {
						var11 = class91.field1120;
					} else if (var0 == 3205) {
						var11 = class91.field1118;
					} else if (var0 == 3207) {
						var11 = class91.field1119;
					}

					if (var11 == class91.field1115) {
						switch(var10.field1130) {
						case 1:
							class459.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class459.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class459.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class459.clientPreferences.method2556(var5);
							break;
						case 5:
							class194.method3794(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1122) {
						case 1:
							class459.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							Coord.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class31.method449(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							Client.method1809(var6);
							break;
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString());
							throw new RuntimeException(var14);
						}
					}

					return 1;
				}
			}
		}
	}
}
