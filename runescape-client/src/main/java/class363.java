import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class363 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final class363 field3967;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final class363 field3964;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1670519837
	)
	final int field3965;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 459864505
	)
	final int field3966;

	static {
		field3967 = new class363(51, 27, 800, 0, 16, 16);
		field3964 = new class363(25, 28, 800, 656, 40, 40);
	}

	class363(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3965 = var5;
		this.field3966 = var6;
	}
}
