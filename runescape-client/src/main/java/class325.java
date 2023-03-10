import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mj")
public class class325 {
   static {
      Math.sqrt(8192.0);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "12"
   )
   static int method6326(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var3 = WorldMapSection1.getWidget(var4);
      } else {
         var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         Interpreter.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class310 var7 = var3.method6118();
            if (var7 != null && var7.method5826(var13, var9)) {
               class69.invalidateWidget(var3);
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

            class69.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         Interpreter.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class69.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            class69.invalidateWidget(var3);
         }

         return 1;
      } else {
         class310 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6118();
               if (var10 != null) {
                  var10.method5833();
               }
            }

            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            Interpreter.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6118();
               if (var10 != null) {
                  var10.method5935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                  var10.method5828(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            }

            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            class69.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            class130.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            FillMode var11 = (FillMode)SpriteMask.findEnumerated(GameObject.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               class69.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.field3545 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3562 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
               class69.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6136(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], class345.urlRequester, class138.method3095());
               return 1;
            } else if (var0 == 1131) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3.method6105(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6106(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               return 1;
            } else {
               class305 var12;
               if (var0 == 1133) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6119();
                  if (var12 != null) {
                     var12.field3436 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6119();
                  if (var12 != null) {
                     var12.field3437 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --HealthBar.Interpreter_stringStackSize;
                  var10 = var3.method6118();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6119();
                  if (var12 != null) {
                     var12.field3440 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6118();
                  if (var10 != null && var10.method5815(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6118();
                  if (var10 != null && var10.method5824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6118();
                  if (var10 != null && var10.method5825(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class310 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.field713.method4070();
                     var6 = var3.method6118();
                     if (var6 != null && var6.method5891(var8)) {
                        if (var8) {
                           Client.field713.method4049(var3);
                        }

                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field713.method4050() == var3) {
                        Client.field713.method4070();
                        class69.invalidateWidget(var3);
                     }

                     var6 = var3.method6118();
                     if (var6 != null) {
                        var6.method5839(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = var3.method6118();
                     if (var10 != null && var10.method5841(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6118();
                     if (var10 != null && var10.method5841(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6118();
                     if (var10 != null) {
                        var10.method5903(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6118();
                     if (var10 != null) {
                        var10.method5862(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6118();
                     if (var10 != null) {
                        var10.method5918(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6118();
                     if (var10 != null) {
                        var10.method5831(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class27 var5;
                     if (var0 == 1148) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6120();
                        if (var5 != null) {
                           var5.method384(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6120();
                        if (var5 != null) {
                           var5.method385((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var3.method6176(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], class345.urlRequester);
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
