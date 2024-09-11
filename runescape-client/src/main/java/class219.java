import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class219 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmx;",
		garbageValue = "861257965"
	)
	public static class324[] method4473() {
		return new class324[]{class324.field3410, class324.field3418, class324.field3415, class324.field3411, class324.field3413, class324.field3412, class324.field3414, class324.field3416, class324.field3417, class324.field3422, class324.field3419};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Ljava/lang/String;Ljava/lang/String;B)[Lvt;",
		garbageValue = "5"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!HttpJsonRequestBody.method9207(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = TileItem.method2983();
			}

			return var5;
		}
	}
}
