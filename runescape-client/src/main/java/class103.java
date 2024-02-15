import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dr")
public class class103 {
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -270514001
	)
	static int field1354;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 904918569
	)
	int field1352;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -166196487
	)
	int field1351;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -745370045
	)
	int field1356;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -392550043
	)
	int field1353;

	class103(int var1, int var2, int var3, int var4) {
		this.field1352 = var1;
		this.field1351 = var2;
		this.field1356 = var3;
		this.field1353 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1608707945"
	)
	int method2733() {
		return this.field1352;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-28872"
	)
	int method2748() {
		return this.field1351;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2734() {
		return this.field1356;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	int method2735() {
		return this.field1353;
	}

	@ObfuscatedName("aq")
	public static final int method2747(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25817"
	)
	public static void method2737() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1244805083"
	)
	static int method2749(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = ArchiveLoader.widgetDefinition.method6431(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		}

		int var16;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class347 var17 = var3.method6806();
				if (var17 != null && var17.method6516(var16, var14)) {
					UserComparator5.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var16;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var14;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				UserComparator5.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var16 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var16 != var3.sequenceId) {
				var3.sequenceId = var16;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				UserComparator5.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else {
			class347 var6;
			String var13;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class347 var20;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3.type == 12) {
						var20 = var3.method6806();
						if (var20 != null) {
							var20.method6742();
						}
					}

					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var20 = var3.method6806();
						if (var20 != null) {
							var20.method6517(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
							var20.method6554(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					}

					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					UserComparator5.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class192.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var16 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					FillMode var18 = (FillMode)class356.findEnumerated(ArchiveDiskAction.FillMode_values(), var16);
					if (var18 != null) {
						var3.fillMode = var18;
						UserComparator5.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var5;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.field3759 = var5;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var5;
						return 1;
					} else if (var0 == 1129) {
						var3.field3762 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
						UserComparator5.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6874(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], "", InvDefinition.urlRequester, AttackOption.getUserId());
						return 1;
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3.method6809(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6810(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						return 1;
					} else {
						class341 var21;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method6823();
							if (var21 != null) {
								var21.field3643 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method6823();
							if (var21 != null) {
								var21.field3639 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class60.Interpreter_stringStackSize;
							var20 = var3.method6806();
							if (var20 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method6823();
							if (var21 != null) {
								var21.field3640 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null && var20.method6519(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null && var20.method6577(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null && var20.method6772(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field737.method4394();
							var6 = var3.method6806();
							if (var6 != null && var6.method6722(var5)) {
								if (var5) {
									Client.field737.method4402(var3);
								}

								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var5 && Client.field737.method4393() == var3) {
								Client.field737.method4394();
								UserComparator5.invalidateWidget(var3);
							}

							var6 = var3.method6806();
							if (var6 != null) {
								var6.method6508(var5);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var20 = var3.method6806();
							if (var20 != null && var20.method6530(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null && var20.method6530(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null) {
								var20.method6520(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null) {
								var20.method6639(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null) {
								var20.method6651(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method6806();
							if (var20 != null) {
								var20.method6521(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var19;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var19 = var3.method6825();
								if (var19 != null) {
									var19.method359(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var19 = var3.method6825();
								if (var19 != null) {
									var19.method360((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6807(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], InvDefinition.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class60.Interpreter_stringStackSize -= 3;
								var13 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
								String var15 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2];
								long var8 = AttackOption.getUserId();
								long var10 = class159.getUserHash();
								String var12 = SongTask.getPlatformInfo().getDeviceId(SongTask.getPlatformInfo().os);
								if (var8 != -1L) {
									var13 = var13.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var13 = var13.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var13 = var13.replaceAll("%deviceid%", var12);
								}

								var3.method6788(var13, var15, var7, var12, Long.toString(var10), InvDefinition.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type == 11) {
									var5 = VarbitComposition.method3830().method4274(var3.method6819().method4141());
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
								} else {
									System.out.println("Attempting to call function on a non-CRMView object.");
								}

								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			} else {
				var13 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var6 = var3.method6806();
					if (var6 != null && var6.method6562()) {
						var6.method6551(var13);
					} else {
						var3.text = var13;
					}

					UserComparator5.invalidateWidget(var3);
				} else if (!var13.equals(var3.text)) {
					var3.text = var13;
					UserComparator5.invalidateWidget(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2069548538"
	)
	static final void method2750(int var0, int var1, boolean var2) {
		if (!var2 || var0 != JagNetThread.field4434 || class317.field3456 != var1) {
			JagNetThread.field4434 = var0;
			class317.field3456 = var1;
			Interpreter.updateGameState(25);
			RouteStrategy.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Projectile.baseX * 64;
			int var4 = GameEngine.baseY * 64;
			Projectile.baseX = (var0 - 6) * 8;
			GameEngine.baseY = (var1 - 6) * 8;
			int var5 = Projectile.baseX * 64 - var3;
			int var6 = GameEngine.baseY * 64 - var4;
			var3 = Projectile.baseX * 64;
			var4 = GameEngine.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			ClanMate.cameraX -= var5 << 7;
			class317.cameraZ -= var6 << 7;
			Friend.oculusOrbFocalPointX -= var5 << 7;
			class59.oculusOrbFocalPointY -= var6 << 7;
			Client.field772 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
