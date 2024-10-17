import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public enum class135 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1576(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1577(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1583(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1579(3, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1580(4, 4);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1352006539
	)
	final int field1581;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1456190951
	)
	final int field1586;

	class135(int var3, int var4) {
		this.field1581 = var3;
		this.field1586 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1586;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "1"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3435() {
		int[] var0 = Client.playerUpdateManager.playerIndices;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();

			int var3;
			for (var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
				Player var6 = var2.players[var0[var3]];
				if (var6 != null && var6.overheadTextCyclesRemaining > 0) {
					--var6.overheadTextCyclesRemaining;
					if (var6.overheadTextCyclesRemaining == 0) {
						var6.overheadText = null;
					}
				}
			}

			for (var3 = 0; var3 < var2.npcCount; ++var3) {
				int var4 = var2.npcIndices[var3];
				NPC var5 = var2.npcs[var4];
				if (var5 != null && var5.overheadTextCyclesRemaining > 0) {
					--var5.overheadTextCyclesRemaining;
					if (var5.overheadTextCyclesRemaining == 0) {
						var5.overheadText = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-4311112"
	)
	public static boolean method3431() {
		return Client.staffModLevel >= 2;
	}
}
