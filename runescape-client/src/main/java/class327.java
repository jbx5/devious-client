import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class327 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	UrlRequest field3550;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	SpritePixels field3548;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;)V"
	)
	class327(String var1, UrlRequester var2) {
		try {
			this.field3550 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3550 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class327(UrlRequest var1) {
		this.field3550 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "915750590"
	)
	SpritePixels method6111() {
		if (this.field3548 == null && this.field3550 != null && this.field3550.isDone()) {
			if (this.field3550.getResponse() != null) {
				this.field3548 = ClanChannelMember.method3152(this.field3550.getResponse());
			}

			this.field3550 = null;
		}

		return this.field3548;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "175301623"
	)
	static String method6113(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
