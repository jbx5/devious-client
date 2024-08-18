import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
class class459 implements Comparator {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static Fonts field4873;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrf;)V"
	)
	class459(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "1149357237"
	)
	int method8478(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method8478((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
