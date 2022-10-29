import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class139 extends class135 {
   @ObfuscatedName("sd")
   static boolean field1616;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lnl;"
   )
   @Export("ItemDefinition_fontPlain11")
   public static Font ItemDefinition_fontPlain11;
   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive20")
   static Archive archive20;
   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "Lhf;"
   )
   @Export("scene")
   static Scene scene;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1457068309
   )
   int field1612;
   @ObfuscatedName("f")
   byte field1611;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class139(class138 var1) {
      this.this$0 = var1;
      this.field1612 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1612 = var1.readUnsignedShort();
      this.field1611 = var1.readByte();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3085(this.field1612, this.field1611);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "52"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }
}
