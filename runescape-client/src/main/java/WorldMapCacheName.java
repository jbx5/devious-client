import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("io")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lio;")
	public static final WorldMapCacheName field2867;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lio;")
	public static final WorldMapCacheName field2865;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lio;")
	public static final WorldMapCacheName field2866;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lio;")
	static final WorldMapCacheName field2869;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lio;")
	public static final WorldMapCacheName field2868;

	@ObfuscatedName("e")
	@Export("name")
	public final String name;

	static {
		field2867 = new WorldMapCacheName("details");
		field2865 = new WorldMapCacheName("compositemap");
		field2866 = new WorldMapCacheName("compositetexture");
		field2869 = new WorldMapCacheName("area");
		field2868 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lgx;", garbageValue = "1464975473")
	public static VarbitComposition method5054(int var0) {
		VarbitComposition var1 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			VarbitComposition.VarbitDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}