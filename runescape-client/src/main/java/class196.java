import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class196 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-1925953895)

	static int field2204;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;Lpe;I)Ljava/lang/String;", garbageValue = 
	"1101478665")

	public static String method3900(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = (((var5 == 160) || (var5 == ' ')) || (var5 == '_')) || (var5 == '-');
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = (((var5 == 160) || (var5 == ' ')) || (var5 == '_')) || (var5 == '-');
				if (!var4) {
					break;
				}

				--var3;
			} 

			int var11 = var3 - var2;
			if ((var11 >= 1) && (var11 <= class204.method4255(var1))) {
				StringBuilder var10 = new StringBuilder(var11);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (NetSocket.method3309(var7)) {
						char var8;
						switch (var7) {
							case ' ' :
							case '-' :
							case '_' :
							case ' ' :
								var8 = '_';
								break;
							case '#' :
							case '[' :
							case ']' :
								var8 = var7;
								break;
							case 'À' :
							case 'Á' :
							case 'Â' :
							case 'Ã' :
							case 'Ä' :
							case 'à' :
							case 'á' :
							case 'â' :
							case 'ã' :
							case 'ä' :
								var8 = 'a';
								break;
							case 'Ç' :
							case 'ç' :
								var8 = 'c';
								break;
							case 'È' :
							case 'É' :
							case 'Ê' :
							case 'Ë' :
							case 'è' :
							case 'é' :
							case 'ê' :
							case 'ë' :
								var8 = 'e';
								break;
							case 'Í' :
							case 'Î' :
							case 'Ï' :
							case 'í' :
							case 'î' :
							case 'ï' :
								var8 = 'i';
								break;
							case 'Ñ' :
							case 'ñ' :
								var8 = 'n';
								break;
							case 'Ò' :
							case 'Ó' :
							case 'Ô' :
							case 'Õ' :
							case 'Ö' :
							case 'ò' :
							case 'ó' :
							case 'ô' :
							case 'õ' :
							case 'ö' :
								var8 = 'o';
								break;
							case 'Ù' :
							case 'Ú' :
							case 'Û' :
							case 'Ü' :
							case 'ù' :
							case 'ú' :
							case 'û' :
							case 'ü' :
								var8 = 'u';
								break;
							case 'ß' :
								var8 = 'b';
								break;
							case 'ÿ' :
							case 'Ÿ' :
								var8 = 'y';
								break;
							default :
								var8 = Character.toLowerCase(var7);}


						if (var8 != 0) {
							var10.append(var8);
						}
					}
				}

				if (var10.length() == 0) {
					return null;
				} else {
					return var10.toString();
				}
			} else {
				return null;
			}
		}
	}
}