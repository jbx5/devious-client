import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("gi")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;

	@ObfuscatedName("fl")
	@Export("worldHost")
	static String worldHost;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpb;")
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "749475992")
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "56")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "1584006933")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = LoginScreenAnimation.readStringIntParameters(var1, this.params);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "80")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class124.method2818(this.params, var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "-581400473")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = ((ObjectNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = ((String) (var5.obj));
			}
		}
		return var3;
	}

	@ObfuscatedName("c")
	public static final int method3616(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0 != var2) {
			double var12;
			if (var4 < 0.5) {
				var12 = (1.0 + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4;
			}
			double var14 = 2.0 * var4 - var12;
			double var16 = var0 + 0.3333333333333333;
			if (var16 > 1.0) {
				--var16;
			}
			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				++var20;
			}
			if (var16 * 6.0 < 1.0) {
				var6 = var16 * (var12 - var14) * 6.0 + var14;
			} else if (var16 * 2.0 < 1.0) {
				var6 = var12;
			} else if (3.0 * var16 < 2.0) {
				var6 = (var12 - var14) * (0.6666666666666666 - var16) * 6.0 + var14;
			} else {
				var6 = var14;
			}
			if (var0 * 6.0 < 1.0) {
				var8 = var14 + var0 * (var12 - var14) * 6.0;
			} else if (2.0 * var0 < 1.0) {
				var8 = var12;
			} else if (3.0 * var0 < 2.0) {
				var8 = 6.0 * (0.6666666666666666 - var0) * (var12 - var14) + var14;
			} else {
				var8 = var14;
			}
			if (6.0 * var20 < 1.0) {
				var10 = var14 + 6.0 * (var12 - var14) * var20;
			} else if (var20 * 2.0 < 1.0) {
				var10 = var12;
			} else if (var20 * 3.0 < 2.0) {
				var10 = 6.0 * (var12 - var14) * (0.6666666666666666 - var20) + var14;
			} else {
				var10 = var14;
			}
		}
		int var22 = ((int) (256.0 * var6));
		int var13 = ((int) (256.0 * var8));
		int var23 = ((int) (var10 * 256.0));
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ILbi;ZS)I", garbageValue = "-18766")
	static int method3617(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		}
		ChatChannel.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class101.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class446.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = EnumComposition.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}
			if (var3.field3424 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3424;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}
			return 1;
		}
	}
}