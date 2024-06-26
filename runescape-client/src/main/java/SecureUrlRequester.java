import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ap")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1132577463"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		label129: {
			HttpURLConnection var12;
			label130: {
				try {
					var9 = true;
					String var3 = var1.field1483.getProtocol();
					if (var3.equals("http")) {
						var2 = this.openHttpConnection(var1);
					} else {
						if (!var3.equals("https")) {
							var1.field1482 = UrlRequest.field1485;
							var9 = false;
							break label129;
						}

						var2 = this.openHttpsConnection(var1);
					}

					this.method2943(var2, var1);
					var9 = false;
					break label130;
				} catch (IOException var10) {
					var1.field1482 = UrlRequest.field1485;
					var9 = false;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
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

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			HttpURLConnection var4 = (HttpURLConnection)var2;
			var4.disconnect();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)Ljava/net/URLConnection;",
		garbageValue = "-64"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1483.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)Ljava/net/URLConnection;",
		garbageValue = "-122"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1483.openConnection();
		if (!this.secureHttps) {
			var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method197());
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}
}
