import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class415 {
	@ObfuscatedName("aq")
	public char field4583;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 24885643
	)
	public int field4584;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1703916661
	)
	public int field4585;

	class415() {
		this.field4584 = 0;
		this.field4585 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-2"
	)
	static String method7833(int var0) {
		return "<img=" + var0 + ">";
	}
}
