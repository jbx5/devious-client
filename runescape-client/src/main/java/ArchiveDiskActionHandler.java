import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("ArchiveDiskActionHandler_requestQueue")
   static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("ArchiveDiskActionHandler_responseQueue")
   static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1199311371
   )
   static int field4122 = 0;
   @ObfuscatedName("x")
   @Export("ArchiveDiskActionHandler_lock")
   static Object ArchiveDiskActionHandler_lock = new Object();
   @ObfuscatedName("h")
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
                  if (field4122 <= 1) {
                     field4122 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  field4122 = 600;
               }
            } else {
               class197.method3946(100L);
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field4122 <= 1) {
                     field4122 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  --field4122;
               }
            }
         }
      } catch (Exception var13) {
         class421.RunException_sendStackTrace((String)null, var13);
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-2029749129"
   )
   public static int method6293(int var0) {
      return var0 >>> 4 & class459.field4854;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)Les;",
      garbageValue = "13"
   )
   static class130 method6280(int var0) {
      class130[] var1 = new class130[]{class130.field1552, class130.field1551, class130.field1547, class130.field1545, class130.field1546, class130.field1549, class130.field1550, class130.field1548, class130.field1553};
      class130 var2 = (class130)WallDecoration.findEnumerated(var1, var0);
      if (var2 == null) {
         var2 = class130.field1553;
      }

      return var2;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-59706697"
   )
   public static void method6291() {
      ParamComposition.ParamDefinition_cached.clear();
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "(Lgg;IIII)V",
      garbageValue = "-1574294658"
   )
   static void method6292(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && BufferedSink.clientPreferences.method2411() != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            class101.method2567(var0.soundEffects[var1], var2, var3);
         }
      }
   }
}
