import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
   @ObfuscatedName("ur")
   @ObfuscatedGetter(
      intValue = -760417651
   )
   static int field1957;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("KitDefinition_archive")
   static AbstractArchive KitDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("KitDefinition_modelsArchive")
   static AbstractArchive KitDefinition_modelsArchive;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 743589639
   )
   @Export("KitDefinition_fileCount")
   public static int KitDefinition_fileCount;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("KitDefinition_cached")
   static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("js5Socket")
   static AbstractSocket js5Socket;
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "[Ltq;"
   )
   @Export("headIconHintSprites")
   static SpritePixels[] headIconHintSprites;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1015855167
   )
   @Export("bodypartID")
   public int bodypartID = -1;
   @ObfuscatedName("ab")
   @Export("models2")
   int[] models2;
   @ObfuscatedName("aq")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("al")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("at")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("aa")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ay")
   @Export("models")
   int[] models = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("ao")
   @Export("nonSelectable")
   public boolean nonSelectable = false;

   KitDefinition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1026746832"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "33"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.bodypartID = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.readUnsignedByte();
            this.models2 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.models2[var4] = var1.readUnsignedShort();
            }
         } else if (var2 == 3) {
            this.nonSelectable = true;
         } else if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.models[var2 - 60] = var1.readUnsignedShort();
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1647976754"
   )
   @Export("ready")
   public boolean ready() {
      if (this.models2 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.models2.length; ++var2) {
            if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Liz;",
      garbageValue = "-240292107"
   )
   @Export("getModelData")
   public ModelData getModelData() {
      if (this.models2 == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[this.models2.length];

         for(int var2 = 0; var2 < this.models2.length; ++var2) {
            var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
         }

         ModelData var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         int var3;
         if (this.recolorFrom != null) {
            for(var3 = 0; var3 < this.recolorFrom.length; ++var3) {
               var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for(var3 = 0; var3 < this.retextureFrom.length; ++var3) {
               var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "10"
   )
   public boolean method3689() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Liz;",
      garbageValue = "-37"
   )
   @Export("getKitDefinitionModels")
   public ModelData getKitDefinitionModels() {
      ModelData[] var1 = new ModelData[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.models[var3] != -1) {
            var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
         }
      }

      ModelData var5 = new ModelData(var1, var2);
      int var4;
      if (this.recolorFrom != null) {
         for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
            var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
         }
      }

      if (this.retextureFrom != null) {
         for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
            var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIILia;Lif;I)Z",
      garbageValue = "1036507043"
   )
   static final boolean method3698(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
      int var5 = var0;
      int var6 = var1;
      int var7 = 64;
      int var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class211.directions[var7][var8] = 99;
      class211.distances[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      class211.bufferX[var11] = var0;
      class211.bufferY[var11++] = var1;
      int[][] var13 = var4.flags;

      while(true) {
         label309:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            do {
               do {
                  do {
                     label286:
                     do {
                        if (var11 == var12) {
                           class18.field94 = var5;
                           class397.field4534 = var6;
                           return false;
                        }

                        var5 = class211.bufferX[var12];
                        var6 = class211.bufferY[var12];
                        var12 = var12 + 1 & 4095;
                        var7 = var5 - var9;
                        var8 = var6 - var10;
                        var14 = var5 - var4.xInset;
                        var15 = var6 - var4.yInset;
                        if (var3.hasArrived(var2, var5, var6, var4)) {
                           class18.field94 = var5;
                           class397.field4534 = var6;
                           return true;
                        }

                        var16 = class211.distances[var7][var8] + 1;
                        if (var7 > 0 && class211.directions[var7 - 1][var8] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class211.bufferX[var11] = var5 - 1;
                                 class211.bufferY[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7 - 1][var8] = 2;
                                 class211.distances[var7 - 1][var8] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && class211.directions[var7 + 1][var8] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class211.bufferX[var11] = var5 + 1;
                                 class211.bufferY[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7 + 1][var8] = 8;
                                 class211.distances[var7 + 1][var8] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 > 0 && class211.directions[var7][var8 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class211.bufferX[var11] = var5;
                                 class211.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7][var8 - 1] = 1;
                                 class211.distances[var7][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 < 128 - var2 && class211.directions[var7][var8 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class211.bufferX[var11] = var5;
                                 class211.bufferY[var11] = var6 + 1;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7][var8 + 1] = 4;
                                 class211.distances[var7][var8 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 > 0 && class211.directions[var7 - 1][var8 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 class211.bufferX[var11] = var5 - 1;
                                 class211.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7 - 1][var8 - 1] = 3;
                                 class211.distances[var7 - 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && var8 > 0 && class211.directions[var7 + 1][var8 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 class211.bufferX[var11] = var5 + 1;
                                 class211.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class211.directions[var7 + 1][var8 - 1] = 9;
                                 class211.distances[var7 + 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 < 128 - var2 && class211.directions[var7 - 1][var8 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
                                 continue label286;
                              }
                           }

                           class211.bufferX[var11] = var5 - 1;
                           class211.bufferY[var11] = var6 + 1;
                           var11 = var11 + 1 & 4095;
                           class211.directions[var7 - 1][var8 + 1] = 6;
                           class211.distances[var7 - 1][var8 + 1] = var16;
                        }
                     } while(var7 >= 128 - var2);
                  } while(var8 >= 128 - var2);
               } while(class211.directions[var7 + 1][var8 + 1] != 0);
            } while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                  continue label309;
               }
            }

            class211.bufferX[var11] = var5 + 1;
            class211.bufferY[var11] = var6 + 1;
            var11 = var11 + 1 & 4095;
            class211.directions[var7 + 1][var8 + 1] = 12;
            class211.distances[var7 + 1][var8 + 1] = var16;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IZB)Ljava/lang/String;",
      garbageValue = "16"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "([BIII)Z",
      garbageValue = "-1749443577"
   )
   static final boolean method3685(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label66:
      while(true) {
         int var6 = var4.readIncrSmallSmart();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.readUShortSmart();
               if (var9 == 0) {
                  continue label66;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = class144.getObjectDefinition(var5);
                  if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
                     if (!var15.needsModelFiles()) {
                        ++Client.field557;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }
}
