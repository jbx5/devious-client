import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class490 implements class489 {
	@ObfuscatedName("au")
	Map field4982;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	final class522 field4981;

	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	public class490(class522 var1) {
		this.field4981 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "31516"
	)
	public int vmethod8775(int var1) {
		if (this.field4982 != null) {
			class523 var2 = (class523)this.field4982.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5177;
			}
		}

		return (Integer)this.field4981.vmethod9358(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1797615972"
	)
	public void vmethod8779(int var1, Object var2) {
		if (this.field4982 == null) {
			this.field4982 = new HashMap();
			this.field4982.put(var1, new class523(var1, var2));
		} else {
			class523 var3 = (class523)this.field4982.get(var1);
			if (var3 == null) {
				this.field4982.put(var1, new class523(var1, var2));
			} else {
				var3.field5177 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4982 == null ? Collections.emptyList().iterator() : this.field4982.values().iterator();
	}
}
