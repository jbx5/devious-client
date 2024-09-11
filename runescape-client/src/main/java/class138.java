import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class138 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1628;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1631;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1629;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1630;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1627;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class138 field1632;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static IndexedSprite field1636;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -433324407
	)
	final int field1633;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1698258669
	)
	final int field1634;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 454426023
	)
	final int field1635;

	static {
		field1628 = new class138(0, 0, (String)null, 0);
		field1631 = new class138(1, 1, (String)null, 9);
		field1629 = new class138(2, 2, (String)null, 3);
		field1630 = new class138(3, 3, (String)null, 6);
		field1627 = new class138(4, 4, (String)null, 1);
		field1632 = new class138(5, 5, (String)null, 3);
	}

	class138(int var1, int var2, String var3, int var4) {
		this.field1633 = var1;
		this.field1634 = var2;
		this.field1635 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1634;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-499919281"
	)
	int method3355() {
		return this.field1635;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)[I",
		garbageValue = "1"
	)
	static int[] method3359(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = BufferedSource.method9109(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = BufferedSource.method9109(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = BufferedSource.method9109(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = BufferedSource.method9109(var3, var4, var6);
		}

		return var5;
	}
}
