import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("cj")
public enum class83 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1076(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1073(1, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1075(2, 3),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1081(3, 4),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1077(4, 5),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lcj;")
	field1078(5, 6);
	@ObfuscatedName("tj")
	@ObfuscatedGetter(intValue = -1155769579)
	static int field1082;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Liw;")
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1466506935)
	final int field1074;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1935588787)
	final int field1080;

	class83(int var3, int var4) {
		this.field1074 = var3;
		this.field1080 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1080;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "105")
	static void method2189(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "2009179115")
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class457.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class267.SpriteBuffer_xOffsets = new int[class457.SpriteBuffer_spriteCount];
		class457.SpriteBuffer_yOffsets = new int[class457.SpriteBuffer_spriteCount];
		class457.SpriteBuffer_spriteWidths = new int[class457.SpriteBuffer_spriteCount];
		Decimator.SpriteBuffer_spriteHeights = new int[class457.SpriteBuffer_spriteCount];
		DbTableType.SpriteBuffer_pixels = new byte[class457.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8;
		class457.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class457.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;
		int var3;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			class267.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			class457.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			class457.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			Decimator.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = new int[var2];
		for (var3 = 1; var3 < var2; ++var3) {
			GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] == 0) {
				GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}
		var1.offset = 0;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class457.SpriteBuffer_spriteWidths[var3];
			int var5 = Decimator.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			DbTableType.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1971750956")
	static int method2188(int var0, Script var1, boolean var2) {
		if (var0 == 7400) {
			--TaskHandler.Interpreter_intStackSize;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7401) {
			--TaskHandler.Interpreter_intStackSize;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7402) {
			TaskHandler.Interpreter_intStackSize -= 2;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7403) {
			TaskHandler.Interpreter_intStackSize -= 2;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7404) {
			--TaskHandler.Interpreter_intStackSize;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7405) {
			TaskHandler.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7406) {
			--TaskHandler.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7407) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7408) {
			TaskHandler.Interpreter_intStackSize -= 2;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7409) {
			--TaskHandler.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
			method2183(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(descriptor = "(ZS)V", garbageValue = "2729")
	static void method2183(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}