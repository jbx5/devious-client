import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final WorldMapCacheName field2896;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final WorldMapCacheName field2894;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final WorldMapCacheName field2895;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final WorldMapCacheName field2898;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	public static final WorldMapCacheName field2900;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 793212413
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("w")
	@Export("name")
	public final String name;

	static {
		field2896 = new WorldMapCacheName("details"); // L: 4
		field2894 = new WorldMapCacheName("compositemap"); // L: 5
		field2895 = new WorldMapCacheName("compositetexture"); // L: 6
		field2898 = new WorldMapCacheName("area"); // L: 7
		field2900 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llv;Ljava/lang/String;Ljava/lang/String;B)Lqu;",
		garbageValue = "5"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 95
		int var4 = var0.getFileId(var3, var2); // L: 96
		return class431.method7757(var0, var3, var4); // L: 97
	}
}
