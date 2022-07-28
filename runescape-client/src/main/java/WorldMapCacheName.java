import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ij")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lij;")
	public static final WorldMapCacheName field2867 = new WorldMapCacheName("details");

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lij;")
	public static final WorldMapCacheName field2861 = new WorldMapCacheName("compositemap");

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lij;")
	public static final WorldMapCacheName field2863 = new WorldMapCacheName("compositetexture");

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lij;")
	static final WorldMapCacheName field2866 = new WorldMapCacheName("area");

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lij;")
	public static final WorldMapCacheName field2864 = new WorldMapCacheName("labels");

	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = 350469975)
	static int field2862;

	@ObfuscatedName("hy")
	@ObfuscatedGetter(intValue = -1050242269)
	static int field2868;

	@ObfuscatedName("w")
	@Export("name")
	public final String name;

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-849774060")
	static int method5048(int var0) {
		return ((int) ((Math.log(((double) (var0))) / Interpreter.field843 - 7.0) * 256.0));
	}
}