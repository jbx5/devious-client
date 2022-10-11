import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("c")
	int field408;

	@ObfuscatedName("c")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lam;)I"
	)
	@Export("update")
	abstract int update();
}
