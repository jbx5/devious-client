import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public enum class133 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1565(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1561(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1562(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1563(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1564(4, 4);

	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1524882693
	)
	static int field1560;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -997691535
	)
	final int field1568;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1133507491
	)
	final int field1566;

	class133(int var3, int var4) {
		this.field1568 = var3;
		this.field1566 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1566;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-507118558"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = UserComparator10.getPreferencesFile("", class109.field1400.name, true);
			Buffer var1 = class105.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}
}
