import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class154 extends class136 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = -854586489
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1555819897
   )
   int field1778;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 831952737
   )
   int field1781;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class154(class139 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1778 = var1.readInt();
      this.field1781 = var1.readInt();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3179(this.field1778, this.field1781);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-106"
   )
   static void method3300() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4173 == 0) {
            AbstractByteArrayCopier.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            AbstractByteArrayCopier.ArchiveDiskActionHandler_thread.setDaemon(true);
            AbstractByteArrayCopier.ArchiveDiskActionHandler_thread.start();
            AbstractByteArrayCopier.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4173 = 600;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "11"
   )
   public static void method3299() {
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "0"
   )
   static long method3301() {
      return Client.field637;
   }
}
