import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class350 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[BLra;B)V",
		garbageValue = "38"
	)
	static void method6804(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4365) {
			if (ArchiveDiskActionHandler.field4360 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4360 = 600;
			ArchiveDiskActionHandler.field4358 = false;
		}
	}
}
