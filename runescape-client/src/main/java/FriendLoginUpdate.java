import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1621096293
	)
	public int field4936;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ag")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvo;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4936 = (int)(WorldMapData_1.method4861() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1061672460"
	)
	protected static final void method8525() {
		class146.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class156.gameCyclesToDo = 0;
	}
}
