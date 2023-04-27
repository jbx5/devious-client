import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("ArchiveDiskActionHandler_requestQueue")
   public static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("ArchiveDiskActionHandler_responseQueue")
   public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1248352937
   )
   static int field4196 = 0;
   @ObfuscatedName("ac")
   @Export("ArchiveDiskActionHandler_lock")
   static Object ArchiveDiskActionHandler_lock = new Object();

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
                  if (field4196 <= 1) {
                     field4196 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  field4196 = 600;
               }
            } else {
               PlayerComposition.method6084(100L);
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field4196 <= 1) {
                     field4196 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  --field4196;
               }
            }
         }
      } catch (Exception var13) {
         class387.RunException_sendStackTrace((String)null, var13);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1319912203"
   )
   static String method6619(int var0) {
      return "<img=" + var0 + ">";
   }
}
