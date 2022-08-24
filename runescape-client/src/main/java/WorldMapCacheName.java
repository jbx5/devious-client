import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("it")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lit;")
	public static final WorldMapCacheName field2872 = new WorldMapCacheName("details");

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lit;")
	public static final WorldMapCacheName field2869 = new WorldMapCacheName("compositemap");

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lit;")
	public static final WorldMapCacheName field2874 = new WorldMapCacheName("compositetexture");

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lit;")
	static final WorldMapCacheName field2871 = new WorldMapCacheName("area");

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lit;")
	public static final WorldMapCacheName field2868 = new WorldMapCacheName("labels");

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -113453181)
	static int field2870;

	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-116")
	static final void method4984(String var0) {
		StringBuilder var10000 = new StringBuilder().append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString();
		VarcInt.addGameMessage(30, "", var1);
	}
}