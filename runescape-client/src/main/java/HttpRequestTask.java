import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("eu")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field92;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final HttpRequest field94;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lay;Lap;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field94 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field94.connect()) {
				class219.method4260(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field94.getResponse();
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2072070052"
	)
	@Export("updateLoginState")
	static void updateLoginState(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
