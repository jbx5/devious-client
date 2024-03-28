import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("az")
	int field391;

	@ObfuscatedName("az")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbj;)I"
	)
	@Export("update")
	abstract int update();
}
