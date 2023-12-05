import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class140 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1617(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1608(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1618(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1610(3, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1611(4, 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1613(5, 5),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1607(6, 6),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1614(7, 7),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1615(8, 8);

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static Fonts field1609;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -72417869
	)
	final int field1616;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 429257913
	)
	final int field1619;

	class140(int var3, int var4) {
		this.field1616 = var3;
		this.field1619 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1619;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "1249641264"
	)
	public static VarcInt method3195(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class30.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3593(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
