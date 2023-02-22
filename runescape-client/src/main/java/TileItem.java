import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("TileItem")
public final class TileItem extends Renderable {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1417914255
   )
   static int field1314;
   @ObfuscatedName("as")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -126580705
   )
   @Export("id")
   int id;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1272655955
   )
   @Export("quantity")
   int quantity;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1678180761
   )
   int field1317 = 31;

   TileItem() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2082293600"
   )
   void method2649(int var1) {
      this.field1317 = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lix;",
      garbageValue = "-1998422213"
   )
   @Export("getModel")
   protected final Model getModel() {
      return ParamComposition.ItemDefinition_get(this.id).getModel(this.quantity);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1678542179"
   )
   boolean method2651(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1317 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "112"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }
}
