import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kz")
public class class305 {
	static {
		int var0 = 0;
		int var1 = 0;
		class301[] var2 = new class301[]{ class301.field3575, class301.field3576 };
		class301[] var3 = var2;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			class301 var5 = var3[var4];
			if (var5.field3580 > var0) {
				var0 = var5.field3580;
			}
			if (var5.field3578 > var1) {
				var1 = var5.field3578;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(ILnd;Llc;B)V", garbageValue = "82")
	static void method5764(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = ((long) (var0));
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}
		Tiles.method2065();
	}
}