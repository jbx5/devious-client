import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)I",
		garbageValue = "1898768769"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("am")
	public static final void method2992(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				GameBuild.method6934(var0 - 1L);
				GameBuild.method6934(1L);
			} else {
				GameBuild.method6934(var0);
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lff;",
		garbageValue = "-1880947968"
	)
	static class132[] method2996() {
		return new class132[]{class132.field1555, class132.field1553, class132.field1554, class132.field1560, class132.field1556, class132.field1561};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "116060212"
	)
	static int method2997(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var0.method6806(var1);
			return 1;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static final void method2990() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class1.method12(var0);
			} else {
				var0.remove();
			}
		}

	}
}
