import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nm")
public class class357 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final class357 field3895;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final class357 field3897;
	@ObfuscatedName("bh")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 346159071
	)
	final int field3894;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1315455049
	)
	final int field3893;

	static {
		field3895 = new class357(51, 27, 800, 0, 16, 16);
		field3897 = new class357(25, 28, 800, 656, 40, 40);
	}

	class357(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3894 = var5;
		this.field3893 = var6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1617415071"
	)
	static int method6861(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			var3 = HealthBarDefinition.widgetDefinition.method6285(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
		}

		int var14;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			DbTableType.Interpreter_intStackSize -= 2;
			var14 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			int var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class341 var7 = var3.method6688();
				if (var7 != null && var7.method6370(var14, var9)) {
					class159.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var14;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var9;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class159.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			DbTableType.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 5];
			class159.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var14 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			if (var14 != var3.sequenceId) {
				var3.sequenceId = var14;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class159.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			class159.invalidateWidget(var3);
			return 1;
		} else {
			class341 var6;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class341 var11;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					if (var3.type == 12) {
						var11 = var3.method6688();
						if (var11 != null) {
							var11.method6386();
						}
					}

					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					DbTableType.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var11 = var3.method6688();
						if (var11 != null) {
							var11.method6371(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
							var11.method6372(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
					}

					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					class159.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class10.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					class159.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var14 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					FillMode var12 = (FillMode)class12.findEnumerated(WallDecoration.FillMode_values(), var14);
					if (var12 != null) {
						var3.fillMode = var12;
						class159.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var8;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var8 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						var3.field3693 = var8;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var8 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var8;
						return 1;
					} else if (var0 == 1129) {
						var3.field3696 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
						class159.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6672(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], class60.urlRequester, ModelData0.getUserId());
						return 1;
					} else if (var0 == 1131) {
						DbTableType.Interpreter_intStackSize -= 2;
						var3.method6695(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6781(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
						return 1;
					} else {
						class336 var13;
						if (var0 == 1133) {
							--DbTableType.Interpreter_intStackSize;
							var13 = var3.method6724();
							if (var13 != null) {
								var13.field3580 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--DbTableType.Interpreter_intStackSize;
							var13 = var3.method6724();
							if (var13 != null) {
								var13.field3578 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class127.Interpreter_stringStackSize;
							var11 = var3.method6688();
							if (var11 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--DbTableType.Interpreter_intStackSize;
							var13 = var3.method6724();
							if (var13 != null) {
								var13.field3579 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null && var11.method6367(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize])) {
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null && var11.method6553(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize])) {
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null && var11.method6369(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize])) {
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							Client.field725.method4281();
							var6 = var3.method6688();
							if (var6 != null && var6.method6361(var8)) {
								if (var8) {
									Client.field725.method4279(var3);
								}

								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
							if (!var8 && Client.field725.method4303() == var3) {
								Client.field725.method4281();
								class159.invalidateWidget(var3);
							}

							var6 = var3.method6688();
							if (var6 != null) {
								var6.method6614(var8);
							}

							return 1;
						} else if (var0 == 1142) {
							DbTableType.Interpreter_intStackSize -= 2;
							var11 = var3.method6688();
							if (var11 != null && var11.method6385(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1])) {
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null && var11.method6385(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize])) {
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null) {
								var11.method6413(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize]);
								class159.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null) {
								var11.method6373(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null) {
								var11.method6376(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--DbTableType.Interpreter_intStackSize;
							var11 = var3.method6688();
							if (var11 != null) {
								var11.method6375(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize]);
								class159.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var10;
							if (var0 == 1148) {
								DbTableType.Interpreter_intStackSize -= 2;
								var10 = var3.method6690();
								if (var10 != null) {
									var10.method404(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								DbTableType.Interpreter_intStackSize -= 2;
								var10 = var3.method6690();
								if (var10 != null) {
									var10.method406((char)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize], Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6673(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], class60.urlRequester);
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			} else {
				String var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var6 = var3.method6688();
					if (var6 != null && var6.method6394()) {
						var6.method6363(var5);
					} else {
						var3.text = var5;
					}

					class159.invalidateWidget(var3);
				} else if (!var5.equals(var3.text)) {
					var3.text = var5;
					class159.invalidateWidget(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Loh;Ljava/lang/String;I)V",
		garbageValue = "-587575754"
	)
	static void method6862(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field645 += var2.groupCount;
	}
}
