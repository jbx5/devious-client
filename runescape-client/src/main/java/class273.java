import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class273 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-957570994"
   )
   public static void method5480() {
      StructComposition.StructDefinition_cached.clear();
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "(Lct;I)V",
      garbageValue = "-912521373"
   )
   static final void method5479(Actor var0) {
      int var1 = Math.max(1, var0.field1233 - Client.cycle);
      int var2 = var0.field1196 * 128 + var0.field1181 * 64;
      int var3 = var0.field1185 * 128 + var0.field1181 * 64;
      var0.x += (var2 - var0.x) / var1;
      var0.y += (var3 - var0.y) / var1;
      var0.field1239 = 0;
      var0.orientation = var0.field1235;
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(Lkd;IIB)V",
      garbageValue = "-128"
   )
   @Export("Widget_addToMenu")
   static final void Widget_addToMenu(Widget var0, int var1, int var2) {
      if (var0.buttonType == 1) {
         ScriptFrame.method1172(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
      }

      String var3;
      if (var0.buttonType == 2 && !Client.isSpellSelected) {
         var3 = ArchiveLoader.Widget_getSpellActionName(var0);
         if (var3 != null) {
            ScriptFrame.method1172(var3, MouseRecorder.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId);
         }
      }

      if (var0.buttonType == 3) {
         ObjectSound.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.buttonType == 4) {
         ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
      }

      if (var0.buttonType == 5) {
         ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
      }

      if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
         ObjectSound.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var13;
      if (var0.type == 2) {
         var13 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var16 = (var0.paddingX + 32) * var5;
               int var7 = (var0.paddingY + 32) * var4;
               if (var13 < 20) {
                  var16 += var0.inventoryXOffsets[var13];
                  var7 += var0.inventoryYOffsets[var13];
               }

               if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) {
                  Client.dragItemSlotDestination = var13;
                  WorldMapID.hoveredItemContainer = var0;
                  if (var0.itemIds[var13] > 0) {
                     ItemComposition var8 = NPCComposition.ItemDefinition_get(var0.itemIds[var13] - 1);
                     if (Client.isItemSelected == 1 && WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) {
                        if (var0.id != ModeWhere.selectedItemWidget || var13 != class101.selectedItemSlot) {
                           ScriptFrame.method1172("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var8.name, 31, 0, var13, var0.id, var8.id);
                        }
                     } else if (Client.isSpellSelected && WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) {
                        if ((class21.selectedSpellFlags & 16) == 16) {
                           ScriptFrame.method1172(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var8.name, 32, 0, var13, var0.id, var8.id);
                        }
                     } else {
                        String[] var9 = var8.inventoryActions;
                        int var10 = -1;
                        if (Client.shiftClickDrop) {
                           boolean var11 = Client.tapToDrop || Client.field747.method4106(81);
                           if (var11) {
                              var10 = var8.getShiftClickIndex();
                           }
                        }

                        int var18;
                        if (WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) {
                           for(var18 = 4; var18 >= 3; --var18) {
                              if (var10 != var18) {
                                 class317.addWidgetItemMenuItem(var0, var8, var13, var18, false);
                              }
                           }
                        }

                        if (UserComparator10.method2867(Clock.getWidgetFlags(var0))) {
                           ScriptFrame.method1172("Use", MouseRecorder.colorStartTag(16748608) + var8.name, 38, 0, var13, var0.id, var8.id);
                        }

                        if (WorldMapSection2.method4907(Clock.getWidgetFlags(var0))) {
                           for(var18 = 2; var18 >= 0; --var18) {
                              if (var18 != var10) {
                                 class317.addWidgetItemMenuItem(var0, var8, var13, var18, false);
                              }
                           }

                           if (var10 >= 0) {
                              class317.addWidgetItemMenuItem(var0, var8, var13, var10, true);
                           }
                        }

                        var9 = var0.itemActions;
                        if (var9 != null) {
                           for(var18 = 4; var18 >= 0; --var18) {
                              if (var9[var18] != null) {
                                 byte var12 = 0;
                                 if (var18 == 0) {
                                    var12 = 39;
                                 }

                                 if (var18 == 1) {
                                    var12 = 40;
                                 }

                                 if (var18 == 2) {
                                    var12 = 41;
                                 }

                                 if (var18 == 3) {
                                    var12 = 42;
                                 }

                                 if (var18 == 4) {
                                    var12 = 43;
                                 }

                                 ScriptFrame.method1172(var9[var18], MouseRecorder.colorStartTag(16748608) + var8.name, var12, 0, var13, var0.id, var8.id);
                              }
                           }
                        }

                        ScriptFrame.method1172("Examine", MouseRecorder.colorStartTag(16748608) + var8.name, 1005, 0, var13, var0.id, var8.id);
                     }
                  }
               }

               ++var13;
            }
         }
      }

      if (var0.isIf3) {
         if (Client.isSpellSelected) {
            var4 = Clock.getWidgetFlags(var0);
            boolean var19 = (var4 >> 21 & 1) != 0;
            if (var19 && (class21.selectedSpellFlags & 32) == 32) {
               ScriptFrame.method1172(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
            }
         } else {
            for(var13 = 9; var13 >= 5; --var13) {
               String var15;
               if (!class251.method5275(Clock.getWidgetFlags(var0), var13) && var0.onOp == null) {
                  var15 = null;
               } else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) {
                  var15 = var0.actions[var13];
               } else {
                  var15 = null;
               }

               if (var15 != null) {
                  ScriptFrame.method1172(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id, var0.itemId);
               }
            }

            var3 = ArchiveLoader.Widget_getSpellActionName(var0);
            if (var3 != null) {
               ScriptFrame.method1172(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var14;
               if (!class251.method5275(Clock.getWidgetFlags(var0), var4) && var0.onOp == null) {
                  var14 = null;
               } else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
                  var14 = var0.actions[var4];
               } else {
                  var14 = null;
               }

               if (var14 != null) {
                  class37.insertMenuItem(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
               }
            }

            var5 = Clock.getWidgetFlags(var0);
            boolean var17 = (var5 & 1) != 0;
            if (var17) {
               ObjectSound.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
            }
         }
      }

   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1263982193"
   )
   static final int method5478() {
      float var0 = 200.0F * ((float)StructComposition.clientPreferences.method2422() - 0.5F);
      return 100 - Math.round(var0);
   }
}
