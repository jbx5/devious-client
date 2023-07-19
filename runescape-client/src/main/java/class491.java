import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public class class491 implements class490 {
	@ObfuscatedName("aw")
	Map field4979;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final class521 field4980;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class491(class521 var1) {
		this.field4980 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2127277043"
	)
	public int vmethod8809(int var1) {
		if (this.field4979 != null) {
			class522 var2 = (class522)this.field4979.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5134;
			}
		}

		return (Integer)this.field4980.vmethod9416(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1811511637"
	)
	public void vmethod8804(int var1, Object var2) {
		if (this.field4979 == null) {
			this.field4979 = new HashMap();
			this.field4979.put(var1, new class522(var1, var2));
		} else {
			class522 var3 = (class522)this.field4979.get(var1);
			if (var3 == null) {
				this.field4979.put(var1, new class522(var1, var2));
			} else {
				var3.field5134 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4979 == null ? Collections.emptyList().iterator() : this.field4979.values().iterator();
	}
}
