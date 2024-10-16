import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3263;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3270;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3264;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static final WorldMapCacheName field3265;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static final WorldMapCacheName field3266;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ay")
	@Export("name")
	public final String name;

	static {
		field3263 = new WorldMapCacheName("details");
		field3270 = new WorldMapCacheName("compositemap");
		field3264 = new WorldMapCacheName("compositetexture");
		field3265 = new WorldMapCacheName("area");
		field3266 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "-1811009939"
	)
	static class426 method6364() {
		synchronized(class426.field4768) {
			if (class426.field4770 == 0) {
				return new class426();
			} else {
				class426.field4768[--class426.field4770].method8202();
				return class426.field4768[class426.field4770];
			}
		}
	}
}
