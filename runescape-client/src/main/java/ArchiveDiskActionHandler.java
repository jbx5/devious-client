import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("ArchiveDiskActionHandler_requestQueue")
   static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("ArchiveDiskActionHandler_responseQueue")
   static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -762322715
   )
   static int field4162 = 0;
   @ObfuscatedName("ab")
   @Export("ArchiveDiskActionHandler_lock")
   static Object ArchiveDiskActionHandler_lock = new Object();
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ldt;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("ju")
   @ObfuscatedGetter(
      intValue = -1111209699
   )
   static int field4161;

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
                  if (field4162 <= 1) {
                     field4162 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  field4162 = 600;
               }
            } else {
               Login.method2088(100L);
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field4162 <= 1) {
                     field4162 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  --field4162;
               }
            }
         }
      } catch (Exception var13) {
         class364.RunException_sendStackTrace((String)null, var13);
      }
   }
}
