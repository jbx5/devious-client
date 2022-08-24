import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("jv")
public class class273 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1132323313)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus = 0;

	@ObfuscatedName("d")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "577365723")
	public static int method5188() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}
}