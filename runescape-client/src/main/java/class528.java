import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
class class528 implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1486813323
	)
	int field5277;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final class529 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	class528(class529 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5277 < this.this$0.method8799();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5277 - 1;
		class488 var2 = (class488)this.this$0.field5278.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9368(var1);
	}
}
