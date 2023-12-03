import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ge")
public class class159 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8389243064566270675L
	)
	long field1743;
	@ObfuscatedName("ah")
	String field1746;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1871625717
	)
	int field1744;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class159(class147 var1) {
		this.this$0 = var1;
		this.field1743 = -1L;
		this.field1746 = null;
		this.field1744 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1743 = var1.readLong();
		}

		this.field1746 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1744 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3327(this.field1743, this.field1746, this.field1744);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	static void method3426() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "404161563"
	)
	static int method3416(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			DbTableType.Interpreter_intStackSize -= 3;
			class460.queueSoundEffect(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				DbTableType.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				class135.method3152(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				DbTableType.Interpreter_intStackSize -= 2;
				FileSystem.method4224(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var4 = 0;
							class90 var19 = (class90)class12.findEnumerated(UserComparator3.method2985(), var3);
							if (var19 != null) {
								var4 = var19 != class90.field1092 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var4 = 0;
							class89 var13 = (class89)class12.findEnumerated(HealthBar.method2656(), var3);
							if (var13 != null) {
								var4 = var13 != class89.field1077 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								DbTableType.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
								WorldMapRenderer.method4769(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								DbTableType.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								class135.method3152(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								DbTableType.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
								class191.method3758(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class90.field1092;
							var11 = class89.field1077;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1077) {
								switch(var10.field1089) {
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
								switch(var11.field1076) {
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

							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class90.field1092;
						var11 = class89.field1077;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6);
							if (var10 == null) {
								var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class90.field1086;
						} else if (var0 == 3204) {
							var11 = class89.field1071;
						} else if (var0 == 3206) {
							var11 = class89.field1081;
						} else if (var0 == 3208) {
							var11 = class89.field1075;
						}

						if (var11 == class89.field1077) {
							switch(var10.field1089) {
							case 1:
								var5 = WorldMapIcon_1.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = WorldMapIcon_1.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = WorldMapIcon_1.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = WorldMapIcon_1.clientPreferences.method2604();
								break;
							case 5:
								var5 = class216.method4235();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1076) {
							case 1:
								var5 = WorldMapIcon_1.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = WorldMapIcon_1.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = WorldMapIcon_1.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = WorldMapIcon_1.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class90.field1092;
					var11 = class89.field1077;
					var5 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var10 = (class90)class12.findEnumerated(UserComparator3.method2985(), var6);
						if (var10 == null) {
							var11 = (class89)class12.findEnumerated(HealthBar.method2656(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class90.field1086;
					} else if (var0 == 3203) {
						var11 = class89.field1071;
					} else if (var0 == 3205) {
						var11 = class89.field1081;
					} else if (var0 == 3207) {
						var11 = class89.field1075;
					}

					if (var11 == class89.field1077) {
						switch(var10.field1089) {
						case 1:
							WorldMapIcon_1.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							WorldMapIcon_1.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							WorldMapIcon_1.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							WorldMapIcon_1.clientPreferences.method2549(var5);
							break;
						case 5:
							class311.method5940(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1076) {
						case 1:
							WorldMapIcon_1.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							Decimator.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							SoundSystem.method868(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							Login.method2198(var6);
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

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "227996304"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field557) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
