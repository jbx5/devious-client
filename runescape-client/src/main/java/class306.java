import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class306 {
	static {
		int var0 = 0;
		int var1 = 0;
		class302[] var2 = class163.method3283();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class302 var4 = var2[var3];
			if (var4.field3556 > var0) {
				var0 = var4.field3556;
			}

			if (var4.field3554 > var1) {
				var1 = var4.field3554;
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;I)J", garbageValue = 
	"650376938")

	public static long method5788(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if ((var5 >= 'A') && (var5 <= 'Z')) {
				var1 += ((long) ((var5 + 1) - 65));
			} else if ((var5 >= 'a') && (var5 <= 'z')) {
				var1 += ((long) ((var5 + 1) - 97));
			} else if ((var5 >= '0') && (var5 <= '9')) {
				var1 += ((long) ((var5 + 27) - 48));
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (((var1 % 37L) == 0L) && (0L != var1)) {
			var1 /= 37L;
		} 

		return var1;
	}
}