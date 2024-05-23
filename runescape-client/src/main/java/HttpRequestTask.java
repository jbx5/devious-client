import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("gy")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1372916459
	)
	static int field96;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final HttpRequest field98;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lae;Lah;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field98 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field98.connect()) {
				class484.method8889(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field98.getResponse();
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	@Export("hasAcceptedEULA")
	static boolean hasAcceptedEULA() {
		return class459.clientPreferences.method2529() >= Client.field531;
	}
}
