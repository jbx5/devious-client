import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class149 extends class135 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1406247549
   )
   int field1699;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class149(class138 var1) {
      this.this$0 = var1;
      this.field1699 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1699 = var1.readUnsignedShort();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3084(this.field1699);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2144467823"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = class156.getPreferencesFile("", class376.field4411.name, true);
         Buffer var1 = BufferedSink.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.offset);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
      }

   }
}
