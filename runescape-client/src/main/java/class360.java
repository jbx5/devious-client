import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mw")
public class class360 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lps;",
		garbageValue = "579230649"
	)
	public static class434 method6732(int var0) {
		int var1 = class432.field4684[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class434.field4691; // L: 21
		} else if (var1 == 2) { // L: 23
			return class434.field4689; // L: 24
		} else {
			return var1 == 3 ? class434.field4688 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;Ljava/lang/String;Ljava/lang/String;I)Lmv;",
		garbageValue = "-746551807"
	)
	public static Font method6731(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 101
		int var5 = var0.getFileId(var4, var3); // L: 102
		return class448.method8182(var0, var1, var4, var5); // L: 103
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-91"
	)
	static int method6733(int var0, Script var1, boolean var2) {
		Widget var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1433
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1434
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundCache.Widget_unpackTargetMask(class97.getWidgetFlags(var3)); // L: 1435
			return 1; // L: 1436
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1438
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1445
				if (var3.dataText == null) { // L: 1446
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1447
				}

				return 1; // L: 1448
			} else {
				return 2; // L: 1450
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1439
			--var4; // L: 1440
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1441
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1442
			} else {
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1443
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1908548296"
	)
	static final void method6734() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 3847
			int var1 = Client.npcIndices[var0]; // L: 3848
			NPC var2 = Client.npcs[var1]; // L: 3849
			if (var2 != null) { // L: 3850
				ClientPreferences.updateActorSequence(var2, var2.definition.size); // L: 3851
			}
		}

	} // L: 3854
}
