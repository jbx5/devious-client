import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.net.MalformedURLException;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("kq")
public class class291 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lcb;")
	UrlRequest field3330;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqj;")
	SpritePixels field3327;

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcc;)V")
	class291(String var1, UrlRequester var2) {
		try {
			this.field3330 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3330 = null;
		}
	}

	@ObfuscatedSignature(descriptor = "(Lcb;)V")
	class291(UrlRequest var1) {
		this.field3330 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "-1693449318")
	SpritePixels method5562() {
		if (this.field3327 == null && this.field3330 != null && this.field3330.isDone()) {
			if (this.field3330.getResponse() != null) {
				this.field3327 = class147.method3105(this.field3330.getResponse());
			}
			this.field3330 = null;
		}
		return this.field3327;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "2015320060")
	public static void method5561(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)[Lqj;", garbageValue = "301348962")
	static SpritePixels[] method5570() {
		SpritePixels[] var0 = new SpritePixels[class457.SpriteBuffer_spriteCount];
		for (int var1 = 0; var1 < class457.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class457.SpriteBuffer_spriteWidth;
			var2.height = class457.SpriteBuffer_spriteHeight;
			var2.xOffset = class267.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class457.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class457.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = Decimator.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subWidth * var2.subHeight;
			byte[] var4 = DbTableType.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];
			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}
		class267.SpriteBuffer_xOffsets = null;
		class457.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		Decimator.SpriteBuffer_spriteHeights = null;
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null;
		DbTableType.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "100")
	static int method5563(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		}
		int var5;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] - 1;
			if (var5 >= 0 && var5 <= 9) {
				var4.setAction(var5, Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]);
				return 1;
			} else {
				--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var4.parent = class293.getWidgetChild(var5, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--TaskHandler.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var11;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						TaskHandler.Interpreter_intStackSize -= 2;
						var11 = 10;
						var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize])) };
						byte[] var9 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1])) };
						RouteStrategy.Widget_setKey(var4, var11, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						TaskHandler.Interpreter_intStackSize -= 3;
						var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
						if (var5 >= 0 && var5 <= 9) {
							Widget_setKeyRate(var4, var5, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var11 = 10;
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						Widget_setKeyRate(var4, var11, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--TaskHandler.Interpreter_intStackSize;
						var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] - 1;
						if (var5 >= 0 && var5 <= 9) {
							HealthBarUpdate.Widget_setKeyIgnoreHeld(var4, var5);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						HealthBarUpdate.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						TaskHandler.Interpreter_intStackSize -= 10;
						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize] >= 0; var7 += 2) {
						}
						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];
							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize]));
								var8[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize + 1]));
							}
						}
					} else {
						TaskHandler.Interpreter_intStackSize -= 2;
						var10 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize])) };
						var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1])) };
					}
					var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						RouteStrategy.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Lku;IIIB)V", garbageValue = "-71")
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3447 == null) {
			throw new RuntimeException();
		} else {
			var0.field3447[var1] = var2;
			var0.field3448[var1] = var3;
		}
	}
}