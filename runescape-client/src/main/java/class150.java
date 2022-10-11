import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class150 {
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("HitSplatDefinition_cached")
	static class429 HitSplatDefinition_cached;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1598267728"
	)
	public static int method3287() {
		return KeyHandler.KeyHandler_idleCycles; // L: 171
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-728225487"
	)
	static final void method3286(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11612
		Player.clientPreferences.updateSoundEffectVolume(var0); // L: 11613
	} // L: 11614
}
