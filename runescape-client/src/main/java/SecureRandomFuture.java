import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 1604871073
	)
	static int field990;
	@ObfuscatedName("aw")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ay")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "527623643"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "62920637"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1723376644"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return WorldMapSection2.method5134();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "49"
	)
	static int method2151(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = VarbitComposition.getWidget(var4);
		} else {
			var3 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class330 var7 = var3.method6504();
				if (var7 != null && var7.method6208(var13, var9)) {
					class200.invalidateWidget(var3);
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

				class200.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var13 != var3.sequenceId) {
				var3.sequenceId = var13;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class200.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class200.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			if (!var14.equals(var3.text)) {
				var3.text = var14;
				class200.invalidateWidget(var3);
			}

			return 1;
		} else {
			class330 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.type == 12) {
					var10 = var3.method6504();
					if (var10 != null) {
						var10.method6176();
					}
				}

				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3;
				if (var3.type == 12) {
					var10 = var3.method6504();
					if (var10 != null) {
						var10.method6170(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						var10.method6310(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				}

				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				class200.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				WorldMapArea.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				FillMode var11 = (FillMode) ClientPreferences.findEnumerated(ItemLayer.FillMode_values(), var13);
				if (var11 != null) {
					var3.fillMode = var11;
					class200.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					var3.field3725 = var8;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var8;
					return 1;
				} else if (var0 == 1129) {
					var3.field3660 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class200.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method6518(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], WorldMapLabel.urlRequester, PendingSpawn.method2375());
					return 1;
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.method6456(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method6457(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					return 1;
				} else {
					class325 var12;
					if (var0 == 1133) {
						--Interpreter.Interpreter_intStackSize;
						var12 = var3.method6469();
						if (var12 != null) {
							var12.field3539 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							class200.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1134) {
						--Interpreter.Interpreter_intStackSize;
						var12 = var3.method6469();
						if (var12 != null) {
							var12.field3540 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							class200.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1135) {
						--Interpreter.Interpreter_stringStackSize;
						var10 = var3.method6504();
						if (var10 != null) {
							var3.text2 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						}

						return 1;
					} else if (var0 == 1136) {
						--Interpreter.Interpreter_intStackSize;
						var12 = var3.method6469();
						if (var12 != null) {
							var12.field3541 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							class200.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1137) {
						--Interpreter.Interpreter_intStackSize;
						var10 = var3.method6504();
						if (var10 != null && var10.method6331(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
							class200.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1138) {
						--Interpreter.Interpreter_intStackSize;
						var10 = var3.method6504();
						if (var10 != null && var10.method6167(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
							class200.invalidateWidget(var3);
						}

						return 1;
					} else if (var0 == 1139) {
						--Interpreter.Interpreter_intStackSize;
						var10 = var3.method6504();
						if (var10 != null && var10.method6168(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
							class200.invalidateWidget(var3);
						}

						return 1;
					} else {
						class330 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field612.method4119();
							var6 = var3.method6504();
							if (var6 != null && var6.method6160(var8)) {
								if (var8) {
									Client.field612.method4126(var3);
								}

								class200.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var8 && Client.field612.method4118() == var3) {
								Client.field612.method4119();
								class200.invalidateWidget(var3);
							}

							var6 = var3.method6504();
							if (var6 != null) {
								var6.method6161(var8);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = var3.method6504();
							if (var10 != null && var10.method6184(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								class200.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var10 = var3.method6504();
							if (var10 != null && var10.method6184(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								class200.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var10 = var3.method6504();
							if (var10 != null) {
								var10.method6173(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								class200.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var10 = var3.method6504();
							if (var10 != null) {
								var10.method6350(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var10 = var3.method6504();
							if (var10 != null) {
								var10.method6175(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var10 = var3.method6504();
							if (var10 != null) {
								var10.method6277(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								class200.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var5;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var5 = var3.method6463();
								if (var5 != null) {
									var5.method389(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var5 = var3.method6463();
								if (var5 != null) {
									var5.method390((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6454(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], WorldMapLabel.urlRequester);
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
