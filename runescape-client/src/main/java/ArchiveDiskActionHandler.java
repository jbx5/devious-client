import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -758269509
	)
	static int field4496;
	@ObfuscatedName("am")
	static final Object field4494;
	@ObfuscatedName("ax")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4496 = 0;
		field4494 = new Object();
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

					synchronized(field4494) {
						if (field4496 <= 1) {
							field4496 = 0;
							field4494.notifyAll();
							return;
						}

						field4496 = 600;
					}
				} else {
					FileSystem.method4499(100L);
					synchronized(field4494) {
						if (field4496 <= 1) {
							field4496 = 0;
							field4494.notifyAll();
							return;
						}

						--field4496;
					}
				}
			}
		} catch (Exception var13) {
			class171.RunException_sendStackTrace((String)null, var13);
		}
	}
}
