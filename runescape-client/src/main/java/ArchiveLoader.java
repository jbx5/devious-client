import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1815953183
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1415768957
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2115421526"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method6982(var1) || this.archive.method6993(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "-1954637396"
	)
	public static void method2326(AbstractArchive var0) {
		class419.FloorOverlayDefinition_archive = var0;
	}
}
