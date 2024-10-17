import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
class class538 implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1820002917
	)
	int field5367;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	final class539 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lue;)V"
	)
	class538(class539 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5367 < this.this$0.method9332();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5367 - 1;
		class498 var2 = (class498)this.this$0.field5370.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9888(var1);
	}
}
