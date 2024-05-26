import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
class class459 implements Comparator {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -1657033645
	)
	static int field4880;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	final class460 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	class459(class460 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrp;Lrp;I)I",
		garbageValue = "-2041358580"
	)
	int method8470(class461 var1, class461 var2) {
		if (var1.field4891 > var2.field4891) {
			return 1;
		} else {
			return var1.field4891 < var2.field4891 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8470((class461)var1, (class461)var2);
	}
}
