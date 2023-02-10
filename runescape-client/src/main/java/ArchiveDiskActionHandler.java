import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("ArchiveDiskActionHandler_requestQueue")
   static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("ArchiveDiskActionHandler_responseQueue")
   static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -2016619953
   )
   public static int field4199 = 0;
   @ObfuscatedName("s")
   @Export("ArchiveDiskActionHandler_lock")
   public static Object ArchiveDiskActionHandler_lock = new Object();
   @ObfuscatedName("z")
   @Export("ArchiveDiskActionHandler_thread")
   static Thread ArchiveDiskActionHandler_thread;

   ArchiveDiskActionHandler() {
   }

   public void run() {
      try {
         while(true) {
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

               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field4199 <= 1) {
                     field4199 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  field4199 = 600;
               }
            } else {
               Clock.method3567(100L);
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field4199 <= 1) {
                     field4199 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  --field4199;
               }
            }
         }
      } catch (Exception var13) {
         class121.RunException_sendStackTrace((String)null, var13);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1911527843"
   )
   public static int method6471(int var0, int var1, int var2) {
      int var3 = SoundCache.method871(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }
}
