import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class300 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvf;",
		garbageValue = "1624629976"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5405.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9985(new Buffer(var2));
			}

			var1.method10001();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-827524013"
	)
	public static int method6301(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
