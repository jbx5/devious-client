import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
class class435 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	final class434 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqv;)V"
	)
	class435(class434 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "0"
	)
	int method7908(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method7908((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
