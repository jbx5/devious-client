import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class113 extends UrlRequester {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2047133239
	)
	static int field1452;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -674991707
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ac")
	final boolean field1451;

	public class113(boolean var1, int var2) {
		super(var2);
		this.field1451 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Let;B)V",
		garbageValue = "-114"
	)
	void vmethod2839(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label135: {
			label127: {
				try {
					label130: {
						var9 = true;
						String var3 = var1.field1453.getProtocol();
						if (var3.equals("http")) {
							var2 = this.method2835(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1456 = UrlRequest.field1455;
								var9 = false;
								break label130;
							}

							var2 = this.method2836(var1);
						}

						this.method2812(var2, var1);
						var9 = false;
						break label135;
					}
				} catch (IOException var10) {
					var1.field1456 = UrlRequest.field1455;
					var9 = false;
					break label127;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ljava/net/URLConnection;",
		garbageValue = "46"
	)
	URLConnection method2835(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1453.openConnection();
		this.method2823(var2);
		return var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ljava/net/URLConnection;",
		garbageValue = "-94"
	)
	URLConnection method2836(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1453.openConnection();
		if (!this.field1451) {
			var2.setSSLSocketFactory(class15.method179());
		}

		this.method2823(var2);
		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhe;",
		garbageValue = "-242071193"
	)
	static HorizontalAlignment[] method2844() {
		return new HorizontalAlignment[]{HorizontalAlignment.field2018, HorizontalAlignment.field2016, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1761588634"
	)
	static void method2843() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (ModeWhere.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = PacketBufferNode.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class92.getWidget(var4);
					if (var5 != null) {
						class218.invalidateWidget(var5);
					}
				}
			}
		}

	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1946244652"
	)
	static final void method2845() {
		Client.field732 = Client.cycleCntr;
	}
}
