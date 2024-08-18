import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class136 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1596;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1599;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1592;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1594;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1595;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1597;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1598;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1601;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1600;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1610;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1602;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1603;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1593;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1605;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1606;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1607;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class136 field1608;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1569608401
	)
	final int field1609;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1287875847
	)
	final int field1604;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1498774137
	)
	final int field1611;

	static {
		field1596 = new class136(0, 0, (String)null, -1, -1);
		field1599 = new class136(1, 1, (String)null, 0, 2);
		field1592 = new class136(2, 2, (String)null, 1, 2);
		field1594 = new class136(3, 3, (String)null, 2, 2);
		field1595 = new class136(4, 4, (String)null, 3, 1);
		field1597 = new class136(5, 5, (String)null, 4, 1);
		field1598 = new class136(6, 6, (String)null, 5, 1);
		field1601 = new class136(7, 7, (String)null, 6, 3);
		field1600 = new class136(8, 8, (String)null, 7, 3);
		field1610 = new class136(9, 9, (String)null, 8, 3);
		field1602 = new class136(10, 10, (String)null, 0, 7);
		field1603 = new class136(11, 11, (String)null, 1, 7);
		field1593 = new class136(12, 12, (String)null, 2, 7);
		field1605 = new class136(13, 13, (String)null, 3, 7);
		field1606 = new class136(14, 14, (String)null, 4, 7);
		field1607 = new class136(15, 15, (String)null, 5, 7);
		field1608 = new class136(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class136(int var1, int var2, String var3, int var4, int var5) {
		this.field1609 = var1;
		this.field1604 = var2;
		this.field1611 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1604;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1596449850"
	)
	int method3243() {
		return this.field1611;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1959592226"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class167.method3573(var0, 10, true);
	}
}
