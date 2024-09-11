import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hj")
public class class190 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-57"
	)
	public static final boolean method3948(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (LoginPacket.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class528.field5299;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class528.field5300;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-112"
	)
	static int method3947(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2087493349"
	)
	static int method3944(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	static final void method3950() {
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
}
