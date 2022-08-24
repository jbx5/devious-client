import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("dm")
public class class120 implements class112 {
	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1513821552")
	public static int method2735(int var0) {
		return WorldMapSection2.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "433143709")
	public static void method2734() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}