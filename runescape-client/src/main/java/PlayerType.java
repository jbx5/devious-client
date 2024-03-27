import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4343(6, 22, false, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4350(7, 41, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4342(8, 42, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4345(9, 43, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4341(10, 44, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4339(11, 45, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4344(12, 46, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4352(13, 47, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4346(14, 48, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4347(15, 49, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4348(16, 52, false, false, true);

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field4332;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -393601945
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1453228269
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("av")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aa")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1867370469"
	)
	static void method6892(int var0) {
		class469.field4862 = var0;
		class469.field4866 = new class469[var0];
		class277.field3054 = 0;
	}
}
