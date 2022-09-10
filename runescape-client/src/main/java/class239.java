import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class239 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class239 field2866;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class239 field2863;
	@ObfuscatedName("j")
	public static short[] field2865;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1856667107
	)
	@Export("value")
	final int value;

	static {
		field2866 = new class239(0); // L: 4
		field2863 = new class239(1); // L: 5
	}

	class239(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)I",
		garbageValue = "-13783"
	)
	public static int method5121(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var1;
		} else if (var2 == 1) { // L: 24
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 25
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILnj;Llb;B)V",
		garbageValue = "-13"
	)
	static void method5122(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 62
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 63
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 64
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) { // L: 65
					var3 = var5.data; // L: 66
					break; // L: 67
				}
			}
		}

		if (var3 != null) { // L: 71
			var2.load(var1, var0, var3, true); // L: 72
		} else {
			byte[] var4 = var1.read(var0); // L: 75
			var2.load(var1, var0, var4, true); // L: 76
		}
	} // L: 73 77
}
