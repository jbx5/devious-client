import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hr")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1608387249
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -15852369
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1337199371
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1272806225
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1369949511
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "9"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;III)V",
		garbageValue = "663810639"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "642049246"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-6"
	)
	public static long method3815(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "16"
	)
	static int method3816(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			Interpreter.Interpreter_intStackSize -= 3;
			class134.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
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
				class136.method3141(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				Interpreter.Interpreter_intStackSize -= 2;
				class7.method39(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class91 var19 = (class91)class356.findEnumerated(Friend.method8300(), var3);
							if (var19 != null) {
								var4 = var19 != class91.field1130 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class90 var13 = (class90)class356.findEnumerated(class207.method4106(), var3);
							if (var13 != null) {
								var4 = var13 != class90.field1116 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								class169.method3521(var3, var4);
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
								class136.method3141(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								Interpreter.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
								class75.method2121(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class91.field1130;
							var11 = class90.field1116;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var10 = (class91)class356.findEnumerated(Friend.method8300(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var11 = (class90)class356.findEnumerated(class207.method4106(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class90.field1116) {
								switch(var10.field1129) {
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
								switch(var11.field1120) {
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
						var10 = class91.field1130;
						var11 = class90.field1116;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class91)class356.findEnumerated(Friend.method8300(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var11 = (class90)class356.findEnumerated(class207.method4106(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var10 = (class91)class356.findEnumerated(Friend.method8300(), var6);
							if (var10 == null) {
								var11 = (class90)class356.findEnumerated(class207.method4106(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class91.field1128;
						} else if (var0 == 3204) {
							var11 = class90.field1122;
						} else if (var0 == 3206) {
							var11 = class90.field1117;
						} else if (var0 == 3208) {
							var11 = class90.field1118;
						}

						if (var11 == class90.field1116) {
							switch(var10.field1129) {
							case 1:
								var5 = class30.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class30.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class30.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class30.clientPreferences.method2526();
								break;
							case 5:
								var5 = Frames.method5635();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1120) {
							case 1:
								var5 = class30.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class30.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class30.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class30.clientPreferences.getAreaSoundEffectsVolume();
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
					var10 = class91.field1130;
					var11 = class90.field1116;
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class91)class356.findEnumerated(Friend.method8300(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (class90)class356.findEnumerated(class207.method4106(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var10 = (class91)class356.findEnumerated(Friend.method8300(), var6);
						if (var10 == null) {
							var11 = (class90)class356.findEnumerated(class207.method4106(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class91.field1128;
					} else if (var0 == 3203) {
						var11 = class90.field1122;
					} else if (var0 == 3205) {
						var11 = class90.field1117;
					} else if (var0 == 3207) {
						var11 = class90.field1118;
					}

					if (var11 == class90.field1116) {
						switch(var10.field1129) {
						case 1:
							class30.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class30.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class30.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class30.clientPreferences.method2564(var5);
							break;
						case 5:
							class182.method3660(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1120) {
						case 1:
							class30.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							SpriteMask.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							SoundCache.method831(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class222.method4344(var6);
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
