import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fb")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -992002495
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -883842709
	)
	static int field1875;
	@ObfuscatedName("ag")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-78"
	)
	public void method3558(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method3559(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "-40"
	)
	void method3559(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZS)I",
		garbageValue = "3125"
	)
	static int method3560(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1394
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1395
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1396
			return 1; // L: 1397
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1399
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1400
			if (var3.itemId != -1) { // L: 1401
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1402
			}

			return 1; // L: 1403
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1405
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1406
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1407
			if (var4 != null) { // L: 1408
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1409
			}

			return 1; // L: 1410
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1412
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1413
			return 1; // L: 1414
		} else if (var0 == 2707) { // L: 1416
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1417
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method5790() ? 1 : 0; // L: 1418
			return 1; // L: 1419
		} else if (var0 == 2708) { // L: 1421
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1422
			return class118.method2875(var3); // L: 1423
		} else if (var0 == 2709) { // L: 1425
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1426
			return class347.method6510(var3); // L: 1427
		} else {
			return 2; // L: 1429
		}
	}
}
