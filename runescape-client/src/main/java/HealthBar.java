import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("f")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1015592217)

	static int field1251;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lfy;")

	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(descriptor = 
	"(Lfy;)V")

	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)V", garbageValue = 
	"-121")

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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lcu;", garbageValue = 
	"62")

	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
		if ((var2 != null) && (var2.cycle <= var1)) {
			for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); (var3 != null) && (var3.cycle <= var1); var3 = ((HealthBarUpdate) (this.updates.previous()))) {
				var2.remove();
				var2 = var3;
			}

			if (((this.definition.int5 + var2.cycleOffset) + var2.cycle) > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"82")

	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6269();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1836952304")

	static void method2351() {
		class113.field1387 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = class92.method2373(((double) (((float) (var1)) / 360.0F)), 0.9998999834060669, ((double) (((0.425F * ((float) (var0))) / 16.0F) + 0.075F)));
			class113.field1387[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class113.field1387.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = class92.method2373(((double) (((float) (var1)) / 360.0F)), 0.9998999834060669, 0.5); (var0 < var3) && (var0 < class113.field1387.length); ++var0) {
				class113.field1387[var0] = var4;
			}
		}

	}
}