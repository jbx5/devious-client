import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class132 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1590;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1583;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1593;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1585;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1586;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1582;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -430465133
	)
	final int field1588;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1552462787
	)
	final int field1589;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -840093281
	)
	final int field1591;

	static {
		field1590 = new class132(0, 0, (String)null, 0);
		field1583 = new class132(1, 1, (String)null, 9);
		field1593 = new class132(2, 2, (String)null, 3);
		field1585 = new class132(3, 3, (String)null, 6);
		field1586 = new class132(4, 4, (String)null, 1);
		field1582 = new class132(5, 5, (String)null, 3);
	}

	class132(int var1, int var2, String var3, int var4) {
		this.field1588 = var1;
		this.field1589 = var2;
		this.field1591 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1589;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "6120736"
	)
	int method3049() {
		return this.field1591;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
		garbageValue = "30808"
	)
	public static String method3057(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1524995741"
	)
	public static int method3058(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5235[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
