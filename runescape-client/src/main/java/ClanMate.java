import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("friend")
	TriBool friend;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"87")

	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1690991920")

	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-15358")

	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = (class155.friendSystem.friendsList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-990460013")

	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(S)Z", garbageValue = 
	"3800")

	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"22")

	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = (class155.friendSystem.ignoreList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}
}