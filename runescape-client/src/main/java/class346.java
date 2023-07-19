import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class346 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final class346 field3863;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final class346 field3860;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1852756963
	)
	final int field3861;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1077429433
	)
	final int field3862;

	static {
		field3863 = new class346(51, 27, 800, 0, 16, 16);
		field3860 = new class346(25, 28, 800, 656, 40, 40);
	}

	class346(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3861 = var5;
		this.field3862 = var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1801743156"
	)
	public static int method6649(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
