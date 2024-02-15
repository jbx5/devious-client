import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("aq")
	int field397;

	@ObfuscatedName("aq")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)I"
	)
	@Export("update")
	abstract int update();
}
