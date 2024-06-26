import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class135.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "299521"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-2320"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "197382137"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class135.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIB)[Lvg;",
		garbageValue = "1"
	)
	public static SpritePixels[] method8542(AbstractArchive var0, int var1, int var2) {
		return !class146.method3260(var0, var1, var2) ? null : WorldMapRegion.method4809();
	}
}
