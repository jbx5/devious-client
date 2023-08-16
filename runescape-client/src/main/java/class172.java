import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class172 {
	@ObfuscatedName("ai")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;I)Luk;",
		garbageValue = "2141415166"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!ApproximateRouteStrategy.method1228(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class493.method8806();
			}

			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1301151779"
	)
	public static boolean method3457(int var0) {
		if (class305.field3405.isEmpty()) {
			return false;
		} else {
			MusicSong var1 = (MusicSong)class305.field3405.get(0);
			return var1 != null && var0 == var1.musicTrackGroupId;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ltb;I)Ljava/lang/Object;",
		garbageValue = "263841727"
	)
	static Object method3458(class502 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5031) {
			case 1:
				return Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	static int method3459(int var0) {
		return var0 * 3 + 600;
	}
}
