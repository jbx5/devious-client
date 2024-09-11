import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public enum class92 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1128(0, -1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1125(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1126(2, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1127(3, 8),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1124(4, 9);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1085106181
	)
	final int field1129;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 133580385
	)
	final int field1130;

	class92(int var3, int var4) {
		this.field1129 = var3;
		this.field1130 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1130;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIII)V",
		garbageValue = "-1007661332"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3931 == null) {
			throw new RuntimeException();
		} else {
			var0.field3931[var1] = var2;
			var0.field3997[var1] = var3;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "537493253"
	)
	public static int method2535(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5415[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lof;",
		garbageValue = "2028635179"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class215.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class382.masterDisk, FontName.field5260, var0, var1, var2, var3, var4, false);
	}
}
