import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("au")
	int field420;

	@ObfuscatedName("au")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbl;)I"
	)
	@Export("update")
	abstract int update();
}
