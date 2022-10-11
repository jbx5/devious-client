import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4158("", 0, new class328[]{class328.field4127}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4164("", 1, new class328[]{class328.field4129, class328.field4127}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4151("", 2, new class328[]{class328.field4129, class328.field4130, class328.field4127}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4152("", 3, new class328[]{class328.field4129}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4153("", 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4150("", 5, new class328[]{class328.field4129, class328.field4127}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4163("", 6, new class328[]{class328.field4127}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4149("", 8, new class328[]{class328.field4129, class328.field4127}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4157("", 9, new class328[]{class328.field4129, class328.field4130}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4154("", 10, new class328[]{class328.field4129}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4159("", 11, new class328[]{class328.field4129}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4160("", 12, new class328[]{class328.field4129, class328.field4127}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4161("", 13, new class328[]{class328.field4129});

	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 17629647
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1444640307
	)
	@Export("id")
	final int id;
	@ObfuscatedName("u")
	final Set field4155;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lle;)V"
	)
	ModeWhere(String var3, int var4, class328[] var5) {
		this.field4155 = new HashSet();
		this.id = var4; // L: 39
		class328[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class328 var8 = var6[var7]; // L: 43
			this.field4155.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field4155 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-497579505"
	)
	static final String method6242(int var0) {
		if (var0 < 100000) { // L: 433
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 434 435
		}
	}
}
