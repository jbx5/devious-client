import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public class class453 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 331279603
	)
	public static int field4867;

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIB)Ldy;",
		garbageValue = "-15"
	)
	static final PendingSpawn method8355(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
