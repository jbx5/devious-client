import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qc")
public class class467 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   public static final class467 field4923 = new class467(1, 0);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   public static final class467 field4919 = new class467(0, 2);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   static final class467 field4920 = new class467(5, 5);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   static final class467 field4921 = new class467(4, 6);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   static final class467 field4922 = new class467(3, 7);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   static final class467 field4925 = new class467(2, 8);
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -141028607
   )
   final int field4924;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2070295773
   )
   final int field4918;

   class467(int var1, int var2) {
      this.field4924 = var1;
      this.field4918 = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4918;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1694657326"
   )
   public boolean method8675() {
      return this == field4919;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "1561760912"
   )
   static int method8672(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         var3 = class281.getWidget(var4);
      } else {
         var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         class379.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class300 var7 = var3.method6076();
            if (var7 != null && var7.method5946(var13, var9)) {
               class143.invalidateWidget(var3);
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

            class143.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var3.color = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         class379.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 5];
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class143.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         class143.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            class143.invalidateWidget(var3);
         }

         return 1;
      } else {
         class300 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6076();
               if (var10 != null) {
                  var10.method5783();
               }
            }

            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            class379.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6076();
               if (var10 != null) {
                  var10.method5777(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                  var10.method5778(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            }

            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            class379.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            class143.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            class453.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            class143.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            FillMode var11 = (FillMode)WallDecoration.findEnumerated(Language.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               class143.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               var3.field3515 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3518 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
               class143.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6062(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize], PcmPlayer.urlRequester, class147.method3141());
               return 1;
            } else if (var0 == 1131) {
               class379.Interpreter_intStackSize -= 2;
               var3.method6074(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6065(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               return 1;
            } else {
               class295 var12;
               if (var0 == 1133) {
                  --class379.Interpreter_intStackSize;
                  var12 = var3.method6153();
                  if (var12 != null) {
                     var12.field3399 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class379.Interpreter_intStackSize;
                  var12 = var3.method6153();
                  if (var12 != null) {
                     var12.field3401 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class125.Interpreter_stringStackSize;
                  var10 = var3.method6076();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class379.Interpreter_intStackSize;
                  var12 = var3.method6153();
                  if (var12 != null) {
                     var12.field3400 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class379.Interpreter_intStackSize;
                  var10 = var3.method6076();
                  if (var10 != null && var10.method5773(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) {
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class379.Interpreter_intStackSize;
                  var10 = var3.method6076();
                  if (var10 != null && var10.method5774(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) {
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class379.Interpreter_intStackSize;
                  var10 = var3.method6076();
                  if (var10 != null && var10.method5775(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) {
                     class143.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class300 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     Client.field734.method3933();
                     var6 = var3.method6076();
                     if (var6 != null && var6.method5767(var8)) {
                        if (var8) {
                           Client.field734.method3915(var3);
                        }

                        class143.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field734.method3916() == var3) {
                        Client.field734.method3933();
                        class143.invalidateWidget(var3);
                     }

                     var6 = var3.method6076();
                     if (var6 != null) {
                        var6.method5843(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class379.Interpreter_intStackSize -= 2;
                     var10 = var3.method6076();
                     if (var10 != null && var10.method5791(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1])) {
                        class143.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class379.Interpreter_intStackSize;
                     var10 = var3.method6076();
                     if (var10 != null && var10.method5791(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) {
                        class143.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class379.Interpreter_intStackSize;
                     var10 = var3.method6076();
                     if (var10 != null) {
                        var10.method5780(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]);
                        class143.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class379.Interpreter_intStackSize;
                     var10 = var3.method6076();
                     if (var10 != null) {
                        var10.method5779(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class379.Interpreter_intStackSize;
                     var10 = var3.method6076();
                     if (var10 != null) {
                        var10.method5936(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class379.Interpreter_intStackSize;
                     var10 = var3.method6076();
                     if (var10 != null) {
                        var10.method5781(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]);
                        class143.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class28 var5;
                     if (var0 == 1148) {
                        class379.Interpreter_intStackSize -= 2;
                        var5 = var3.method6078();
                        if (var5 != null) {
                           var5.method406(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class379.Interpreter_intStackSize -= 2;
                        var5 = var3.method6078();
                        if (var5 != null) {
                           var5.method407((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
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
}
