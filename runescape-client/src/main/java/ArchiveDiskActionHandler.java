import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -609387083
	)
	static int field4010;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2097458275
	)
	static int field4018;
	@ObfuscatedName("n")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("k")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4018 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 94
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 95
				} // L: 96

				if (var1 != null) { // L: 97
					if (var1.type == 0) { // L: 98
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 99
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 100
							var1.remove(); // L: 101
						} // L: 102
					} else if (var1.type == 1) { // L: 104
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 105
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 106
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 107
						} // L: 108
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 110
						if (field4018 <= 1) { // L: 111
							field4018 = 0; // L: 112
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 113
							return; // L: 114
						}

						field4018 = 600; // L: 116
					}
				} else {
					class28.method412(100L); // L: 120
					synchronized(ArchiveDiskActionHandler_lock) { // L: 121
						if (field4018 <= 1) { // L: 122
							field4018 = 0; // L: 123
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 124
							return; // L: 125
						}

						--field4018; // L: 127
					}
				}
			}
		} catch (Exception var13) { // L: 132
			Clock.RunException_sendStackTrace((String)null, var13); // L: 133
		}
	} // L: 135
}
