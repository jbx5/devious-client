import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cj")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("pm")
	@ObfuscatedGetter(intValue = 1643162371)
	static int field1249;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lfi;")
	@Export("definition")
	HealthBarDefinition definition;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llx;")
	@Export("updates")
	IterableNodeDeque updates = new IterableNodeDeque();

	@ObfuscatedSignature(descriptor = "(Lfi;)V")
	HealthBar(HealthBarDefinition var1) {
		this.definition = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "106")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Lcc;", garbageValue = "-741230363")
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); var3 != null && var3.cycle <= var1; var3 = ((HealthBarUpdate) (this.updates.previous()))) {
				var2.remove();
				var2 = var3;
			}
			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1803012983")
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6073();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)Lgu;", garbageValue = "-1068428838")
	public static HitSplatDefinition method2311(int var0) {
		HitSplatDefinition var1 = ((HitSplatDefinition) (HitSplatDefinition.HitSplatDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class430.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			HitSplatDefinition.HitSplatDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}