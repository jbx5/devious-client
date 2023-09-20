import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ac")
	int field420;

	@ObfuscatedName("ac")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbm;)I"
	)
	@Export("update")
	abstract int update();
}
