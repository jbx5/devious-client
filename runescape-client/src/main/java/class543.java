import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public enum class543 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5349(1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5329(2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5355(4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5331(8),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5332(16),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5334(32),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5341(64, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5335(128),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5336(256, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5337(512),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5338(1024),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5339(2048),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5340(4096),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5328(8192),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5342(16384),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5343(32768),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5344(65536),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5345(131072),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5346(262144),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5333(524288),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5348(1048576),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5359(2097152),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5350(4194304),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5351(8388608),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5330(16777216),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5353(33554432),
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5354(67108864, true),
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5352(134217728),
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5356(268435456),
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5357(536870912, true),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5358(1073741824, true),
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	field5360(Integer.MIN_VALUE);

	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1320951499
	)
	final int field5347;

	class543(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class543(int var3, boolean var4) {
		this.field5347 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5347;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lob;Ljava/lang/String;Ljava/lang/String;I)[Lvb;",
		garbageValue = "-924776128"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return ItemContainer.method2397(var0, var3, var4);
		}
	}
}
