import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	Clock() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1748185955"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "127"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("al")
	static boolean method3771(long var0) {
		return class109.method2774(var0) == 2;
	}
}
