import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ac")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("s")
	int field397;

	@ObfuscatedName("s")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Las;)I")
	@Export("update")
	abstract int update();
}