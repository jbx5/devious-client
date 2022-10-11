import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class142 extends class135 {
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("a")
   boolean field1641;
   @ObfuscatedName("f")
   byte field1637;
   @ObfuscatedName("c")
   byte field1636;
   @ObfuscatedName("x")
   byte field1639;
   @ObfuscatedName("h")
   byte field1640;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class142(class138 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1641 = var1.readUnsignedByte() == 1;
      this.field1637 = var1.readByte();
      this.field1636 = var1.readByte();
      this.field1639 = var1.readByte();
      this.field1640 = var1.readByte();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.allowGuests = this.field1641;
      var1.field1670 = this.field1637;
      var1.field1660 = this.field1636;
      var1.field1680 = this.field1639;
      var1.field1671 = this.field1640;
   }
}
