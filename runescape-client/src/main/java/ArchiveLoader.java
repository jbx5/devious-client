import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 547762925
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 471216377
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "3182"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7060(var1) || this.archive.method7059(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FI)F",
		garbageValue = "-1557056206"
	)
	static float method2325(class132 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1561;
			return var0.field1566 + var2 * ((var2 * var0.field1563 + var0.field1564) * var2 + var0.field1562);
		}
	}
}
