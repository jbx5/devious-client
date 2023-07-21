import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public final class class387 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field4438;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1062015441
	)
	static int field4437;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 297347911
	)
	static int field4440;

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "19345"
	)
	public static int method7246(String var0) {
		return var0.length() + 2;
	}
}
