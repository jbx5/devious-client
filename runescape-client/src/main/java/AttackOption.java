import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cs")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lcs;")
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lcs;")
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lcs;")
	field1284(2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lcs;")
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lcs;")
	field1287(4);
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1845683863)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)[Ldt;", garbageValue = "-38")
	static class119[] method2359() {
		return new class119[]{ class119.field1488, class119.field1490, class119.field1468, class119.field1471, class119.field1472, class119.field1473, class119.field1474, class119.field1475, class119.field1476, class119.field1477, class119.field1478, class119.field1482, class119.field1479, class119.field1481, class119.field1470, class119.field1483, class119.field1480 };
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IB)Lgb;", garbageValue = "-16")
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = ((ItemComposition) (ItemComposition.ItemDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}
			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}
			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}
			if (!InterfaceParent.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}
				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}
				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;
					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = DesktopPlatformInfoProvider.getParamDefinition(((int) (var4.key)));
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}
					if (!var6) {
						var1.params = null;
					}
				}
			}
			ItemComposition.ItemDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Lkn;S)I", garbageValue = "128")
	static int method2360(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var0.method5553(var1);
			return 1;
		}
	}
}