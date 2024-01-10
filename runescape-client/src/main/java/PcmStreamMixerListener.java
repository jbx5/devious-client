import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("am")
	int field402;

	@ObfuscatedName("am")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbp;)I"
	)
	@Export("update")
	abstract int update();
}
