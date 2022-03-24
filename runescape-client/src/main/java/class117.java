



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class117 {
	@ObfuscatedName("v")
	boolean field1434;
	@ObfuscatedName("o")
	boolean field1427;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Ldy;")

	class116 field1428;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Ldy;")

	class116 field1429;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"[Ldh;")

	class113[] field1430;
	@ObfuscatedName("n")
	boolean field1438;
	@ObfuscatedName("d")
	float field1432;
	@ObfuscatedName("f")
	float field1433;
	@ObfuscatedName("u")
	float[] field1440;
	@ObfuscatedName("r")
	float[] field1435;
	@ObfuscatedName("k")
	boolean field1442;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	111409657)

	int field1436;
	@ObfuscatedName("c")
	float[] field1439;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	1432271977)

	int field1426;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	1400069259)

	int field1431;
	@ObfuscatedName("s")
	float field1441;
	@ObfuscatedName("b")
	float field1437;

	class117() {
		this.field1440 = new float[4];
		this.field1435 = new float[4];
		this.field1442 = true;
		this.field1436 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;IB)I", garbageValue = 
	"20")

	int method2722(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class123 var5 = ((class123) (ChatChannel.findEnumerated(DevicePcmPlayerProvider.method383(), var4)));
		if (var5 == null) {
			var5 = class123.field1501;
		}

		this.field1428 = class327.method6109(var1.readUnsignedByte());
		this.field1429 = class327.method6109(var1.readUnsignedByte());
		this.field1434 = var1.readUnsignedByte() != 0;
		this.field1430 = new class113[var3];
		class113 var8 = null;

		int var6;
		for (var6 = 0; var6 < var3; ++var6) {
			class113 var7 = new class113();
			var7.method2632(var1, var2);
			this.field1430[var6] = var7;
			if (var8 != null) {
				var8.field1392 = var7;
			}

			var8 = var7;
		}

		this.field1426 = this.field1430[0].field1384;
		this.field1431 = this.field1430[this.method2706() - 1].field1384;
		this.field1439 = new float[this.method2703() + 1];

		for (var6 = this.method2699(); var6 <= this.method2702(); ++var6) {
			this.field1439[var6 - this.method2699()] = AttackOption.method2392(this, ((float) (var6)));
		}

		this.field1430 = null;
		this.field1441 = AttackOption.method2392(this, ((float) (this.method2699() - 1)));
		this.field1437 = AttackOption.method2392(this, ((float) (this.method2702() + 1)));
		return var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)F", garbageValue = 
	"296880524")

	public float method2700(int var1) {
		if (var1 < this.method2699()) {
			return this.field1441;
		} else {
			return var1 > this.method2702() ? this.field1437 : this.field1439[var1 - this.method2699()];
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1807012578")

	int method2699() {
		return this.field1426;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1753260984")

	int method2702() {
		return this.field1431;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"760390929")

	int method2703() {
		return this.method2702() - this.method2699();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(FI)I", garbageValue = 
	"201296115")

	int method2704(float var1) {
		if (((this.field1436 < 0) || (((float) (this.field1430[this.field1436].field1384)) > var1)) || ((this.field1430[this.field1436].field1392 != null) && (((float) (this.field1430[this.field1436].field1392.field1384)) <= var1))) {
			if ((var1 >= ((float) (this.method2699()))) && (var1 <= ((float) (this.method2702())))) {
				int var2 = this.method2706();
				int var3 = this.field1436;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = (var4 + var5) >> 1;
						if (var1 < ((float) (this.field1430[var6].field1384))) {
							if (var1 > ((float) (this.field1430[var6 - 1].field1384))) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= ((float) (this.field1430[var6].field1384))) {
								var3 = var6;
								break;
							}

							if (var1 < ((float) (this.field1430[var6 + 1].field1384))) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while (var4 <= var5 );
				}

				if (var3 != this.field1436) {
					this.field1436 = var3;
					this.field1442 = true;
				}

				return this.field1436;
			} else {
				return -1;
			}
		} else {
			return this.field1436;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(FI)Ldh;", garbageValue = 
	"1784485987")

	class113 method2705(float var1) {
		int var2 = this.method2704(var1);
		return (var2 >= 0) && (var2 < this.field1430.length) ? this.field1430[var2] : null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"79780462")

	int method2706() {
		return this.field1430 == null ? 0 : this.field1430.length;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1667390542")

	static int method2709(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			var3 = HorizontalAlignment.getWidget(var4);
		} else {
			var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class295.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			if (var3.scrollX > (var3.scrollWidth - var3.width)) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			if (var3.scrollY > (var3.scrollHeight - var3.height)) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			class290.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class295.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 5];
			class290.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class290.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class290.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class295.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class295.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				class290.invalidateWidget(var3);
				if ((var4 != (-1)) && (var3.type == 0)) {
					GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				Messages.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				FillMode var6 = ((FillMode) (ChatChannel.findEnumerated(PlayerType.FillMode_values(), var8)));
				if (var6 != null) {
					var3.fillMode = var6;
					class290.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					var3.field3491 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					class295.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3386 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					class290.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5720(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize], UserComparator9.urlRequester, class4.method16());
					return 1;
				} else if (var0 == 1131) {
					class295.Interpreter_intStackSize -= 2;
					var3.method5639(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5682(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"-1589949227")

	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return (var0 >= '0') && (var0 <= '9');
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(II)Ldu;", garbageValue = 
	"-1883042828")

	static class122 method2724(int var0) {
		class122 var1 = ((class122) (SequenceDefinition.SequenceDefinition_cachedModel.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = DevicePcmPlayerProvider.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			byte[] var6 = var3.takeFile((var0 >> 16) & 65535, var0 & 65535);
			class122 var2;
			if (var6 == null) {
				var5 = false;
				var2 = null;
			} else {
				int var7 = ((var6[1] & 255) << 8) | (var6[2] & 255);
				byte[] var8 = var4.getFile(var7, 0);
				if (var8 == null) {
					var5 = false;
				}

				if (!var5) {
					var2 = null;
				} else {
					try {
						var2 = new class122(var3, var4, var0, false);
					} catch (Exception var10) {
						var2 = null;
					}
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, ((long) (var0)));
			}

			return var2;
		}
	}
}