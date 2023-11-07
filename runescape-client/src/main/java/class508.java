import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
class class508 implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 597261077
	)
	int field5050;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	final class509 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	class508(class509 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5050 < this.this$0.method8531();
	}

	public Object next() {
		int var1 = ++this.field5050 - 1;
		class468 var2 = (class468)this.this$0.field5054.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9076(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
