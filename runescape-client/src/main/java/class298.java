import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class298 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static final class298 field3238;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static final class298 field3239;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 683212995
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 791128817
	)
	@Export("value")
	final int value;

	static {
		field3238 = new class298(0);
		field3239 = new class298(1);
	}

	class298(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;B)V",
		garbageValue = "1"
	)
	public static void method6297(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferNameComparator.KitDefinition_archive = var0;
		GrandExchangeOfferTotalQuantityComparator.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = GrandExchangeOfferNameComparator.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Lda;",
		garbageValue = "2047"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class1.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = InterfaceParent.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1283755408"
	)
	public static boolean method6294(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class417.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1192975141"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return HttpMethod.method83(var0, 10, true);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lum;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1418911021"
	)
	static String method6296(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-18"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class417.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
