import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public abstract class class150 extends Node {
	class150() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	abstract void vmethod3778(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	abstract void vmethod3771(ClanSettings var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "234253922"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		Client.sortWorlds(SoundSystem.World_worlds, 0, SoundSystem.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2107291629"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = class461.clientPreferences.getEULA() >= Client.field520;
		if (!var2) {
			var1 = 12;
		} else if (class1.client.containsAccessAndRefreshToken() || class1.client.otlTokenRequesterInitialized() || class1.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		LoginState.updateLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class53.otpMedium = 0;
			Language.otp = "";
		}

		MusicPatchNode.method6756();
		class107.focusPasswordWhenUsernameFilled();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "84"
	)
	static void method3480(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "886396137"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
