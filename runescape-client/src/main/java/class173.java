import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class173 extends DualNode {
	@ObfuscatedName("vw")
	static List field1847;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("as")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;I)Lvg;",
		garbageValue = "-91396228"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return Huffman.method6973(var0, var3, var4);
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "252343269"
	)
	static final int method3545(int var0) {
		return Math.abs(var0 - Script.cameraYaw) > 1024 ? 2048 * (var0 < Script.cameraYaw ? 1 : -1) + var0 : var0;
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1951363951"
	)
	static void method3543() {
		if (Client.oculusOrbState == 1) {
			Client.field625 = true;
		}

	}
}
