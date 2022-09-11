import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class292 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	UrlRequest field3357;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	SpritePixels field3358;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lch;)V"
	)
	class292(String var1, UrlRequester var2) {
		try {
			this.field3357 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3357 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lcm;)V"
	)
	class292(UrlRequest var1) {
		this.field3357 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "1783597520"
	)
	SpritePixels method5722() {
		if (this.field3358 == null && this.field3357 != null && this.field3357.isDone()) { // L: 28
			if (this.field3357.getResponse() != null) { // L: 29
				this.field3358 = class21.method322(this.field3357.getResponse()); // L: 30
			}

			this.field3357 = null; // L: 32
		}

		return this.field3358; // L: 34
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILgz;IS)V",
		garbageValue = "-3813"
	)
	static void method5723(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 128; // L: 75
		var5.y = var2 * 16384; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.maxX = (var6 + var1) * 16384; // L: 83
		var5.maxY = (var7 + var2) * 128; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field823 = var3.int7 * 128; // L: 86
		var5.field819 = var3.int5; // L: 87
		var5.field827 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field829 = var5.field819 + (int)(Math.random() * (double)(var5.field827 - var5.field819));
		}

	} // L: 96

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1017893852"
	)
	public static void method5724() {
		Widget.Widget_cachedSprites.clear(); // L: 766
		Widget.Widget_cachedModels.clear(); // L: 767
		Widget.Widget_cachedFonts.clear(); // L: 768
		Widget.Widget_cachedSpriteMasks.clear(); // L: 769
	} // L: 770
}
