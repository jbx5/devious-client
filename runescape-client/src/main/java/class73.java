import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class73 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 349131713
	)
	public static int field911;
	@ObfuscatedName("an")
	static final BigInteger field898;
	@ObfuscatedName("ao")
	static final BigInteger field902;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("jl")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		field898 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field902 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1431032114"
	)
	public static int method2084(int var0, int var1, int var2) {
		int var3 = class75.method2089(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}
}
