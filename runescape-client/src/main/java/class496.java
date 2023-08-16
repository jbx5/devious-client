import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
class class496 implements Iterator {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1383103345
	)
	int field5018;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	final class497 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lth;)V"
	)
	class496(class497 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5018 < this.this$0.method8301();
	}

	public Object next() {
		int var1 = ++this.field5018 - 1;
		class456 var2 = (class456)this.this$0.field5021.get((long)var1);
		return var2 != null ? var2 : this.this$0.method8878(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
