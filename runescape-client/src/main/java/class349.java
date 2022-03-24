import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public final class class349 {
	@ObfuscatedName("v")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("o")
	static long[] field4155;
	static 
	{
		base37Table = new char[]{ '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		field4155 = new long[12];

		for (int var0 = 0; var0 < class349.field4155.length; ++var0) {
			field4155[var0] = ((long) (Math.pow(37.0, ((double) (var0)))));
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Lcv;", garbageValue = 
	"77762889")

	static ClientPreferences method6537() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = ReflectionCheck.getPreferencesFile("", Login.field917.name, false);
			byte[] var2 = new byte[((int) (var0.length()))];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == (-1)) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}
}