import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ax")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V",
		garbageValue = "2145007281"
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
						String var3 = var1.field1502.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1504 = UrlRequest.field1503;
								var9 = false;
								break label131;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method3134(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1504 = UrlRequest.field1503;
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Ljava/net/URLConnection;",
		garbageValue = "373156715"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1502.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Ljava/net/URLConnection;",
		garbageValue = "-1357287561"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1502.openConnection();
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "965500672"
	)
	static final int method3160(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}
}
