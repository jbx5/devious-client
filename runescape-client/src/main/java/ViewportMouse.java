import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jr")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("aw")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1275203471
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -903634309
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("am")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 723197887
	)
	static int field2754;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1007308985
	)
	static int field2755;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 807277257
	)
	static int field2756;
	@ObfuscatedName("ah")
	public static short[] field2762;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1228596433
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("aa")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Llo;",
		garbageValue = "719974539"
	)
	public static class296[] method4947() {
		return new class296[]{class296.field3198, class296.field3194, class296.field3195, class296.field3193, class296.field3197, class296.field3203, class296.field3199, class296.field3200, class296.field3196, class296.field3202, class296.field3201};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-900202219"
	)
	public static int method4930(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;",
		garbageValue = "1976955779"
	)
	public static class450 method4940() {
		synchronized(class450.field4734) {
			if (class344.field3852 == 0) {
				return new class450();
			} else {
				class450.field4734[--class344.field3852].method8223();
				return class450.field4734[class344.field3852];
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-604436276"
	)
	static int method4923(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			Interpreter.Interpreter_intStackSize -= 3;
			class17.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				Interpreter.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				ObjectComposition.method3963(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				Interpreter.Interpreter_intStackSize -= 2;
				Interpreter.method1995(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class90 var19 = (class90)ClientPreferences.findEnumerated(class1.method10(), var3);
							if (var19 != null) {
								var4 = var19 != class90.field1100 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class89 var13 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var3);
							if (var13 != null) {
								var4 = var13 != class89.field1097 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								RouteStrategy.method4227(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								Interpreter.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								ObjectComposition.method3963(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								Interpreter.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
								class452.method8324(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class90.field1100;
							var11 = class89.field1097;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class89.field1097) {
								switch(var10.field1104) {
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
								switch(var11.field1094) {
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

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class90.field1100;
						var11 = class89.field1097;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6);
							if (var10 == null) {
								var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class90.field1103;
						} else if (var0 == 3204) {
							var11 = class89.field1091;
						} else if (var0 == 3206) {
							var11 = class89.field1093;
						} else if (var0 == 3208) {
							var11 = class89.field1089;
						}

						if (var11 == class89.field1097) {
							switch(var10.field1104) {
							case 1:
								var5 = class150.clientPreferences.method2467() ? 1 : 0;
								break;
							case 2:
								var5 = class150.clientPreferences.method2469() ? 1 : 0;
								break;
							case 3:
								var5 = class150.clientPreferences.method2546() ? 1 : 0;
								break;
							case 4:
								var5 = class150.clientPreferences.method2461();
								break;
							case 5:
								var5 = JagexCache.method3521();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1094) {
							case 1:
								var5 = class150.clientPreferences.method2465() ? 1 : 0;
								break;
							case 2:
								var6 = class150.clientPreferences.method2478();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class150.clientPreferences.method2480();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class150.clientPreferences.method2481();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class90.field1100;
					var11 = class89.field1097;
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class90)ClientPreferences.findEnumerated(class1.method10(), var6);
						if (var10 == null) {
							var11 = (class89)ClientPreferences.findEnumerated(FontName.method8742(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class90.field1103;
					} else if (var0 == 3203) {
						var11 = class89.field1091;
					} else if (var0 == 3205) {
						var11 = class89.field1093;
					} else if (var0 == 3207) {
						var11 = class89.field1089;
					}

					if (var11 == class89.field1097) {
						switch(var10.field1104) {
						case 1:
							class150.clientPreferences.method2529(var5 == 1);
							break;
						case 2:
							class150.clientPreferences.method2468(var5 == 1);
							break;
						case 3:
							class150.clientPreferences.method2519(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class150.clientPreferences.method2473(var5);
							break;
						case 5:
							UrlRequester.method2823(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1094) {
						case 1:
							class150.clientPreferences.method2464(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							StudioGame.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							ClanMate.method7938(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							Interpreter.method1966(var6);
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
