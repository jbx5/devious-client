import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	538081707)

	public static int field3940;
	@ObfuscatedName("g")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("l")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(intValue = 
	1748062659)

	@Export("menuY")
	static int menuY;
	static 
	{
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3940 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

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
						if (field3940 <= 1) {
							field3940 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3940 = 600;
					}
				} else {
					GrandExchangeOfferTotalQuantityComparator.method6007(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3940 <= 1) {
							field3940 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3940;
					}
				}
			} 
		} catch (Exception var13) {
			class301.RunException_sendStackTrace(((String) (null)), var13);
		}
	}
}