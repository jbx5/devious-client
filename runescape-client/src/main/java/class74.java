import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class74 {
	@ObfuscatedName("ax")
	static final BigInteger field882;
	@ObfuscatedName("ao")
	static final BigInteger field883;

	static {
		field882 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field883 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "771115169"
	)
	static final int method2178(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
