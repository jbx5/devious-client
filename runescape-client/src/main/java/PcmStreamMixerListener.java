import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ab")
	int field379;

	@ObfuscatedName("ab")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)I"
	)
	@Export("update")
	abstract int update();
}
