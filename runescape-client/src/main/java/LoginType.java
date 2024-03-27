import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5111;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5112;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5113;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5119;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5115;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5121;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5117;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final LoginType field5118;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1389160821
	)
	public final int field5114;
	@ObfuscatedName("as")
	final String field5120;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field5111 = new LoginType(6, 1, "", "");
		field5112 = new LoginType(0, 2, "", "");
		field5113 = new LoginType(3, 3, "", "");
		field5119 = new LoginType(5, 4, "", "");
		field5115 = new LoginType(4, 5, "", "");
		field5121 = new LoginType(8, 6, "", "");
		field5117 = new LoginType(2, 7, "", "");
		field5118 = new LoginType(1, -1, "", "", true, new LoginType[]{oldscape, field5111, field5112, field5119, field5113});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5114 = var1;
		this.field5120 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Ltr;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5114 = var1;
		this.field5120 = var4;
	}

	public String toString() {
		return this.field5120;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "649028774"
	)
	public static char method8998(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}
}
