import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 384909799
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
