import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("gl")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("ax")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-1836234627"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true;
						String var3 = var1.field1473.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1470 = UrlRequest.field1472;
								var9 = false;
								break label131;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method2982(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1470 = UrlRequest.field1472;
					var9 = false;
					break label128;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "1987557843"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1473.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "-2113577919"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1473.openConnection();
		if (!this.secureHttps) {
			if (SecureRandomSSLSocketFactory.INSTANCE == null) {
				SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
			}

			SecureRandomSSLSocketFactory var4 = SecureRandomSSLSocketFactory.INSTANCE;
			var2.setSSLSocketFactory(var4);
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	static void method3018() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			WorldMapEvent.titlebuttonSprite = null;
			class328.runesSprite = null;
			class368.leftTitleSprite = null;
			AttackOption.rightTitleSprite = null;
			FillMode.logoSprite = null;
			Login.title_muteSprite = null;
			class423.options_buttons_0Sprite = null;
			class421.options_buttons_2Sprite = null;
			class163.worldSelectBackSprites = null;
			Interpreter.worldSelectFlagSprites = null;
			class151.worldSelectArrows = null;
			class414.worldSelectStars = null;
			LoginScreenAnimation.field1282 = null;
			class27.loginScreenRunesAnimation.method2584();
			class92.method2440(0, 100);
			class1.method8().method7360(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "955390231"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return NpcOverrides.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
