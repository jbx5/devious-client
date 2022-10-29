import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Message")
public class Message extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1275956487
   )
   @Export("count")
   int count;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 582496861
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1600395461
   )
   @Export("type")
   int type;
   @ObfuscatedName("x")
   @Export("sender")
   String sender;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("senderUsername")
   Username senderUsername;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isFromFriend0")
   TriBool isFromFriend0;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isFromIgnored0")
   TriBool isFromIgnored0;
   @ObfuscatedName("d")
   @Export("prefix")
   String prefix;
   @ObfuscatedName("n")
   @Export("text")
   String text;

   Message(int var1, String var2, String var3, String var4) {
      this.isFromFriend0 = TriBool.TriBool_unknown;
      this.isFromIgnored0 = TriBool.TriBool_unknown;
      this.set(var1, var2, var3, var4);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "75"
   )
   @Export("set")
   void set(int var1, String var2, String var3, String var4) {
      this.count = class417.method7781();
      this.cycle = Client.cycle;
      this.type = var1;
      this.sender = var2;
      this.fillSenderUsername();
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend();
      this.clearIsFromIgnored();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-732833419"
   )
   @Export("clearIsFromFriend")
   void clearIsFromFriend() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1626696256"
   )
   @Export("isFromFriend")
   final boolean isFromFriend() {
      if (this.isFromFriend0 == TriBool.TriBool_unknown) {
         this.fillIsFromFriend();
      }

      return this.isFromFriend0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-548011858"
   )
   @Export("fillIsFromFriend")
   void fillIsFromFriend() {
      this.isFromFriend0 = WallDecoration.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1930798269"
   )
   @Export("clearIsFromIgnored")
   void clearIsFromIgnored() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-51"
   )
   @Export("isFromIgnored")
   final boolean isFromIgnored() {
      if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
         this.fillIsFromIgnored();
      }

      return this.isFromIgnored0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1350273895"
   )
   @Export("fillIsFromIgnored")
   void fillIsFromIgnored() {
      this.isFromIgnored0 = WallDecoration.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "117"
   )
   @Export("fillSenderUsername")
   final void fillSenderUsername() {
      if (this.sender != null) {
         this.senderUsername = new Username(ItemLayer.method4055(this.sender), ViewportMouse.loginType);
      } else {
         this.senderUsername = null;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-406725449"
   )
   static int method1161(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         NPCComposition var4 = HealthBarDefinition.getNpcDefinition(var3);
         Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(Lkn;III)V",
      garbageValue = "-1032416860"
   )
   @Export("Widget_addToMenu")
   static final void Widget_addToMenu(Widget var0, int var1, int var2) {
      if (var0.buttonType == 1) {
         Login.method2081(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
      }

      String var3;
      if (var0.buttonType == 2 && !Client.isSpellSelected) {
         var3 = class313.Widget_getSpellActionName(var0);
         if (var3 != null) {
            Login.method2081(var3, GameObject.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId);
         }
      }

      if (var0.buttonType == 3) {
         class16.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.buttonType == 4) {
         class16.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
      }

      if (var0.buttonType == 5) {
         class16.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
      }

      if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
         class16.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var17;
      if (var0.type == 2) {
         var17 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var6 = (var0.paddingX + 32) * var5;
               int var7 = (var0.paddingY + 32) * var4;
               if (var17 < 20) {
                  var6 += var0.inventoryXOffsets[var17];
                  var7 += var0.inventoryYOffsets[var17];
               }

               if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  Client.dragItemSlotDestination = var17;
                  class168.hoveredItemContainer = var0;
                  if (var0.itemIds[var17] > 0) {
                     label314: {
                        ItemComposition var8 = MidiPcmStream.ItemDefinition_get(var0.itemIds[var17] - 1);
                        boolean var9;
                        int var10;
                        if (Client.isItemSelected == 1) {
                           var10 = class197.getWidgetFlags(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if (var9) {
                              if (var0.id != class230.selectedItemWidget || var17 != class1.selectedItemSlot) {
                                 Login.method2081("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id);
                              }
                              break label314;
                           }
                        }

                        if (Client.isSpellSelected) {
                           var10 = class197.getWidgetFlags(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if (var9) {
                              if ((UserComparator5.selectedSpellFlags & 16) == 16) {
                                 Login.method2081(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id);
                              }
                              break label314;
                           }
                        }

                        String[] var20 = var8.inventoryActions;
                        var10 = -1;
                        if (Client.shiftClickDrop && PlayerCompositionColorTextureOverride.method3399()) {
                           var10 = var8.getShiftClickIndex();
                        }

                        int var12 = class197.getWidgetFlags(var0);
                        boolean var11 = (var12 >> 30 & 1) != 0;
                        if (var11) {
                           for(int var13 = 4; var13 >= 3; --var13) {
                              if (var13 != var10) {
                                 class136.addWidgetItemMenuItem(var0, var8, var17, var13, false);
                              }
                           }
                        }

                        Object var10000 = null;
                        if (ServerPacket.method5399(class197.getWidgetFlags(var0))) {
                           Login.method2081("Use", GameObject.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id);
                        }

                        int var14 = class197.getWidgetFlags(var0);
                        boolean var22 = (var14 >> 30 & 1) != 0;
                        int var15;
                        if (var22) {
                           for(var15 = 2; var15 >= 0; --var15) {
                              if (var10 != var15) {
                                 class136.addWidgetItemMenuItem(var0, var8, var17, var15, false);
                              }
                           }

                           if (var10 >= 0) {
                              class136.addWidgetItemMenuItem(var0, var8, var17, var10, true);
                           }
                        }

                        var20 = var0.itemActions;
                        if (var20 != null) {
                           for(var15 = 4; var15 >= 0; --var15) {
                              if (var20[var15] != null) {
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

                                 Login.method2081(var20[var15], GameObject.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id);
                              }
                           }
                        }

                        Login.method2081("Examine", GameObject.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id);
                     }
                  }
               }

               ++var17;
            }
         }
      }

      if (var0.isIf3) {
         if (Client.isSpellSelected) {
            var4 = class197.getWidgetFlags(var0);
            boolean var23 = (var4 >> 21 & 1) != 0;
            if (var23 && (UserComparator5.selectedSpellFlags & 32) == 32) {
               Login.method2081(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
            }
         } else {
            for(var17 = 9; var17 >= 5; --var17) {
               String var19 = class380.method7205(var0, var17);
               if (var19 != null) {
                  Login.method2081(var19, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId);
               }
            }

            var3 = class313.Widget_getSpellActionName(var0);
            if (var3 != null) {
               Login.method2081(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var18 = class380.method7205(var0, var4);
               if (var18 != null) {
                  UserComparator8.insertMenuItem(var18, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
               }
            }

            var5 = class197.getWidgetFlags(var0);
            boolean var21 = (var5 & 1) != 0;
            if (var21) {
               class16.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
            }
         }
      }

   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-805716886"
   )
   static final void method1150(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      BufferedSink.clientPreferences.updateSoundEffectVolume(var0);
   }
}
