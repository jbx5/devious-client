import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("aw")
	int field429;

	@ObfuscatedName("aw")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbe;)I"
	)
	@Export("update")
	abstract int update();
}
