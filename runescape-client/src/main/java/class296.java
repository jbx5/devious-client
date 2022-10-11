import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("km")
public class class296 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1442489081"
	)
	static int method5887(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 556
		Widget var4;
		if (var0 >= 2000) { // L: 558
			var0 -= 1000; // L: 559
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 560
			var4 = SpotAnimationDefinition.getWidget(var3); // L: 561
		} else {
			var4 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 563
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 564
			Interpreter.Interpreter_intStackSize -= 4; // L: 565
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 566
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 567
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 568
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 569
			class403.invalidateWidget(var4); // L: 570
			IgnoreList.client.alignWidget(var4); // L: 571
			if (var3 != -1 && var4.type == 0) { // L: 572
				StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 573
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 575
			Interpreter.Interpreter_intStackSize -= 4; // L: 576
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 577
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 578
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 579
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 580
			class403.invalidateWidget(var4); // L: 581
			IgnoreList.client.alignWidget(var4); // L: 582
			if (var3 != -1 && var4.type == 0) { // L: 583
				StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 584
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 586
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 587
			if (var5 != var4.isHidden) { // L: 588
				var4.isHidden = var5; // L: 589
				class403.invalidateWidget(var4); // L: 590
			}

			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 594
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 595
			return 1; // L: 596
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 598
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 599
			return 1; // L: 600
		} else {
			return 2; // L: 602
		}
	}
}
