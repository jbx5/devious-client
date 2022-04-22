import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public final class class349 {
	@ObfuscatedName("v")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("c")
	static long[] field4142;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	static 
	{
		base37Table = new char[]{ '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		field4142 = new long[12];

		for (int var0 = 0; var0 < class349.field4142.length; ++var0) {
			field4142[var0] = ((long) (Math.pow(37.0, ((double) (var0)))));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILpi;I)Lfj;", garbageValue = 
	"-307481051")

	public static class168 method6509(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class168 var5 = new class168(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, (var6 >> 4) & 15 };
			var8 = (var5.field1791 != null) && (var7.length == var5.field1791.length);

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.field1791[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, (var6 >> 4) & 15 };
			var8 = (var5.field1790 != null) && (var7.length == var5.field1790.length);

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.field1790[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}
}