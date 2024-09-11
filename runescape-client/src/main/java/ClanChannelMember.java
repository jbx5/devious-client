import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fy")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ac")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1520253821
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "585324631"
	)
	static void method3493(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * 128) {
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 128) {
					var5 += var2 - var4.maxY * 128;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				var5 = Math.max(var5 - 64, 0);
				if (var5 < var4.field857 && class461.clientPreferences.getAreaSoundEffectsVolume() != 0 && var0 == var4.plane) {
					float var6 = var4.field864 < var4.field857 ? Math.min(Math.max((float)(var4.field857 - var5) / (float)(var4.field857 - var4.field864), 0.0F), 1.0F) : 1.0F;
					int var7 = (int)(var6 * (float)class461.clientPreferences.getAreaSoundEffectsVolume());
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var8 = SoundEffect.readSoundEffect(class60.soundEffectsArchive, var4.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(DevicePcmPlayerProvider.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								GameEngine.pcmStreamMixer.addSubStream(var10);
								var4.stream1 = var10;
							}
						}
					} else {
						var4.stream1.method905(var7);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field860 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var13 = SoundEffect.readSoundEffect(class60.soundEffectsArchive, var4.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(DevicePcmPlayerProvider.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								GameEngine.pcmStreamMixer.addSubStream(var11);
								var4.stream2 = var11;
								var4.field860 = var4.field861 + (int)(Math.random() * (double)(var4.field862 - var4.field861));
							}
						}
					} else {
						var4.stream2.method905(var7);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						GameEngine.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						GameEngine.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1927259741"
	)
	static int method3494(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class465.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class320.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var4.parent = TaskHandler.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field3898 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class320.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field3898 != null) {
					var4.field3898[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7365(var6, var11, Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field3968 = 4;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field3968 = var11 - 1;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class320.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]};
						Tiles.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class320.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class92.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						class92.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class320.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							WorldView.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						WorldView.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class320.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class320.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class320.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class320.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class320.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						Tiles.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
