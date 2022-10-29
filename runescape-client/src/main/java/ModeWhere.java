import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mh")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4262("", 0, new class341[]{class341.field4232}),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4254("", 1, new class341[]{class341.field4229, class341.field4232}),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4255("", 2, new class341[]{class341.field4229, class341.field4231, class341.field4232}),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4256("", 3, new class341[]{class341.field4229}),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4253("", 4),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4258("", 5, new class341[]{class341.field4229, class341.field4232}),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4259("", 6, new class341[]{class341.field4232}),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4260("", 8, new class341[]{class341.field4229, class341.field4232}),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4267("", 9, new class341[]{class341.field4229, class341.field4231}),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4269("", 10, new class341[]{class341.field4229}),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4264("", 11, new class341[]{class341.field4229}),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4261("", 12, new class341[]{class341.field4229, class341.field4232}),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   field4265("", 13, new class341[]{class341.field4229});

   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 955062507
   )
   static int field4271;
   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "Lnl;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1623689719
   )
   @Export("id")
   final int id;
   @ObfuscatedName("o")
   final Set field4257 = new HashSet();

   static {
      method6593();
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I[Lmx;)V"
   )
   ModeWhere(String var3, int var4, class341[] var5) {
      this.id = var4;
      class341[] var6 = var5;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class341 var8 = var6[var7];
         this.field4257.add(var8);
      }

   }

   ModeWhere(String var3, int var4) {
      this.id = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lfb;",
      garbageValue = "-1880541005"
   )
   public static HealthBarDefinition method6594(int var0) {
      HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
         var1 = new HealthBarDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Lmh;",
      garbageValue = "1602959533"
   )
   static ModeWhere[] method6593() {
      return new ModeWhere[]{field4256, field4258, field4261, field4267, field4262, field4269, field4253, field4264, field4254, field4255, field4260, field4259, field4265};
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "2113556951"
   )
   static int method6595(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = ApproximateRouteStrategy.Client_plane;
         int var15 = KeyHandler.baseX * 64 + (class296.localPlayer.x >> 7);
         int var8 = class158.baseY * 64 + (class296.localPlayer.y >> 7);
         GrandExchangeOfferUnitPriceComparator.getWorldMap().method7888(var3, var15, var8, true);
         return 1;
      } else {
         WorldMapArea var9;
         if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            String var16 = "";
            var9 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
            if (var9 != null) {
               var16 = var9.getExternalName();
            }

            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var16;
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            GrandExchangeOfferUnitPriceComparator.getWorldMap().setCurrentMapAreaId(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getZoomLevel();
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            GrandExchangeOfferUnitPriceComparator.getWorldMap().setZoomPercentage(var3);
            return 1;
         } else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isCacheLoaded() ? 1 : 0;
            return 1;
         } else {
            Coord var14;
            if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               GrandExchangeOfferUnitPriceComparator.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               GrandExchangeOfferUnitPriceComparator.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               GrandExchangeOfferUnitPriceComparator.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
               var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
               GrandExchangeOfferUnitPriceComparator.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
               return 1;
            } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayX();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayY();
               return 1;
            } else {
               WorldMapArea var11;
               if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
                  var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getZoom();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var14 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayCoord();
                  if (var14 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var14.x;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var14.y;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().currentMapAreaId();
                  return 1;
               } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
                  var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                  var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getCurrentMapArea();
                  if (var11 == null) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else {
                     int[] var12 = var11.position(var14.plane, var14.x, var14.y);
                     if (var12 == null) {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var12[0];
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var12[1];
                     }

                     return 1;
                  }
               } else {
                  Coord var5;
                  if (var0 == 6618) {
                     var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                     var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getCurrentMapArea();
                     if (var11 == null) {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                        return 1;
                     } else {
                        var5 = var11.coord(var14.x, var14.y);
                        if (var5 == null) {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.packed();
                        }

                        return 1;
                     }
                  } else {
                     Coord var10;
                     if (var0 == 6619) {
                        class379.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                        GrandExchangeOfferUnitPriceComparator.method6533(var3, var10, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class379.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                        GrandExchangeOfferUnitPriceComparator.method6533(var3, var10, true);
                        return 1;
                     } else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
                        class379.Interpreter_intStackSize -= 2;
                        var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                        var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                        var9 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3);
                        if (var9 == null) {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                           return 1;
                        } else {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayWith();
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayHeight();
                        return 1;
                     } else if (var0 == 6623) {
                        var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                        var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
                        if (var11 == null) {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getId();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        GrandExchangeOfferUnitPriceComparator.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6625) {
                        GrandExchangeOfferUnitPriceComparator.getWorldMap().resetMaxFlashCount();
                        return 1;
                     } else if (var0 == 6626) {
                        GrandExchangeOfferUnitPriceComparator.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
                        return 1;
                     } else if (var0 == 6627) {
                        GrandExchangeOfferUnitPriceComparator.getWorldMap().resetCyclesPerFlash();
                        return 1;
                     } else {
                        boolean var13;
                        if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
                           var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                           GrandExchangeOfferUnitPriceComparator.getWorldMap().setPerpetualFlash(var13);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
                           var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                           GrandExchangeOfferUnitPriceComparator.getWorldMap().flashElement(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
                           var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                           GrandExchangeOfferUnitPriceComparator.getWorldMap().flashCategory(var3);
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
                           GrandExchangeOfferUnitPriceComparator.getWorldMap().stopCurrentFlashes();
                           return 1;
                        } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
                           var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                           GrandExchangeOfferUnitPriceComparator.getWorldMap().setElementsDisabled(var13);
                           return 1;
                        } else {
                           boolean var7;
                           if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
                              class379.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1;
                              GrandExchangeOfferUnitPriceComparator.getWorldMap().disableElement(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
                              class379.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                              var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1;
                              GrandExchangeOfferUnitPriceComparator.getWorldMap().setCategoryDisabled(var3, var7);
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
                              Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getElementsDisabled() ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
                              var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isElementDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
                              var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                              Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class379.Interpreter_intStackSize -= 2;
                              var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                              var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
                              var5 = GrandExchangeOfferUnitPriceComparator.getWorldMap().method7920(var3, var10);
                              if (var5 == null) {
                                 Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.packed();
                              }

                              return 1;
                           } else {
                              AbstractWorldMapIcon var6;
                              if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
                                 var6 = GrandExchangeOfferUnitPriceComparator.getWorldMap().iconStart();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
                                 var6 = GrandExchangeOfferUnitPriceComparator.getWorldMap().iconNext();
                                 if (var6 == null) {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.getElement();
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.coord2.packed();
                                 }

                                 return 1;
                              } else {
                                 WorldMapElement var4;
                                 if (var0 == ScriptOpcodes.MEC_TEXT) {
                                    var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                                    var4 = Actor.WorldMapElement_get(var3);
                                    if (var4.name == null) {
                                       Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                                    } else {
                                       Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.name;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
                                    var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                                    var4 = Actor.WorldMapElement_get(var3);
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.textSize;
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
                                    var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                                    var4 = Actor.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.category;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.MEC_SPRITE) {
                                    var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                                    var4 = Actor.WorldMapElement_get(var3);
                                    if (var4 == null) {
                                       Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.sprite1;
                                    }

                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.mapElement;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.coord1.packed();
                                    return 1;
                                 } else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
                                    Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.coord2.packed();
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

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(Lgf;I)V",
      garbageValue = "-1009550654"
   )
   static void method6590(class198 var0) {
      if (var0 != null && var0.field2240 != null) {
         if (var0.field2240.childIndex >= 0) {
            Widget var1 = class281.getWidget(var0.field2240.parentId);
            if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2240.childIndex >= var1.children.length || var0.field2240 != var1.children[var0.field2240.childIndex]) {
               return;
            }
         }

         if (var0.field2240.type == 11 && var0.field2239 == 0) {
            switch (var0.field2240.method6069()) {
               case 0:
                  UrlRequester.openURL(var0.field2240.method6071(), true, false);
                  break;
               case 1:
                  if (WorldMapCacheName.method5229(class197.getWidgetFlags(var0.field2240))) {
                     int[] var4 = var0.field2240.method6132();
                     if (var4 != null) {
                        PacketBufferNode var2 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher);
                        var2.packetBuffer.writeIntME(var4[2]);
                        var2.packetBuffer.writeInt(var0.field2240.id);
                        var2.packetBuffer.writeIntME(var0.field2240.method6070());
                        var2.packetBuffer.writeShort(var0.field2240.childIndex);
                        var2.packetBuffer.writeIntLE(var4[1]);
                        var2.packetBuffer.writeIntLE(var4[0]);
                        Client.packetWriter.addNode(var2);
                     }
                  }
            }
         } else if (var0.field2240.type == 12) {
            class300 var3 = var0.field2240.method6076();
            if (var3 != null && var3.method5819()) {
               switch (var0.field2239) {
                  case 0:
                     Client.field734.method3915(var0.field2240);
                     var3.method5767(true);
                     var3.method5806(var0.field2243, var0.field2236, Client.field733.method3956(82), Client.field733.method3956(81));
                     break;
                  case 1:
                     var3.method5807(var0.field2243, var0.field2236);
               }
            }
         }

      }
   }
}
