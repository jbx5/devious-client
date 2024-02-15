import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
class class515 implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -351257941
	)
	int field5112;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	final class516 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltx;)V"
	)
	class515(class516 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5112 - 1;
		class475 var2 = (class475)this.this$0.field5115.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9274(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field5112 < this.this$0.method8723();
	}
}
