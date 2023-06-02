import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gq")
public abstract class class180 {
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("no")
   @ObfuscatedGetter(
      intValue = 567132225
   )
   @Export("menuX")
   static int menuX;
   @ObfuscatedName("as")
   String field1878;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgi;"
   )
   final class169 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgi;Ljava/lang/String;)V"
   )
   class180(class169 var1, String var2) {
      this.this$0 = var1;
      this.field1878 = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1756234342"
   )
   public abstract int vmethod3531();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1324098336"
   )
   public String vmethod3532() {
      return null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "16858419"
   )
   public int vmethod3536() {
      return -1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "139137054"
   )
   public String method3530() {
      return this.field1878;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "-87"
   )
   static int method3540(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var3 = FriendSystem.getWidget(var4);
      } else {
         var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         Interpreter.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class327 var7 = var3.method6380();
            if (var7 != null && var7.method6338(var13, var9)) {
               Messages.invalidateWidget(var3);
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

            Messages.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         Interpreter.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            Messages.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         Messages.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            Messages.invalidateWidget(var3);
         }

         return 1;
      } else {
         class327 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6380();
               if (var10 != null) {
                  var10.method6072();
               }
            }

            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            Interpreter.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6380();
               if (var10 != null) {
                  var10.method6066(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                  var10.method6067(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            }

            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Messages.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            FloorDecoration.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Messages.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            FillMode var11 = (FillMode)GameObject.findEnumerated(ClanChannelMember.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               Messages.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.field3658 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3693 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               Messages.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6386(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], class47.urlRequester, class27.method406());
               return 1;
            } else if (var0 == 1131) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3.method6367(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6368(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               return 1;
            } else {
               class322 var12;
               if (var0 == 1133) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6381();
                  if (var12 != null) {
                     var12.field3522 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6381();
                  if (var12 != null) {
                     var12.field3519 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class149.Interpreter_stringStackSize;
                  var10 = var3.method6380();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6381();
                  if (var12 != null) {
                     var12.field3520 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6380();
                  if (var10 != null && var10.method6167(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6380();
                  if (var10 != null && var10.method6110(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6380();
                  if (var10 != null && var10.method6064(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     Messages.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class327 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.field740.method4102();
                     var6 = var3.method6380();
                     if (var6 != null && var6.method6056(var8)) {
                        if (var8) {
                           Client.field740.method4120(var3);
                        }

                        Messages.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field740.method4099() == var3) {
                        Client.field740.method4102();
                        Messages.invalidateWidget(var3);
                     }

                     var6 = var3.method6380();
                     if (var6 != null) {
                        var6.method6057(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = var3.method6380();
                     if (var10 != null && var10.method6080(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
                        Messages.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6380();
                     if (var10 != null && var10.method6080(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                        Messages.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6380();
                     if (var10 != null) {
                        var10.method6069(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        Messages.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6380();
                     if (var10 != null) {
                        var10.method6168(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6380();
                     if (var10 != null) {
                        var10.method6071(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6380();
                     if (var10 != null) {
                        var10.method6070(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        Messages.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class27 var5;
                     if (var0 == 1148) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6382();
                        if (var5 != null) {
                           var5.method382(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6382();
                        if (var5 != null) {
                           var5.method383((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var3.method6365(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], class47.urlRequester);
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
