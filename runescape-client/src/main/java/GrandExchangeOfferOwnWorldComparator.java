import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedName("f")
   @Export("filterWorlds")
   boolean filterWorlds;

   GrandExchangeOfferOwnWorldComparator() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmv;Lmv;I)I",
      garbageValue = "883548151"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(FFFFLda;S)V",
      garbageValue = "18728"
   )
   static void method1202(float var0, float var1, float var2, float var3, class125 var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field1531 = var7 - var6 - var8;
      var4.field1543 = var8 + var8 + var8;
      var4.field1529 = var5 + var5 + var5;
      var4.field1528 = var0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "924609426"
   )
   static int method1209(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         var3 = class133.getWidget(var4);
      } else {
         var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         class302.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class307 var7 = var3.method6235();
            if (var7 != null && var7.method5932(var13, var9)) {
               LoginScreenAnimation.invalidateWidget(var3);
            }
         } else {
            var3.scrollX = var13;
            if (var3.scrollX > var3.scrollWidth - var3.width) {
               var3.scrollX = var3.scrollWidth - var3.width;
            }

            if (var3.scrollX < 0) {
               var3.scrollX = 0;
            }

            var3.scrollY = var9;
            if (var3.scrollY > var3.scrollHeight - var3.height) {
               var3.scrollY = var3.scrollHeight - var3.height;
            }

            if (var3.scrollY < 0) {
               var3.scrollY = 0;
            }

            LoginScreenAnimation.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var3.color = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         class302.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 5];
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            LoginScreenAnimation.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
         LoginScreenAnimation.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            LoginScreenAnimation.invalidateWidget(var3);
         }

         return 1;
      } else {
         class307 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6235();
               if (var10 != null) {
                  var10.method6031();
               }
            }

            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            class302.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6235();
               if (var10 != null) {
                  var10.method6068(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                  var10.method5934(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            }

            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            class302.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            LoginScreenAnimation.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            class205.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            LoginScreenAnimation.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            FillMode var11 = (FillMode)class4.findEnumerated(WorldMapData_0.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               LoginScreenAnimation.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               var3.field3606 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3588 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
               LoginScreenAnimation.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6211(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize], class245.urlRequester, class17.method246());
               return 1;
            } else if (var0 == 1131) {
               class302.Interpreter_intStackSize -= 2;
               var3.method6213(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6214(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               return 1;
            } else {
               class302 var12;
               if (var0 == 1133) {
                  --class302.Interpreter_intStackSize;
                  var12 = var3.method6226();
                  if (var12 != null) {
                     var12.field3465 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class302.Interpreter_intStackSize;
                  var12 = var3.method6226();
                  if (var12 != null) {
                     var12.field3470 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class20.Interpreter_stringStackSize;
                  var10 = var3.method6235();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class302.Interpreter_intStackSize;
                  var12 = var3.method6226();
                  if (var12 != null) {
                     var12.field3467 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class302.Interpreter_intStackSize;
                  var10 = var3.method6235();
                  if (var10 != null && var10.method5929(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) {
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class302.Interpreter_intStackSize;
                  var10 = var3.method6235();
                  if (var10 != null && var10.method5930(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) {
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class302.Interpreter_intStackSize;
                  var10 = var3.method6235();
                  if (var10 != null && var10.method6150(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) {
                     LoginScreenAnimation.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class307 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     Client.field752.method4097();
                     var6 = var3.method6235();
                     if (var6 != null && var6.method6057(var8)) {
                        if (var8) {
                           Client.field752.method4096(var3);
                        }

                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field752.method4109() == var3) {
                        Client.field752.method4097();
                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     var6 = var3.method6235();
                     if (var6 != null) {
                        var6.method5924(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class302.Interpreter_intStackSize -= 2;
                     var10 = var3.method6235();
                     if (var10 != null && var10.method6013(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1])) {
                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class302.Interpreter_intStackSize;
                     var10 = var3.method6235();
                     if (var10 != null && var10.method6013(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) {
                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class302.Interpreter_intStackSize;
                     var10 = var3.method6235();
                     if (var10 != null) {
                        var10.method5936(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class302.Interpreter_intStackSize;
                     var10 = var3.method6235();
                     if (var10 != null) {
                        var10.method5935(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class302.Interpreter_intStackSize;
                     var10 = var3.method6235();
                     if (var10 != null) {
                        var10.method5938(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class302.Interpreter_intStackSize;
                     var10 = var3.method6235();
                     if (var10 != null) {
                        var10.method5937(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]);
                        LoginScreenAnimation.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class27 var5;
                     if (var0 == 1148) {
                        class302.Interpreter_intStackSize -= 2;
                        var5 = var3.method6227();
                        if (var5 != null) {
                           var5.method391(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class302.Interpreter_intStackSize -= 2;
                        var5 = var3.method6227();
                        if (var5 != null) {
                           var5.method417((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-290172946"
   )
   static int method1208(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         var3 = false;
      } else {
         var4 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      }

      int var5;
      if (var0 == ScriptOpcodes.CC_SETOP) {
         var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] - 1;
         if (var5 >= 0 && var5 <= 9) {
            var4.setAction(var5, Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]);
            return 1;
         } else {
            --class20.Interpreter_stringStackSize;
            return 1;
         }
      } else {
         int var6;
         if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
            class302.Interpreter_intStackSize -= 2;
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var4.parent = class135.getWidgetChild(var5, var6);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
            var4.isScrollBar = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
            var4.dragZoneSize = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
            var4.dragThreshold = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
            var4.dataText = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
            var4.spellActionName = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
            var4.actions = null;
            return 1;
         } else if (var0 == 1308) {
            var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class302.Interpreter_intStackSize;
            return 1;
         } else {
            int var7;
            byte[] var8;
            if (var0 != ScriptOpcodes.CC_SETOPKEY) {
               byte var11;
               if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
                  class302.Interpreter_intStackSize -= 2;
                  var11 = 10;
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]};
                  byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]};
                  ObjectSound.Widget_setKey(var4, var11, var8, var9);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
                  class302.Interpreter_intStackSize -= 3;
                  var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] - 1;
                  var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                  var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
                  if (var5 >= 0 && var5 <= 9) {
                     ViewportMouse.Widget_setKeyRate(var4, var5, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
                  var11 = 10;
                  var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  ViewportMouse.Widget_setKeyRate(var4, var11, var6, var7);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
                  --class302.Interpreter_intStackSize;
                  var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] - 1;
                  if (var5 >= 0 && var5 <= 9) {
                     class145.Widget_setKeyIgnoreHeld(var4, var5);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
                  var5 = 10;
                  class145.Widget_setKeyIgnoreHeld(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var10 = null;
               var8 = null;
               if (var3) {
                  class302.Interpreter_intStackSize -= 10;

                  for(var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize] >= 0; var7 += 2) {
                  }

                  if (var7 > 0) {
                     var10 = new byte[var7 / 2];
                     var8 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize];
                        var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize + 1];
                     }
                  }
               } else {
                  class302.Interpreter_intStackSize -= 2;
                  var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]};
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]};
               }

               var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  ObjectSound.Widget_setKey(var4, var7, var10, var8);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-2053256956"
   )
   static int method1205(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else if (var0 == 2707) {
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method6351() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         return FileSystem.method3510(var3);
      } else if (var0 == 2709) {
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         return class308.method6188(var3);
      } else {
         return 2;
      }
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   static void method1210() {
      if (Client.field595 && class387.localPlayer != null) {
         int var0 = class387.localPlayer.pathX[0];
         int var1 = class387.localPlayer.pathY[0];
         if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         class245.oculusOrbFocalPointX = class387.localPlayer.x;
         int var2 = GrandExchangeOfferNameComparator.getTileHeight(class387.localPlayer.x, class387.localPlayer.y, class103.Client_plane) - Client.camFollowHeight;
         if (var2 < Ignored.field4573) {
            Ignored.field4573 = var2;
         }

         UserComparator10.oculusOrbFocalPointY = class387.localPlayer.y;
         Client.field595 = false;
      }

   }
}
