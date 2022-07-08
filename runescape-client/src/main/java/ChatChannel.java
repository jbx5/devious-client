import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bx")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Lbr;")
	@Export("messages")
	Message[] messages;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 941516663)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;", garbageValue = "-1607330830")
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];
		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}
		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}
		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}
		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Lbr;", garbageValue = "-2069744784")
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "164096866")
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILbi;ZS)I", garbageValue = "1700")
	static int method2003(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		}
		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
				return 1;
			} else {
				--Interpreter.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class446.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var4.parent = ScriptFrame.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class446.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class446.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize])) };
						byte[] var9 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1])) };
						class340.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class446.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class346.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						class346.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class446.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class145.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class145.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class446.Interpreter_intStackSize -= 10;
						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize] >= 0; var7 += 2) {
						}
						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];
							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize]));
								var8[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize + 1]));
							}
						}
					} else {
						class446.Interpreter_intStackSize -= 2;
						var10 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize])) };
						var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1])) };
					}
					var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						class340.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "1956135788")
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class456.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class426.SpriteBuffer_xOffsets = new int[class456.SpriteBuffer_spriteCount];
		class142.SpriteBuffer_yOffsets = new int[class456.SpriteBuffer_spriteCount];
		class359.SpriteBuffer_spriteWidths = new int[class456.SpriteBuffer_spriteCount];
		class456.SpriteBuffer_spriteHeights = new int[class456.SpriteBuffer_spriteCount];
		class421.SpriteBuffer_pixels = new byte[class456.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class456.SpriteBuffer_spriteCount * 8;
		ModelData0.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class456.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;
		int var3;
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) {
			class426.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) {
			class142.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) {
			class359.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) {
			class456.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}
		var1.offset = var0.length - 7 - class456.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class13.SpriteBuffer_spritePalette = new int[var2];
		for (var3 = 1; var3 < var2; ++var3) {
			class13.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class13.SpriteBuffer_spritePalette[var3] == 0) {
				class13.SpriteBuffer_spritePalette[var3] = 1;
			}
		}
		var1.offset = 0;
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class359.SpriteBuffer_spriteWidths[var3];
			int var5 = class456.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class421.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(descriptor = "(Lkb;I)V", garbageValue = "-720762696")
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field702) {
			Client.field703[var0.rootIndex] = true;
		}
	}
}