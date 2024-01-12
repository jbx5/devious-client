import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -853527651
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -277541407
	)
	@Export("size")
	int size;
	@ObfuscatedName("af")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("aj")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("aq")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ar")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ag")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ao")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIB)V",
		garbageValue = "-45"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (Huffman.isWorldMapEvent(var0.type)) {
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = ConcurrentMidiTask.WorldMapElement_get(Interpreter.worldMapEvent.mapElement);
			var4 = class518.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = Skeleton.getScript(var5);
		}

		if (var4 != null) {
			WorldMapRegion.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-325706819"
	)
	public static int method736(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-14"
	)
	static int method735(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method6762() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			return class132.method3116(var3);
		} else if (var0 == 2709) {
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			return BuddyRankComparator.method2997(var3);
		} else {
			return 2;
		}
	}
}
