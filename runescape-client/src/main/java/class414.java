import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public final class class414 {
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1729222907
	)
	@Export("otpMedium")
	static int otpMedium;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method7741() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		UrlRequest.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1617514960"
	)
	static final int method7717(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
