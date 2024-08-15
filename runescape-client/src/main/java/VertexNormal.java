import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1360818691
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 480284201
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1452093495
	)
	@Export("z")
	int z;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -492910779
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}
}
