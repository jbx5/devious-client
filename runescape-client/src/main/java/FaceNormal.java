import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 918683499
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -385696985
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 184381595
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILny;IIIII[FI)Lny;",
		garbageValue = "-387724970"
	)
	static Widget method5155(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)var1.width * var7[0]);
		var8.rawY = (int)((float)var1.height * var7[1]);
		var8.rawWidth = (int)(var7[2] * (float)var1.width);
		var8.rawHeight = (int)(var7[3] * (float)var1.height);
		return var8;
	}
}
