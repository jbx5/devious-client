import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public class class494 {
	@ObfuscatedName("ar")
	static final char[] field4999;
	@ObfuscatedName("am")
	static final char[] field4998;

	static {
		field4999 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field4998 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)Luu;",
		garbageValue = "31"
	)
	public static IndexedSprite method8824(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			VarbitComposition.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : Script.method2172();
	}
}
