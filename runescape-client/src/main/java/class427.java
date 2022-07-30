import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
@ObfuscatedName("pd")
class class427 implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -596337965)
	int field4654;

	@ObfuscatedSignature(descriptor = "Lpo;")
	final class428 this$0;

	@ObfuscatedSignature(descriptor = "(Lpo;)V")
	class427(class428 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field4654 - 1;
		class394 var2 = ((class394) (this.this$0.field4656.get(((long) (var1)))));
		return var2 != null ? var2 : this.this$0.method7555(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field4654 < this.this$0.method7107();
	}
}