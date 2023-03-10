import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class158 extends class140 {
   @ObfuscatedName("ah")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -534646765
   )
   int field1750;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 731087325
   )
   int field1749;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class158(class143 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1750 = var1.readInt();
      this.field1749 = var1.readInt();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3243(this.field1750, this.field1749);
   }
}
