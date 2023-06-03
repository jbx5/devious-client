import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("ac")
   @Export("equipmentIndices")
   static final int[] equipmentIndices;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("PlayerAppearance_cachedModels")
   public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
   @ObfuscatedName("at")
   int[] field3544;
   @ObfuscatedName("an")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("av")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1302023925
   )
   public int field3541 = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -838376169
   )
   @Export("gender")
   public int gender = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1286079261
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = -698536201873075837L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      longValue = -7296980266756646439L
   )
   long field3545;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "[Lhe;"
   )
   @Export("playerCompositionColorTextureOverrides")
   PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
   @ObfuscatedName("af")
   boolean field3547 = false;

   static {
      equipmentIndices = new int[]{class208.field2304.field2315, class208.field2312.field2315, class208.field2301.field2315, class208.field2307.field2315, class208.field2309.field2315, class208.field2308.field2315, class208.field2311.field2315};
      PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   }

   public PlayerComposition() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lmk;)V"
   )
   PlayerComposition(PlayerComposition var1) {
      int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
      int[] var3 = Arrays.copyOf(var1.field3544, var1.field3544.length);
      PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
      int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
      this.method6010(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3541);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([I[I[Lhe;Z[IIIII)V",
      garbageValue = "-2103200697"
   )
   public void method6010(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.playerCompositionColorTextureOverrides = var3;
      this.field3547 = var4;
      this.field3541 = var8;
      this.method6011(var1, var2, var5, var6, var7);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([I[I[IIIB)V",
      garbageValue = "-89"
   )
   public void method6011(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.method6012(var4);
      }

      if (var2 == null) {
         var2 = this.method6012(var4);
      }

      this.field3544 = var1;
      this.equipment = var2;
      this.bodyColors = var3;
      this.gender = var4;
      this.npcTransformId = var5;
      this.setHash();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "2008088858"
   )
   int[] method6012(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         class59.method1116(var1, var2, var3);
      }

      return var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1483080455"
   )
   @Export("changeAppearance")
   public void changeAppearance(int var1, boolean var2) {
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

            var4 = class154.KitDefinition_get(var3);
         } while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.gender == 1 ? 7 : 0) + var1);

         this.equipment[equipmentIndices[var1]] = var3 + 256;
         this.setHash();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "-19"
   )
   public void method6014(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = class13.field65[var1].length - 1;
            }
         } while(!UserComparator8.method2852(var1, var3));
      } else {
         do {
            ++var3;
            if (var3 >= class13.field65[var1].length) {
               var3 = 0;
            }
         } while(!UserComparator8.method2852(var1, var3));
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "6519"
   )
   public void method6015(int var1) {
      if (this.gender != var1) {
         this.method6011((int[])null, (int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "217742493"
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "214405957"
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
      this.hash += -838376169L * (long)(this.gender * 1749033639);
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (var1 != 0L && var1 != this.hash || this.field3547) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lhy;ILhy;IB)Ljd;",
      garbageValue = "0"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return Bounds.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NewStuff)null);
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
               if (var11 >= 256 && var11 < 512 && !class154.KitDefinition_get(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !class300.ItemDefinition_get(var11 - 512).method3957(this.gender)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (this.field3545 != -1L) {
                  var18 = (Model)PlayerAppearance_cachedModels.get(this.field3545);
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
                     ModelData var14 = class154.KitDefinition_get(var13 - 256).getModelData();
                     if (var14 != null) {
                        var19[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     ItemComposition var22 = class300.ItemDefinition_get(var13 - 512);
                     ModelData var15 = var22.method3986(this.gender);
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
                  if (this.bodyColors[var13] < class13.field65[var13].length) {
                     var20.recolor(WorldMapSection1.field3036[var13], class13.field65[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < class209.field2326[var13].length) {
                     var20.recolor(GrandExchangeEvent.field4312[var13], class209.field2326[var13][this.bodyColors[var13]]);
                  }
               }

               var18 = var20.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var18, var5);
               this.field3545 = var5;
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "4"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return Bounds.getNpcDefinition(this.npcTransformId).method3692((NewStuff)null);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !class154.KitDefinition_get(var3 - 256).method3619()) {
               var1 = true;
            }

            if (var3 >= 512 && !class300.ItemDefinition_get(var3 - 512).method3959(this.gender)) {
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
                  var6 = class154.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = class300.ItemDefinition_get(var5 - 512).method3960(this.gender);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < class13.field65[var5].length) {
                  var8.recolor(WorldMapSection1.field3036[var5], class13.field65[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < class209.field2326[var5].length) {
                  var8.recolor(GrandExchangeEvent.field4312[var5], class209.field2326[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "766034284"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Bounds.getNpcDefinition(this.npcTransformId).id;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-611812075"
   )
   void method6021() {
      this.method6011(this.field3544, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lhl;",
      garbageValue = "-2145601729"
   )
   public static HitSplatDefinition method6053(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "2031134679"
   )
   public static int method6052(int var0, int var1, int var2) {
      int var3 = class155.method3288(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(Ldh;IILie;I)V",
      garbageValue = "115389205"
   )
   static final void method6009(Player var0, int var1, int var2, class216 var3) {
      int var4 = var0.pathX[0];
      int var5 = var0.pathY[0];
      int var6 = var0.transformedSize();
      if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.transformedSize();
            RouteStrategy var9 = WorldMapDecoration.method5461(var1, var2);
            CollisionMap var10 = Client.collisionMaps[var0.plane];
            int[] var11 = Client.field805;
            int[] var12 = Client.field806;
            int var7 = class328.method6347(var4, var5, var8, var9, var10, true, var11, var12, class135.field1579[0]);
            int var13 = var7;
            if (var7 >= 1) {
               for(int var14 = 0; var14 < var13 - 1; ++var14) {
                  var0.method2296(Client.field805[var14], Client.field806[var14], var3);
               }

            }
         }
      }
   }
}
