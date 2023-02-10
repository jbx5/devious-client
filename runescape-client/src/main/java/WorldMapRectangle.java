import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("is")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -136664415
   )
   static int field2963;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1539762259
   )
   @Export("width")
   int width;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1201232349
   )
   @Export("height")
   int height;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1721050557
   )
   @Export("x")
   int x;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 437187605
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   final WorldMapRenderer this$0;

   @ObfuscatedSignature(
      descriptor = "(Lic;)V"
   )
   WorldMapRectangle(WorldMapRenderer var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1397546589"
   )
   static int method5329(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = class103.Client_plane;
         int var15 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
         int var8 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
         WorldMapDecorationType.getWorldMap().method8306(var3, var15, var8, true);
         return 1;
      } else {
         WorldMapArea var9;
         if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            String var16 = "";
            var9 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
            if (var9 != null) {
               var16 = var9.getExternalName();
            }

            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var16;
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            WorldMapDecorationType.getWorldMap().setCurrentMapAreaId(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getZoomLevel();
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            WorldMapDecorationType.getWorldMap().setZoomPercentage(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isCacheLoaded() ? 1 : 0;
            return 1;
         } else {
            Coord var14;
            if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               WorldMapDecorationType.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               WorldMapDecorationType.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               WorldMapDecorationType.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
               WorldMapDecorationType.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayX();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayY();
               return 1;
            } else {
               WorldMapArea var11;
               if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getZoom();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var14 = WorldMapDecorationType.getWorldMap().getDisplayCoord();
                  if (var14 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var14.x;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var14.y;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().currentMapAreaId();
                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
                  var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                  var11 = WorldMapDecorationType.getWorldMap().getCurrentMapArea();
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else {
                     int[] var12 = var11.position(var14.plane, var14.x, var14.y);
                     if (var12 == null) {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var12[0];
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var12[1];
                     }

                     return 1;
                  }
               } else {
                  Coord var5;
                  if (var0 == 6618) {
                     var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                     var11 = WorldMapDecorationType.getWorldMap().getCurrentMapArea();
                     if (var11 == null) {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                        return 1;
                     } else {
                        var5 = var11.coord(var14.x, var14.y);
                        if (var5 == null) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.packed();
                        }

                        return 1;
                     }
                  } else {
                     Coord var10;
                     if (var0 == 6619) {
                        class302.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                        class124.method3040(var3, var10, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class302.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                        class124.method3040(var3, var10, true);
                        return 1;
                     } else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
                        class302.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                        var9 = WorldMapDecorationType.getWorldMap().getMapArea(var3);
                        if (var9 == null) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                           return 1;
                        } else {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayWith();
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayHeight();
                        return 1;
                     } else if (var0 == 6623) {
                        var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                        var11 = WorldMapDecorationType.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
                        if (var11 == null) {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getId();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        WorldMapDecorationType.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6625) {
                        WorldMapDecorationType.getWorldMap().resetMaxFlashCount();
                        return 1;
                     } else if (var0 == 6626) {
                        WorldMapDecorationType.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6627) {
                        WorldMapDecorationType.getWorldMap().resetCyclesPerFlash();
                        return 1;
                     } else {
                        boolean var13;
                        if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
                           var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                           WorldMapDecorationType.getWorldMap().setPerpetualFlash(var13);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
                           var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                           WorldMapDecorationType.getWorldMap().flashElement(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
                           var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                           WorldMapDecorationType.getWorldMap().flashCategory(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
                           WorldMapDecorationType.getWorldMap().stopCurrentFlashes();
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
                           var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                           WorldMapDecorationType.getWorldMap().setElementsDisabled(var13);
                           return 1;
                        } else {
                           boolean var7;
                           if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
                              class302.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1;
                              WorldMapDecorationType.getWorldMap().disableElement(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
                              class302.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1;
                              WorldMapDecorationType.getWorldMap().setCategoryDisabled(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
                              Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getElementsDisabled() ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
                              var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isElementDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
                              var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class302.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                              var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
                              var5 = WorldMapDecorationType.getWorldMap().method8114(var3, var10);
                              if (var5 == null) {
                                 Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.packed();
                              }

                              return 1;
                           } else {
                              AbstractWorldMapIcon var6;
                              if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
                                 var6 = WorldMapDecorationType.getWorldMap().iconStart();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
                                 var6 = WorldMapDecorationType.getWorldMap().iconNext();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else {
                                 WorldMapElement var4;
                                 if (var0 == ScriptOpcodes.MEC_TEXT) {
                                    var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                                    var4 = class4.WorldMapElement_get(var3);
                                    if (var4.name == null) {
                                       Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                                    } else {
                                       Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.name;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
                                    var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                                    var4 = class4.WorldMapElement_get(var3);
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.textSize;
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
                                    var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                                    var4 = class4.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.category;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_SPRITE) {
                                    var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                                    var4 = class4.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.sprite1;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.mapElement;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.coord1.packed();
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
                                    Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.coord2.packed();
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
         }
      }
   }
}
