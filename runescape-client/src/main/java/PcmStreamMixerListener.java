import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("at")
	int field385;

	@ObfuscatedName("at")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbn;)I"
	)
	@Export("update")
	abstract int update();
}
