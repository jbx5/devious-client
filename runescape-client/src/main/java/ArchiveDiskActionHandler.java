import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("ArchiveDiskActionHandler_requestQueue")
    static NodeDeque ArchiveDiskActionHandler_requestQueue;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("ArchiveDiskActionHandler_responseQueue")
    static NodeDeque ArchiveDiskActionHandler_responseQueue;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -153421111)
    static int field3869;

    @ObfuscatedName("e")
    @Export("ArchiveDiskActionHandler_lock")
    static Object ArchiveDiskActionHandler_lock;

    @ObfuscatedName("r")
    @Export("ArchiveDiskActionHandler_thread")
    static Thread ArchiveDiskActionHandler_thread;

    @ObfuscatedName("m")
    @Export("ByteArrayPool_altSizeArrayCounts")
    public static int[] ByteArrayPool_altSizeArrayCounts;

    static {
        ArchiveDiskActionHandler_requestQueue = new NodeDeque();
        ArchiveDiskActionHandler_responseQueue = new NodeDeque();
        field3869 = 0;
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
                        if (field3869 <= 1) {
                            field3869 = 0;
                            ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        field3869 = 600;
                    }
                } else {
                    Language.method5813(100L);
                    synchronized(ArchiveDiskActionHandler_lock) {
                        if (field3869 <= 1) {
                            field3869 = 0;
                            ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        --field3869;
                    }
                }
            } 
        } catch (Exception var13) {
            FloorDecoration.RunException_sendStackTrace(((String) (null)), var13);
        }
    }
}