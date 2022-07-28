import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kl")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkl;")
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3977(6, 22, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3970(7, 41, false, false, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3973(8, 42, false, false, true),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3979(9, 43, false, false, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3969(10, 44, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3976(11, 45, false, false, true),
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3975(12, 46, false, false, true),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3963(13, 47, false, false, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3971(14, 48, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lkl;")
	field3972(15, 49, false, false, true);
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -358361805)
	@Export("id")
	final int id;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -882770757)
	@Export("modIcon")
	public final int modIcon;

	@ObfuscatedName("k")
	@Export("isPrivileged")
	public final boolean isPrivileged;

	@ObfuscatedName("v")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}