import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class207 implements class29 {
   @ObfuscatedName("af")
   char[] field2355 = new char[128];
   @ObfuscatedName("an")
   int[] field2359 = new int[128];
   @ObfuscatedName("aw")
   public int[] field2349 = new int[128];
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1888573011
   )
   public int field2363 = 0;
   @ObfuscatedName("au")
   int[] field2353 = new int[128];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 2082731989
   )
   int field2354 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 73809669
   )
   int field2350 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1384260729
   )
   int field2364 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -147657295
   )
   int field2357 = 0;
   @ObfuscatedName("aa")
   boolean[] field2358 = new boolean[112];
   @ObfuscatedName("ay")
   boolean[] field2351 = new boolean[112];
   @ObfuscatedName("ao")
   boolean[] field2360 = new boolean[112];
   @ObfuscatedName("ax")
   public char field2361;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 546317845
   )
   public int field2362;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1311192309"
   )
   public boolean vmethod4207(int var1) {
      this.method4210(var1);
      this.field2358[var1] = true;
      this.field2351[var1] = true;
      this.field2360[var1] = false;
      this.field2349[++this.field2363 - 1] = var1;
      return true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1312051339"
   )
   public boolean vmethod4217(int var1) {
      this.field2358[var1] = false;
      this.field2351[var1] = false;
      this.field2360[var1] = true;
      this.field2353[++this.field2354 - 1] = var1;
      return true;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-2018590760"
   )
   public boolean vmethod4234(char var1) {
      int var2 = this.field2364 + 1 & 127;
      if (var2 != this.field2350) {
         this.field2359[this.field2364] = -1;
         this.field2355[this.field2364] = var1;
         this.field2364 = var2;
      }

      return false;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "-16"
   )
   public boolean vmethod4224(boolean var1) {
      return false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "30"
   )
   void method4210(int var1) {
      int var2 = this.field2364 + 1 & 127;
      if (var2 != this.field2350) {
         this.field2359[this.field2364] = var1;
         this.field2355[this.field2364] = 0;
         this.field2364 = var2;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public void method4212() {
      this.field2350 = this.field2357;
      this.field2357 = this.field2364;
      this.field2363 = 0;
      this.field2354 = 0;
      Arrays.fill(this.field2351, false);
      Arrays.fill(this.field2360, false);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1805139264"
   )
   public final boolean method4215() {
      if (this.field2357 == this.field2350) {
         return false;
      } else {
         this.field2362 = this.field2359[this.field2350];
         this.field2361 = this.field2355[this.field2350];
         this.field2350 = this.field2350 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "92"
   )
   public boolean method4214(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2351[var1] : false;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "847321512"
   )
   public boolean method4229(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2358[var1] : false;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1556637445"
   )
   public boolean method4231(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2360[var1] : false;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1282850562"
   )
   public int[] method4216() {
      int[] var1 = new int[this.field2363];

      for(int var2 = 0; var2 < this.field2363; ++var2) {
         var1[var2] = this.field2349[var2];
      }

      return var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1821496925"
   )
   public int[] method4213() {
      int[] var1 = new int[this.field2354];

      for(int var2 = 0; var2 < this.field2354; ++var2) {
         var1[var2] = this.field2353[var2];
      }

      return var1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILie;Lif;I)V",
      garbageValue = "-1625886951"
   )
   @Export("addObjects")
   static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = class144.getObjectDefinition(var3);
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
         long var19 = FaceNormal.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.int3 == 1) {
            var21 += 256;
         }

         if (var8.hasSound()) {
            GameEngine.method684(var0, var1, var2, var8, var4);
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

                  var6.method4687(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class161.field1782[var0][var1];
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

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field995[var4], 0, var19, var21);
                  if (var4 == 0) {
                     if (var8.clipped) {
                        Tiles.Tiles_underlays2[var0][var1][var2] = 50;
                        Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class161.field1782[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var8.clipped) {
                        Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class161.field1782[var0][var1];
                        var10000[1 + var2] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var8.clipped) {
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class161.field1782[var0][var1 + 1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var8.clipped) {
                        Tiles.Tiles_underlays2[var0][var1][var2] = 50;
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                     }

                     if (var8.modelClipped) {
                        var10000 = class161.field1782[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4247(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4558(var0, var1, var2, var8.int2);
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
                        Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Tiles.Tiles_underlays2[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4247(var1, var2, var5, var4, var8.boolean1);
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

                     var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field995[var4], Tiles.field995[var22], var19, var21);
                     if (var8.modelClipped) {
                        if (var4 == 0) {
                           var10000 = class161.field1782[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class161.field1782[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (var4 == 1) {
                           var10000 = class161.field1782[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = class161.field1782[var0][var1 + 1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class161.field1782[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class161.field1782[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class161.field1782[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class161.field1782[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var8.interactType != 0 && var7 != null) {
                        var7.method4247(var1, var2, var5, var4, var8.boolean1);
                     }

                     if (var8.int2 != 16) {
                        var6.method4558(var0, var1, var2, var8.int2);
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
                           Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           Tiles.Tiles_underlays2[var0][var1][var2] = 50;
                        }
                     }

                     if (var8.interactType != 0 && var7 != null) {
                        var7.method4247(var1, var2, var5, var4, var8.boolean1);
                     }

                  } else if (var5 == 9) {
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.method4687(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
                     if (var8.interactType != 0 && var7 != null) {
                        var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                     }

                     if (var8.int2 != 16) {
                        var6.method4558(var0, var1, var2, var8.int2);
                     }

                  } else if (var5 == 4) {
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field995[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var23;
                     Object var25;
                     if (var5 == 5) {
                        var22 = 16;
                        var23 = var6.getBoundaryObjectTag(var0, var1, var2);
                        if (0L != var23) {
                           var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2;
                        }

                        if (var8.animationId == -1 && var8.transforms == null) {
                           var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                        } else {
                           var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field995[var4], 0, var22 * Tiles.field1007[var4], var22 * Tiles.field1003[var4], var19, var21);
                     } else if (var5 == 6) {
                        var22 = 8;
                        var23 = var6.getBoundaryObjectTag(var0, var1, var2);
                        if (0L != var23) {
                           var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
                        }

                        if (var8.animationId == -1 && var8.transforms == null) {
                           var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                        } else {
                           var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                        }

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1009[var4], var22 * Tiles.field1010[var4], var19, var21);
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
                           var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
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

                        var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1009[var4], var22 * Tiles.field1010[var4], var19, var21);
                     }
                  }
               }
            } else {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
               } else {
                  var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               if (var29 != null && var6.method4687(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
                  var28 = 15;
                  if (var29 instanceof Model) {
                     var28 = ((Model)var29).method4762() / 4;
                     if (var28 > 30) {
                        var28 = 30;
                     }
                  }

                  for(int var31 = 0; var31 <= var9; ++var31) {
                     for(int var32 = 0; var32 <= var10; ++var32) {
                        if (var28 > Tiles.Tiles_underlays2[var0][var31 + var1][var32 + var2]) {
                           Tiles.Tiles_underlays2[var0][var31 + var1][var32 + var2] = (byte)var28;
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

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Lbp;I)V",
      garbageValue = "2037910040"
   )
   @Export("PcmStream_disable")
   static final void PcmStream_disable(PcmStream var0) {
      var0.active = false;
      if (var0.sound != null) {
         var0.sound.position = 0;
      }

      for(PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
         PcmStream_disable(var1);
      }

   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1334904246"
   )
   static final void method4244() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         Player var3 = Client.players[var1[var2]];
         if (var3 != null) {
            ReflectionCheck.updateActorSequence(var3, 1);
         }
      }

   }
}
