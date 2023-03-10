import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("no")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ObfuscatedName("ul")
   @ObfuscatedGetter(
      intValue = 1915876021
   )
   static int field4269;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lnv;Lnv;I)I",
      garbageValue = "-698884156"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "146398086"
   )
   @Export("decodeStringCp1252")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class365.cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "-1107467981"
   )
   static int method6602(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6191() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return World.method1830(var3);
      } else {
         return var0 == 1709 ? class420.method7841(var3) : 2;
      }
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-29"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = WorldMapDecorationType.getTileHeight(var0, var1, TaskHandler.Client_plane) - var2;
         var0 -= class381.cameraX;
         var3 -= class351.cameraY;
         var1 -= class471.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[class311.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[class311.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class110.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class110.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var4 * var3 + var5 * var1 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }
}
