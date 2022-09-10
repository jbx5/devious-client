import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class175 {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "1197497248"
	)
	public static int method3614(CharSequence var0, int var1) {
		return Calendar.method5674(var0, var1, true); // L: 72
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	static final void method3615() {
		if (Client.field736 != Tiles.Client_plane) { // L: 3571
			Client.field736 = Tiles.Client_plane; // L: 3572
			class10.method109(Tiles.Client_plane); // L: 3573
		}

	} // L: 3575
}
