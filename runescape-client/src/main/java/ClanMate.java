import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-14"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1398592953"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class332.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-192003731"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class332.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "1973794054"
	)
	static boolean method8252(PlayerComposition var0) {
		if (var0.equipment[0] < 512) {
			return false;
		} else {
			ItemComposition var1 = class341.ItemDefinition_get(var0.equipment[0] - 512);
			return var1.maleModel1 != class205.field2257.field2259 && var1.maleModel2 != class205.field2257.field2259;
		}
	}
}
