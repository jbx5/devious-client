import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
final class class109 implements class350 {
	@ObfuscatedName("as")
	public static short[][] field1390;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnq;)V"
	)
	class109(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "523602495"
	)
	public void vmethod6542() {
		if (this.val$cc != null && this.val$cc.method6974().field3732 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2421(this.val$cc);
			var1.setArgs(this.val$cc.method6974().field3732);
			WidgetDefinition.method6561().addFirst(var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "17"
	)
	static int method2863(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = FloorUnderlayDefinition.widgetDefinition.method6544(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method6949();
						var12.method6971().method6687(new class108(var12));
						var12.method6971().method6686(new class109(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						class238.scriptDotWidget = var12;
					} else {
						class428.scriptActiveWidget = var12;
					}

					class416.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
				Widget var10 = FloorUnderlayDefinition.widgetDefinition.method6544(var3.id);
				var10.children[var3.childIndex] = null;
				class416.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var3.children = null;
				class416.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class238.scriptDotWidget = var3;
						} else {
							class428.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var5 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class238.scriptDotWidget = var5;
					} else {
						class428.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lob;Ljava/lang/String;Ljava/lang/String;B)Lvb;",
		garbageValue = "29"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class415.method7697(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite var7 = new IndexedSprite();
				var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var7.height = class563.SpriteBuffer_spriteHeight;
				var7.xOffset = class149.SpriteBuffer_xOffsets[0];
				var7.yOffset = class563.SpriteBuffer_yOffsets[0];
				var7.subWidth = class563.SpriteBuffer_spriteWidths[0];
				var7.subHeight = class372.SpriteBuffer_spriteHeights[0] * -2113044483;
				var7.palette = RouteStrategy.SpriteBuffer_spritePalette;
				var7.pixels = class563.SpriteBuffer_pixels[0];
				class149.SpriteBuffer_xOffsets = null;
				class563.SpriteBuffer_yOffsets = null;
				class563.SpriteBuffer_spriteWidths = null;
				class372.SpriteBuffer_spriteHeights = null;
				RouteStrategy.SpriteBuffer_spritePalette = null;
				class563.SpriteBuffer_pixels = null;
				var5 = var7;
			}

			return var5;
		}
	}
}
