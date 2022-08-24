import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lk")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Llm;")
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llm;")
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -2145355515)
	public static int field3970 = 0;

	@ObfuscatedName("v")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock = new Object();

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
						if (field3970 <= 1) {
							field3970 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						field3970 = 600;
					}
				} else {
					class144.method3006(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3970 <= 1) {
							field3970 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						--field3970;
					}
				}
			} 
		} catch (Exception var13) {
			class33.RunException_sendStackTrace(((String) (null)), var13);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)[B", garbageValue = "2006927330")
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Lls;II)Z", garbageValue = "853644846")
	static boolean method5708(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class117.SpriteBuffer_decode(var2);
			return true;
		}
	}
}