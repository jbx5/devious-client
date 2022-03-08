import java.io.File;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cm")
@Implements("UrlRequest")
public class UrlRequest {
    @ObfuscatedName("r")
    @Export("cacheDir")
    static File cacheDir;

    @ObfuscatedName("em")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive18")
    static Archive archive18;

    @ObfuscatedName("c")
    @Export("url")
    final URL url;

    @ObfuscatedName("l")
    @Export("isDone0")
    volatile boolean isDone0;

    @ObfuscatedName("s")
    @Export("response0")
    volatile byte[] response0;

    UrlRequest(URL var1) {
        this.url = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1976117199")
    @Export("isDone")
    public boolean isDone() {
        return this.isDone0;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "1707102034")
    @Export("getResponse")
    public byte[] getResponse() {
        return this.response0;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILnb;Lkz;I)V", garbageValue = "-793908641")
    static void method2422(int var0, ArchiveDisk var1, Archive var2) {
        ArchiveDiskAction var3 = new ArchiveDiskAction();
        var3.type = 1;
        var3.key = ((long) (var0));
        var3.archiveDisk = var1;
        var3.archive = var2;
        synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
        }
        synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (ArchiveDiskActionHandler.field3869 == 0) {
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
            }
            ArchiveDiskActionHandler.field3869 = 600;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1455921541")
    public static int method2432(int var0) {
        return class383.field4276[var0 & 16383];
    }

    @ObfuscatedName("ku")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1421327475")
    static final void method2424(int var0) {
        var0 = Math.min(Math.max(var0, 0), 127);
        class424.clientPreferences.areaSoundEffectsVolume = var0;
        GameEngine.savePreferences();
    }
}