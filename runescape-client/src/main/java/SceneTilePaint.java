import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("hf")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1690514069)
	@Export("swColor")
	int swColor;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -504198131)
	@Export("seColor")
	int seColor;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -831521809)
	@Export("neColor")
	int neColor;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 851338797)
	@Export("nwColor")
	int nwColor;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 42115919)
	@Export("texture")
	int texture;

	@ObfuscatedName("w")
	@Export("isFlat")
	boolean isFlat = true;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1794433853)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)I", garbageValue = "80")
	public static int method4491(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}
		return var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-1633545616")
	static int method4490(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			var3 = FloorUnderlayDefinition.getWidget(var4);
		} else {
			var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		}
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}
			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}
			var3.scrollY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}
			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			class220.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			TaskHandler.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 5];
			class220.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class220.invalidateWidget(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class220.invalidateWidget(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				TaskHandler.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				class220.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				WorldMapSection2.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class220.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				FillMode var6 = ((FillMode) (class271.findEnumerated(class386.FillMode_values(), var8)));
				if (var6 != null) {
					var3.fillMode = var6;
					class220.invalidateWidget(var3);
				}
				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					var3.field3399 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					TaskHandler.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3402 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					class220.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5635(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], class152.urlRequester, ArchiveLoader.method2130());
					return 1;
				} else if (var0 == 1131) {
					TaskHandler.Interpreter_intStackSize -= 2;
					var3.method5698(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5638(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}