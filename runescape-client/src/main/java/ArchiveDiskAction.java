import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1890921037
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	@Export("data")
	byte[] data;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "9"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10303

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10304
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10305
		}

		if (var1.length() > 9) { // L: 10307
			return " " + SoundCache.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + SoundCache.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + SoundCache.colorStartTag(16776960) + var1 + "</col>"; // L: 10308 10309
		}
	}
}
