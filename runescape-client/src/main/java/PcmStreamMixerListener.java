import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ak")
	int field407;

	@ObfuscatedName("ak")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)I"
	)
	@Export("update")
	abstract int update();
}
