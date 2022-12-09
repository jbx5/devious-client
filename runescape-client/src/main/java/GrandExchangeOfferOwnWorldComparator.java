import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("worldSelectBackSprites")
   static SpritePixels[] worldSelectBackSprites;
   @ObfuscatedName("h")
   @Export("filterWorlds")
   boolean filterWorlds;

   GrandExchangeOfferOwnWorldComparator() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lmg;Lmg;B)I",
      garbageValue = "-94"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var2.world == var1.world) {
         return 0;
      } else {
         if (this.filterWorlds) {
            if (Client.worldId == var1.world) {
               return -1;
            }

            if (var2.world == Client.worldId) {
               return 1;
            }
         }

         return var1.world < var2.world ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljh;",
      garbageValue = "-1399136251"
   )
   static LoginPacket[] method1224() {
      return new LoginPacket[]{LoginPacket.field3300, LoginPacket.field3304, LoginPacket.field3301, LoginPacket.field3305, LoginPacket.field3303, LoginPacket.field3308};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "1"
   )
   public static final boolean method1212(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "1356676967"
   )
   static int method1223(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      }

      class69.invalidateWidget(var3);
      if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
         if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
            var3.modelType = 2;
            var3.modelId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
            var3.modelType = 3;
            var3.modelId = class155.localPlayer.appearance.getChatHeadId();
            return 1;
         } else {
            return 2;
         }
      } else {
         class87.Interpreter_intStackSize -= 2;
         int var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         int var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = NPCComposition.ItemDefinition_get(var4);
         var3.modelAngleX = var6.xan2d;
         var3.modelAngleY = var6.yan2d;
         var3.modelAngleZ = var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d;
         var3.modelOffsetY = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
            var3.itemQuantityMode = 0;
         } else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
            var3.itemQuantityMode = 1;
         } else {
            var3.itemQuantityMode = 2;
         }

         if (var3.field3659 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field3659;
         } else if (var3.rawWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
         }

         return 1;
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1113873989"
   )
   static final void method1219() {
      int var0 = VarcInt.menuX;
      int var1 = NPC.menuY;
      int var2 = AttackOption.menuWidth;
      int var3 = MouseHandler.menuHeight;
      int var4 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
      Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
      class146.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
      int var5 = MouseHandler.MouseHandler_x;
      int var6 = MouseHandler.MouseHandler_y;

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
         var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
         var9 = 16777215;
         if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         class146.fontBold12.draw(class34.method491(var7), var0 + 3, var8, var9, 0);
      }

      var7 = VarcInt.menuX;
      var8 = NPC.menuY;
      var9 = AttackOption.menuWidth;
      int var10 = MouseHandler.menuHeight;

      for(int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
         if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
            Client.field732[var11] = true;
         }
      }

   }
}
