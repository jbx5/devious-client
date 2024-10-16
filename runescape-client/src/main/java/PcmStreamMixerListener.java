import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("ap")
	int field376;

	@ObfuscatedName("ap")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbn;)I"
	)
	@Export("update")
	abstract int update();
}
