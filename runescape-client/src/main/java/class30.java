import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class30 {
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = 1420334919
   )
   @Export("menuHeight")
   static int menuHeight;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILir;Liz;I)V",
      garbageValue = "795706327"
   )
   @Export("addObjects")
   static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = WallDecoration.getObjectDefinition(var3);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.sizeX;
            var10 = var8.sizeY;
         } else {
            var9 = var8.sizeY;
            var10 = var8.sizeX;
         }

         int var11;
         int var12;
         if (var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = Tiles.Tiles_heights[var0];
         int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class103.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.int3 == 1) {
            var21 += 256;
         }

         if (var8.hasSound()) {
            class388.method7347(var0, var1, var2, var8, var4);
         }

         Object var29;
         if (var5 == 22) {
            if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
               } else {
                  var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
               if (var8.interactType == 1 && var7 != null) {
                  var7.setBlockedByFloorDec(var1, var2);
               }

            }
         } else {
            int var28;
            if (var5 != 10 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                  } else {
                     var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.method4532(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class17.field88[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                  }

               } else if (var5 == 0) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
                  } else {
                     var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field998[var4], 0, var19, var21);
                  if (var4 == 0) {
                     if (var8.clipped) {
                        Decimator.Tiles_underlays2[var0][var1][var2] = 50;
                        Decimator.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class17.field88[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var8.clipped) {
                        Decimator.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class17.field88[var0][var1];
                        var10000[var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var8.clipped) {
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class17.field88[var0][var1 + 1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var8.clipped) {
                        Decimator.Tiles_underlays2[var0][var1][var2] = 50;
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class17.field88[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4114(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4531(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 1) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
                  } else {
                     var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21);
                  if (var8.clipped) {
                     if (var4 == 0) {
                        Decimator.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        Decimator.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Decimator.Tiles_underlays2[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4114(var1, var2, var5, var4, var8.boolean1);
                  }

               } else {
                  int var22;
                  if (var5 == 2) {
                     var22 = var4 + 1 & 3;
                     Object var24;
                     Object var30;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
                        var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
                     } else {
                        var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field998[var4], Tiles.field998[var22], var19, var21);
                     if (var8.modelClipped) {
                        if (var4 == 0) {
                           var10000 = class17.field88[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class17.field88[var0][var1];
                           var10000[1 + var2] |= 1170;
                        } else if (var4 == 1) {
                           var10000 = class17.field88[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = class17.field88[var0][var1 + 1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class17.field88[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class17.field88[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class17.field88[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class17.field88[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var8.interactType != 0 && var7 != null) {
                        var7.method4114(var1, var2, var5, var4, var8.boolean1);
                     }

                     if (var8.int2 != 16) {
                        var6.method4531(var0, var1, var2, var8.int2);
                     }

                  } else if (var5 == 3) {
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21);
                     if (var8.clipped) {
                        if (var4 == 0) {
                           Decimator.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           Decimator.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           Decimator.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           Decimator.Tiles_underlays2[var0][var1][var2] = 50;
                        }
                     }

                     if (var8.interactType != 0 && var7 != null) {
                        var7.method4114(var1, var2, var5, var4, var8.boolean1);
                     }

                  } else if (var5 == 9) {
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.method4532(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
                     if (var8.interactType != 0 && var7 != null) {
                        var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                     }

                     if (var8.int2 != 16) {
                        var6.method4531(var0, var1, var2, var8.int2);
                     }

                  } else if (var5 == 4) {
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field998[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var23;
                     Object var25;
                     if (var5 == 5) {
                        var22 = 16;
                        var23 = var6.getBoundaryObjectTag(var0, var1, var2);
                        if (var23 != 0L) {
                           var22 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var23)).int2;
                        }

                        if (var8.animationId == -1 && var8.transforms == null) {
                           var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                        } else {
                           var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field998[var4], 0, var22 * Tiles.field1000[var4], var22 * Tiles.field1002[var4], var19, var21);
                     } else if (var5 == 6) {
                        var22 = 8;
                        var23 = var6.getBoundaryObjectTag(var0, var1, var2);
                        if (0L != var23) {
                           var22 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var23)).int2 / 2;
                        }

                        if (var8.animationId == -1 && var8.transforms == null) {
                           var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                        } else {
                           var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1004[var4], var19, var21);
                     } else if (var5 == 7) {
                        var28 = var4 + 2 & 3;
                        if (var8.animationId == -1 && var8.transforms == null) {
                           var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
                        } else {
                           var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
                     } else if (var5 == 8) {
                        var22 = 8;
                        var23 = var6.getBoundaryObjectTag(var0, var1, var2);
                        if (0L != var23) {
                           var22 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var23)).int2 / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if (var8.animationId == -1 && var8.transforms == null) {
                           var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                           var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
                        } else {
                           var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                           var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1004[var4], var19, var21);
                     }
                  }
               }
            } else {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
               } else {
                  var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               if (var29 != null && var6.method4532(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
                  var28 = 15;
                  if (var29 instanceof Model) {
                     var28 = ((Model)var29).method4625() / 4;
                     if (var28 > 30) {
                        var28 = 30;
                     }
                  }

                  for(int var31 = 0; var31 <= var9; ++var31) {
                     for(int var32 = 0; var32 <= var10; ++var32) {
                        if (var28 > Decimator.Tiles_underlays2[var0][var31 + var1][var32 + var2]) {
                           Decimator.Tiles_underlays2[var0][var31 + var1][var32 + var2] = (byte)var28;
                        }
                     }
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
               }

            }
         }
      }
   }
}
