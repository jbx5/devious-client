import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
@Implements("DbTableType")
public class DbTableType extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   public static AbstractArchive field4841;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("DBTableType_cache")
   public static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @Export("types")
   public int[][] types;
   @ObfuscatedName("x")
   @Export("defaultValues")
   public Object[][] defaultValues;

   DbTableType() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-779817529"
   )
   void method8282(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8285(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "1887043738"
   )
   void method8285(Buffer var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.readUnsignedByte();
         if (this.types == null) {
            this.types = new int[var3][];
         }

         for(int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
            int var5 = var4 & 127;
            boolean var6 = (var4 & 128) != 0;
            int[] var7 = new int[var1.readUnsignedByte()];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.readUShortSmart();
            }

            this.types[var5] = var7;
            if (var6) {
               if (this.defaultValues == null) {
                  this.defaultValues = new Object[this.types.length][];
               }

               Object[][] var17 = this.defaultValues;
               int var11 = var1.readUShortSmart();
               Object[] var12 = new Object[var7.length * var11];

               for(int var13 = 0; var13 < var11; ++var13) {
                  for(int var14 = 0; var14 < var7.length; ++var14) {
                     int var15 = var14 + var7.length * var13;
                     class453 var16 = class230.method4679(var7[var14]);
                     var12[var15] = var16.method8257(var1);
                  }
               }

               var17[var5] = var12;
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "24652616"
   )
   void method8284() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILhf;Lgr;I)V",
      garbageValue = "675846473"
   )
   @Export("addObjects")
   static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = InterfaceParent.getObjectDefinition(var3);
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
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = SpotAnimationDefinition.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.int3 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if (var8.hasSound()) {
            ObjectSound var22 = new ObjectSound();
            var22.plane = var0;
            var22.x = var1 * 128;
            var22.y = var2 * 16384;
            var23 = var8.sizeX;
            var24 = var8.sizeY;
            if (var4 == 1 || var4 == 3) {
               var23 = var8.sizeY;
               var24 = var8.sizeX;
            }

            var22.maxX = (var23 + var1) * 128;
            var22.maxY = (var24 + var2) * 16384;
            var22.soundEffectId = var8.ambientSoundId;
            var22.field824 = var8.int7 * 128;
            var22.field830 = var8.int5;
            var22.field831 = var8.int6;
            var22.soundEffectIds = var8.soundEffectIds;
            if (var8.transforms != null) {
               var22.obj = var8;
               var22.set();
            }

            ObjectSound.objectSounds.addFirst(var22);
            if (var22.soundEffectIds != null) {
               var22.field821 = var22.field830 + (int)(Math.random() * (double)(var22.field831 - var22.field830));
            }
         }

         Object var34;
         if (var5 == 22) {
            if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
               if (var8.interactType == 1 && var7 != null) {
                  var7.setBlockedByFloorDec(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            int[] var10000;
            if (var5 >= 12) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.method4315(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  var10000 = UserComparator7.field1410[var0][var1];
                  var10000[var2] |= 2340;
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
               }

            } else if (var5 == 0) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field999[var4], 0, var19, var21);
               if (var4 == 0) {
                  if (var8.clipped) {
                     class32.Tiles_underlays[var0][var1][var2] = 50;
                     class32.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = UserComparator7.field1410[var0][var1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var8.clipped) {
                     class32.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     class32.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = UserComparator7.field1410[var0][var1];
                     var10000[1 + var2] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var8.clipped) {
                     class32.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     class32.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = UserComparator7.field1410[var0][var1 + 1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var8.clipped) {
                     class32.Tiles_underlays[var0][var1][var2] = 50;
                     class32.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = UserComparator7.field1410[var0][var1];
                     var10000[var2] |= 1170;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4002(var1, var2, var5, var4, var8.boolean1);
               }

               if (var8.int2 != 16) {
                  var6.method4287(var0, var1, var2, var8.int2);
               }

            } else if (var5 == 1) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1000[var4], 0, var19, var21);
               if (var8.clipped) {
                  if (var4 == 0) {
                     class32.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     class32.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     class32.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     class32.Tiles_underlays[var0][var1][var2] = 50;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4002(var1, var2, var5, var4, var8.boolean1);
               }

            } else {
               int var28;
               if (var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var31;
                  Object var32;
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
                     var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
                  } else {
                     var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field999[var4], Tiles.field999[var28], var19, var21);
                  if (var8.modelClipped) {
                     if (var4 == 0) {
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[var2] |= 585;
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[1 + var2] |= 1170;
                     } else if (var4 == 1) {
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[var2 + 1] |= 1170;
                        var10000 = UserComparator7.field1410[var0][var1 + 1];
                        var10000[var2] |= 585;
                     } else if (var4 == 2) {
                        var10000 = UserComparator7.field1410[var0][var1 + 1];
                        var10000[var2] |= 585;
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[var2] |= 1170;
                     } else if (var4 == 3) {
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[var2] |= 1170;
                        var10000 = UserComparator7.field1410[var0][var1];
                        var10000[var2] |= 585;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4002(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4287(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 3) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1000[var4], 0, var19, var21);
                  if (var8.clipped) {
                     if (var4 == 0) {
                        class32.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class32.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class32.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class32.Tiles_underlays[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4002(var1, var2, var5, var4, var8.boolean1);
                  }

               } else if (var5 == 9) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.method4315(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
                  if (var8.interactType != 0 && var7 != null) {
                     var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4287(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 4) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field999[var4], 0, 0, 0, var19, var21);
               } else {
                  Object var25;
                  long var29;
                  if (var5 == 5) {
                     var28 = 16;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (var29 != 0L) {
                        var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field999[var4], 0, var28 * Tiles.field991[var4], var28 * Tiles.field1003[var4], var19, var21);
                  } else if (var5 == 6) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (var29 != 0L) {
                        var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2 / 2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field993[var4], var28 * Tiles.field1004[var4], var19, var21);
                  } else if (var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
                  } else if (var5 == 8) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (var29 != 0L) {
                        var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2 / 2;
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

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field993[var4], var28 * Tiles.field1004[var4], var19, var21);
                  }
               }
            }
         } else {
            if (var8.animationId == -1 && var8.transforms == null) {
               var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
            }

            if (var34 != null && var6.method4315(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
               var23 = 15;
               if (var34 instanceof Model) {
                  var23 = ((Model)var34).method4510() / 4;
                  if (var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var33 = 0; var33 <= var10; ++var33) {
                     if (var23 > class32.Tiles_underlays[var0][var24 + var1][var33 + var2]) {
                        class32.Tiles_underlays[var0][var24 + var1][var33 + var2] = (byte)var23;
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
