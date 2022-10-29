import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class154 extends class135 {
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = 431134035
   )
   static int field1724;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1376085631
   )
   int field1722;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class154(class138 var1) {
      this.this$0 = var1;
      this.field1722 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1722 = var1.readUnsignedShort();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3086(this.field1722);
   }
}
