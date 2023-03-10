import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive13")
   static Archive archive13;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lii;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("deque")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -974812285
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 218820245
   )
   @Export("remaining")
   int remaining = 0;
   @ObfuscatedName("an")
   @Export("brightness")
   double brightness = 1.0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -920955831
   )
   @Export("textureSize")
   int textureSize = 128;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("archive")
   AbstractArchive archive;

   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;IDI)V"
   )
   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.capacity = var3;
      this.remaining = this.capacity;
      this.brightness = var4;
      this.textureSize = var6;
      int[] var7 = var1.getGroupFileIds(0);
      int var8 = var7.length;
      this.textures = new Texture[var1.getGroupFileCount(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
         this.textures[var7[var9]] = new Texture(var10);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-848273151"
   )
   @Export("getLoadedPercentage")
   public int getLoadedPercentage() {
      int var1 = 0;
      int var2 = 0;
      Texture[] var3 = this.textures;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Texture var5 = var3[var4];
         if (var5 != null && var5.fileIds != null) {
            var1 += var5.fileIds.length;
            int[] var6 = var5.fileIds;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if (this.archive.method6436(var8)) {
                  ++var2;
               }
            }
         }
      }

      if (var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("al")
   @Export("setBrightness")
   public void setBrightness(double var1) {
      this.brightness = var1;
      this.clear();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "599010973"
   )
   @Export("getTexturePixels")
   public int[] getTexturePixels(int var1) {
      Texture var2 = this.textures[var1];
      if (var2 != null) {
         if (var2.pixels != null) {
            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
         if (var3) {
            if (this.remaining == 0) {
               Texture var4 = (Texture)this.deque.removeFirst();
               var4.reset();
            } else {
               --this.remaining;
            }

            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-1822"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2046582382"
   )
   public boolean vmethod4757(int var1) {
      return this.textures[var1].field2423;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1479518028"
   )
   @Export("isLowDetail")
   public boolean isLowDetail(int var1) {
      return this.textureSize == 64;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "19136782"
   )
   @Export("clear")
   public void clear() {
      for(int var1 = 0; var1 < this.textures.length; ++var1) {
         if (this.textures[var1] != null) {
            this.textures[var1].reset();
         }
      }

      this.deque = new NodeDeque();
      this.remaining = this.capacity;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "48"
   )
   @Export("animate")
   public void animate(int var1) {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         Texture var3 = this.textures[var2];
         if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
            var3.animate(var1);
            var3.isLoaded = false;
         }
      }

   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "888042879"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         class110.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;

      int var8;
      for(var8 = 0; var8 < class196.method3752(); ++var8) {
         long var23 = class166.method3384(var8);
         if (var23 != var6) {
            var6 = var23;
            int var25 = class132.method3036(var8);
            int var12 = class211.method4150(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var13 = var12;
            long var16 = ViewportMouse.ViewportMouse_entityTags[var8];
            int var15 = (int)(var16 >>> 14 & 3L);
            int var26 = class11.method100(var8);
            int var20;
            int var21;
            if (var15 == 2 && class1.scene.getObjectFlags(TaskHandler.Client_plane, var25, var12, var23) >= 0) {
               ObjectComposition var17 = WallDecoration.getObjectDefinition(var26);
               if (var17.transforms != null) {
                  var17 = var17.transform();
               }

               if (var17 == null) {
                  continue;
               }

               PendingSpawn var18 = null;

               for(PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
                  if (var19.plane == TaskHandler.Client_plane && var25 == var19.x && var13 == var19.y && var26 == var19.field1135) {
                     var18 = var19;
                     break;
                  }
               }

               if (Client.isItemSelected == 1) {
                  class110.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Canvas.colorStartTag(65535) + var17.name, 1, var26, var25, var13);
               } else if (Client.isSpellSelected) {
                  if ((class90.selectedSpellFlags & 4) == 4) {
                     class110.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Canvas.colorStartTag(65535) + var17.name, 2, var26, var25, var13);
                  }
               } else {
                  String[] var34 = var17.actions;
                  if (var34 != null) {
                     for(var20 = 4; var20 >= 0; --var20) {
                        if ((var18 == null || var18.method2345(var20)) && var34[var20] != null) {
                           var21 = 0;
                           if (var20 == 0) {
                              var21 = 3;
                           }

                           if (var20 == 1) {
                              var21 = 4;
                           }

                           if (var20 == 2) {
                              var21 = 5;
                           }

                           if (var20 == 3) {
                              var21 = 6;
                           }

                           if (var20 == 4) {
                              var21 = 1001;
                           }

                           class110.insertMenuItemNoShift(var34[var20], Canvas.colorStartTag(65535) + var17.name, var21, var26, var25, var13);
                        }
                     }
                  }

                  class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var13);
               }
            }

            int var27;
            Player var28;
            NPC var35;
            int[] var36;
            if (var15 == 1) {
               NPC var30 = Client.npcs[var26];
               if (var30 == null) {
                  continue;
               }

               if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) {
                  for(var27 = 0; var27 < Client.npcCount; ++var27) {
                     var35 = Client.npcs[Client.npcIndices[var27]];
                     if (var35 != null && var35 != var30 && var35.definition.size == 1 && var35.x == var30.x && var35.y == var30.y) {
                        class260.addNpcToMenu(var35, Client.npcIndices[var27], var25, var13);
                     }
                  }

                  var27 = Players.Players_count;
                  var36 = Players.Players_indices;

                  for(var20 = 0; var20 < var27; ++var20) {
                     var28 = Client.players[var36[var20]];
                     if (var28 != null && var30.x == var28.x && var30.y == var28.y) {
                        class16.addPlayerToMenu(var28, var36[var20], var25, var13);
                     }
                  }
               }

               class260.addNpcToMenu(var30, var26, var25, var13);
            }

            if (var15 == 0) {
               Player var31 = Client.players[var26];
               if (var31 == null) {
                  continue;
               }

               if ((var31.x & 127) == 64 && (var31.y & 127) == 64) {
                  for(var27 = 0; var27 < Client.npcCount; ++var27) {
                     var35 = Client.npcs[Client.npcIndices[var27]];
                     if (var35 != null && var35.definition.size == 1 && var35.x == var31.x && var35.y == var31.y) {
                        class260.addNpcToMenu(var35, Client.npcIndices[var27], var25, var13);
                     }
                  }

                  var27 = Players.Players_count;
                  var36 = Players.Players_indices;

                  for(var20 = 0; var20 < var27; ++var20) {
                     var28 = Client.players[var36[var20]];
                     if (var28 != null && var31 != var28 && var31.x == var28.x && var28.y == var31.y) {
                        class16.addPlayerToMenu(var28, var36[var20], var25, var13);
                     }
                  }
               }

               if (var26 != Client.combatTargetPlayerIndex) {
                  class16.addPlayerToMenu(var31, var26, var25, var13);
               } else {
                  var4 = var23;
               }
            }

            if (var15 == 3) {
               NodeDeque var32 = Client.groundItems[TaskHandler.Client_plane][var25][var13];
               if (var32 != null) {
                  for(TileItem var33 = (TileItem)var32.first(); var33 != null; var33 = (TileItem)var32.next()) {
                     ItemComposition var37 = ParamComposition.ItemDefinition_get(var33.id);
                     if (Client.isItemSelected == 1) {
                        class110.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Canvas.colorStartTag(16748608) + var37.name, 16, var33.id, var25, var13);
                     } else if (Client.isSpellSelected) {
                        if ((class90.selectedSpellFlags & 1) == 1) {
                           class110.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Canvas.colorStartTag(16748608) + var37.name, 17, var33.id, var25, var13);
                        }
                     } else {
                        String[] var29 = var37.groundActions;

                        for(var21 = 4; var21 >= 0; --var21) {
                           if (var33.method2651(var21)) {
                              if (var29 != null && var29[var21] != null) {
                                 byte var22 = 0;
                                 if (var21 == 0) {
                                    var22 = 18;
                                 }

                                 if (var21 == 1) {
                                    var22 = 19;
                                 }

                                 if (var21 == 2) {
                                    var22 = 20;
                                 }

                                 if (var21 == 3) {
                                    var22 = 21;
                                 }

                                 if (var21 == 4) {
                                    var22 = 22;
                                 }

                                 class110.insertMenuItemNoShift(var29[var21], Canvas.colorStartTag(16748608) + var37.name, var22, var33.id, var25, var13);
                              } else if (var21 == 2) {
                                 class110.insertMenuItemNoShift("Take", Canvas.colorStartTag(16748608) + var37.name, 20, var33.id, var25, var13);
                              }
                           }
                        }

                        class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16748608) + var37.name, 1004, var33.id, var25, var13);
                     }
                  }
               }
            }
         }
      }

      if (-1L != var4) {
         var8 = (int)(var4 >>> 0 & 127L);
         int var10 = class211.method4150(var4);
         Player var11 = Client.players[Client.combatTargetPlayerIndex];
         class16.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
      }

   }
}
