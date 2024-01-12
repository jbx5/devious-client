import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class304 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-791933648"
	)
	public static boolean method5978(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "314759886"
	)
	public static final float method5979(float var0) {
		float var1 = 75.0F;
		float var2 = 10000.0F;
		float var3 = 750000.0F / (10000.0F - var0 * 9925.0F);
		return (var3 - 75.0F) / 9925.0F;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Lch;",
		garbageValue = "-8397"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return GameEngine.getNextWorldListWorld();
	}
}
