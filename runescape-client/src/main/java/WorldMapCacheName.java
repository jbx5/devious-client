import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static final WorldMapCacheName field3068;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static final WorldMapCacheName field3063;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static final WorldMapCacheName field3062;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static final WorldMapCacheName field3065;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static final WorldMapCacheName field3066;
	@ObfuscatedName("ai")
	@Export("name")
	public final String name;

	static {
		field3068 = new WorldMapCacheName("details");
		field3063 = new WorldMapCacheName("compositemap");
		field3062 = new WorldMapCacheName("compositetexture");
		field3065 = new WorldMapCacheName("area");
		field3066 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "101"
	)
	public static HitSplatDefinition method5560(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
