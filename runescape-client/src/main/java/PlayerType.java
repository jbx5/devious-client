import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4450(6, 22, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4448(7, 41, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4449(8, 42, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4441(9, 43, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4451(10, 44, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4462(11, 45, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4453(12, 46, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4454(13, 47, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4455(14, 48, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4456(15, 49, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4457(16, 52, false, false, true);

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static class529 field4444;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2130659373
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1013815813
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("aa")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("as")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
