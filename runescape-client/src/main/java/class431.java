import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class431 extends class432 {
   public class431(int var1) {
      super(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "489961361"
   )
   void vmethod8304(Buffer var1, int var2) {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2098730562"
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

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "88"
   )
   static void method8299(int var0, int var1) {
      int var2 = class137.fontBold12.stringWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
         var4 = class137.fontBold12.stringWidth(Friend.method7814(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionsCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var2 + var4 > GameEngine.canvasWidth) {
         var4 = GameEngine.canvasWidth - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var3 + var1 > class262.canvasHeight) {
         var5 = class262.canvasHeight - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      class192.menuX = var4;
      ArchiveLoader.menuY = var5;
      DesktopPlatformInfoProvider.menuWidth = var2;
      class147.menuHeight = Client.menuOptionsCount * 15 + 22;
   }
}
