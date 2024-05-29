import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public abstract class class163 extends Node {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	class163() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	abstract void vmethod3479(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	abstract void vmethod3480(ClanChannel var1);

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1618960405"
	)
	static final int method3419() {
		return Client.menuOptionsCount - 1;
	}
}
