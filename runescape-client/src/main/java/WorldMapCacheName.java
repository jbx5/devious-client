import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lhw;")

	public static final WorldMapCacheName field2413;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lhw;")

	public static final WorldMapCacheName field2414;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lhw;")

	public static final WorldMapCacheName field2418;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lhw;")

	static final WorldMapCacheName field2419;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lhw;")

	public static final WorldMapCacheName field2417;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;
	static 
	{
		field2413 = new WorldMapCacheName("details");
		field2414 = new WorldMapCacheName("compositemap");
		field2418 = new WorldMapCacheName("compositetexture");
		field2419 = new WorldMapCacheName("area");
		field2417 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}