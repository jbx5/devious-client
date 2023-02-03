import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -963964871
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1154172457
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[Low;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("r")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("b")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("m")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Low;",
      garbageValue = "-2146736820"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)[Low;",
      garbageValue = "1411048209"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "770946348"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2047510064"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1405724718"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.size == this.capacity;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lsi;S)Z",
      garbageValue = "180"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)Low;",
      garbageValue = "-87"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)Low;",
      garbageValue = "26"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsi;I)Low;",
      garbageValue = "1658076204"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lsi;I)Z",
      garbageValue = "589374822"
   )
   @Export("removeByUsername")
   public final boolean removeByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      if (var2 == null) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Low;I)V",
      garbageValue = "-839294896"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)Low;",
      garbageValue = "-75"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lsi;Lsi;I)Low;",
      garbageValue = "-1772827399"
   )
   @Export("addLast")
   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance();
         var3.set(var1, var2);
         this.arrayAddLast(var3);
         this.mapPut(var3);
         return var3;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Low;",
      garbageValue = "-1751472166"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1605517414"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Low;Lsi;Lsi;I)V",
      garbageValue = "38165693"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Low;I)I",
      garbageValue = "-551306172"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Low;I)V",
      garbageValue = "1328104098"
   )
   @Export("mapRemove")
   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Low;I)V",
      garbageValue = "1247991301"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Low;B)V",
      garbageValue = "90"
   )
   @Export("mapPut")
   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (var2 != null && var2 != var1) {
            var2.previousUsername = null;
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2033158716"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1499141929"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILhn;Lgv;I)V",
      garbageValue = "-2041787633"
   )
   @Export("addObjects")
   static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = class463.getObjectDefinition(var3);
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
         int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = ItemLayer.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
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
            var22.y = var2 * 128;
            var23 = var8.sizeX;
            var24 = var8.sizeY;
            if (var4 == 1 || var4 == 3) {
               var23 = var8.sizeY;
               var24 = var8.sizeX;
            }

            var22.maxX = (var23 + var1) * 128;
            var22.maxY = (var24 + var2) * 128;
            var22.soundEffectId = var8.ambientSoundId;
            var22.field837 = var8.int7 * 128;
            var22.field845 = var8.int5;
            var22.field841 = var8.int6;
            var22.soundEffectIds = var8.soundEffectIds;
            if (var8.transforms != null) {
               var22.obj = var8;
               var22.set();
            }

            ObjectSound.objectSounds.addFirst(var22);
            if (var22.soundEffectIds != null) {
               var22.field843 = var22.field845 + (int)(Math.random() * (double)(var22.field841 - var22.field845));
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

               var6.method4466(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  var10000 = class312.field3717[var0][var1];
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

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1015[var4], 0, var19, var21);
               if (var4 == 0) {
                  if (var8.clipped) {
                     Tiles.Tiles_underlays[var0][var1][var2] = 50;
                     Tiles.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class312.field3717[var0][var1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var8.clipped) {
                     Tiles.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     Tiles.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class312.field3717[var0][var1];
                     var10000[1 + var2] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var8.clipped) {
                     Tiles.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     Tiles.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class312.field3717[var0][var1 + 1];
                     var10000[var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var8.clipped) {
                     Tiles.Tiles_underlays[var0][var1][var2] = 50;
                     Tiles.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  }

                  if (var8.modelClipped) {
                     var10000 = class312.field3717[var0][var1];
                     var10000[var2] |= 1170;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4184(var1, var2, var5, var4, var8.boolean1);
               }

               if (var8.int2 != 16) {
                  var6.method4583(var0, var1, var2, var8.int2);
               }

            } else if (var5 == 1) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1016[var4], 0, var19, var21);
               if (var8.clipped) {
                  if (var4 == 0) {
                     Tiles.Tiles_underlays[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     Tiles.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     Tiles.Tiles_underlays[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     Tiles.Tiles_underlays[var0][var1][var2] = 50;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method4184(var1, var2, var5, var4, var8.boolean1);
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

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1015[var4], Tiles.field1015[var28], var19, var21);
                  if (var8.modelClipped) {
                     if (var4 == 0) {
                        var10000 = class312.field3717[var0][var1];
                        var10000[var2] |= 585;
                        var10000 = class312.field3717[var0][var1];
                        var10000[1 + var2] |= 1170;
                     } else if (var4 == 1) {
                        var10000 = class312.field3717[var0][var1];
                        var10000[1 + var2] |= 1170;
                        var10000 = class312.field3717[var0][var1 + 1];
                        var10000[var2] |= 585;
                     } else if (var4 == 2) {
                        var10000 = class312.field3717[var0][var1 + 1];
                        var10000[var2] |= 585;
                        var10000 = class312.field3717[var0][var1];
                        var10000[var2] |= 1170;
                     } else if (var4 == 3) {
                        var10000 = class312.field3717[var0][var1];
                        var10000[var2] |= 1170;
                        var10000 = class312.field3717[var0][var1];
                        var10000[var2] |= 585;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4184(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4583(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 3) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1016[var4], 0, var19, var21);
                  if (var8.clipped) {
                     if (var4 == 0) {
                        Tiles.Tiles_underlays[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        Tiles.Tiles_underlays[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        Tiles.Tiles_underlays[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Tiles.Tiles_underlays[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method4184(var1, var2, var5, var4, var8.boolean1);
                  }

               } else if (var5 == 9) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.method4466(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
                  if (var8.interactType != 0 && var7 != null) {
                     var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method4583(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 4) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                  }

                  var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1015[var4], 0, 0, 0, var19, var21);
               } else {
                  Object var25;
                  long var29;
                  if (var5 == 5) {
                     var28 = 16;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (var29 != 0L) {
                        var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1015[var4], 0, var28 * Tiles.field1017[var4], var28 * Tiles.field1007[var4], var19, var21);
                  } else if (var5 == 6) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2 / 2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1019[var4], var28 * Tiles.field1020[var4], var19, var21);
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
                        var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2 / 2;
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

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1019[var4], var28 * Tiles.field1020[var4], var19, var21);
                  }
               }
            }
         } else {
            if (var8.animationId == -1 && var8.transforms == null) {
               var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
            }

            if (var34 != null && var6.method4466(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
               var23 = 15;
               if (var34 instanceof Model) {
                  var23 = ((Model)var34).method4690() / 4;
                  if (var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var33 = 0; var33 <= var10; ++var33) {
                     if (var23 > Tiles.Tiles_underlays[var0][var24 + var1][var33 + var2]) {
                        Tiles.Tiles_underlays[var0][var24 + var1][var33 + var2] = (byte)var23;
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
