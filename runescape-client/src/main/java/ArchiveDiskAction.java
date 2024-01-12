import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1539402633
	)
	@Export("type")
	int type;
	@ObfuscatedName("ap")
	@Export("data")
	byte[] data;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}
}
