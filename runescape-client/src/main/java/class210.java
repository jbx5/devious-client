import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class210 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2316;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2306;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2308;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2309;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2317;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2319;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2312;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2320;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2314;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2315;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2310;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2307;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2318;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2313;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1289947479
	)
	public final int field2311;

	static {
		field2316 = new class210(0);
		field2306 = new class210(1);
		field2308 = new class210(2);
		field2309 = new class210(3);
		field2317 = new class210(4, class196.field2064);
		field2319 = new class210(5);
		field2312 = new class210(6, class196.field2054);
		field2320 = new class210(7, class196.field2066);
		field2314 = new class210(8, class196.field2055);
		field2315 = new class210(9, class196.field2058);
		field2310 = new class210(10, class196.field2060);
		field2307 = new class210(11, class196.field2059);
		field2318 = new class210(12);
		field2313 = new class210(13);
	}

	class210(int var1) {
		this(var1, (class196)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILht;)V"
	)
	class210(int var1, class196 var2) {
		this.field2311 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Lpc;II)Lpc;",
		garbageValue = "1515296574"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "38"
	)
	@Export("shift8LeftAndAdd")
	public static int shift8LeftAndAdd(int var0, int var1) {
		return (var0 << 8) + var1;
	}
}
