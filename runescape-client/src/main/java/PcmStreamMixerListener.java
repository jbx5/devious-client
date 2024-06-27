import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("aq")
	int field379;

	@ObfuscatedName("aq")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lby;)I"
	)
	@Export("update")
	abstract int update();
}
