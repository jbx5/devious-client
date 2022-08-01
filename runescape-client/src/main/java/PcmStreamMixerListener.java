import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("az")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("o")
	int field401;

	@ObfuscatedName("o")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lai;)I")
	@Export("update")
	abstract int update();
}