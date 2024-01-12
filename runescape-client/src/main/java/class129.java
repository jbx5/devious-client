import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public enum class129 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1513(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1510(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1512(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1515(3, 3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1514(4, 4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1227940229
	)
	final int field1511;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 738105409
	)
	final int field1516;

	class129(int var3, int var4) {
		this.field1511 = var3;
		this.field1516 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1516;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-696903355"
	)
	public static void method3075(int var0, int var1) {
		Iterator var2 = class319.field3463.iterator();

		while (var2.hasNext()) {
			class325 var3 = (class325)var2.next();
			var3.vmethod6254(var0, var1);
		}

	}
}
