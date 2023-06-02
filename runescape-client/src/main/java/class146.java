import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class146 extends class142 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -447346437
   )
   int field1644;
   @ObfuscatedName("an")
   byte field1643;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class146(class145 var1) {
      this.this$0 = var1;
      this.field1644 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1644 = var1.readUnsignedShort();
      this.field1643 = var1.readByte();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3212(this.field1644, this.field1643);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "-1616025757"
   )
   @Export("isNumber")
   public static boolean isNumber(CharSequence var0) {
      return class160.method3324(var0, 10, true);
   }
}
