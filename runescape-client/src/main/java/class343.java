import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class343 extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -650466251
	)
	int field3719;
	@ObfuscatedName("ad")
	BitSet field3721;

	class343(int var1) {
		this.field3719 = var1;
		this.field3721 = new BitSet(128);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILsq;Loz;S)V",
		garbageValue = "-26919"
	)
	static void method6442(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}
}
