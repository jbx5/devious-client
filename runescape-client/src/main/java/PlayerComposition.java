import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("m")
   @Export("equipmentIndices")
   static final int[] equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("PlayerAppearance_cachedModels")
   static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedName("f")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("w")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1589517711
   )
   public int field3486 = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1359876681
   )
   @Export("gender")
   public int gender = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1861727973
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      longValue = 7921280636194110999L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 9049238717222935959L
   )
   long field3490;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Lfy;"
   )
   @Export("playerCompositionColorTextureOverrides")
   PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
   @ObfuscatedName("l")
   boolean field3485 = false;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([I[Lfy;Z[IIIIS)V",
      garbageValue = "11351"
   )
   public void method5886(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
      this.playerCompositionColorTextureOverrides = var2;
      this.field3485 = var3;
      this.field3486 = var7;
      this.method5910(var1, var4, var5, var6);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "([I[IIII)V",
      garbageValue = "-946653358"
   )
   public void method5910(int[] var1, int[] var2, int var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
               KitDefinition var7 = UrlRequester.KitDefinition_get(var6);
               if (var7 != null && !var7.nonSelectable && var5 + (var3 == 1 ? 7 : 0) == var7.bodypartID) {
                  var1[equipmentIndices[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipment = var1;
      this.bodyColors = var2;
      this.gender = var3;
      this.npcTransformId = var4;
      this.setHash();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1974416025"
   )
   @Export("changeAppearance")
   public void changeAppearance(int var1, boolean var2) {
      if (var1 != 1 || this.gender != 1) {
         int var3 = this.equipment[equipmentIndices[var1]];
         if (var3 != 0) {
            var3 -= 256;

            KitDefinition var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = KitDefinition.KitDefinition_fileCount - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= KitDefinition.KitDefinition_fileCount) {
                     var3 = 0;
                  }
               }

               var4 = UrlRequester.KitDefinition_get(var3);
            } while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.gender == 1 ? 7 : 0));

            this.equipment[equipmentIndices[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "1"
   )
   public void method5885(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = UserComparator8.field1435[var1].length - 1;
            }
         } while(!FriendSystem.method1874(var1, var3));
      } else {
         do {
            ++var3;
            if (var3 >= UserComparator8.field1435[var1].length) {
               var3 = 0;
            }
         } while(!FriendSystem.method1874(var1, var3));
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1082972328"
   )
   public void method5898(int var1) {
      if (this.gender != var1) {
         this.method5910((int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "-55"
   )
   @Export("write")
   public void write(Buffer var1) {
      var1.writeByte(this.gender);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipment[equipmentIndices[var2]];
         if (var3 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.bodyColors[var2]);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-711968992"
   )
   @Export("setHash")
   void setHash() {
      long var1 = this.hash;
      int var3 = this.equipment[5];
      int var4 = this.equipment[9];
      this.equipment[5] = var4;
      this.equipment[9] = var3;
      this.hash = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.hash <<= 4;
         if (this.equipment[var5] >= 256) {
            this.hash += (long)(this.equipment[var5] - 256);
         }
      }

      if (this.equipment[0] >= 256) {
         this.hash += (long)(this.equipment[0] - 256 >> 4);
      }

      if (this.equipment[1] >= 256) {
         this.hash += (long)(this.equipment[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.hash <<= 3;
         this.hash += (long)this.bodyColors[var5];
      }

      this.hash <<= 1;
      this.hash += -1359876681L * (long)(this.gender * 1135706119);
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (var1 != 0L && this.hash != var1 || this.field3485) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lge;ILge;IB)Lhs;",
      garbageValue = "34"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return class137.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NewStuff)null);
      } else {
         long var5 = this.hash;
         int[] var7 = this.equipment;
         if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.equipment[var8];
            }

            if (var1.shield >= 0) {
               var5 += (long)(var1.shield - this.equipment[5] << 40);
               var7[5] = var1.shield;
            }

            if (var1.weapon >= 0) {
               var5 += (long)(var1.weapon - this.equipment[3] << 48);
               var7[3] = var1.weapon;
            }
         }

         Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
         if (var18 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !UrlRequester.KitDefinition_get(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !TileItem.ItemDefinition_get(var11 - 512).method3969(this.gender)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.field3490) {
                  var18 = (Model)PlayerAppearance_cachedModels.get(this.field3490);
               }

               if (var18 == null) {
                  return null;
               }
            }

            if (var18 == null) {
               ModelData[] var19 = new ModelData[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  if (var13 >= 256 && var13 < 512) {
                     ModelData var14 = UrlRequester.KitDefinition_get(var13 - 256).getModelData();
                     if (var14 != null) {
                        var19[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     ItemComposition var22 = TileItem.ItemDefinition_get(var13 - 512);
                     ModelData var15 = var22.method3959(this.gender);
                     if (var15 != null) {
                        if (this.playerCompositionColorTextureOverrides != null) {
                           PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
                           if (var16 != null) {
                              int var17;
                              if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var22.recolorTo.length == var16.playerCompositionRecolorTo.length) {
                                 for(var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
                                    var15.recolor(var22.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
                                 }
                              }

                              if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var16.playerCompositionRetextureTo.length == var22.retextureTo.length) {
                                 for(var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
                                    var15.retexture(var22.retextureTo[var17], var16.playerCompositionRetextureTo[var17]);
                                 }
                              }
                           }
                        }

                        var19[var11++] = var15;
                     }
                  }
               }

               ModelData var20 = new ModelData(var19, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.bodyColors[var13] < UserComparator8.field1435[var13].length) {
                     var20.recolor(class384.field4483[var13], UserComparator8.field1435[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < Varcs.field1379[var13].length) {
                     var20.recolor(ItemLayer.field2385[var13], Varcs.field1379[var13][this.bodyColors[var13]]);
                  }
               }

               var18 = var20.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var18, var5);
               this.field3490 = var5;
            }
         }

         Model var21;
         if (var1 == null && var3 == null) {
            var21 = var18.toSharedSequenceModel(true);
         } else if (var1 != null && var3 != null) {
            var21 = var1.applyTransformations(var18, var2, var3, var4);
         } else if (var1 != null) {
            var21 = var1.transformActorModel(var18, var2);
         } else {
            var21 = var3.transformActorModel(var18, var4);
         }

         return var21;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)Lhe;",
      garbageValue = "31"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return class137.getNpcDefinition(this.npcTransformId).method3750((NewStuff)null);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !UrlRequester.KitDefinition_get(var3 - 256).method3645()) {
               var1 = true;
            }

            if (var3 >= 512 && !TileItem.ItemDefinition_get(var3 - 512).method3960(this.gender)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.equipment[var4];
               ModelData var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = UrlRequester.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = TileItem.ItemDefinition_get(var5 - 512).method3961(this.gender);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < UserComparator8.field1435[var5].length) {
                  var8.recolor(class384.field4483[var5], UserComparator8.field1435[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < Varcs.field1379[var5].length) {
                  var8.recolor(ItemLayer.field2385[var5], Varcs.field1379[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "490980648"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class137.getNpcDefinition(this.npcTransformId).id;
   }
}
