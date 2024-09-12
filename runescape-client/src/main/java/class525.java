import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class525 implements class524 {
	@ObfuscatedName("ac")
	Map field5280;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	final class558 field5281;

	@ObfuscatedSignature(
		descriptor = "(Lvn;)V"
	)
	public class525(class558 var1) {
		this.field5281 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1390948004"
	)
	public int vmethod9622(int var1) {
		if (this.field5280 != null) {
			class559 var2 = (class559)this.field5280.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5480;
			}
		}

		return (Integer)this.field5281.vmethod10246(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "804122963"
	)
	public void vmethod9621(int var1, Object var2) {
		if (this.field5280 == null) {
			this.field5280 = new HashMap();
			this.field5280.put(var1, new class559(var1, var2));
		} else {
			class559 var3 = (class559)this.field5280.get(var1);
			if (var3 == null) {
				this.field5280.put(var1, new class559(var1, var2));
			} else {
				var3.field5480 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5280 == null ? Collections.emptyList().iterator() : this.field5280.values().iterator();
	}
}
