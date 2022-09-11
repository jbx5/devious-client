import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -865554559
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 867172352
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 951058432
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -1899984965495053823L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1235485627
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-987681124"
	)
	public static String method4040(byte[] var0) {
		return Messages.method2651(var0, 0, var0.length); // L: 58
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1128119848"
	)
	static int method4039(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3400
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3401
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = UserComparator3.ItemDefinition_get(var3).name; // L: 3402
			return 1; // L: 3403
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3405
				Interpreter.Interpreter_intStackSize -= 2; // L: 3406
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3407
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3408
				var5 = UserComparator3.ItemDefinition_get(var3); // L: 3409
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3410
				} else {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3411
				}

				return 1; // L: 3412
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3414
				Interpreter.Interpreter_intStackSize -= 2; // L: 3415
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3416
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3417
				var5 = UserComparator3.ItemDefinition_get(var3); // L: 3418
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3419
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3420
				}

				return 1; // L: 3421
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3423
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3424
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemDefinition_get(var3).price; // L: 3425
				return 1; // L: 3426
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3428
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3429
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3430
				return 1; // L: 3431
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3433
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3434
					var7 = UserComparator3.ItemDefinition_get(var3); // L: 3435
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3436
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3437
					}

					return 1; // L: 3438
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3440
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3441
					var7 = UserComparator3.ItemDefinition_get(var3); // L: 3442
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3443
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3444
					}

					return 1; // L: 3445
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3447
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3448
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3449
					return 1; // L: 3450
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3452
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3453
					var7 = UserComparator3.ItemDefinition_get(var3); // L: 3454
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3455
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3456
					}

					return 1; // L: 3457
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3459
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3460
					var7 = UserComparator3.ItemDefinition_get(var3); // L: 3461
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3462
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3463
					}

					return 1; // L: 3464
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3466
					String var6 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3467
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3468
					GameBuild.findItemDefinitions(var6, var4 == 1); // L: 3469
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator4.foundItemIdCount; // L: 3470
					return 1; // L: 3471
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3473
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3478
						GameEngine.foundItemIndex = 0; // L: 3479
						return 1; // L: 3480
					} else if (var0 == 4213) { // L: 3482
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3483
						var4 = UserComparator3.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3484
						if (var4 == -1) { // L: 3485
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3486
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + 1; // L: 3489
						}

						return 1; // L: 3491
					} else {
						return 2; // L: 3493
					}
				} else {
					if (class283.foundItemIds != null && GameEngine.foundItemIndex < UserComparator4.foundItemIdCount) { // L: 3474
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class283.foundItemIds[++GameEngine.foundItemIndex - 1] & '\uffff'; // L: 3475
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3476
				}
			}
		}
	}
}
