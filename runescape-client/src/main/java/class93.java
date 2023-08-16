import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dw")
public class class93 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "36436435"
	)
	static int method2358(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			var3 = class92.getWidget(var4);
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			SoundCache.Interpreter_intStackSize -= 2;
			var13 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			int var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class329 var7 = var3.method6532();
				if (var7 != null && var7.method6115(var13, var9)) {
					class218.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var13;
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

				class218.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			SoundCache.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 5];
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			if (var13 != var3.sequenceId) {
				var3.sequenceId = var13;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class218.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			class218.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			if (!var14.equals(var3.text)) {
				var3.text = var14;
				class218.invalidateWidget(var3);
			}

			return 1;
		} else {
			class329 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var3.type == 12) {
					var10 = var3.method6532();
					if (var10 != null) {
						var10.method6122();
					}
				}

				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				SoundCache.Interpreter_intStackSize -= 3;
				if (var3.type == 12) {
					var10 = var3.method6532();
					if (var10 != null) {
						var10.method6267(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
						var10.method6117(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]);
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
					var3.textYAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
					var3.textLineHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				}

				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				SoundCache.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				class218.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class466.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class218.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				FillMode var11 = (FillMode)KeyHandler.findEnumerated(MidiPcmStream.FillMode_values(), var13);
				if (var11 != null) {
					var3.fillMode = var11;
					class218.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
					var3.field3680 = var8;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var8;
					return 1;
				} else if (var0 == 1129) {
					var3.field3683 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
					class218.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method6491(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], FriendsChat.urlRequester, UrlRequester.getUserId());
					return 1;
				} else if (var0 == 1131) {
					SoundCache.Interpreter_intStackSize -= 2;
					var3.method6443(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method6403(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
					return 1;
				} else {
					class324 var12;
					if (var0 == 1133) {
						--SoundCache.Interpreter_intStackSize;
						var12 = var3.method6416();
						if (var12 != null) {
							var12.field3547 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							class218.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1134) {
						--SoundCache.Interpreter_intStackSize;
						var12 = var3.method6416();
						if (var12 != null) {
							var12.field3548 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							class218.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1135) {
						--class137.Interpreter_stringStackSize;
						var10 = var3.method6532();
						if (var10 != null) {
							var3.text2 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
						}

						return 1;
					} else if (var0 == 1136) {
						--SoundCache.Interpreter_intStackSize;
						var12 = var3.method6416();
						if (var12 != null) {
							var12.field3549 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							class218.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1137) {
						--SoundCache.Interpreter_intStackSize;
						var10 = var3.method6532();
						if (var10 != null && var10.method6112(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) {
							class218.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1138) {
						--SoundCache.Interpreter_intStackSize;
						var10 = var3.method6532();
						if (var10 != null && var10.method6113(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) {
							class218.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1139) {
						--SoundCache.Interpreter_intStackSize;
						var10 = var3.method6532();
						if (var10 != null && var10.method6322(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) {
							class218.invalidateWidget(var3);
						}

						return 1;
					} else {
						class329 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
							Client.field765.method4092();
							var6 = var3.method6532();
							if (var6 != null && var6.method6106(var8)) {
								if (var8) {
									Client.field765.method4093(var3);
								}

								class218.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
							if (!var8 && Client.field765.method4075() == var3) {
								Client.field765.method4092();
								class218.invalidateWidget(var3);
							}

							var6 = var3.method6532();
							if (var6 != null) {
								var6.method6143(var8);
							}

							return 1;
						} else if (var0 == 1142) {
							SoundCache.Interpreter_intStackSize -= 2;
							var10 = var3.method6532();
							if (var10 != null && var10.method6130(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1])) {
								class218.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--SoundCache.Interpreter_intStackSize;
							var10 = var3.method6532();
							if (var10 != null && var10.method6130(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) {
								class218.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--SoundCache.Interpreter_intStackSize;
							var10 = var3.method6532();
							if (var10 != null) {
								var10.method6378(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
								class218.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--SoundCache.Interpreter_intStackSize;
							var10 = var3.method6532();
							if (var10 != null) {
								var10.method6118(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--SoundCache.Interpreter_intStackSize;
							var10 = var3.method6532();
							if (var10 != null) {
								var10.method6201(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--SoundCache.Interpreter_intStackSize;
							var10 = var3.method6532();
							if (var10 != null) {
								var10.method6376(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
								class218.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var5;
							if (var0 == 1148) {
								SoundCache.Interpreter_intStackSize -= 2;
								var5 = var3.method6401();
								if (var5 != null) {
									var5.method394(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								SoundCache.Interpreter_intStackSize -= 2;
								var5 = var3.method6401();
								if (var5 != null) {
									var5.method419((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6467(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], FriendsChat.urlRequester);
								return 1;
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
