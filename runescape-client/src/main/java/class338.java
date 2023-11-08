import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class338 {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field3586;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	SpritePixels field3584;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class338(String var1, UrlRequester var2) {
		try {
			this.field3586 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3586 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lea;)V"
	)
	class338(UrlRequest var1) {
		this.field3586 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Luz;",
		garbageValue = "1464542862"
	)
	SpritePixels method6307() {
		if (this.field3584 == null && this.field3586 != null && this.field3586.isDone()) {
			if (this.field3586.getResponse() != null) {
				this.field3584 = WorldMapArchiveLoader.method8710(this.field3586.getResponse());
			}

			this.field3586 = null;
		}

		return this.field3584;
	}
}
