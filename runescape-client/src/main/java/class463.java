import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
class class463 implements Comparator {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -566466219
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 322327291
	)
	@Export("cameraPitch")
	static int cameraPitch;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	final class464 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	class463(class464 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrt;Lrt;I)I",
		garbageValue = "-1828216664"
	)
	int method8746(class465 var1, class465 var2) {
		if (var1.field4949 > var2.field4949) {
			return 1;
		} else {
			return var1.field4949 < var2.field4949 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8746((class465)var1, (class465)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
