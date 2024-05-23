import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1779711313
	)
	static int field4445;
	@ObfuscatedName("az")
	static boolean field4448;
	@ObfuscatedName("af")
	static Object field4447;
	@ObfuscatedName("aa")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -302371735
	)
	@Export("menuHeight")
	static int menuHeight;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4445 = 0;
		field4448 = false;
		field4447 = new Object();
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

					synchronized(field4447) {
						if ((field4448 || field4445 <= 1) && ArchiveDiskActionHandler_requestQueue.method7511()) {
							field4445 = 0;
							field4447.notifyAll();
							return;
						}

						field4445 = 600;
					}
				} else {
					class484.method8889(100L);
					synchronized(field4447) {
						if ((field4448 || field4445 <= 1) && ArchiveDiskActionHandler_requestQueue.method7511()) {
							field4445 = 0;
							field4447.notifyAll();
							return;
						}

						--field4445;
					}
				}
			}
		} catch (Exception var13) {
			BufferedSink.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvm;",
		garbageValue = "-27"
	)
	@Export("FillMode_values")
	public static class557[] FillMode_values() {
		return new class557[]{class557.SOLID, class557.field5427, class557.field5426};
	}
}
