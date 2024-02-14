import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public class class538 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	public static final class538 field5255;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	public static final class538 field5253;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field5254;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field5259;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field5256;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field5257;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -987935687
	)
	final int field5258;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 526282423
	)
	final int field5252;

	static {
		field5255 = new class538(2, 0);
		field5253 = new class538(0, 2);
		field5254 = new class538(1, 5);
		field5259 = new class538(4, 6);
		field5256 = new class538(5, 7);
		field5257 = new class538(3, 8);
	}

	class538(int var1, int var2) {
		this.field5258 = var1;
		this.field5252 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5252;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1025371396"
	)
	public boolean method9755() {
		return this == field5253;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2144369700"
	)
	static int method9752() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field786;
		} else {
			return 10000;
		}
	}
}
