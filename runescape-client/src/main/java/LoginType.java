import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4986;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4987;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4995;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4993;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4990;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4991;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final LoginType field4992;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	public static final LoginType field4989;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1018559
	)
	final int field4994;
	@ObfuscatedName("aq")
	final String field4985;

	static {
		oldscape = new LoginType(4, 0, "", "");
		field4986 = new LoginType(1, 1, "", "");
		field4987 = new LoginType(6, 2, "", "");
		field4995 = new LoginType(7, 3, "", "");
		field4993 = new LoginType(5, 4, "", "");
		field4990 = new LoginType(8, 5, "", "");
		field4991 = new LoginType(0, 6, "", "");
		field4992 = new LoginType(2, 7, "", "");
		field4989 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4986, field4987, field4993, field4995});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4994 = var1;
		this.field4985 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsi;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4994 = var1;
		this.field4985 = var4;
	}

	public String toString() {
		return this.field4985;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-10"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class385.cp1252AsciiExtension[var6 - 128];
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
