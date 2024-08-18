import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kb")
public class class271 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	static void method5434(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-1608806013"
	)
	static int method5432(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			Interpreter.Interpreter_intStackSize -= 3;
			ArchiveDisk.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
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
				class169.method3599(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				Interpreter.Interpreter_intStackSize -= 2;
				class87.method2398(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class92 var19 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var3);
							if (var19 != null) {
								var4 = var19 != class92.field1105 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class91 var13 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var3);
							if (var13 != null) {
								var4 = var13 != class91.field1097 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								class92.method2440(var3, var4);
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
								class169.method3599(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								Interpreter.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
								WorldMapEvent.method6097(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class92.field1105;
							var11 = class91.field1097;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var10 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var11 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1097) {
								switch(var10.field1106) {
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
								switch(var11.field1092) {
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
						var10 = class92.field1105;
						var11 = class91.field1097;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var11 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var6);
							if (var10 == null) {
								var11 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class92.field1103;
						} else if (var0 == 3204) {
							var11 = class91.field1086;
						} else if (var0 == 3206) {
							var11 = class91.field1087;
						} else if (var0 == 3208) {
							var11 = class91.field1088;
						}

						if (var11 == class91.field1097) {
							switch(var10.field1106) {
							case 1:
								var5 = TileItem.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = TileItem.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = TileItem.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = TileItem.clientPreferences.method2719();
								break;
							case 5:
								var5 = class138.method3250();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1092) {
							case 1:
								var5 = TileItem.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = TileItem.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = TileItem.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = TileItem.clientPreferences.getAreaSoundEffectsVolume();
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
					var10 = class92.field1105;
					var11 = class91.field1097;
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class92)class134.findEnumerated(HttpQueryParams.method8925(), var6);
						if (var10 == null) {
							var11 = (class91)class134.findEnumerated(WorldMapSection2.method5560(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class92.field1103;
					} else if (var0 == 3203) {
						var11 = class91.field1086;
					} else if (var0 == 3205) {
						var11 = class91.field1087;
					} else if (var0 == 3207) {
						var11 = class91.field1088;
					}

					if (var11 == class91.field1097) {
						switch(var10.field1106) {
						case 1:
							TileItem.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							TileItem.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							TileItem.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							TileItem.clientPreferences.method2619(var5);
							break;
						case 5:
							HttpHeaders.method8477(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1092) {
						case 1:
							TileItem.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class195.method4206(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class544.method9543(var6);
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

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "75"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != TileItem.clientPreferences.getMusicVolume()) {
			label27: {
				if (TileItem.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class332.field3565.isEmpty();
					if (var1) {
						UserComparator8.method3052(class33.archive6, var0);
						Client.playingJingle = false;
						break label27;
					}
				}

				if (var0 == 0) {
					class92.method2440(0, 0);
					Client.playingJingle = false;
				} else {
					NpcOverrides.method4910(var0);
				}
			}

			TileItem.clientPreferences.updateMusicVolume(var0);
		}

	}
}
