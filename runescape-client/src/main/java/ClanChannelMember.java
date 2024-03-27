import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("az")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1897540225
	)
	@Export("world")
	public int world;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lvg;",
		garbageValue = "-1806321092"
	)
	static SpritePixels method3164(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}
}
