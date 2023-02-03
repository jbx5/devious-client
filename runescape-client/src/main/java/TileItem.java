import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("TileItem")
public final class TileItem extends Renderable {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1625083761
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -921940105
   )
   @Export("quantity")
   int quantity;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1195842737
   )
   int field1323 = 31;

   TileItem() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-138937291"
   )
   void method2723(int var1) {
      this.field1323 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lhs;",
      garbageValue = "922199662"
   )
   @Export("getModel")
   protected final Model getModel() {
      return ItemDefinition_get(this.id).getModel(this.quantity);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "27915480"
   )
   boolean method2712(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1323 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgr;",
      garbageValue = "37"
   )
   @Export("ItemDefinition_get")
   public static ItemComposition ItemDefinition_get(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class4.ItemDefinition_archive.takeFile(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         if (var1.noteTemplate != -1) {
            var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
         }

         if (var1.notedId != -1) {
            var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
         }

         if (var1.placeholderTemplate != -1) {
            var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
         }

         if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
            var1.name = "Members object";
            var1.isTradable = false;

            int var3;
            for(var3 = 0; var3 < var1.groundActions.length; ++var3) {
               var1.groundActions[var3] = null;
            }

            for(var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
               if (var3 != 4) {
                  var1.inventoryActions[var3] = null;
               }
            }

            var1.shiftClickIndex = -2;
            var1.team = 0;
            if (var1.params != null) {
               boolean var6 = false;

               for(Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                  ParamComposition var5 = ClanChannelMember.getParamDefinition((int)var4.key);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lbw;",
      garbageValue = "-702923171"
   )
   @Export("getNextWorldListWorld")
   static World getNextWorldListWorld() {
      return World.World_listCount < World.World_count ? class88.World_worlds[++World.World_listCount - 1] : null;
   }
}
