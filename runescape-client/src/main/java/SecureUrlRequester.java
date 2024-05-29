import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1360015913
	)
	static int field1482;
	@ObfuscatedName("af")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)V",
		garbageValue = "0"
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
						String var3 = var1.field1492.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1489 = UrlRequest.field1486;
								var9 = false;
								break label131;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method2909(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1489 = UrlRequest.field1486;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Ljava/net/URLConnection;",
		garbageValue = "1736534596"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1492.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)Ljava/net/URLConnection;",
		garbageValue = "-122"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1492.openConnection();
		if (!this.secureHttps) {
			var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method182());
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1843380512"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (AsyncRestClient.widgetDefinition.loadInterface(var0)) {
			ClientPreferences.runComponentCloseListeners(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
