import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class152 extends class160 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1505334263
	)
	int field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class152(class161 var1) {
		this.this$0 = var1;
		this.field1722 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1722 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		var1.removeMember(this.field1722);
	}

	@ObfuscatedName("az")
	public static int method3210(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(256.0D * var3);
		int var10 = (int)(256.0D * var5);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("an")
	public static boolean method3219(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1618550265"
	)
	static int method3220(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			HttpRequestTask.Interpreter_intStackSize -= 3;
			class151.queueSoundEffect(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				HttpRequestTask.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				FriendSystem.method1892(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				class137.method3080(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class91 var10;
				class90 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							var4 = 0;
							class91 var19 = (class91)KitDefinition.findEnumerated(class47.method849(), var3);
							if (var19 != null) {
								var4 = var19 != class91.field1120 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							var4 = 0;
							class90 var13 = (class90)KitDefinition.findEnumerated(class165.method3400(), var3);
							if (var13 != null) {
								var4 = var13 != class90.field1107 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
								class11.method108(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								HttpRequestTask.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								FriendSystem.method1892(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								HttpRequestTask.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
								WorldMapElement.method3742(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class91.field1120;
							var11 = class90.field1107;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
								var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
								var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class90.field1107) {
								switch(var10.field1111) {
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
								switch(var11.field1103) {
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

							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class91.field1120;
						var11 = class90.field1107;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6);
							if (var10 == null) {
								var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class91.field1114;
						} else if (var0 == 3204) {
							var11 = class90.field1100;
						} else if (var0 == 3206) {
							var11 = class90.field1101;
						} else if (var0 == 3208) {
							var11 = class90.field1098;
						}

						if (var11 == class90.field1107) {
							switch(var10.field1111) {
							case 1:
								var5 = NPC.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = NPC.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = NPC.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = NPC.clientPreferences.method2549();
								break;
							case 5:
								var5 = class171.method3467();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1103) {
							case 1:
								var5 = NPC.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = NPC.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = NPC.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = NPC.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class91.field1120;
					var11 = class90.field1107;
					var5 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var10 = (class91)KitDefinition.findEnumerated(class47.method849(), var6);
						if (var10 == null) {
							var11 = (class90)KitDefinition.findEnumerated(class165.method3400(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class91.field1114;
					} else if (var0 == 3203) {
						var11 = class90.field1100;
					} else if (var0 == 3205) {
						var11 = class90.field1101;
					} else if (var0 == 3207) {
						var11 = class90.field1098;
					}

					if (var11 == class90.field1107) {
						switch(var10.field1111) {
						case 1:
							NPC.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							NPC.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							NPC.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							NPC.clientPreferences.method2558(var5);
							break;
						case 5:
							class185.method3681(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1103) {
						case 1:
							NPC.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							InvDefinition.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class522.method9128(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							ObjectSound.method1921(var6);
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

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-472926015"
	)
	static void method3221() {
		if (Client.field609 && class133.localPlayer != null) {
			int var0 = class133.localPlayer.pathX[0];
			int var1 = class133.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			class185.oculusOrbFocalPointX = class133.localPlayer.x;
			int var2 = Canvas.getTileHeight(class133.localPlayer.x, class133.localPlayer.y, class172.Client_plane) - Client.camFollowHeight;
			if (var2 < FloorUnderlayDefinition.field2198) {
				FloorUnderlayDefinition.field2198 = var2;
			}

			Skeleton.oculusOrbFocalPointY = class133.localPlayer.y;
			Client.field609 = false;
		}

	}
}
