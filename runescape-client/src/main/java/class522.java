import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public enum class522 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5096(1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5114(2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5095(4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5108(8),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5097(16),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5093(32),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5099(64, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5100(128),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5094(256, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5102(512),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5103(1024),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5104(2048),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5117(4096),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5106(8192),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5107(16384),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5112(32768),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5109(65536),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5115(131072),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5110(262144),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5121(524288),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5113(1048576),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5098(2097152),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5101(4194304),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5116(8388608),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5119(16777216),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5111(33554432),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5118(67108864, true),
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5120(134217728),
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5105(268435456),
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5122(536870912, true),
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5123(1073741824, true),
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	field5124(Integer.MIN_VALUE);

	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 400328265
	)
	final int field5125;

	class522(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class522(int var3, boolean var4) {
		this.field5125 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5125;
	}
}
