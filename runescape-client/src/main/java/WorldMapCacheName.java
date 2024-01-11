import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2669;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2671;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2670;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static final WorldMapCacheName field2673;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2672;
	@ObfuscatedName("hm")
	static String field2676;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -532013549
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ar")
	@Export("name")
	public final String name;

	static {
		field2669 = new WorldMapCacheName("details");
		field2671 = new WorldMapCacheName("compositemap");
		field2670 = new WorldMapCacheName("compositetexture");
		field2673 = new WorldMapCacheName("area");
		field2672 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
