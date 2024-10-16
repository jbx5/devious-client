import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4510(6, 22, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4519(7, 41, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4514(8, 42, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4513(9, 43, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4512(10, 44, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4515(11, 45, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4521(12, 46, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4517(13, 47, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4518(14, 48, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4516(15, 49, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4509(16, 52, false, false, true);

	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -892337617
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 178923161
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 145246295
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ac")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("av")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
