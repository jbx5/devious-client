import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public enum class510 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5087(1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5062(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5071(4),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5075(8),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5081(16),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5089(32),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5073(64, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5068(128),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5069(256, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5070(512),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5092(1024),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5072(2048),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5063(4096),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5074(8192),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5061(16384),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5076(32768),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5077(65536),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5078(131072),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5080(262144),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5067(524288),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5064(1048576),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5082(2097152),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5083(4194304),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5084(8388608),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5085(16777216),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5086(33554432),
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5065(67108864, true),
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5088(134217728),
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5066(268435456),
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5090(536870912, true),
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5091(1073741824, true),
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	field5079(Integer.MIN_VALUE);

	@ObfuscatedName("hu")
	static String field5094;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2094335397
	)
	final int field5093;

	class510(int var3) {
		this.field5093 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class510(int var3, boolean var4) {
		this.field5093 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5093;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3331"
	)
	public static void method8993() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field1862; ++var0) {
				WallDecoration.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
