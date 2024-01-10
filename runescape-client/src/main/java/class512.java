import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
class class512 implements Iterator {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1833377439
	)
	int field5092;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	final class513 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltx;)V"
	)
	class512(class513 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5092 - 1;
		class472 var2 = (class472)this.this$0.field5094.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9200(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field5092 < this.this$0.method8651();
	}
}
