import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("nt")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("friend")
	TriBool friend;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "718806536")
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-541482210")
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}
		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1600645243")
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = (MusicPatchPcmStream.friendSystem.friendsList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1976733883")
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "8")
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}
		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "58")
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = (MusicPatchPcmStream.friendSystem.ignoreList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/Date;", garbageValue = "-653757242")
	static Date method6695() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}