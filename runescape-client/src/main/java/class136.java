import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class136 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1609;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1601;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1599;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1602;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1600;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1611;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 669295793
	)
	final int field1605;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1253664005
	)
	final int field1606;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 426669381
	)
	final int field1607;

	static {
		field1609 = new class136(0, 0, (String)null, 0);
		field1601 = new class136(1, 1, (String)null, 9);
		field1599 = new class136(2, 2, (String)null, 3);
		field1602 = new class136(3, 3, (String)null, 6);
		field1600 = new class136(4, 4, (String)null, 1);
		field1611 = new class136(5, 5, (String)null, 3);
	}

	class136(int var1, int var2, String var3, int var4) {
		this.field1605 = var1;
		this.field1606 = var2;
		this.field1607 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1606;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619182222"
	)
	int method3168() {
		return this.field1607;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Loa;",
		garbageValue = "-1507088397"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4462, PlayerType.field4449, PlayerType.field4453, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.field4451, PlayerType.field4457, PlayerType.field4450, PlayerType.PlayerType_playerModerator, PlayerType.field4456, PlayerType.field4441, PlayerType.field4455, PlayerType.field4454, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4448};
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "12"
	)
	static final void method3174(WorldView var0) {
		int[] var1 = var0.playerUpdateManager.playerIndices;

		int var2;
		for (var2 = 0; var2 < var0.playerUpdateManager.playerCount; ++var2) {
			Player var5 = var0.players[var1[var2]];
			if (var5 != null && var5.overheadTextCyclesRemaining > 0) {
				--var5.overheadTextCyclesRemaining;
				if (var5.overheadTextCyclesRemaining == 0) {
					var5.overheadText = null;
				}
			}
		}

		for (var2 = 0; var2 < var0.npcCount; ++var2) {
			int var3 = var0.npcIndices[var2];
			NPC var4 = var0.npcs[var3];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

	}
}
