import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field2468;
	@ObfuscatedName("sy")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;

	Clock() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "555753729"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-120"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "1486427565"
	)
	static long method4667(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}
}
