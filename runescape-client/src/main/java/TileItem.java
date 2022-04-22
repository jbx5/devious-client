import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1512550431)

	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1689491185)

	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected final Model getModel() {
		return class19.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1886709718")

	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class293.World_request == null) {
				class293.World_request = VerticalAlignment.urlRequester.request(new URL(WorldMapElement.field1836));
			} else if (class293.World_request.isDone()) {
				byte[] var0 = class293.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				DevicePcmPlayerProvider.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = DevicePcmPlayerProvider.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class127.sortWorlds(DevicePcmPlayerProvider.World_worlds, 0, DevicePcmPlayerProvider.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class293.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class293.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIS)I", garbageValue = 
	"-26385")

	public static int method2393(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1980901442")

	static void method2395() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3945 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3945 = 600;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)Lbe;", garbageValue = 
	"-99479259")

	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
	}
}