import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class355 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field3729;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	SpritePixels field3728;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;)V"
	)
	class355(String var1, UrlRequester var2) {
		try {
			this.field3729 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3729 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class355(UrlRequest var1) {
		this.field3729 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "818926719"
	)
	SpritePixels method6570() {
		if (this.field3728 == null && this.field3729 != null && this.field3729.isDone()) {
			if (this.field3729.getResponse() != null) {
				this.field3728 = class224.readSpritePixelsFromBytes(this.field3729.getResponse());
			}

			this.field3729 = null;
		}

		return this.field3728;
	}
}
