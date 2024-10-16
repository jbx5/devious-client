import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class30 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;[II)[Ljava/lang/Object;",
		garbageValue = "767532376"
	)
	static Object[] method460(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class544 var7 = JagexCache.method4512(var1[var5]);
				var3[var6] = var7.method9932(var0);
			}
		}

		return var3;
	}
}
