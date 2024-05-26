import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	public static final WorldMapCacheName field3236;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	public static final WorldMapCacheName field3233;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	public static final WorldMapCacheName field3234;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static final WorldMapCacheName field3235;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	public static final WorldMapCacheName field3232;
	@ObfuscatedName("ab")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aa")
	@Export("name")
	public final String name;

	static {
		field3236 = new WorldMapCacheName("details");
		field3233 = new WorldMapCacheName("compositemap");
		field3234 = new WorldMapCacheName("compositetexture");
		field3235 = new WorldMapCacheName("area");
		field3232 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method6011() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
