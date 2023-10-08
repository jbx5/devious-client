import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4279(6, 22, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4272(7, 41, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4273(8, 42, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4285(9, 43, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4275(10, 44, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4270(11, 45, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4277(12, 46, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4278(13, 47, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4267(14, 48, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4274(15, 49, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4276(16, 52, false, false, true);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1322573275
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2100708859
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ae")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aw")
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
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1861309020"
	)
	public static void method6830() {
		DbTableType.DBTableType_cache.clear();
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)V",
		garbageValue = "-1410811311"
	)
	static final void method6828(Actor var0, int var1) {
		class150.worldToScreen(var0.x, var0.y, var1);
	}
}
