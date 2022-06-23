import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nj")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("friend")
	TriBool friend;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2088884239")
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-138013262")
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}
		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-43")
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = (Player.friendSystem.friendsList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1504039009")
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-61")
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}
		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2033430026")
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = (Player.friendSystem.ignoreList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "34")
	public static int method6650(int var0) {
		return class401.field4442[var0 & 16383];
	}
}