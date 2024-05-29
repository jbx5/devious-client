import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4425(6, 22, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4419(7, 41, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4428(8, 42, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4418(9, 43, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4422(10, 44, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4423(11, 45, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4414(12, 46, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4412(13, 47, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4424(14, 48, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4427(15, 49, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4430(16, 52, false, false, true);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 661917803
	)
	@Export("id")
	final int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 503536659
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("aw")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ad")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
