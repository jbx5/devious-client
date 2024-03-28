import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public abstract class class144 extends Node {
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	class144() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	abstract void vmethod3420(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	abstract void vmethod3419(ClanSettings var1);
}
