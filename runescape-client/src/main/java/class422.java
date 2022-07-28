import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
@ObfuscatedName("px")
public class class422 implements class421 {
	@ObfuscatedName("o")
	Map field4620;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqm;")
	final class450 field4622;

	@ObfuscatedSignature(descriptor = "(Lqm;)V")
	public class422(class450 var1) {
		this.field4622 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1114812568")
	public int vmethod7480(int var1) {
		if (this.field4620 != null) {
			class451 var2 = ((class451) (this.field4620.get(var1)));
			if (var2 != null) {
				return ((Integer) (var2.field4770));
			}
		}
		return ((Integer) (this.field4622.vmethod8047(var1)));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V", garbageValue = "204450768")
	public void vmethod7481(int var1, Object var2) {
		if (this.field4620 == null) {
			this.field4620 = new HashMap();
			this.field4620.put(var1, new class451(var1, var2));
		} else {
			class451 var3 = ((class451) (this.field4620.get(var1)));
			if (var3 == null) {
				this.field4620.put(var1, new class451(var1, var2));
			} else {
				var3.field4770 = var2;
			}
		}
	}

	public Iterator iterator() {
		return this.field4620 == null ? Collections.emptyList().iterator() : this.field4620.values().iterator();
	}
}