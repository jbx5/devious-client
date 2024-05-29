import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1734803163
	)
	@Export("group")
	int group;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -242259599
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	boolean field1091;

	InterfaceParent() {
		this.field1091 = false;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lot;",
		garbageValue = "2134359933"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class74.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class332.masterDisk, HttpMethod.field32, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "590098191"
	)
	static final void method2318() {
		KitDefinition.KitDefinition_archive = null;
		class156.KitDefinition_modelsArchive = null;
		class420.KitDefinition_fileCount = 0;
	}
}
