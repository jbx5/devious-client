import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1529987001
	)
	@Export("type")
	int type;
	@ObfuscatedName("ae")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
