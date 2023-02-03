import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class136 extends class139 {
   @ObfuscatedName("vr")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class347 field1633;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -66286931
   )
   int field1635;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 445176669
   )
   int field1632;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1161886563
   )
   int field1631;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 335766969
   )
   int field1634;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class136(class142 var1) {
      this.this$0 = var1;
      this.field1635 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1635 = var1.readUnsignedShort();
      this.field1632 = var1.readInt();
      this.field1631 = var1.readUnsignedByte();
      this.field1634 = var1.readUnsignedByte();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3244(this.field1635, this.field1632, this.field1631, this.field1634);
   }
}
