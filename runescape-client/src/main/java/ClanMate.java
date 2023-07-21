import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2011263729"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1028184707"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class177.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1660942663"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1198262183"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class177.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "3"
	)
	static int method7946(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "784115253"
	)
	static final void method7938(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class150.clientPreferences.updateSoundEffectVolume(var0);
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "779330688"
	)
	static String method7947(String var0) {
		PlayerType[] var1 = PendingSpawn.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(SecureRandomCallable.method2253(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
