import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1704868361
	)
	static int field4438;
	@ObfuscatedName("au")
	static boolean field4441;
	@ObfuscatedName("ax")
	static Object field4440;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4438 = 0;
		field4441 = false;
		field4440 = new Object();
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

					synchronized(field4440) {
						if ((field4441 || field4438 <= 1) && ArchiveDiskActionHandler_requestQueue.method7528()) {
							field4438 = 0;
							field4440.notifyAll();
							return;
						}

						field4438 = 600;
					}
				} else {
					ClanChannel.method3595(100L);
					synchronized(field4440) {
						if ((field4441 || field4438 <= 1) && ArchiveDiskActionHandler_requestQueue.method7528()) {
							field4438 = 0;
							field4440.notifyAll();
							return;
						}

						--field4438;
					}
				}
			}
		} catch (Exception var13) {
			Script.RunException_sendStackTrace((String)null, var13);
		}
	}
}
