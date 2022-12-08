import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
public class class126 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1565 = new class126(0, 0, (String)null, 0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1563 = new class126(1, 1, (String)null, 9);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1567 = new class126(2, 2, (String)null, 3);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1564 = new class126(3, 3, (String)null, 6);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1566 = new class126(4, 4, (String)null, 1);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   static final class126 field1562 = new class126(5, 5, (String)null, 3);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lep;"
   )
   static ClanSettings field1573;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -835148647
   )
   static int field1569;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1612132921
   )
   final int field1568;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1023455411
   )
   final int field1570;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1522114827
   )
   final int field1571;

   class126(int var1, int var2, String var3, int var4) {
      this.field1568 = var1;
      this.field1570 = var2;
      this.field1571 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1570;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1367110649"
   )
   int method2974() {
      return this.field1571;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;I)V",
      garbageValue = "-237323188"
   )
   public static void method2985(AbstractArchive var0, AbstractArchive var1) {
      HealthBarDefinition.HealthBarDefinition_archive = var0;
      HealthBarDefinition.field1975 = var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "1965818056"
   )
   static int method2986(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = class383.Client_plane;
         int var15 = class154.baseX * 64 + (class155.localPlayer.x >> 7);
         int var8 = class365.baseY * 64 + (class155.localPlayer.y >> 7);
         Client.getWorldMap().method7999(var3, var15, var8, true);
         return 1;
      } else {
         WorldMapArea var9;
         if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            String var16 = "";
            var9 = Client.getWorldMap().getMapArea(var3);
            if (var9 != null) {
               var16 = var9.getExternalName();
            }

            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Client.getWorldMap().setCurrentMapAreaId(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getZoomLevel();
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Client.getWorldMap().setZoomPercentage(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isCacheLoaded() ? 1 : 0;
            return 1;
         } else {
            Coord var14;
            if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               Client.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               Client.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               Client.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               Client.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayX();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayY();
               return 1;
            } else {
               WorldMapArea var11;
               if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var11 = Client.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var11 = Client.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var11 = Client.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var11 = Client.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getZoom();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var14 = Client.getWorldMap().getDisplayCoord();
                  if (var14 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var14.x;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var14.y;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().currentMapAreaId();
                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
                  var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                  var11 = Client.getWorldMap().getCurrentMapArea();
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else {
                     int[] var12 = var11.position(var14.plane, var14.x, var14.y);
                     if (var12 == null) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var12[0];
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var12[1];
                     }

                     return 1;
                  }
               } else {
                  Coord var5;
                  if (var0 == 6618) {
                     var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                     var11 = Client.getWorldMap().getCurrentMapArea();
                     if (var11 == null) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                        return 1;
                     } else {
                        var5 = var11.coord(var14.x, var14.y);
                        if (var5 == null) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.packed();
                        }

                        return 1;
                     }
                  } else {
                     Coord var10;
                     if (var0 == 6619) {
                        class87.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                        AttackOption.method2608(var3, var10, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class87.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                        AttackOption.method2608(var3, var10, true);
                        return 1;
                     } else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
                        class87.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                        var9 = Client.getWorldMap().getMapArea(var3);
                        if (var9 == null) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                           return 1;
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayWith();
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayHeight();
                        return 1;
                     } else if (var0 == 6623) {
                        var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                        var11 = Client.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
                        if (var11 == null) {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getId();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        Client.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6625) {
                        Client.getWorldMap().resetMaxFlashCount();
                        return 1;
                     } else if (var0 == 6626) {
                        Client.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6627) {
                        Client.getWorldMap().resetCyclesPerFlash();
                        return 1;
                     } else {
                        boolean var13;
                        if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
                           var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                           Client.getWorldMap().setPerpetualFlash(var13);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
                           var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                           Client.getWorldMap().flashElement(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
                           var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                           Client.getWorldMap().flashCategory(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
                           Client.getWorldMap().stopCurrentFlashes();
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
                           var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                           Client.getWorldMap().setElementsDisabled(var13);
                           return 1;
                        } else {
                           boolean var7;
                           if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
                              class87.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1;
                              Client.getWorldMap().disableElement(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
                              class87.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1;
                              Client.getWorldMap().setCategoryDisabled(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
                              Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getElementsDisabled() ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
                              var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isElementDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
                              var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class87.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                              var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
                              var5 = Client.getWorldMap().method8041(var3, var10);
                              if (var5 == null) {
                                 Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.packed();
                              }

                              return 1;
                           } else {
                              AbstractWorldMapIcon var6;
                              if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
                                 var6 = Client.getWorldMap().iconStart();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
                                 var6 = Client.getWorldMap().iconNext();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else {
                                 WorldMapElement var4;
                                 if (var0 == ScriptOpcodes.MEC_TEXT) {
                                    var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                                    var4 = JagexCache.WorldMapElement_get(var3);
                                    if (var4.name == null) {
                                       Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                                    } else {
                                       Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
                                    var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                                    var4 = JagexCache.WorldMapElement_get(var3);
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.textSize;
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
                                    var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                                    var4 = JagexCache.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.category;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_SPRITE) {
                                    var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                                    var4 = JagexCache.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.sprite1;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.mapElement;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.coord1.packed();
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
                                    Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.coord2.packed();
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
