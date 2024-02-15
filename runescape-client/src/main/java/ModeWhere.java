import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4505("", 0, new class389[]{class389.field4476, class389.field4480}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4499("", 1, new class389[]{class389.field4478, class389.field4476, class389.field4480}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4500("", 2, new class389[]{class389.field4478, class389.field4477, class389.field4476}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4498("", 3, new class389[]{class389.field4478}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4513("", 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4503("", 5, new class389[]{class389.field4478, class389.field4476}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4510("", 6, new class389[]{class389.field4476}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4504("", 8, new class389[]{class389.field4478, class389.field4476}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4506("", 9, new class389[]{class389.field4478, class389.field4477}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4507("", 10, new class389[]{class389.field4478}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4508("", 11, new class389[]{class389.field4478}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4509("", 12, new class389[]{class389.field4478, class389.field4476}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4512("", 13, new class389[]{class389.field4478});

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field4514;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 923722533
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ax")
	final Set field4502;

	static {
		method7375();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Low;)V"
	)
	ModeWhere(String var3, int var4, class389[] var5) {
		this.field4502 = new HashSet();
		this.id = var4;
		class389[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class389 var8 = var6[var7];
			this.field4502.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4502 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpl;",
		garbageValue = "1"
	)
	static ModeWhere[] method7375() {
		return new ModeWhere[]{field4505, field4510, field4509, field4508, field4503, field4513, field4506, field4500, field4499, field4507, field4512, field4498, field4504};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lng;I[B[BI)V",
		garbageValue = "1875065031"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3739 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3739 = new byte[11][];
			var0.field3806 = new byte[11][];
			var0.field3820 = new int[11];
			var0.field3804 = new int[11];
		}

		var0.field3739[var1] = var2;
		if (var2 != null) {
			var0.field3808 = true;
		} else {
			var0.field3808 = false;

			for (int var4 = 0; var4 < var0.field3739.length; ++var4) {
				if (var0.field3739[var4] != null) {
					var0.field3808 = true;
					break;
				}
			}
		}

		var0.field3806[var1] = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	public static void method7376() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(III)Lih;",
		garbageValue = "-580270022"
	)
	static RouteStrategy method7374(int var0, int var1) {
		Client.field801.approxDestinationX = var0;
		Client.field801.approxDestinationY = var1;
		Client.field801.approxDestinationSizeX = 1;
		Client.field801.approxDestinationSizeY = 1;
		return Client.field801;
	}
}
