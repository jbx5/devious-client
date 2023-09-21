import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("al")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ak")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ltr;I)Ljava/lang/Object;",
		garbageValue = "1234966456"
	)
	static Object method2290(class517 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5068) {
			case 0:
				return Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
