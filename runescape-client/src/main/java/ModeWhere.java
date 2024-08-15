import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4607("", 0, new class400[]{class400.field4583, class400.field4585}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4620("", 1, new class400[]{class400.field4584, class400.field4583, class400.field4585}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4608("", 2, new class400[]{class400.field4584, class400.field4586, class400.field4583}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4609("", 3, new class400[]{class400.field4584}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4610("", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4616("", 5, new class400[]{class400.field4584, class400.field4583}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4606("", 6, new class400[]{class400.field4583}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4613("", 8, new class400[]{class400.field4584, class400.field4583}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4611("", 9, new class400[]{class400.field4584, class400.field4586}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4612("", 10, new class400[]{class400.field4584}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4615("", 11, new class400[]{class400.field4584}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4617("", 12, new class400[]{class400.field4584, class400.field4583}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4618("", 13, new class400[]{class400.field4584});

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1237413733
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aw")
	final Set field4622;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpn;)V"
	)
	ModeWhere(String var3, int var4, class400[] var5) {
		this.field4622 = new HashSet();
		this.id = var4;
		class400[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class400 var8 = var6[var7];
			this.field4622.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4622 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
