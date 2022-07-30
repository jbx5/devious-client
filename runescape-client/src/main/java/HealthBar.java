import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("cw")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("um")
	static Iterator field1255;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lfi;")
	@Export("definition")
	HealthBarDefinition definition;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("updates")
	IterableNodeDeque updates = new IterableNodeDeque();

	@ObfuscatedSignature(descriptor = "(Lfi;)V")
	HealthBar(HealthBarDefinition var1) {
		this.definition = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-548199087")
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;
		for (HealthBarUpdate var7 = ((HealthBarUpdate) (this.updates.last())); var7 != null; var7 = ((HealthBarUpdate) (this.updates.previous()))) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}
			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}
		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}
		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Lca;", garbageValue = "3")
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); var3 != null && var3.cycle <= var1; var3 = ((HealthBarUpdate) (this.updates.previous()))) {
				var2.remove();
				var2 = var3;
			}
			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6165();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lku;I)I", garbageValue = "410728992")
	static int method2410(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var0.method5642(var1);
			return 1;
		}
	}
}