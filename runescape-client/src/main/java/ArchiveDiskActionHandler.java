import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1640815555
	)
	static int field4246;
	@ObfuscatedName("am")
	static boolean field4247;
	@ObfuscatedName("as")
	static Object field4248;
	@ObfuscatedName("aj")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4246 = 0;
		field4247 = false;
		field4248 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4248) {
						if ((field4247 || field4246 <= 1) && ArchiveDiskActionHandler_requestQueue.method7036()) {
							field4246 = 0;
							field4248.notifyAll();
							return;
						}

						field4246 = 600;
					}
				} else {
					class13.method180(100L);
					synchronized(field4248) {
						if ((field4247 || field4246 <= 1) && ArchiveDiskActionHandler_requestQueue.method7036()) {
							field4246 = 0;
							field4248.notifyAll();
							return;
						}

						--field4246;
					}
				}
			}
		} catch (Exception var13) {
			class317.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "707019941"
	)
	public static void method6684() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}
}
