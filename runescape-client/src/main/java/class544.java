import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ui")
public class class544 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	public static final class544 field5385;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	public static final class544 field5380;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	public static final class544 field5381;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class496 field5379;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -934598989
	)
	public final int field5382;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -561719529
	)
	public final int field5383;
	@ObfuscatedName("ay")
	public final Class field5386;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	final class540 field5384;

	static {
		field5385 = new class544(2, 0, Integer.class, new class541());
		field5380 = new class544(0, 1, Long.class, new class543());
		field5381 = new class544(1, 2, String.class, new class545());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Luo;)V"
	)
	class544(int var1, int var2, Class var3, class540 var4) {
		this.field5382 = var1;
		this.field5383 = var2;
		this.field5386 = var3;
		this.field5384 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5383;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object method9932(Buffer var1) {
		return this.field5384.vmethod9953(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lui;",
		garbageValue = "41"
	)
	public static class544[] method9937() {
		return new class544[]{field5381, field5385, field5380};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfn;",
		garbageValue = "-158156887"
	)
	static class139[] method9948() {
		return new class139[]{class139.field1641, class139.field1627, class139.field1647, class139.field1629, class139.field1630, class139.field1631, class139.field1637, class139.field1633, class139.field1626, class139.field1635, class139.field1636, class139.field1628, class139.field1638, class139.field1644, class139.field1640, class139.field1632, class139.field1642};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-17"
	)
	public static int method9936(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lui;",
		garbageValue = "53039308"
	)
	public static class544 method9926(Class var0) {
		class544[] var1 = method9937();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class544 var3 = var1[var2];
			if (var3.field5386 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvl;I)V",
		garbageValue = "-671038062"
	)
	public static void method9929(Object var0, Buffer var1) {
		class540 var2 = method9930(var0.getClass());
		var2.vmethod9951(var0, var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Luo;",
		garbageValue = "-805336762"
	)
	static class540 method9930(Class var0) {
		class544 var1 = method9926(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5384;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "-1450976103"
	)
	static void method9950(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method9950(var0, var1, var2, var5 - 1);
			method9950(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lct;",
		garbageValue = "-22"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class180.getNextWorldListWorld();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1577159825"
	)
	static int method9949(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class96.Interpreter_intStackSize -= 3;
			class1.queueSoundEffect(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				class96.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				WorldMapData_1.method6173(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				class96.Interpreter_intStackSize -= 2;
				HealthBarDefinition.method3942(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class93 var10;
				class92 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var4 = 0;
							class93 var19 = (class93)class177.findEnumerated(UserComparator7.method3289(), var3);
							if (var19 != null) {
								var4 = var19 != class93.field1133 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var4 = 0;
							class92 var13 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var3);
							if (var13 != null) {
								var4 = var13 != class92.field1124 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class96.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
								class167.method3766(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								class96.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								WorldMapData_1.method6173(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								class96.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
								WorldMapLabel.method6291(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class93.field1133;
							var11 = class92.field1124;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								var10 = (class93)class177.findEnumerated(UserComparator7.method3289(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								var11 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class92.field1124) {
								switch(var10.field1131) {
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

							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class93.field1133;
						var11 = class92.field1124;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var10 = (class93)class177.findEnumerated(UserComparator7.method3289(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var11 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var10 = (class93)class177.findEnumerated(UserComparator7.method3289(), var6);
							if (var10 == null) {
								var11 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class93.field1130;
						} else if (var0 == 3204) {
							var11 = class92.field1119;
						} else if (var0 == 3206) {
							var11 = class92.field1120;
						} else if (var0 == 3208) {
							var11 = class92.field1121;
						}

						if (var11 == class92.field1124) {
							switch(var10.field1131) {
							case 1:
								var5 = TaskHandler.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = TaskHandler.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = TaskHandler.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = TaskHandler.clientPreferences.method2928();
								break;
							case 5:
								var5 = HttpResponse.method296();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1122) {
							case 1:
								var5 = TaskHandler.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = TaskHandler.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = TaskHandler.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = TaskHandler.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class93.field1133;
					var11 = class92.field1124;
					var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var10 = (class93)class177.findEnumerated(UserComparator7.method3289(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var11 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var10 = (class93)class177.findEnumerated(UserComparator7.method3289(), var6);
						if (var10 == null) {
							var11 = (class92)class177.findEnumerated(SequenceDefinition.method4384(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class93.field1130;
					} else if (var0 == 3203) {
						var11 = class92.field1119;
					} else if (var0 == 3205) {
						var11 = class92.field1120;
					} else if (var0 == 3207) {
						var11 = class92.field1121;
					}

					if (var11 == class92.field1124) {
						switch(var10.field1131) {
						case 1:
							TaskHandler.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							TaskHandler.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							TaskHandler.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							TaskHandler.clientPreferences.method2830(var5);
							break;
						case 5:
							class168.method3772(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1122) {
						case 1:
							TaskHandler.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class437.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							PlayerComposition.method7003(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class182.method3869(var6);
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
