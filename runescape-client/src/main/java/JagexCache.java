import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("fm")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("u")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 60928527)
	@Export("idxCount")
	public static int idxCount;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat = null;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File = null;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File = null;

	@ObfuscatedName("s")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
}