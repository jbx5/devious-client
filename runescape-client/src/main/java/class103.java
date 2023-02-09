import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class103 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1370 = new class103(0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1371 = new class103(1);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1356 = new class103(2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1354 = new class103(3);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1358 = new class103(4);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1359 = new class103(5);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1360 = new class103(6);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1361 = new class103(7);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1362 = new class103(8);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1363 = new class103(9);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1364 = new class103(10);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1365 = new class103(11);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1355 = new class103(12);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lcw;"
   )
   static final class103 field1367 = new class103(13);
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = 1869714183
   )
   @Export("cameraPitch")
   static int cameraPitch;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = 1817318801
   )
   @Export("Client_plane")
   static int Client_plane;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1578729661
   )
   int field1368;

   class103(int var1) {
      this.field1368 = var1;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IIB)V",
      garbageValue = "123"
   )
   @Export("Widget_addToMenu")
   static final void Widget_addToMenu(Widget var0, int var1, int var2) {
      if (var0.buttonType == 1) {
         class285.method5570(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
      }

      String var3;
      if (var0.buttonType == 2 && !Client.isSpellSelected) {
         var3 = class317.Widget_getSpellActionName(var0);
         if (var3 != null) {
            class285.method5570(var3, class149.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId);
         }
      }

      if (var0.buttonType == 3) {
         WorldMapRenderer.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.buttonType == 4) {
         WorldMapRenderer.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
      }

      if (var0.buttonType == 5) {
         WorldMapRenderer.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
      }

      if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
         WorldMapRenderer.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var17;
      if (var0.type == 2) {
         var17 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var20 = (var0.paddingX + 32) * var5;
               int var7 = (var0.paddingY + 32) * var4;
               if (var17 < 20) {
                  var20 += var0.inventoryXOffsets[var17];
                  var7 += var0.inventoryYOffsets[var17];
               }

               if (var1 >= var20 && var2 >= var7 && var1 < var20 + 32 && var2 < var7 + 32) {
                  Client.dragItemSlotDestination = var17;
                  class157.hoveredItemContainer = var0;
                  if (var0.itemIds[var17] > 0) {
                     label379: {
                        ItemComposition var8 = TileItem.ItemDefinition_get(var0.itemIds[var17] - 1);
                        boolean var9;
                        int var10;
                        if (Client.isItemSelected == 1) {
                           var10 = class173.getWidgetFlags(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if (var9) {
                              if (var0.id != WorldMapLabel.selectedItemWidget || var17 != WorldMapIcon_0.selectedItemSlot) {
                                 class285.method5570("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id);
                              }
                              break label379;
                           }
                        }

                        if (Client.isSpellSelected) {
                           var10 = class173.getWidgetFlags(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if (var9) {
                              if ((class149.selectedSpellFlags & 16) == 16) {
                                 class285.method5570(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id);
                              }
                              break label379;
                           }
                        }

                        String[] var21 = var8.inventoryActions;
                        var10 = -1;
                        boolean var11;
                        if (Client.shiftClickDrop) {
                           var11 = Client.tapToDrop || Client.field702.method4143(81);
                           if (var11) {
                              var10 = var8.getShiftClickIndex();
                           }
                        }

                        int var12 = class173.getWidgetFlags(var0);
                        var11 = (var12 >> 30 & 1) != 0;
                        if (var11) {
                           for(int var13 = 4; var13 >= 3; --var13) {
                              if (var13 != var10) {
                                 WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var13, false);
                              }
                           }
                        }

                        Object var10000 = null;
                        if (class288.method5596(class173.getWidgetFlags(var0))) {
                           class285.method5570("Use", class149.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id);
                        }

                        int var14 = class173.getWidgetFlags(var0);
                        boolean var23 = (var14 >> 30 & 1) != 0;
                        int var15;
                        if (var23) {
                           for(var15 = 2; var15 >= 0; --var15) {
                              if (var15 != var10) {
                                 WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var15, false);
                              }
                           }

                           if (var10 >= 0) {
                              WorldMapRegion.addWidgetItemMenuItem(var0, var8, var17, var10, true);
                           }
                        }

                        var21 = var0.itemActions;
                        if (var21 != null) {
                           for(var15 = 4; var15 >= 0; --var15) {
                              if (var21[var15] != null) {
                                 byte var16 = 0;
                                 if (var15 == 0) {
                                    var16 = 39;
                                 }

                                 if (var15 == 1) {
                                    var16 = 40;
                                 }

                                 if (var15 == 2) {
                                    var16 = 41;
                                 }

                                 if (var15 == 3) {
                                    var16 = 42;
                                 }

                                 if (var15 == 4) {
                                    var16 = 43;
                                 }

                                 class285.method5570(var21[var15], class149.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id);
                              }
                           }
                        }

                        class285.method5570("Examine", class149.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id);
                     }
                  }
               }

               ++var17;
            }
         }
      }

      if (var0.isIf3) {
         if (Client.isSpellSelected) {
            var4 = class173.getWidgetFlags(var0);
            boolean var24 = (var4 >> 21 & 1) != 0;
            if (var24 && (class149.selectedSpellFlags & 32) == 32) {
               class285.method5570(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
            }
         } else {
            for(var17 = 9; var17 >= 5; --var17) {
               String var19;
               if (!ItemLayer.method4229(class173.getWidgetFlags(var0), var17) && var0.onOp == null) {
                  var19 = null;
               } else if (var0.actions != null && var0.actions.length > var17 && var0.actions[var17] != null && var0.actions[var17].trim().length() != 0) {
                  var19 = var0.actions[var17];
               } else {
                  var19 = null;
               }

               if (var19 != null) {
                  class285.method5570(var19, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId);
               }
            }

            var3 = class317.Widget_getSpellActionName(var0);
            if (var3 != null) {
               class285.method5570(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var18;
               if (!ItemLayer.method4229(class173.getWidgetFlags(var0), var4) && var0.onOp == null) {
                  var18 = null;
               } else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
                  var18 = var0.actions[var4];
               } else {
                  var18 = null;
               }

               if (var18 != null) {
                  class290.insertMenuItem(var18, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
               }
            }

            var5 = class173.getWidgetFlags(var0);
            boolean var22 = (var5 & 1) != 0;
            if (var22) {
               WorldMapRenderer.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
            }
         }
      }

   }
}
