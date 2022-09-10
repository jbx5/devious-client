import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class423 implements class422 {
	@ObfuscatedName("c")
	Map field4641;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	final class451 field4640;

	@ObfuscatedSignature(
		descriptor = "(Lqg;)V"
	)
	public class423(class451 var1) {
		this.field4640 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "121"
	)
	public int vmethod7651(int var1) {
		if (this.field4641 != null) { // L: 20
			class452 var2 = (class452)this.field4641.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4797; // L: 22
			}
		}

		return (Integer)this.field4640.vmethod8208(var1); // L: 24
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-24891652"
	)
	public void vmethod7652(int var1, Object var2) {
		if (this.field4641 == null) { // L: 29
			this.field4641 = new HashMap(); // L: 30
			this.field4641.put(var1, new class452(var1, var2)); // L: 31
		} else {
			class452 var3 = (class452)this.field4641.get(var1); // L: 34
			if (var3 == null) {
				this.field4641.put(var1, new class452(var1, var2)); // L: 35
			} else {
				var3.field4797 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4641 == null ? Collections.emptyList().iterator() : this.field4641.values().iterator(); // L: 42 43
	}
}
