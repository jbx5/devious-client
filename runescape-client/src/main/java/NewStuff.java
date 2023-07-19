import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("NewStuff")
public class NewStuff {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 3973216861410173197L
	)
	public long field1990;
	@ObfuscatedName("ay")
	int[] field1993;
	@ObfuscatedName("ar")
	short[] field1992;
	@ObfuscatedName("am")
	short[] field1995;
	@ObfuscatedName("as")
	public boolean field1994;

	public NewStuff(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1994 = false;
		this.field1990 = var1;
		this.field1993 = var3;
		this.field1992 = var4;
		this.field1995 = var5;
		this.field1994 = var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "-1510328589"
	)
	static float method3703(class130 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1538 == var1) {
				var2 = 0.0F;
			} else if (var1 == var0.field1535) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1538) / (var0.field1535 - var0.field1538);
			}

			float var3;
			if (var0.field1543) {
				var3 = var2;
			} else {
				class126.field1492[3] = var0.field1550;
				class126.field1492[2] = var0.field1542;
				class126.field1492[1] = var0.field1541;
				class126.field1492[0] = var0.field1540 - var2;
				class126.field1497[0] = 0.0F;
				class126.field1497[1] = 0.0F;
				class126.field1497[2] = 0.0F;
				class126.field1497[3] = 0.0F;
				class126.field1497[4] = 0.0F;
				int var4 = DbRowType.method9009(class126.field1492, 3, 0.0F, true, 1.0F, true, class126.field1497);
				if (var4 == 1) {
					var3 = class126.field1497[0];
				} else {
					var3 = 0.0F;
				}
			}

			return (var0.field1553 + (var0.field1546 + var3 * var0.field1537) * var3) * var3 + var0.field1544;
		}
	}
}
