import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 881044235
	)
	public static int field1059;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1637987935
	)
	static int field1055;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1811013267
	)
	@Export("group")
	int group;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2070786127
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	boolean field1057;

	InterfaceParent() {
		this.field1057 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1057971079"
	)
	static String method2408(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class415.field4643[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class415.field4643[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class415.field4643[(var6 & 15) << 2 | var7 >>> 6]).append(class415.field4643[var7 & 63]);
				} else {
					var3.append(class415.field4643[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class415.field4643[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1756730024"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class138.logOut();
		switch(var0) {
		case 1:
			class532.updateLoginIndex(24);
			class130.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class535.method9464();
		}

	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIIILvc;Lnm;I)V",
		garbageValue = "1214583396"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			FileSystem.redHintArrowSprite.method10094(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			UrlRequest.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
