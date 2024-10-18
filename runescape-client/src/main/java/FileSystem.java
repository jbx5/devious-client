import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ap")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ak")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field2400;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-742753003"
	)
	public static String method4540(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = class1.method13(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)Lih;",
		garbageValue = "69"
	)
	static class208 method4535(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			int var2 = -1;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.readUnsignedShort();
			if (class555.field5457 >= 226) {
				var2 = var0.readUnsignedByte();
			}

			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			int var9 = var0.readUnsignedByte();
			if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
				return new class208(var6, var2, var7, var8, var9);
			}
		}

		return null;
	}
}
