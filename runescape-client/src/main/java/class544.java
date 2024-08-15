import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public abstract class class544 {
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	static final void method9543(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		TileItem.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
