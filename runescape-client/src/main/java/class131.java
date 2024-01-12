import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
public class class131 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("am")
	boolean field1541;
	@ObfuscatedName("ap")
	boolean field1527;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1539;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1530;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	class126[] field1545;
	@ObfuscatedName("ar")
	boolean field1532;
	@ObfuscatedName("ag")
	float field1533;
	@ObfuscatedName("ao")
	float field1534;
	@ObfuscatedName("ae")
	float field1535;
	@ObfuscatedName("aa")
	float field1540;
	@ObfuscatedName("au")
	float field1546;
	@ObfuscatedName("an")
	float field1538;
	@ObfuscatedName("ad")
	float field1537;
	@ObfuscatedName("ax")
	float field1531;
	@ObfuscatedName("aw")
	float field1529;
	@ObfuscatedName("az")
	float field1542;
	@ObfuscatedName("av")
	boolean field1543;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1042030441
	)
	int field1544;
	@ObfuscatedName("ay")
	float[] field1528;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1017319781
	)
	int field1536;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 939425181
	)
	int field1547;
	@ObfuscatedName("ah")
	float field1548;
	@ObfuscatedName("ai")
	float field1549;

	class131() {
		this.field1543 = true;
		this.field1544 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)I",
		garbageValue = "1608855587"
	)
	int method3083(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class139 var5 = (class139)GrandExchangeEvents.findEnumerated(class169.method3551(), var4);
		if (var5 == null) {
			var5 = class139.field1615;
		}

		this.field1539 = SecureRandomSSLSocket.method169(var1.readUnsignedByte());
		this.field1530 = SecureRandomSSLSocket.method169(var1.readUnsignedByte());
		this.field1541 = var1.readUnsignedByte() != 0;
		this.field1545 = new class126[var3];
		class126 var8 = null;

		for (int var6 = 0; var6 < var3; ++var6) {
			class126 var7 = new class126();
			var7.method3009(var1, var2);
			this.field1545[var6] = var7;
			if (var8 != null) {
				var8.field1485 = var7;
			}

			var8 = var7;
		}

		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3085() {
		this.field1536 = this.field1545[0].field1483;
		this.field1547 = this.field1545[this.method3088() - 1].field1483;
		this.field1528 = new float[this.method3089() + 1];

		for (int var1 = this.method3111(); var1 <= this.method3112(); ++var1) {
			this.field1528[var1 - this.method3111()] = class155.method3423(this, (float)var1);
		}

		this.field1545 = null;
		this.field1548 = class155.method3423(this, (float)(this.method3111() - 1));
		this.field1549 = class155.method3423(this, (float)(this.method3112() + 1));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "763849285"
	)
	public float method3086(int var1) {
		if (var1 < this.method3111()) {
			return this.field1548;
		} else {
			return var1 > this.method3112() ? this.field1549 : this.field1528[var1 - this.method3111()];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "780354422"
	)
	int method3111() {
		return this.field1536;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "37011230"
	)
	int method3112() {
		return this.field1547;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1038677469"
	)
	int method3089() {
		return this.method3112() - this.method3111();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "-11"
	)
	int method3090(float var1) {
		if (this.field1544 < 0 || (float)this.field1545[this.field1544].field1483 > var1 || this.field1545[this.field1544].field1485 != null && (float)this.field1545[this.field1544].field1485.field1483 <= var1) {
			if (var1 >= (float)this.method3111() && var1 <= (float)this.method3112()) {
				int var2 = this.method3088();
				int var3 = this.field1544;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1545[var6].field1483) {
							if (var1 > (float)this.field1545[var6 - 1].field1483) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1545[var6].field1483) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1545[var6 + 1].field1483) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1544) {
					this.field1544 = var3;
					this.field1543 = true;
				}

				return this.field1544;
			} else {
				return -1;
			}
		} else {
			return this.field1544;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FB)Lei;",
		garbageValue = "-103"
	)
	class126 method3091(float var1) {
		int var2 = this.method3090(var1);
		return var2 >= 0 && var2 < this.field1545.length ? this.field1545[var2] : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2052429363"
	)
	int method3088() {
		return this.field1545 == null ? 0 : this.field1545.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1461307275"
	)
	static int method3092(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			var3 = class380.widgetDefinition.method6348(var4);
		} else {
			var3 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
		}

		int var16;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var16 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			int var14 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class344 var17 = var3.method6700();
				if (var17 != null && var17.method6426(var16, var14)) {
					FaceNormal.invalidateWidget(var3);
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

				FaceNormal.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			UserComparator6.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 5];
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var16 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			if (var16 != var3.sequenceId) {
				var3.sequenceId = var16;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				FaceNormal.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			FaceNormal.invalidateWidget(var3);
			return 1;
		} else {
			class344 var6;
			String var13;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class344 var20;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (var3.type == 12) {
						var20 = var3.method6700();
						if (var20 != null) {
							var20.method6433();
						}
					}

					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					UserComparator6.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var20 = var3.method6700();
						if (var20 != null) {
							var20.method6435(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
							var20.method6428(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
					}

					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					FaceNormal.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					Occluder.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FaceNormal.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var16 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					FillMode var18 = (FillMode)GrandExchangeEvents.findEnumerated(class171.FillMode_values(), var16);
					if (var18 != null) {
						var3.fillMode = var18;
						FaceNormal.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var5;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						var3.field3735 = var5;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var5;
						return 1;
					} else if (var0 == 1129) {
						var3.field3728 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
						FaceNormal.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6704(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], "", SecureUrlRequester.urlRequester, WorldMapSprite.getUserId());
						return 1;
					} else if (var0 == 1131) {
						UserComparator6.Interpreter_intStackSize -= 2;
						var3.method6742(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6709(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
						return 1;
					} else {
						class339 var21;
						if (var0 == 1133) {
							--UserComparator6.Interpreter_intStackSize;
							var21 = var3.method6729();
							if (var21 != null) {
								var21.field3623 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--UserComparator6.Interpreter_intStackSize;
							var21 = var3.method6729();
							if (var21 != null) {
								var21.field3619 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class211.Interpreter_stringStackSize;
							var20 = var3.method6700();
							if (var20 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--UserComparator6.Interpreter_intStackSize;
							var21 = var3.method6729();
							if (var21 != null) {
								var21.field3620 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null && var20.method6423(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) {
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null && var20.method6424(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) {
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null && var20.method6425(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) {
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							Client.field608.method4407();
							var6 = var3.method6700();
							if (var6 != null && var6.method6475(var5)) {
								if (var5) {
									Client.field608.method4391(var3);
								}

								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
							if (!var5 && Client.field608.method4392() == var3) {
								Client.field608.method4407();
								FaceNormal.invalidateWidget(var3);
							}

							var6 = var3.method6700();
							if (var6 != null) {
								var6.method6418(var5);
							}

							return 1;
						} else if (var0 == 1142) {
							UserComparator6.Interpreter_intStackSize -= 2;
							var20 = var3.method6700();
							if (var20 != null && var20.method6441(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1])) {
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null && var20.method6441(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) {
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null) {
								var20.method6446(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null) {
								var20.method6429(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null) {
								var20.method6432(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--UserComparator6.Interpreter_intStackSize;
							var20 = var3.method6700();
							if (var20 != null) {
								var20.method6431(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
								FaceNormal.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var19;
							if (var0 == 1148) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var19 = var3.method6724();
								if (var19 != null) {
									var19.method427(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var19 = var3.method6724();
								if (var19 != null) {
									var19.method393((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6768(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], SecureUrlRequester.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class211.Interpreter_stringStackSize -= 3;
								var13 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
								String var15 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 2];
								long var8 = WorldMapSprite.getUserId();
								long var10 = class226.getUserHash();
								String var12 = class72.getPlatformInfo().getDeviceId(class72.getPlatformInfo().os);
								if (-1L != var8) {
									var13 = var13.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var13 = var13.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var13 = var13.replaceAll("%deviceid%", var12);
								}

								var3.method6705(var13, var15, var7, var12, Long.toString(var10), SecureUrlRequester.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type == 11) {
									var5 = KitDefinition.method3664().method4308(var3.method6718().method4154());
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
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
				var13 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var6 = var3.method6700();
					if (var6 != null && var6.method6472()) {
						var6.method6639(var13);
					} else {
						var3.text = var13;
					}

					FaceNormal.invalidateWidget(var3);
				} else if (!var13.equals(var3.text)) {
					var3.text = var13;
					FaceNormal.invalidateWidget(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field608.method4407();
			}

			if (Client.gameState == 0) {
				VertexNormal.client.method557();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				UrlRequest.updateLoginState(0);
				Client.field533 = 0;
				Client.field534 = 0;
				Client.timer.method8041(var0);
				if (var0 != 20) {
					ParamComposition.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && PlayerType.field4298 != null) {
				PlayerType.field4298.close();
				PlayerType.field4298 = null;
			}

			if (Client.gameState == 25) {
				Client.field568 = 0;
				Client.field566 = 0;
				Client.field567 = 1;
				Client.field555 = 0;
				Client.field569 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					AuthenticationScheme.method3004(class189.archive10, HttpRequestTask.archive8, false, var1);
				} else if (var0 == 11) {
					AuthenticationScheme.method3004(class189.archive10, HttpRequestTask.archive8, false, 4);
				} else if (var0 == 50) {
					class142.setLoginResponseString("", "Updating date of birth...", "");
					AuthenticationScheme.method3004(class189.archive10, HttpRequestTask.archive8, false, 7);
				} else {
					class47.method913();
				}
			} else {
				var1 = GrandExchangeOfferUnitPriceComparator.method7241() ? 0 : 12;
				AuthenticationScheme.method3004(class189.archive10, HttpRequestTask.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1788330842"
	)
	static final void method3113() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
					String var2 = Client.menuTargets[var1];
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
					Client.menuTargets[var1 + 1] = var2;
					String var3 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var3;
					int var4 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var4;
					var4 = Client.menuArguments1[var1];
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
					Client.menuArguments1[var1 + 1] = var4;
					var4 = Client.menuArguments2[var1];
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
					Client.menuArguments2[var1 + 1] = var4;
					var4 = Client.menuIdentifiers[var1];
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
					Client.menuIdentifiers[var1 + 1] = var4;
					var4 = Client.menuItemIds[var1];
					Client.menuItemIds[var1] = Client.menuItemIds[var1 + 1];
					Client.menuItemIds[var1 + 1] = var4;
					boolean var5 = Client.menuShiftClick[var1];
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					Client.menuShiftClick[var1 + 1] = var5;
					var0 = false;
				}
			}
		}

	}
}
