import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1482970883
   )
   static int field1315 = 1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -107770019
   )
   static int field1317 = 1;
   @ObfuscatedName("i")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = -736500721
   )
   @Export("menuY")
   static int menuY;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgz;"
   )
   @Export("definition")
   NPCComposition definition;
   @ObfuscatedName("e")
   String field1311 = "";
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1973298013
   )
   int field1312 = 31;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lqz;"
   )
   class467 field1313;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   NewStuff field1314;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   NewStuff field1316;

   NPC() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1631971802"
   )
   void method2573(String var1) {
      this.field1311 = var1 == null ? "" : var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lhh;",
      garbageValue = "-1279733976"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.definition == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? AABB.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : AABB.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.field1314);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               Model var5 = ClanSettings.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var5 != null) {
                  var5.offsetBy(0, -super.spotAnimationHeight, 0);
                  Model[] var6 = new Model[]{var3, var5};
                  var3 = new Model(var6, 2);
               }
            }

            if (this.definition.size == 1) {
               var3.isSingleTile = true;
            }

            if (super.field1243 != 0 && Client.cycle >= super.field1238 && Client.cycle < super.field1200) {
               var3.overrideHue = super.field1240;
               var3.overrideSaturation = super.field1220;
               var3.overrideLuminance = super.field1232;
               var3.overrideAmount = super.field1243;
               var3.field2741 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "939145985"
   )
   void method2531(int var1) {
      this.field1312 = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1988661958"
   )
   boolean method2576(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1312 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1271311386"
   )
   final String method2535() {
      if (!this.field1311.isEmpty()) {
         return this.field1311;
      } else {
         NPCComposition var1 = this.definition;
         if (var1.transforms != null) {
            var1 = var1.transform();
            if (var1 == null) {
               var1 = this.definition;
            }
         }

         return var1.name;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ILgs;B)V",
      garbageValue = "-17"
   )
   final void method2533(int var1, class204 var2) {
      int var3 = super.pathX[0];
      int var4 = super.pathY[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.sequence != -1 && AABB.SequenceDefinition_get(super.sequence).field2284 == 1) {
         super.sequence = -1;
      }

      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var5 = super.pathLength; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.pathTraversed[0] = var2;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-468996840"
   )
   final void method2534(int var1, int var2, boolean var3) {
      if (super.sequence != -1 && AABB.SequenceDefinition_get(super.sequence).field2284 == 1) {
         super.sequence = -1;
      }

      if (!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (super.pathLength < 9) {
               ++super.pathLength;
            }

            for(int var6 = super.pathLength; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.pathTraversed[0] = class204.field2355;
            return;
         }
      }

      super.pathLength = 0;
      super.field1252 = 0;
      super.field1239 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1181 * 64 + super.pathX[0] * 128;
      super.y = super.field1181 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "114"
   )
   int[] method2546() {
      return this.field1313 != null ? this.field1313.method8797() : this.definition.method3678();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)[S",
      garbageValue = "79"
   )
   short[] method2538() {
      return this.field1313 != null ? this.field1313.method8799() : this.definition.method3715();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IISI)V",
      garbageValue = "1336672694"
   )
   void method2539(int var1, int var2, short var3) {
      if (this.field1313 == null) {
         this.field1313 = new class467(this.definition);
      }

      this.field1313.method8800(var1, var2, var3);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "([I[SI)V",
      garbageValue = "-1499310121"
   )
   void method2540(int[] var1, short[] var2) {
      if (this.field1313 == null) {
         this.field1313 = new class467(this.definition);
      }

      this.field1313.method8801(var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-4"
   )
   void method2541() {
      this.field1313 = null;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lgp;I)V",
      garbageValue = "-812185885"
   )
   void method2542(NewStuff var1) {
      this.field1316 = var1;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Lgp;",
      garbageValue = "894608808"
   )
   NewStuff method2543() {
      return this.field1316;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lgp;I)V",
      garbageValue = "-1612778242"
   )
   void method2544(NewStuff var1) {
      this.field1314 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-200769249"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.definition != null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-222403464"
   )
   void method2560() {
      this.field1316 = null;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "611713256"
   )
   void method2567() {
      this.field1314 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "98652591"
   )
   static int method2530(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         var3 = PlayerCompositionColorTextureOverride.getWidget(var4);
      } else {
         var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         class87.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class303 var7 = var3.method6167();
            if (var7 != null && var7.method5889(var13, var9)) {
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
         var3.color = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         class87.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 5];
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class69.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
         class69.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            class69.invalidateWidget(var3);
         }

         return 1;
      } else {
         class303 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6167();
               if (var10 != null) {
                  var10.method5896();
               }
            }

            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            class87.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6167();
               if (var10 != null) {
                  var10.method5890(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                  var10.method5891(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
            }

            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            class87.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            class69.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            class262.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            FillMode var11 = (FillMode)World.findEnumerated(UrlRequest.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               class69.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
               var3.field3575 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3578 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               class69.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6285(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], TaskHandler.urlRequester, class154.method3301());
               return 1;
            } else if (var0 == 1131) {
               class87.Interpreter_intStackSize -= 2;
               var3.method6170(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6162(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               return 1;
            } else {
               class298 var12;
               if (var0 == 1133) {
                  --class87.Interpreter_intStackSize;
                  var12 = var3.method6293();
                  if (var12 != null) {
                     var12.field3454 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class87.Interpreter_intStackSize;
                  var12 = var3.method6293();
                  if (var12 != null) {
                     var12.field3456 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --Interpreter.Interpreter_stringStackSize;
                  var10 = var3.method6167();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class87.Interpreter_intStackSize;
                  var12 = var3.method6293();
                  if (var12 != null) {
                     var12.field3455 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class87.Interpreter_intStackSize;
                  var10 = var3.method6167();
                  if (var10 != null && var10.method5886(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class87.Interpreter_intStackSize;
                  var10 = var3.method6167();
                  if (var10 != null && var10.method5887(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class87.Interpreter_intStackSize;
                  var10 = var3.method6167();
                  if (var10 != null && var10.method5888(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) {
                     class69.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class303 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     Client.field572.method4068();
                     var6 = var3.method6167();
                     if (var6 != null && var6.method5880(var8)) {
                        if (var8) {
                           Client.field572.method4066(var3);
                        }

                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field572.method4067() == var3) {
                        Client.field572.method4068();
                        class69.invalidateWidget(var3);
                     }

                     var6 = var3.method6167();
                     if (var6 != null) {
                        var6.method5881(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class87.Interpreter_intStackSize -= 2;
                     var10 = var3.method6167();
                     if (var10 != null && var10.method5904(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1])) {
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class87.Interpreter_intStackSize;
                     var10 = var3.method6167();
                     if (var10 != null && var10.method5904(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) {
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class87.Interpreter_intStackSize;
                     var10 = var3.method6167();
                     if (var10 != null) {
                        var10.method6015(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]);
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class87.Interpreter_intStackSize;
                     var10 = var3.method6167();
                     if (var10 != null) {
                        var10.method5892(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class87.Interpreter_intStackSize;
                     var10 = var3.method6167();
                     if (var10 != null) {
                        var10.method6044(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class87.Interpreter_intStackSize;
                     var10 = var3.method6167();
                     if (var10 != null) {
                        var10.method5941(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]);
                        class69.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class28 var5;
                     if (var0 == 1148) {
                        class87.Interpreter_intStackSize -= 2;
                        var5 = var3.method6187();
                        if (var5 != null) {
                           var5.method400(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class87.Interpreter_intStackSize -= 2;
                        var5 = var3.method6187();
                        if (var5 != null) {
                           var5.method394((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
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

   @ObfuscatedName("mn")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)Z",
      garbageValue = "1009858394"
   )
   static final boolean method2583(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 205) {
         Client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.changeAppearance(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.method5852(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.playerAppearance.method5853(0);
         }

         if (var1 == 325) {
            Client.playerAppearance.method5853(1);
         }

         if (var1 == 326) {
            PacketBufferNode var4 = class136.getPacketBufferNode(ClientPacket.field3050, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(var4.packetBuffer);
            Client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
