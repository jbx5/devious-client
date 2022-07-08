import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.lang.reflect.Method;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("aj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 1448497001)
	static int field247;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1169863591)
	@Export("id")
	int id;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 181292073)
	@Export("size")
	int size;

	@ObfuscatedName("q")
	@Export("operations")
	int[] operations;

	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;

	@ObfuscatedName("j")
	@Export("creationErrors")
	int[] creationErrors;

	@ObfuscatedName("e")
	@Export("fields")
	Field[] fields;

	@ObfuscatedName("g")
	@Export("methods")
	Method[] methods;

	@ObfuscatedName("w")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1131201261")
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;
		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}
		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		MouseRecorder.sortWorlds(class362.World_worlds, 0, class362.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1378535469")
	public static void method579() {
		class272.midiPcmStream.clear();
		class272.musicPlayerStatus = 1;
		class272.musicTrackArchive = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIIS)V", garbageValue = "-8124")
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, ((long) (var0)));
		}
		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];
			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}
			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}
			var4.ids = var5;
			var4.quantities = var6;
		}
		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-232696808")
	static int method576(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field843.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class446.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class93 var6 = new class93(var5, var3, var4, class140.getWidget(var3).itemId);
					Interpreter.field843.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field850 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			} else {
				var7 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
			}
			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1056 = Interpreter.field850 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}