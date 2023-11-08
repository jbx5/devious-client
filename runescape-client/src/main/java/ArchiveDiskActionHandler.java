import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -632476027
	)
	static int field4271;
	@ObfuscatedName("ao")
	static boolean field4274;
	@ObfuscatedName("ab")
	static Object field4272;
	@ObfuscatedName("au")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4271 = 0;
		field4274 = false;
		field4272 = new Object();
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

					synchronized(field4272) {
						if ((field4274 || field4271 <= 1) && ArchiveDiskActionHandler_requestQueue.method7235()) {
							field4271 = 0;
							field4272.notifyAll();
							return;
						}

						field4271 = 600;
					}
				} else {
					class219.method4260(100L);
					synchronized(field4272) {
						if ((field4274 || field4271 <= 1) && ArchiveDiskActionHandler_requestQueue.method7235()) {
							field4271 = 0;
							field4272.notifyAll();
							return;
						}

						--field4271;
					}
				}
			}
		} catch (Exception var13) {
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var13);
		}
	}
}
