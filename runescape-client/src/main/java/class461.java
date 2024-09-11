import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
class class461 implements Comparator {
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrf;)V"
	)
	class461(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "1902441751"
	)
	int method8736(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8736((Entry)var1, (Entry)var2);
	}
}
