import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("ay")
   @Export("equipmentIndices")
   static final int[] equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("PlayerAppearance_cachedModels")
   public static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedName("aj")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("al")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -25773693
   )
   public int field3461 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1628771057
   )
   @Export("gender")
   public int gender = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 464846559
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 8656154274683595361L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      longValue = 5668896369310599269L
   )
   long field3463;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "[Lgv;"
   )
   @Export("playerCompositionColorTextureOverrides")
   PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
   @ObfuscatedName("ap")
   boolean field3469 = false;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([I[Lgv;Z[IIIII)V",
      garbageValue = "662366071"
   )
   public void method5792(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
      this.playerCompositionColorTextureOverrides = var2;
      this.field3469 = var3;
      this.field3461 = var7;
      this.method5784(var1, var4, var5, var6);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "([I[IIII)V",
      garbageValue = "-1988594317"
   )
   public void method5784(int[] var1, int[] var2, int var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
               KitDefinition var7 = class395.KitDefinition_get(var6);
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-542295271"
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

               var4 = class395.KitDefinition_get(var3);
            } while(var4 == null || var4.nonSelectable || (this.gender == 1 ? 7 : 0) + var1 != var4.bodypartID);

            this.equipment[equipmentIndices[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "54"
   )
   public void method5786(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = CollisionMap.field2315[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= CollisionMap.field2315[var1].length) {
               var3 = 0;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-245090985"
   )
   public void method5787(int var1) {
      if (this.gender != var1) {
         this.method5784((int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "18"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-126"
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
      this.hash += -1628771057L * (long)(this.gender * -410623505);
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (0L != var1 && this.hash != var1 || this.field3469) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lhx;ILhx;II)Lix;",
      garbageValue = "-1414560036"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return class188.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NewStuff)null);
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
               if (var11 >= 256 && var11 < 512 && !class395.KitDefinition_get(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !ParamComposition.ItemDefinition_get(var11 - 512).method3918(this.gender)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (this.field3463 != -1L) {
                  var18 = (Model)PlayerAppearance_cachedModels.get(this.field3463);
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
                     ModelData var14 = class395.KitDefinition_get(var13 - 256).getModelData();
                     if (var14 != null) {
                        var19[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     ItemComposition var22 = ParamComposition.ItemDefinition_get(var13 - 512);
                     ModelData var15 = var22.method3919(this.gender);
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
                  if (this.bodyColors[var13] < CollisionMap.field2315[var13].length) {
                     var20.recolor(class308.field3457[var13], CollisionMap.field2315[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < class126.field1495[var13].length) {
                     var20.recolor(class128.field1529[var13], class126.field1495[var13][this.bodyColors[var13]]);
                  }
               }

               var18 = var20.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var18, var5);
               this.field3463 = var5;
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Liu;",
      garbageValue = "-1742868640"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return class188.getNpcDefinition(this.npcTransformId).method3670((NewStuff)null);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !class395.KitDefinition_get(var3 - 256).method3608()) {
               var1 = true;
            }

            if (var3 >= 512 && !ParamComposition.ItemDefinition_get(var3 - 512).method3920(this.gender)) {
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
                  var6 = class395.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = ParamComposition.ItemDefinition_get(var5 - 512).method3921(this.gender);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < CollisionMap.field2315[var5].length) {
                  var8.recolor(class308.field3457[var5], CollisionMap.field2315[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < class126.field1495[var5].length) {
                  var8.recolor(class128.field1529[var5], class126.field1495[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1033760523"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class188.getNpcDefinition(this.npcTransformId).id;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ILsy;B)Lgv;",
      garbageValue = "16"
   )
   public static PlayerCompositionColorTextureOverride method5812(int var0, Buffer var1) {
      int var2 = var1.readUnsignedByte();
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = (var2 & 2) != 0;
      PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRecolorTo[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRetextureTo[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;ZII)V",
      garbageValue = "-17062513"
   )
   static void method5782(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (Login.clearLoginScreen) {
         if (var3 == 4) {
            class14.method173(4);
         }

      } else {
         if (var3 == 0) {
            class28.method426(var2);
         } else {
            class14.method173(var3);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         Login.leftTitleSprite = class139.method3105(var4);
         class419.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
         class269.method5378(var1, Client.worldProperties);
         WorldMapSprite.titleboxSprite = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         Login.titlebuttonSprite = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         GrandExchangeOfferOwnWorldComparator.field478 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
         class72.field882 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
         class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
         int var6 = var1.getGroupId("runes");
         int var7 = var1.getFileId(var6, "");
         IndexedSprite[] var5 = class456.method8334(var1, var6, var7);
         Login.runesSprite = var5;
         var7 = var1.getGroupId("title_mute");
         int var8 = var1.getFileId(var7, "");
         IndexedSprite[] var9 = class456.method8334(var1, var7, var8);
         class139.title_muteSprite = var9;
         Login.options_buttons_0Sprite = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         ArchiveLoader.field1017 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         Login.options_buttons_2Sprite = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         KitDefinition.field1941 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         Message.field466 = Login.options_buttons_0Sprite.subWidth;
         class465.field4857 = Login.options_buttons_0Sprite.subHeight;
         ArchiveDiskActionHandler.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field908 = new String[8];
            Login.field909 = 0;
         }

         FriendSystem.field800 = 0;
         NetFileRequest.otp = "";
         Login.field914 = true;
         Login.worldSelectOpen = false;
         if (!WorldMapSectionType.clientPreferences.method2445()) {
            NPC.method2620(2, class308.archive6, "scape main", "", 255, false);
         } else {
            class293.musicPlayerStatus = 1;
            class364.musicTrackArchive = null;
            IntHashTable.musicTrackGroupId = -1;
            class293.musicTrackFileId = -1;
            class368.musicTrackVolume = 0;
            class293.musicTrackBoolean = false;
            AbstractRasterProvider.pcmSampleLength = 2;
         }

         class166.method3383(false);
         Login.clearLoginScreen = true;
         Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         Login.loginBoxCenter = Login.loginBoxX + 180;
         Login.leftTitleSprite.drawAt(Login.xPadding, 0);
         class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1026409589"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
