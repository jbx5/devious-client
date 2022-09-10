import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("l")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = -2140509633
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("c")
	@Export("url")
	final URL url;
	@ObfuscatedName("p")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("f")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 118
	} // L: 119

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2041738934"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 122
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2020883939"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 126
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-58"
	)
	public String method2714() {
		return this.url.toString(); // L: 130
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIILqi;Lko;I)V",
		garbageValue = "-1583573099"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11875
		if (var6 > 4225 && var6 < 90000) { // L: 11876
			int var7 = Client.camAngleY & 2047; // L: 11877
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11878
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11879
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11880
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11881
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11882
			int var14 = var5.width / 2 - 25; // L: 11883
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11884
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11885
			byte var17 = 20; // L: 11886
			GraphicsObject.redHintArrowSprite.method8363(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11887
		} else {
			class146.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11889
		}

	} // L: 11890
}
