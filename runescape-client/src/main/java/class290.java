import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.net.MalformedURLException;
import net.runelite.mapping.Export;
@ObfuscatedName("ki")
public class class290 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lct;")
	UrlRequest field3331;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqe;")
	SpritePixels field3332;

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcd;)V")
	class290(String var1, UrlRequester var2) {
		try {
			this.field3331 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3331 = null;
		}
	}

	@ObfuscatedSignature(descriptor = "(Lct;)V")
	class290(UrlRequest var1) {
		this.field3331 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Lqe;", garbageValue = "47")
	SpritePixels method5562() {
		if (this.field3332 == null && this.field3331 != null && this.field3331.isDone()) {
			if (this.field3331.getResponse() != null) {
				this.field3332 = ItemLayer.method3920(this.field3331.getResponse());
			}
			this.field3331 = null;
		}
		return this.field3332;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue = "21073206")
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		SecureRandomFuture.addChatMessage(var0, var1, var2, ((String) (null)));
	}
}