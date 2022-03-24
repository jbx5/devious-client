import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
class class425 implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1020132659)

	int field4584;

	@ObfuscatedSignature(descriptor = 
	"Lps;")

	final class426 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lps;)V")

	class425(class426 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4584 < this.this$0.method7171();
	}

	public Object next() {
		int var1 = (++this.field4584) - 1;
		class393 var2 = ((class393) (this.this$0.field4585.get(((long) (var1)))));
		return var2 != null ? var2 : this.this$0.method7639(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)I", garbageValue = 
	"0")

	public static int method7636(int var0, int var1, int var2) {
		int var3 = class260.method5203((var2 - var1) + 1);
		var3 <<= var1;
		return var0 & (~var3);
	}
}