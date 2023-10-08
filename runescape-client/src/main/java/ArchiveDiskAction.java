import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field4291;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1423175445
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@Export("data")
	byte[] data;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}
}
