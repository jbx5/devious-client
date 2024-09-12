import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4483(6, 22, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4477(7, 41, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4489(8, 42, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4478(9, 43, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4469(10, 44, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4480(11, 45, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4481(12, 46, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4482(13, 47, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4486(14, 48, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4484(15, 49, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4485(16, 52, false, false, true);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1795782681
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1196051647
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("as")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ay")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
