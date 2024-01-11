import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ak")
	static String[] field1458;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1520919717
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)I",
		garbageValue = "-1967044104"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-499305472"
	)
	static int method2972(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			UserComparator6.Interpreter_intStackSize -= 3;
			class365.queueSoundEffect(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				UserComparator6.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				Skills.method6928(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				UserComparator6.Interpreter_intStackSize -= 2;
				class405.method7552(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class90 var10;
				class89 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var4 = 0;
							class90 var19 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var3);
							if (var19 != null) {
								var4 = var19 != class90.field1090 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var4 = 0;
							class89 var13 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var3);
							if (var13 != null) {
								var4 = var13 != class89.field1082 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
								Actor.method2488(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								UserComparator6.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								Skills.method6928(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								UserComparator6.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
								FriendSystem.method1927(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class90.field1090;
							var11 = class89.field1082;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1082) {
								switch(var10.field1093) {
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
								switch(var11.field1083) {
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

							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class90.field1090;
						var11 = class89.field1082;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6);
							if (var10 == null) {
								var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class90.field1092;
						} else if (var0 == 3204) {
							var11 = class89.field1080;
						} else if (var0 == 3206) {
							var11 = class89.field1085;
						} else if (var0 == 3208) {
							var11 = class89.field1078;
						}

						if (var11 == class89.field1082) {
							switch(var10.field1093) {
							case 1:
								var5 = class93.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class93.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class93.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class93.clientPreferences.method2543();
								break;
							case 5:
								var5 = class89.method2378();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1083) {
							case 1:
								var5 = class93.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class93.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class93.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class93.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class90.field1090;
					var11 = class89.field1082;
					var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var10 = (class90)GrandExchangeEvents.findEnumerated(class1.method6(), var6);
						if (var10 == null) {
							var11 = (class89)GrandExchangeEvents.findEnumerated(ChatChannel.method2271(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class90.field1092;
					} else if (var0 == 3203) {
						var11 = class89.field1080;
					} else if (var0 == 3205) {
						var11 = class89.field1085;
					} else if (var0 == 3207) {
						var11 = class89.field1078;
					}

					if (var11 == class89.field1082) {
						switch(var10.field1093) {
						case 1:
							class93.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class93.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class93.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class93.clientPreferences.method2542(var5);
							break;
						case 5:
							Huffman.method6901(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1083) {
						case 1:
							class93.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class401.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							Canvas.method327(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class165.method3515(var6);
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
