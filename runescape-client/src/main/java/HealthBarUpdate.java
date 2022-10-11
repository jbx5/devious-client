import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 502214119
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1381480295
	)
	@Export("health")
	int health;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1427417885
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 78932263
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1737189293"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-484590387"
	)
	static int method2353(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1257
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1274
				var7 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1275
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1276
				if (var4 >= 1 && var4 <= 10) { // L: 1277
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1280
					Interpreter.field848.add(var8); // L: 1281
					return 1; // L: 1282
				} else {
					throw new RuntimeException(); // L: 1278
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1284
				Interpreter.Interpreter_intStackSize -= 3; // L: 1285
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1286
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1287
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1288
				if (var5 >= 1 && var5 <= 10) { // L: 1289
					class93 var6 = new class93(var5, var3, var4, SpotAnimationDefinition.getWidget(var3).itemId); // L: 1292
					Interpreter.field848.add(var6); // L: 1293
					return 1; // L: 1294
				} else {
					throw new RuntimeException(); // L: 1290
				}
			} else {
				return 2; // L: 1296
			}
		} else if (Interpreter.field849 >= 10) { // L: 1258
			throw new RuntimeException(); // L: 1259
		} else {
			if (var0 >= 2000) { // L: 1262
				var7 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1263
			} else {
				var7 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1265
			}

			if (var7.onResize == null) { // L: 1266
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1267
				var9.widget = var7; // L: 1268
				var9.args = var7.onResize; // L: 1269
				var9.field1041 = Interpreter.field849 + 1; // L: 1270
				Client.scriptEvents.addFirst(var9); // L: 1271
				return 1; // L: 1272
			}
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "480321097"
	)
	static final void method2352() {
		int var0 = BufferedSource.menuX; // L: 8147
		int var1 = class115.menuY; // L: 8148
		int var2 = MusicPatchNode.menuWidth; // L: 8149
		int var3 = GrandExchangeEvents.menuHeight; // L: 8150
		int var4 = 6116423; // L: 8151
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8152
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8153
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8154
		class29.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8155
		int var5 = MouseHandler.MouseHandler_x; // L: 8156
		int var6 = MouseHandler.MouseHandler_y; // L: 8157

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8158
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 8159
			var9 = 16777215; // L: 8160
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8161
				var9 = 16776960;
			}

			class29.fontBold12.draw(DynamicObject.method2135(var7), var0 + 3, var8, var9, 0); // L: 8162
		}

		var7 = BufferedSource.menuX; // L: 8164
		var8 = class115.menuY; // L: 8165
		var9 = MusicPatchNode.menuWidth; // L: 8166
		int var10 = GrandExchangeEvents.menuHeight; // L: 8167

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 8169
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 8170
				Client.field556[var11] = true;
			}
		}

	} // L: 8173
}
