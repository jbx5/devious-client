import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class190 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("an")
	public static short[][] field1981;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	public static String method3979(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class421.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lja;",
		garbageValue = "2"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class440.method8689(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
