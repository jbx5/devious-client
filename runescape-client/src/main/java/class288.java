import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class288 {
   @ObfuscatedName("f")
   static int[] field3340;
   @ObfuscatedName("pz")
   @ObfuscatedGetter(
      intValue = 754592057
   )
   static int field3342;
   @ObfuscatedName("rs")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("privateChatMode")
   static PrivateChatMode privateChatMode;

   static {
      new Object();
      field3340 = new int[33];
      field3340[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3340[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1844004108"
   )
   static void method5590() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4199 == 0) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4199 = 600;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1985801344"
   )
   public static boolean method5596(int var0) {
      return (var0 >> 31 & 1) != 0;
   }
}
