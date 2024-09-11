import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class254 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[BLsl;I)V",
		garbageValue = "1716451415"
	)
	static void method5217(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4494) {
			if (ArchiveDiskActionHandler.field4496 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4496 = 600;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Ldr;S)V",
		garbageValue = "2745"
	)
	static final void method5223(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = class213.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1211 = var6;
		var1.field1210 = var7;
	}
}
