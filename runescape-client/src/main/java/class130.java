import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public enum class130 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1524(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1523(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1525(2, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1526(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1522(4, 4);

	@ObfuscatedName("wd")
	static List field1529;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -992322605
	)
	final int field1527;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1058172471
	)
	final int field1528;

	class130(int var3, int var4) {
		this.field1527 = var3;
		this.field1528 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1528;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "861803654"
	)
	public static void method3012(int var0, int var1) {
		VarbitComposition var2 = Messages.method2802(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}
}
