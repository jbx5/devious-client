import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class521 implements class520 {
	@ObfuscatedName("ak")
	Map field5215;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	final class553 field5214;

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	public class521(class553 var1) {
		this.field5214 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-423215907"
	)
	public int vmethod9382(int var1) {
		if (this.field5215 != null) {
			class554 var2 = (class554)this.field5215.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5410;
			}
		}

		return (Integer)this.field5214.vmethod9962(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1251579836"
	)
	public void vmethod9377(int var1, Object var2) {
		if (this.field5215 == null) {
			this.field5215 = new HashMap();
			this.field5215.put(var1, new class554(var1, var2));
		} else {
			class554 var3 = (class554)this.field5215.get(var1);
			if (var3 == null) {
				this.field5215.put(var1, new class554(var1, var2));
			} else {
				var3.field5410 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5215 == null ? Collections.emptyList().iterator() : this.field5215.values().iterator();
	}
}
