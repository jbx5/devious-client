import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
@ObfuscatedName("pi")
public class class422 implements class421 {
	@ObfuscatedName("s")
	Map field4606;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lqd;")
	final class450 field4605;

	@ObfuscatedSignature(descriptor = "(Lqd;)V")
	public class422(class450 var1) {
		this.field4605 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "0")
	public int vmethod7381(int var1) {
		if (this.field4606 != null) {
			class451 var2 = ((class451) (this.field4606.get(var1)));
			if (var2 != null) {
				return ((Integer) (var2.field4768));
			}
		}
		return ((Integer) (this.field4605.vmethod7942(var1)));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/Object;B)V", garbageValue = "62")
	public void vmethod7377(int var1, Object var2) {
		if (this.field4606 == null) {
			this.field4606 = new HashMap();
			this.field4606.put(var1, new class451(var1, var2));
		} else {
			class451 var3 = ((class451) (this.field4606.get(var1)));
			if (var3 == null) {
				this.field4606.put(var1, new class451(var1, var2));
			} else {
				var3.field4768 = var2;
			}
		}
	}

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator();
	}

	@ObfuscatedName("h")
	static final void method7384(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}
	}
}