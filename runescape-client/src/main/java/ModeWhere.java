import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4446("", 0, new class385[]{class385.field4422, class385.field4417}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4453("", 1, new class385[]{class385.field4419, class385.field4422, class385.field4417}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4440("", 2, new class385[]{class385.field4419, class385.field4418, class385.field4422}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4441("", 3, new class385[]{class385.field4419}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4444("", 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4442("", 5, new class385[]{class385.field4419, class385.field4422}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4448("", 6, new class385[]{class385.field4422}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4445("", 8, new class385[]{class385.field4419, class385.field4422}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4449("", 9, new class385[]{class385.field4419, class385.field4418}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4447("", 10, new class385[]{class385.field4419}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4443("", 11, new class385[]{class385.field4419}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4438("", 12, new class385[]{class385.field4419, class385.field4422}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4450("", 13, new class385[]{class385.field4419});

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 257777211
	)
	@Export("id")
	final int id;
	@ObfuscatedName("as")
	final Set field4452;

	static {
		method7172();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Loi;)V"
	)
	ModeWhere(String var3, int var4, class385[] var5) {
		this.field4452 = new HashSet();
		this.id = var4;
		class385[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class385 var8 = var6[var7];
			this.field4452.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4452 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1022385277"
	)
	public static int method7170(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Lor;",
		garbageValue = "28"
	)
	static ModeWhere[] method7172() {
		return new ModeWhere[]{field4438, field4445, field4453, field4444, field4440, field4449, field4441, field4443, field4447, field4448, field4450, field4446, field4442};
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lif;IIIS)V",
		garbageValue = "-16278"
	)
	static void method7181(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class91.clientPreferences.method2589() != 0) {
			if (var0.field2322 != null && var0.field2322.containsKey(var1)) {
				class91.method2349((Integer)var0.field2322.get(var1), var2, var3);
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2030592343"
	)
	static boolean method7182() {
		return (Client.drawPlayerNames & 1) != 0;
	}
}
