import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class263 {
	@ObfuscatedName("ut")
	@ObfuscatedSignature(descriptor = 
	"Loj;")

	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3006;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3005;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3015;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3007;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3008;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3009;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3004;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3011;
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3012;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Ljp;")

	public static final class263 field3013;
	static 
	{
		field3006 = new class263(5);
		field3005 = new class263(4);
		field3015 = new class263(6);
		field3007 = new class263(7);
		field3008 = new class263(5);
		field3009 = new class263(3);
		field3004 = new class263(14);
		field3011 = new class263(15);
		field3012 = new class263(2);
		field3013 = new class263(4);
	}

	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"5")

	class263(int var1) {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;IZI)I", garbageValue = 
	"-1248696661")

	static int method5178(CharSequence var0, int var1, boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if ((var8 >= '0') && (var8 <= '9')) {
					var10 = var8 - '0';
				} else if ((var8 >= 'A') && (var8 <= 'Z')) {
					var10 = var8 - '7';
				} else {
					if ((var8 < 'a') || (var8 > 'z')) {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + (var5 * var1);
				if ((var9 / var1) != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}