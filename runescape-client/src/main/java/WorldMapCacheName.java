import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3261;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3259;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3258;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final WorldMapCacheName field3263;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final WorldMapCacheName field3262;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aq")
	@Export("name")
	public final String name;

	static {
		field3261 = new WorldMapCacheName("details");
		field3259 = new WorldMapCacheName("compositemap");
		field3258 = new WorldMapCacheName("compositetexture");
		field3263 = new WorldMapCacheName("area");
		field3262 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
