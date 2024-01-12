import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uy")
public class class524 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 714099229
	)
	static final int field5131;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1309388659
	)
	static final int field5129;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 659925521
	)
	@Export("canvasWidth")
	public static int canvasWidth;

	static {
		field5131 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5129 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}
}
