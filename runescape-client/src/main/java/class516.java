import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
class class516 implements Iterator {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2053439433
	)
	int field5146;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	final class517 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltc;)V"
	)
	class516(class517 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5146 < this.this$0.method8504();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5146 - 1;
		class476 var2 = (class476)this.this$0.field5148.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9069(var1);
	}
}
