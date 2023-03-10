import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class149 extends class140 {
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = 1713776453
   )
   static int field1677;
   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   @Export("compass")
   static SpritePixels compass;
   @ObfuscatedName("aj")
   String field1674;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class149(class143 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1674 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.name = this.field1674;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-740848087"
   )
   @Export("addPendingSpawnToScene")
   static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.isLowDetail && var0 != TaskHandler.Client_plane) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if (var1 == 0) {
            var8 = class1.scene.getBoundaryObjectTag(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class1.scene.getWallDecorationTag(var0, var2, var3);
         }

         if (var1 == 2) {
            var8 = class1.scene.getGameObjectTag(var0, var2, var3);
         }

         if (var1 == 3) {
            var8 = class1.scene.getFloorDecorationTag(var0, var2, var3);
         }

         int var13;
         if (var8 != 0L) {
            var13 = class1.scene.getObjectFlags(var0, var2, var3, var8);
            int var40 = class279.Entity_unpackID(var8);
            int var41 = var13 & 31;
            int var42 = var13 >> 6 & 3;
            ObjectComposition var14;
            if (var1 == 0) {
               class1.scene.removeBoundaryObject(var0, var2, var3);
               var14 = WallDecoration.getObjectDefinition(var40);
               if (var14.interactType != 0) {
                  Client.collisionMaps[var0].method4136(var2, var3, var41, var42, var14.boolean1);
               }
            }

            if (var1 == 1) {
               class1.scene.removeWallDecoration(var0, var2, var3);
            }

            if (var1 == 2) {
               class1.scene.removeGameObject(var0, var2, var3);
               var14 = WallDecoration.getObjectDefinition(var40);
               if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
                  return;
               }

               if (var14.interactType != 0) {
                  Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
               }
            }

            if (var1 == 3) {
               class1.scene.removeFloorDecoration(var0, var2, var3);
               var14 = WallDecoration.getObjectDefinition(var40);
               if (var14.interactType == 1) {
                  Client.collisionMaps[var0].method4120(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var13 = var0;
            if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
               var13 = var0 + 1;
            }

            Scene var43 = class1.scene;
            CollisionMap var15 = Client.collisionMaps[var0];
            ObjectComposition var16 = WallDecoration.getObjectDefinition(var4);
            int var17 = var7 >= 0 ? var7 : var16.animationId;
            int var18;
            int var19;
            if (var5 != 1 && var5 != 3) {
               var18 = var16.sizeX;
               var19 = var16.sizeY;
            } else {
               var18 = var16.sizeY;
               var19 = var16.sizeX;
            }

            int var20;
            int var21;
            if (var18 + var2 <= 104) {
               var20 = (var18 >> 1) + var2;
               var21 = var2 + (var18 + 1 >> 1);
            } else {
               var20 = var2;
               var21 = var2 + 1;
            }

            int var22;
            int var23;
            if (var3 + var19 <= 104) {
               var22 = var3 + (var19 >> 1);
               var23 = var3 + (var19 + 1 >> 1);
            } else {
               var22 = var3;
               var23 = var3 + 1;
            }

            int[][] var24 = Tiles.Tiles_heights[var13];
            int var25 = var24[var20][var22] + var24[var21][var22] + var24[var20][var23] + var24[var21][var23] >> 2;
            int var26 = (var2 << 7) + (var18 << 6);
            int var27 = (var3 << 7) + (var19 << 6);
            long var28 = class103.calculateTag(var2, var3, 2, var16.int1 == 0, var4);
            int var30 = (var5 << 6) + var6;
            if (var16.int3 == 1) {
               var30 += 256;
            }

            Object var38;
            if (var6 == 22) {
               if (var17 == -1 && var16.transforms == null) {
                  var38 = var16.getModel(22, var5, var24, var26, var25, var27);
               } else {
                  var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
               }

               var43.newFloorDecoration(var0, var2, var3, var25, (Renderable)var38, var28, var30);
               if (var16.interactType == 1) {
                  var15.setBlockedByFloorDec(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var17 == -1 && var16.transforms == null) {
                     var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
                  } else {
                     var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                  }

                  var43.method4532(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
                  if (var16.interactType != 0) {
                     var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
                  }
               } else if (var6 == 0) {
                  if (var17 == -1 && var16.transforms == null) {
                     var38 = var16.getModel(0, var5, var24, var26, var25, var27);
                  } else {
                     var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                  }

                  var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field998[var5], 0, var28, var30);
                  if (var16.interactType != 0) {
                     var15.method4114(var2, var3, var6, var5, var16.boolean1);
                  }
               } else if (var6 == 1) {
                  if (var17 == -1 && var16.transforms == null) {
                     var38 = var16.getModel(1, var5, var24, var26, var25, var27);
                  } else {
                     var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                  }

                  var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1006[var5], 0, var28, var30);
                  if (var16.interactType != 0) {
                     var15.method4114(var2, var3, var6, var5, var16.boolean1);
                  }
               } else {
                  int var31;
                  if (var6 == 2) {
                     var31 = var5 + 1 & 3;
                     Object var33;
                     Object var39;
                     if (var17 == -1 && var16.transforms == null) {
                        var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27);
                        var33 = var16.getModel(2, var31, var24, var26, var25, var27);
                     } else {
                        var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                        var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                     }

                     var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field998[var5], Tiles.field998[var31], var28, var30);
                     if (var16.interactType != 0) {
                        var15.method4114(var2, var3, var6, var5, var16.boolean1);
                     }
                  } else if (var6 == 3) {
                     if (var17 == -1 && var16.transforms == null) {
                        var38 = var16.getModel(3, var5, var24, var26, var25, var27);
                     } else {
                        var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                     }

                     var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1006[var5], 0, var28, var30);
                     if (var16.interactType != 0) {
                        var15.method4114(var2, var3, var6, var5, var16.boolean1);
                     }
                  } else if (var6 == 9) {
                     if (var17 == -1 && var16.transforms == null) {
                        var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
                     } else {
                        var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                     }

                     var43.method4532(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
                     if (var16.interactType != 0) {
                        var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
                     }
                  } else if (var6 == 4) {
                     if (var17 == -1 && var16.transforms == null) {
                        var38 = var16.getModel(4, var5, var24, var26, var25, var27);
                     } else {
                        var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                     }

                     var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field998[var5], 0, 0, 0, var28, var30);
                  } else {
                     long var32;
                     Object var34;
                     if (var6 == 5) {
                        var31 = 16;
                        var32 = var43.getBoundaryObjectTag(var0, var2, var3);
                        if (0L != var32) {
                           var31 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var32)).int2;
                        }

                        if (var17 == -1 && var16.transforms == null) {
                           var34 = var16.getModel(4, var5, var24, var26, var25, var27);
                        } else {
                           var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                        }

                        var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field998[var5], 0, var31 * Tiles.field1000[var5], var31 * Tiles.field1002[var5], var28, var30);
                     } else if (var6 == 6) {
                        var31 = 8;
                        var32 = var43.getBoundaryObjectTag(var0, var2, var3);
                        if (0L != var32) {
                           var31 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var32)).int2 / 2;
                        }

                        if (var17 == -1 && var16.transforms == null) {
                           var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
                        } else {
                           var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                        }

                        var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1003[var5], var31 * Tiles.field1004[var5], var28, var30);
                     } else if (var6 == 7) {
                        int var37 = var5 + 2 & 3;
                        if (var17 == -1 && var16.transforms == null) {
                           var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
                        } else {
                           var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                        }

                        var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30);
                     } else if (var6 == 8) {
                        var31 = 8;
                        var32 = var43.getBoundaryObjectTag(var0, var2, var3);
                        if (0L != var32) {
                           var31 = WallDecoration.getObjectDefinition(class279.Entity_unpackID(var32)).int2 / 2;
                        }

                        int var36 = var5 + 2 & 3;
                        Object var35;
                        if (var17 == -1 && var16.transforms == null) {
                           var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
                           var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27);
                        } else {
                           var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                           var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
                        }

                        var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1003[var5], var31 * Tiles.field1004[var5], var28, var30);
                     }
                  }
               }
            } else {
               if (var17 == -1 && var16.transforms == null) {
                  var38 = var16.getModel(10, var5, var24, var26, var25, var27);
               } else {
                  var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
               }

               if (var38 != null) {
                  var43.method4532(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
               }

               if (var16.interactType != 0) {
                  var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
               }
            }
         }
      }

   }

   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      descriptor = "(IIIILsn;Llx;I)V",
      garbageValue = "1105906577"
   )
   @Export("drawSpriteOnMinimap")
   static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      if (var4 != null) {
         int var6 = Client.camAngleY & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method9076(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
            } else {
               var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
            }

         }
      }
   }
}
