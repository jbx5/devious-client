import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class88 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;Lpo;I)V",
		garbageValue = "1642724731"
	)
	public static void method2504(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2138 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "1118002659"
	)
	static byte[] method2505(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var4 + var3;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "-1136147628"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return CollisionMap.platformInfo;
	}
}
