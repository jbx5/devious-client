import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("o")
   @Export("equipmentIndices")
   static final int[] equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("PlayerAppearance_cachedModels")
   static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedName("h")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("e")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 735151423
   )
   public int field3476 = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 354323345
   )
   @Export("gender")
   public int gender = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 14128873
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -7383529453804590235L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -5961177219730857421L
   )
   long field3477;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "[Lfx;"
   )
   @Export("playerCompositionColorTextureOverrides")
   PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
   @ObfuscatedName("u")
   boolean field3473 = false;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([I[Lfx;Z[IIIII)V",
      garbageValue = "-1317748076"
   )
   public void method5867(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
      this.playerCompositionColorTextureOverrides = var2;
      this.field3473 = var3;
      this.field3476 = var7;
      this.method5850(var1, var4, var5, var6);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "([I[IIIB)V",
      garbageValue = "53"
   )
   public void method5850(int[] var1, int[] var2, int var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class71.KitDefinition_fileCount; ++var6) {
               KitDefinition var7 = AbstractSocket.KitDefinition_get(var6);
               if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 == 1 ? 7 : 0)) {
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
      descriptor = "(IZB)V",
      garbageValue = "-11"
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
                     var3 = class71.KitDefinition_fileCount - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= class71.KitDefinition_fileCount) {
                     var3 = 0;
                  }
               }

               var4 = AbstractSocket.KitDefinition_get(var3);
            } while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.gender == 1 ? 7 : 0) + var1);

            this.equipment[equipmentIndices[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "906587072"
   )
   public void method5852(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = TriBool.field4548[var1].length - 1;
            }
         } while(!UserComparator7.method2829(var1, var3));
      } else {
         do {
            ++var3;
            if (var3 >= TriBool.field4548[var1].length) {
               var3 = 0;
            }
         } while(!UserComparator7.method2829(var1, var3));
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1044750621"
   )
   public void method5853(int var1) {
      if (this.gender != var1) {
         this.method5850((int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "11"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-19775"
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
      this.hash += (long)(this.gender * 590976369) * 354323345L;
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (var1 != 0L && var1 != this.hash || this.field3473) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lga;ILga;II)Lhh;",
      garbageValue = "1815127134"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return class129.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NewStuff)null);
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
               if (var11 >= 256 && var11 < 512 && !AbstractSocket.KitDefinition_get(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !NPCComposition.ItemDefinition_get(var11 - 512).method3933(this.gender)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.field3477) {
                  var18 = (Model)PlayerAppearance_cachedModels.get(this.field3477);
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
                     ModelData var14 = AbstractSocket.KitDefinition_get(var13 - 256).getModelData();
                     if (var14 != null) {
                        var19[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     ItemComposition var22 = NPCComposition.ItemDefinition_get(var13 - 512);
                     ModelData var15 = var22.method3934(this.gender);
                     if (var15 != null) {
                        if (this.playerCompositionColorTextureOverrides != null) {
                           PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
                           if (var16 != null) {
                              int var17;
                              if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var16.playerCompositionRecolorTo.length == var22.recolorTo.length) {
                                 for(var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
                                    var15.recolor(var22.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
                                 }
                              }

                              if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var22.retextureTo.length == var16.playerCompositionRetextureTo.length) {
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
                  if (this.bodyColors[var13] < TriBool.field4548[var13].length) {
                     var20.recolor(class86.field1104[var13], TriBool.field4548[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < Varps.field3445[var13].length) {
                     var20.recolor(NewStuff.field2017[var13], Varps.field3445[var13][this.bodyColors[var13]]);
                  }
               }

               var18 = var20.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var18, var5);
               this.field3477 = var5;
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)Lgi;",
      garbageValue = "83"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return class129.getNpcDefinition(this.npcTransformId).method3666((NewStuff)null);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !AbstractSocket.KitDefinition_get(var3 - 256).method3589()) {
               var1 = true;
            }

            if (var3 >= 512 && !NPCComposition.ItemDefinition_get(var3 - 512).method3935(this.gender)) {
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
                  var6 = AbstractSocket.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = NPCComposition.ItemDefinition_get(var5 - 512).method3936(this.gender);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < TriBool.field4548[var5].length) {
                  var8.recolor(class86.field1104[var5], TriBool.field4548[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < Varps.field3445[var5].length) {
                  var8.recolor(NewStuff.field2017[var5], Varps.field3445[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1407340254"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class129.getNpcDefinition(this.npcTransformId).id;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Lbz;",
      garbageValue = "-397803252"
   )
   @Export("worldListStart")
   static World worldListStart() {
      World.World_listCount = 0;
      return UserComparator9.getNextWorldListWorld();
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1666244801"
   )
   @Export("forceDisconnect")
   static final void forceDisconnect(int var0) {
      Player.logOut();
      switch (var0) {
         case 1:
            class376.method7327();
            break;
         case 2:
            class12.method155(24);
            TaskHandler.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
      }

   }
}
