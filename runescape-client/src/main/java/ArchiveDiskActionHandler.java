import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("le")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1401449583)
	static int field3991 = 0;

	@ObfuscatedName("u")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock = new Object();

	@ObfuscatedName("c")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = ((ArchiveDiskAction) (ArchiveDiskActionHandler_requestQueue.last()));
				}
				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write(((int) (var1.key)), var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read(((int) (var1.key)));
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3991 <= 1) {
							field3991 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						field3991 = 600;
					}
				} else {
					WorldMapDecoration.method4967(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3991 <= 1) {
							field3991 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						--field3991;
					}
				}
			} 
		} catch (Exception var13) {
			class359.RunException_sendStackTrace(((String) (null)), var13);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "37815092")
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class144.World_request == null) {
				class144.World_request = class152.urlRequester.request(new URL(GrandExchangeOfferOwnWorldComparator.field479));
			} else if (class144.World_request.isDone()) {
				byte[] var0 = class144.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class93.World_worlds = new World[World.World_count];
				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class93.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}
				BoundaryObject.sortWorlds(class93.World_worlds, 0, class93.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class144.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class144.World_request = null;
		}
		return false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;S)I", garbageValue = "-5302")
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Calendar.charToByteCp1252(var0.charAt(var3));
		}
		return var2;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-632726805")
	static void method5800(int var0, int var1) {
		int[] var2 = new int[9];
		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = class152.method3152(var4);
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
			var5 = HitSplatDefinition.method3637(var5, var1);
			var2[var3] = var6 * var5 >> 16;
		}
		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
	}
}