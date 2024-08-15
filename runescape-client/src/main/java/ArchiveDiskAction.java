import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1121383543
	)
	@Export("type")
	int type;
	@ObfuscatedName("ay")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-127"
	)
	public static final boolean method7186(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class148.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class526.field5261;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class526.field5263;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
