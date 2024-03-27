import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("an")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1625450923"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		label130: {
			HttpURLConnection var12;
			label131: {
				try {
					var9 = true;
					String var3 = var1.field1469.getProtocol();
					if (var3.equals("http")) {
						var2 = this.openHttpConnection(var1);
					} else {
						if (!var3.equals("https")) {
							var1.field1465 = UrlRequest.field1464;
							var9 = false;
							break label130;
						}

						var2 = this.openHttpsConnection(var1);
					}

					this.method2806(var2, var1);
					var9 = false;
					break label131;
				} catch (IOException var10) {
					var1.field1465 = UrlRequest.field1464;
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ljava/net/URLConnection;",
		garbageValue = "-1804346988"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1469.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Ljava/net/URLConnection;",
		garbageValue = "-958310751"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1469.openConnection();
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
}
