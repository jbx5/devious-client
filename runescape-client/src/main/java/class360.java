import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("mc")
public class class360 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lmc;")
	public static final class360 field4257 = new class360(0);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lmc;")
	static final class360 field4256 = new class360(1);

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1324921489)
	final int field4258;

	class360(int var1) {
		this.field4258 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ILnk;Lln;I)V", garbageValue = "248614131")
	static void method6484(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = ((long) (var0));
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3970 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}
			ArchiveDiskActionHandler.field3970 = 600;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "185486591")
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class268.Client_plane][var0][var1];
		if (var2 == null) {
			class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;
			TileItem var6;
			for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
				ItemComposition var7 = AttackOption.ItemDefinition_get(var6.id);
				long var11 = ((long) (var7.price));
				if (var7.isStackable == 1) {
					var11 *= ((long) (var6.quantity + 1));
				}
				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}
			if (var5 == null) {
				class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;
				for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}
						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}
				long var9 = FloorDecoration.calculateTag(var0, var1, 3, false, 0);
				class12.scene.newGroundItemPile(class268.Client_plane, var0, var1, ObjectComposition.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class268.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}