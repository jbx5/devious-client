import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class class77 {
	@ObfuscatedName("ap")
	static final BigInteger field920;
	@ObfuscatedName("aw")
	static final BigInteger field924;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static IndexedSprite field919;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	public static class402 field922;

	static {
		field920 = new BigInteger("10001", 16);
		field924 = new BigInteger("90599d6e45ad3596822d15845d898c97425da5d7400c7ce14b136fe6b57818302e12ca8cb9957a9659faf3ae0c156cefc2d598c8ca7b5a5ed99fdd22e82613468184f0d0b633e4543bd258f4606cefd89cb1c5115b25967803a2d96cf543f830b5199e2f820cf71181f1c9aa70aa86ddbe1e030514df8ed320c14927e6747b39", 16);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1684308193"
	)
	public static final synchronized long method2338() {
		long var0 = System.currentTimeMillis();
		if (var0 < class329.field3604) {
			class329.field3602 += class329.field3604 - var0;
		}

		class329.field3604 = var0;
		return var0 + class329.field3602;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-453868509"
	)
	static boolean method2339(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-760693873"
	)
	static void method2340() {
		Huffman.otp.trim();
		if (Huffman.otp.length() != 6) {
			class132.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class333.otpMedium = Integer.parseInt(Huffman.otp);
			Huffman.otp = "";
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
			class132.setLoginResponseString("", "Connecting to server...", "");
			BuddyRankComparator.updateGameState(20);
		}
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIB)V",
		garbageValue = "-98"
	)
	static final void method2341(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7328(class416.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				HttpMethod.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
