import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qr")
public class class419 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	public class424 field4659;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public class423 field4657;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public class423 field4658;

	public class419() {
		this.field4659 = new class424();
		this.field4657 = new class423();
		this.field4658 = new class423(1.0F, 1.0F, 1.0F);
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class419)) {
			return false;
		} else {
			class419 var2 = (class419)var1;
			return this.field4659.equals(var2.field4659) && this.field4657.method7820(var2.field4657) && this.field4658.method7820(var2.field4658);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4659.hashCode();
		var3 = var3 * 31 + this.field4657.hashCode();
		var3 = 31 * var3 + this.field4658.hashCode();
		return var3;
	}

	public String toString() {
		return "[" + this.field4659.toString() + "|" + this.field4657.toString() + "|" + this.field4658.toString() + "]";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "2017912083"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "2020304012"
	)
	static int method7761(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2035298484"
	)
	static final void method7762() {
		if (HttpRequestTask.ClanChat_inClanChat) {
			if (HttpRequestTask.friendsChat != null) {
				HttpRequestTask.friendsChat.sort();
			}

			for (int var0 = 0; var0 < ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerCount; ++var0) {
				Player var1 = ConcurrentMidiTask.topLevelWorldView.players[ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerIndices[var0]];
				var1.clearIsInFriendsChat();
			}

			HttpRequestTask.ClanChat_inClanChat = false;
		}

	}
}
