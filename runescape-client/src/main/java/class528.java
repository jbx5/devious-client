import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class528 {
	@ObfuscatedName("ag")
	static final char[] field5299;
	@ObfuscatedName("am")
	static final char[] field5300;
	@ObfuscatedName("jr")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	static {
		field5299 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field5300 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lun;",
		garbageValue = "1552811841"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5348.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9794(new Buffer(var2));
			}

			var1.method9796();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
