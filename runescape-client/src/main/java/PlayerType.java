import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4231(6, 22, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4225(7, 41, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4214(8, 42, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4222(9, 43, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4224(10, 44, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4223(11, 45, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4226(12, 46, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4227(13, 47, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4228(14, 48, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4221(15, 49, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4230(16, 52, false, false, true);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2099070601
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 466937399
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ao")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ac")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
