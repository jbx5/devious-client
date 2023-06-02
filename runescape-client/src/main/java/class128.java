import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class128 implements Callable {
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   final class129 field1502;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfg;"
   )
   final class130 field1496;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class131 field1497;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 498098769
   )
   final int field1499;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class136 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;Leq;Lfg;Lfa;I)V"
   )
   class128(class136 var1, class129 var2, class130 var3, class131 var4, int var5) {
      this.this$0 = var1;
      this.field1502 = var2;
      this.field1496 = var3;
      this.field1497 = var4;
      this.field1499 = var5;
   }

   public Object call() {
      this.field1502.method2986();
      class129[][] var1;
      if (this.field1496 == class130.field1529) {
         var1 = this.this$0.field1584;
      } else {
         var1 = this.this$0.field1583;
      }

      var1[this.field1499][this.field1497.method3017()] = this.field1502;
      return null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-709369885"
   )
   public static int method2970(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "11"
   )
   @Export("updateItemPile")
   static final void updateItemPile(int var0, int var1) {
      NodeDeque var2 = Client.groundItems[Clock.Client_plane][var0][var1];
      if (var2 == null) {
         class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1);
      } else {
         long var3 = -99999999L;
         TileItem var5 = null;

         TileItem var6;
         for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
            ItemComposition var7 = class300.ItemDefinition_get(var6.id);
            long var11 = (long)var7.price;
            if (var7.isStackable == 1) {
               var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity;
            }

            if (var11 > var3) {
               var3 = var11;
               var5 = var6;
            }
         }

         if (var5 == null) {
            class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1);
         } else {
            var2.addLast(var5);
            TileItem var13 = null;
            TileItem var8 = null;

            for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
               if (var6.id != var5.id) {
                  if (var13 == null) {
                     var13 = var6;
                  }

                  if (var13.id != var6.id && var8 == null) {
                     var8 = var6;
                  }
               }
            }

            long var9 = class394.calculateTag(var0, var1, 3, false, 0);
            class36.scene.newGroundItemPile(Clock.Client_plane, var0, var1, Renderable.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Clock.Client_plane), var5, var9, var13, var8);
         }
      }
   }
}
