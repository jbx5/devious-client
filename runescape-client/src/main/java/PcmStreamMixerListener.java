import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ac")
	int field390;

	@ObfuscatedName("ac")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)I"
	)
	@Export("update")
	abstract int update();
}
