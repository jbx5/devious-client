import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rn")
public class class451 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-1128519427"
	)
	static int method8398(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(var4);
		} else {
			var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class358 var17 = var3.method6971();
				if (var17 != null && var17.method6880(var23, var16)) {
					class416.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class416.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			class416.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class416.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class416.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class358 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method6971();
					if (var21 != null && var21.method6843()) {
						var21.method6642(var15);
					} else {
						var3.text = var15;
					}

					class416.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					class416.invalidateWidget(var3);
				}

				return 1;
			} else {
				class358 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method6971();
						if (var19 != null) {
							var19.method6656();
						}
					}

					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method6971();
						if (var19 != null) {
							var19.method6650(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
							var19.method6798(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					}

					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					class416.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class165.revalidateWidgetScroll(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					SecureRandomCallable.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class416.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					FillMode var22 = (FillMode)class134.findEnumerated(class165.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						class416.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.field3837 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3954 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
						class416.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7020(Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize], "", Canvas.urlRequester, FontName.getUserId());
						return 1;
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3.method6975(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7034(Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						return 1;
					} else {
						class352 var20;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6972();
							if (var20 != null) {
								var20.field3721 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6972();
							if (var20 != null) {
								var20.field3720 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class230.Interpreter_stringStackSize;
							var19 = var3.method6971();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class230.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6972();
							if (var20 != null) {
								var20.field3722 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null && var19.method6646(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null && var19.method6647(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null && var19.method6648(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field735.method5345();
							var21 = var3.method6971();
							if (var21 != null && var21.method6640(var14)) {
								if (var14) {
									Client.field735.method5318(var3);
								}

								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field735.method5327() == var3) {
								Client.field735.method5345();
								class416.invalidateWidget(var3);
							}

							var21 = var3.method6971();
							if (var21 != null) {
								var21.method6652(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var19 = var3.method6971();
							if (var19 != null && var19.method6664(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null && var19.method6664(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null) {
								var19.method6653(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								class416.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null) {
								var19.method6723(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null) {
								var19.method6655(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method6971();
							if (var19 != null) {
								var19.method6886(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								class416.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var18 = var3.method6973();
								if (var18 != null) {
									var18.method362(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var18 = var3.method6973();
								if (var18 != null) {
									var18.method363((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7000(Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize], Canvas.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class230.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class230.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class230.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class230.Interpreter_stringStackSize + 2];
								long var8 = FontName.getUserId();
								long var10 = BufferedSource.getUserHash();
								String var12 = KitDefinition.getPlatformInfo().getDeviceId(KitDefinition.getPlatformInfo().os);
								if (var8 != -1L) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7047(var15, var13, var7, var12, Long.toString(var10), Canvas.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class210 var5 = var3.method7043();
									boolean var6 = var5 != null && var5.method4513() && AsyncHttpResponse.method265().method4628(var5.method4521());
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}
}
