import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class506 implements class505 {
	@ObfuscatedName("am")
	Map field5059;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	final class538 field5058;

	@ObfuscatedSignature(
		descriptor = "(Lus;)V"
	)
	public class506(class538 var1) {
		this.field5058 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1228264639"
	)
	public int vmethod9122(int var1) {
		if (this.field5059 != null) {
			class539 var2 = (class539)this.field5059.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5244;
			}
		}

		return (Integer)this.field5058.vmethod9698(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "693198435"
	)
	public void vmethod9116(int var1, Object var2) {
		if (this.field5059 == null) {
			this.field5059 = new HashMap();
			this.field5059.put(var1, new class539(var1, var2));
		} else {
			class539 var3 = (class539)this.field5059.get(var1);
			if (var3 == null) {
				this.field5059.put(var1, new class539(var1, var2));
			} else {
				var3.field5244 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5059 == null ? Collections.emptyList().iterator() : this.field5059.values().iterator();
	}
}
