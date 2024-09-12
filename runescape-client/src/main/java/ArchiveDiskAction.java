import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -138543647
	)
	@Export("type")
	int type;
	@ObfuscatedName("ae")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lps;II)Lps;",
		garbageValue = "2025359384"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
