import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class133 extends class136 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 486648423
   )
   static int field1637;
   @ObfuscatedName("bg")
   static String field1635;
   @ObfuscatedName("id")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -22321723
   )
   int field1638;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 958981063
   )
   int field1632;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -402576261
   )
   int field1633;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1759168031
   )
   int field1631;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class133(class139 var1) {
      this.this$0 = var1;
      this.field1638 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1638 = var1.readUnsignedShort();
      this.field1632 = var1.readInt();
      this.field1633 = var1.readUnsignedByte();
      this.field1631 = var1.readUnsignedByte();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3178(this.field1638, this.field1632, this.field1633, this.field1631);
   }
}
