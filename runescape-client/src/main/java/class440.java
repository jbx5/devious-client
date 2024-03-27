import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
class class440 implements Comparator {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 1293834423
	)
	static int field4745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	class440(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "29"
	)
	int method7988(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method7988((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
