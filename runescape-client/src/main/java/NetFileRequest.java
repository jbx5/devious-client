import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("la")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("v")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;

	@ObfuscatedName("hy")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive")
	Archive archive;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1580363083)
	@Export("crc")
	int crc;

	@ObfuscatedName("w")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	}
}