import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("jx")
	static int[][] field460;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILip;I)Z",
		garbageValue = "950007468"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "331513751"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class421.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "122"
	)
	static int method1223(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class130.Interpreter_intStackSize -= 3;
			SoundCache.queueSoundEffect(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				class130.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				class498.method8899(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				class130.Interpreter_intStackSize -= 2;
				LoginScreenAnimation.method2551(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var4 = 0;
							class92 var19 = (class92)class210.findEnumerated(class6.method37(), var3);
							if (var19 != null) {
								var4 = var19 != class92.field1116 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var4 = 0;
							class91 var13 = (class91)class210.findEnumerated(Interpreter.method2144(), var3);
							if (var13 != null) {
								var4 = var13 != class91.field1102 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class130.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
								class137.method3187(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								class130.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								class498.method8899(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								class130.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
								class108.method2812(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class92.field1116;
							var11 = class91.field1102;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								var10 = (class92)class210.findEnumerated(class6.method37(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1102) {
								switch(var10.field1108) {
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
								switch(var11.field1104) {
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

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class92.field1116;
						var11 = class91.field1102;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var10 = (class92)class210.findEnumerated(class6.method37(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var10 = (class92)class210.findEnumerated(class6.method37(), var6);
							if (var10 == null) {
								var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class92.field1113;
						} else if (var0 == 3204) {
							var11 = class91.field1101;
						} else if (var0 == 3206) {
							var11 = class91.field1099;
						} else if (var0 == 3208) {
							var11 = class91.field1103;
						}

						if (var11 == class91.field1102) {
							switch(var10.field1108) {
							case 1:
								var5 = class105.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class105.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class105.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class105.clientPreferences.method2581();
								break;
							case 5:
								var5 = WorldMapArea.method4653();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1104) {
							case 1:
								var5 = class105.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class105.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class105.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class105.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class92.field1116;
					var11 = class91.field1102;
					var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var10 = (class92)class210.findEnumerated(class6.method37(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var10 = (class92)class210.findEnumerated(class6.method37(), var6);
						if (var10 == null) {
							var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class92.field1113;
					} else if (var0 == 3203) {
						var11 = class91.field1101;
					} else if (var0 == 3205) {
						var11 = class91.field1099;
					} else if (var0 == 3207) {
						var11 = class91.field1103;
					}

					if (var11 == class91.field1102) {
						switch(var10.field1108) {
						case 1:
							class105.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class105.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class105.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class105.clientPreferences.method2657(var5);
							break;
						case 5:
							class166.method3476(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1104) {
						case 1:
							class105.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							Script.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class105.method2785(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class148.method3278(var6);
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
