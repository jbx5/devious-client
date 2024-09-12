import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1383258553
	)
	int field3711;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	MusicPatchNode2 field3705;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 107915439
	)
	int field3712;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 528717609
	)
	int field3706;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 76825659
	)
	int field3707;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 656149513
	)
	int field3708;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1533372179
	)
	int field3709;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1635351087
	)
	int field3710;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 693097243
	)
	int field3701;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -274726912
	)
	int field3720;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 127781599
	)
	int field3713;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1324390209
	)
	int field3714;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1783172009
	)
	int field3704;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -184078825
	)
	int field3716;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1996035633
	)
	int field3717;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -459326909
	)
	int field3718;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 601813091
	)
	int field3703;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1429130885
	)
	int field3721;

	MusicPatchNode() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1113329963"
	)
	void method6754() {
		this.table = null;
		this.rawSound = null;
		this.field3705 = null;
		this.stream = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	static void method6756() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class461.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class461.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
