import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class334 extends Node {
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2061431973
	)
	int field3622;
	@ObfuscatedName("ah")
	BitSet field3618;

	class334(int var1) {
		this.field3622 = var1;
		this.field3618 = new BitSet(128);
	}
}
