import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dx")
public class class115 {
	@ObfuscatedName("n")
	public static final float field1423;
	@ObfuscatedName("k")
	public static final float field1420;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 498159979
	)
	@Export("menuY")
	static int menuY;

	static {
		field1423 = Math.ulp(1.0F); // L: 10
		field1420 = field1423 * 2.0F; // L: 11
	}
}
