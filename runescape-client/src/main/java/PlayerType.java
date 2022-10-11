import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3990(6, 22, false, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3988(7, 41, false, false, true),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3992(8, 42, false, false, true),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3993(9, 43, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3994(10, 44, false, false, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3995(11, 45, false, false, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3996(12, 46, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3986(13, 47, false, false, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3998(14, 48, false, false, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3999(15, 49, false, false, true);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1197271127
	)
	@Export("id")
	final int id;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -938815979
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("l")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("e")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 33
		this.modIcon = var4; // L: 34
		this.isPrivileged = var6; // L: 35
		this.isUser = var7; // L: 36
	} // L: 37

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 41
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-26"
	)
	static int method5943(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 4451
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Widget.method5882() ? 1 : 0; // L: 4452
			return 1; // L: 4453
		} else {
			return 2; // L: 4455
		}
	}
}
