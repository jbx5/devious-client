import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2680;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2678;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2681;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final WorldMapCacheName field2677;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2682;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static IndexedSprite[] field2685;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -957921043
	)
	static int field2683;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;

	static {
		field2680 = new WorldMapCacheName("details");
		field2678 = new WorldMapCacheName("compositemap");
		field2681 = new WorldMapCacheName("compositetexture");
		field2677 = new WorldMapCacheName("area");
		field2682 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1813975840"
	)
	static int method5111(int var0) {
		return var0 * 3 + 600;
	}
}
