import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class281 {
	@ObfuscatedName("co")
	static String field3070;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1738541882"
	)
	static Date method5749() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}
