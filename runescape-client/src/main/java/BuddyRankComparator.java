import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("da")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(descriptor = "Llu;")
	static Archive field1380;

	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnh;Lnh;B)I", garbageValue = "-6")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "134944919")
	static int method2690(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++TaskHandler.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			GrandExchangeOfferAgeComparator.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++TaskHandler.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++TaskHandler.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class21.method303()) ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--TaskHandler.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				TaskHandler.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				TaskHandler.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++TaskHandler.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "144313696")
	static void method2698() {
		if (Client.field701 && class28.localPlayer != null) {
			int var0 = class28.localPlayer.pathX[0];
			int var1 = class28.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}
			ObjectSound.oculusOrbFocalPointX = class28.localPlayer.x;
			int var2 = SecureRandomFuture.getTileHeight(class28.localPlayer.x, class28.localPlayer.y, FriendSystem.Client_plane) - Client.camFollowHeight;
			if (var2 < FileSystem.field1753) {
				FileSystem.field1753 = var2;
			}
			class306.oculusOrbFocalPointY = class28.localPlayer.y;
			Client.field701 = false;
		}
	}
}