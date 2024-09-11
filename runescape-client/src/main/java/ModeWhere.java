import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4661("", 0, new class402[]{class402.field4638, class402.field4634}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4660("", 1, new class402[]{class402.field4636, class402.field4638, class402.field4634}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4665("", 2, new class402[]{class402.field4636, class402.field4635, class402.field4638}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4658("", 3, new class402[]{class402.field4636}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4662("", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4663("", 5, new class402[]{class402.field4636, class402.field4638}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4664("", 6, new class402[]{class402.field4638}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4659("", 8, new class402[]{class402.field4636, class402.field4638}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4666("", 9, new class402[]{class402.field4636, class402.field4635}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4667("", 10, new class402[]{class402.field4636}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4668("", 11, new class402[]{class402.field4636}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4669("", 12, new class402[]{class402.field4636, class402.field4638}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	field4670("", 13, new class402[]{class402.field4636});

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	static IndexedSprite[] field4673;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 409335443
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ab")
	final Set field4672;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpg;)V"
	)
	ModeWhere(String var3, int var4, class402[] var5) {
		this.field4672 = new HashSet();
		this.id = var4;
		class402[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class402 var8 = var6[var7];
			this.field4672.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4672 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-26"
	)
	public static int method7778(int var0) {
		return class499.field5097[var0 & 16383];
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "122"
	)
	static boolean method7774(int var0, int var1, int var2, int var3, int var4, int var5) {
		return GraphicsObject.method2285(class162.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
