import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
class class529 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 294796963
	)
	int field5282;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	final class530 this$0;

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	class529(class530 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5282 - 1;
		class489 var2 = (class489)this.this$0.field5283.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9409(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field5282 < this.this$0.method8882();
	}
}
