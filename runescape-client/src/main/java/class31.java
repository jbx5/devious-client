import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class31 {
   @ObfuscatedName("af")
   public static Applet field174 = null;
   @ObfuscatedName("an")
   public static String field175 = "";
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "[Lcl;"
   )
   @Export("World_worlds")
   static World[] World_worlds;
   @ObfuscatedName("ai")
   static int[] field176;
   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   @Export("scene")
   static Scene scene;
   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1319661382"
   )
   public static String method469(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "14"
   )
   static int method474(int var0, Script var1, boolean var2) {
      int var4 = -1;
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var3 = class165.getWidget(var4);
      } else {
         var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      }

      int var13;
      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         Interpreter.Interpreter_intStackSize -= 2;
         var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (var3.type == 12) {
            class314 var7 = var3.method6392();
            if (var7 != null && var7.method6096(var13, var9)) {
               class144.invalidateWidget(var3);
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

            class144.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var3.modelType = 1;
         var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         Interpreter.Interpreter_intStackSize -= 6;
         var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
         var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
         var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var13 != var3.sequenceId) {
            var3.sequenceId = var13;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class144.invalidateWidget(var3);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
         var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         class144.invalidateWidget(var3);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
         String var14 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
         if (!var14.equals(var3.text)) {
            var3.text = var14;
            class144.invalidateWidget(var3);
         }

         return 1;
      } else {
         class314 var10;
         if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3.type == 12) {
               var10 = var3.method6392();
               if (var10 != null) {
                  var10.method6215();
               }
            }

            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            Interpreter.Interpreter_intStackSize -= 3;
            if (var3.type == 12) {
               var10 = var3.method6392();
               if (var10 != null) {
                  var10.method6097(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                  var10.method6098(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
               }
            } else {
               var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            }

            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            class144.invalidateWidget(var3);
            if (var4 != -1 && var3.type == 0) {
               WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            class81.resumePauseWidget(var3.id, var3.childIndex);
            Client.meslayerContinueWidget = var3;
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 == 1125) {
            var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            FillMode var11 = (FillMode)StructComposition.findEnumerated(GrandExchangeOffer.FillMode_values(), var13);
            if (var11 != null) {
               var3.fillMode = var11;
               class144.invalidateWidget(var3);
            }

            return 1;
         } else {
            boolean var8;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.field3603 = var8;
               return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
               var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               var3.modelTransparency = var8;
               return 1;
            } else if (var0 == 1129) {
               var3.field3606 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
               class144.invalidateWidget(var3);
               return 1;
            } else if (var0 == 1130) {
               var3.method6376(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], class14.urlRequester, Projectile.method2111());
               return 1;
            } else if (var0 == 1131) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3.method6466(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
               return 1;
            } else if (var0 == 1132) {
               var3.method6380(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               return 1;
            } else {
               class309 var12;
               if (var0 == 1133) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6394();
                  if (var12 != null) {
                     var12.field3493 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6394();
                  if (var12 != null) {
                     var12.field3489 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --SecureRandomCallable.Interpreter_stringStackSize;
                  var10 = var3.method6392();
                  if (var10 != null) {
                     var3.text2 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --Interpreter.Interpreter_intStackSize;
                  var12 = var3.method6394();
                  if (var12 != null) {
                     var12.field3491 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6392();
                  if (var10 != null && var10.method6093(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6392();
                  if (var10 != null && var10.method6336(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --Interpreter.Interpreter_intStackSize;
                  var10 = var3.method6392();
                  if (var10 != null && var10.method6095(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                     class144.invalidateWidget(var3);
                  }

                  return 1;
               } else {
                  class314 var6;
                  if (var0 == 1140) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.field722.method4181();
                     var6 = var3.method6392();
                     if (var6 != null && var6.method6087(var8)) {
                        if (var8) {
                           Client.field722.method4179(var3);
                        }

                        class144.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (!var8 && Client.field722.method4202() == var3) {
                        Client.field722.method4181();
                        class144.invalidateWidget(var3);
                     }

                     var6 = var3.method6392();
                     if (var6 != null) {
                        var6.method6088(var8);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = var3.method6392();
                     if (var10 != null && var10.method6111(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
                        class144.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6392();
                     if (var10 != null && var10.method6111(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
                        class144.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6392();
                     if (var10 != null) {
                        var10.method6100(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        class144.invalidateWidget(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6392();
                     if (var10 != null) {
                        var10.method6086(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6392();
                     if (var10 != null) {
                        var10.method6102(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --Interpreter.Interpreter_intStackSize;
                     var10 = var3.method6392();
                     if (var10 != null) {
                        var10.method6101(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
                        class144.invalidateWidget(var3);
                     }

                     return 1;
                  } else {
                     class27 var5;
                     if (var0 == 1148) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6367();
                        if (var5 != null) {
                           var5.method407(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = var3.method6367();
                        if (var5 != null) {
                           var5.method408((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var3.method6375(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], class14.urlRequester);
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "57"
   )
   static int method471(int var0, Script var1, boolean var2) {
      Widget var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHIDE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETLAYER) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1613801130"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
      class294.method5724();
      class4.method19();
      class14.method188();
      class173.method3589();
      class379.method7393();
      SequenceDefinition.SequenceDefinition_cached.clear();
      SequenceDefinition.SequenceDefinition_cachedFrames.clear();
      SequenceDefinition.SequenceDefinition_cachedModel.clear();
      SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
      VarbitComposition.VarbitDefinition_cached.clear();
      VarpDefinition.VarpDefinition_cached.clear();
      class160.HitSplatDefinition_cachedSprites.method8823();
      MenuAction.HitSplatDefinition_cached.method8823();
      class432.method8317();
      GrandExchangeEvent.method6857();
      InterfaceParent.method2252();
      class165.method3473();
      Strings.method6602();
      class383.method7542();
      DbRowType.DBRowType_cache.clear();
      Client.DBTableIndex_cache.clear();
      Client.DBTableMasterIndex_cache.clear();
      GrandExchangeOfferTotalQuantityComparator.method6811();
      class18.method288();
      ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      Client.archive5.method7719();
      DevicePcmPlayerProvider.field117.clearFiles();
      GameBuild.archive7.clearFiles();
      class85.archive4.clearFiles();
      class426.field4687.clearFiles();
      GrandExchangeOfferTotalQuantityComparator.archive9.clearFiles();
      class399.archive6.clearFiles();
      FloorUnderlayDefinition.archive11.clearFiles();
      class452.archive8.clearFiles();
      WorldMapLabelSize.field2868.clearFiles();
      NetFileRequest.archive10.clearFiles();
      class195.field2101.clearFiles();
      class126.archive12.clearFiles();
      PcmPlayer.field316.clearFiles();
      scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      Client.field722.method4181();
      System.gc();
      class297.musicPlayerStatus = 1;
      class297.musicTrackArchive = null;
      class379.musicTrackGroupId = -1;
      VarpDefinition.musicTrackFileId = -1;
      class100.musicTrackVolume = 0;
      class120.musicTrackBoolean = false;
      class162.pcmSampleLength = 2;
      Client.currentTrackGroupId = -1;
      Client.playingJingle = false;
      StructComposition.method3926();
      class138.updateGameState(10);
   }
}
