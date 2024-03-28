import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
public enum class530 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5220(1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5205(2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5221(4),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5219(8),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5193(16),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5213(32),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5195(64, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5196(128),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5197(256, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5198(512),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5199(1024),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5217(2048),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5212(4096),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5202(8192),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5189(16384),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5204(32768),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5203(65536),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5206(131072),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5207(262144),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5208(524288),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5209(1048576),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5210(2097152),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5218(4194304),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5191(8388608),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5190(16777216),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5214(33554432),
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5215(67108864, true),
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5216(134217728),
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5194(268435456),
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5201(536870912, true),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5192(1073741824, true),
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	field5211(Integer.MIN_VALUE);

	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 547178953
	)
	final int field5200;

	class530(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class530(int var3, boolean var4) {
		this.field5200 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5200;
	}
}
