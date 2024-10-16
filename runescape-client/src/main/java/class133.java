import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fj")
public class class133 {
	@ObfuscatedName("aj")
	public static final float field1547;
	@ObfuscatedName("ai")
	public static final float field1552;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -1683062733
	)
	static int field1546;
	@ObfuscatedName("jg")
	@Export("xteaKeys")
	static int[][] xteaKeys;

	static {
		field1547 = Math.ulp(1.0F);
		field1552 = field1547 * 2.0F;
	}
}
