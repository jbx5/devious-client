import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public enum class6 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ly;"
   )
   field19(0, 0);

   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1499472863
   )
   static int field17;
   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      descriptor = "Lhg;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -277308963
   )
   final int field23;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2083873231
   )
   final int field16;

   class6(int var3, int var4) {
      this.field23 = var3;
      this.field16 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field16;
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "(Lcl;II)V",
      garbageValue = "-2095695257"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      int var3;
      int var4;
      int var5;
      int var11;
      if (var0.field1192 >= Client.cycle) {
         Language.method6579(var0);
      } else if (var0.field1193 >= Client.cycle) {
         Occluder.method4470(var0);
      } else {
         var0.movementSequence = var0.idleSequence;
         if (var0.pathLength == 0) {
            var0.field1172 = 0;
         } else {
            label473: {
               if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                  SequenceDefinition var2 = WorldMapElement.SequenceDefinition_get(var0.sequence);
                  if (var0.field1211 > 0 && var2.field2221 == 0) {
                     ++var0.field1172;
                     break label473;
                  }

                  if (var0.field1211 <= 0 && var2.field2211 == 0) {
                     ++var0.field1172;
                     break label473;
                  }
               }

               var11 = var0.x;
               var3 = var0.y;
               var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1201 * 64;
               var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1201 * 64;
               if (var11 < var4) {
                  if (var3 < var5) {
                     var0.orientation = 1280;
                  } else if (var3 > var5) {
                     var0.orientation = 1792;
                  } else {
                     var0.orientation = 1536;
                  }
               } else if (var11 > var4) {
                  if (var3 < var5) {
                     var0.orientation = 768;
                  } else if (var3 > var5) {
                     var0.orientation = 256;
                  } else {
                     var0.orientation = 512;
                  }
               } else if (var3 < var5) {
                  var0.orientation = 1024;
               } else if (var3 > var5) {
                  var0.orientation = 0;
               }

               class202 var6 = var0.pathTraversed[var0.pathLength - 1];
               if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                  int var7 = var0.orientation - var0.rotation & 2047;
                  if (var7 > 1024) {
                     var7 -= 2048;
                  }

                  int var8 = var0.walkBackSequence;
                  if (var7 >= -256 && var7 <= 256) {
                     var8 = var0.walkSequence;
                  } else if (var7 >= 256 && var7 < 768) {
                     var8 = var0.walkRightSequence;
                  } else if (var7 >= -768 && var7 <= -256) {
                     var8 = var0.walkLeftSequence;
                  }

                  if (var8 == -1) {
                     var8 = var0.walkSequence;
                  }

                  var0.movementSequence = var8;
                  int var9 = 4;
                  boolean var10 = true;
                  if (var0 instanceof NPC) {
                     var10 = ((NPC)var0).definition.isClickable;
                  }

                  if (var10) {
                     if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1205 != 0) {
                        var9 = 2;
                     }

                     if (var0.pathLength > 2) {
                        var9 = 6;
                     }

                     if (var0.pathLength > 3) {
                        var9 = 8;
                     }

                     if (var0.field1172 > 0 && var0.pathLength > 1) {
                        var9 = 8;
                        --var0.field1172;
                     }
                  } else {
                     if (var0.pathLength > 1) {
                        var9 = 6;
                     }

                     if (var0.pathLength > 2) {
                        var9 = 8;
                     }

                     if (var0.field1172 > 0 && var0.pathLength > 1) {
                        var9 = 8;
                        --var0.field1172;
                     }
                  }

                  if (var6 == class202.field2284) {
                     var9 <<= 1;
                  } else if (var6 == class202.field2281) {
                     var9 >>= 1;
                  }

                  if (var9 >= 8) {
                     if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                        var0.movementSequence = var0.runSequence;
                     } else if (var0.walkBackSequence == var0.movementSequence && var0.field1181 != -1) {
                        var0.movementSequence = var0.field1181;
                     } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1151 != -1) {
                        var0.movementSequence = var0.field1151;
                     } else if (var0.movementSequence == var0.walkRightSequence && var0.field1152 != -1) {
                        var0.movementSequence = var0.field1152;
                     }
                  } else if (var9 <= 1) {
                     if (var0.movementSequence == var0.walkSequence && var0.field1153 != -1) {
                        var0.movementSequence = var0.field1153;
                     } else if (var0.movementSequence == var0.walkBackSequence && var0.field1209 != -1) {
                        var0.movementSequence = var0.field1209;
                     } else if (var0.movementSequence == var0.walkLeftSequence && var0.field1184 != -1) {
                        var0.movementSequence = var0.field1184;
                     } else if (var0.movementSequence == var0.walkRightSequence && var0.field1156 != -1) {
                        var0.movementSequence = var0.field1156;
                     }
                  }

                  if (var4 != var11 || var3 != var5) {
                     if (var11 < var4) {
                        var0.x += var9;
                        if (var0.x > var4) {
                           var0.x = var4;
                        }
                     } else if (var11 > var4) {
                        var0.x -= var9;
                        if (var0.x < var4) {
                           var0.x = var4;
                        }
                     }

                     if (var3 < var5) {
                        var0.y += var9;
                        if (var0.y > var5) {
                           var0.y = var5;
                        }
                     } else if (var3 > var5) {
                        var0.y -= var9;
                        if (var0.y < var5) {
                           var0.y = var5;
                        }
                     }
                  }

                  if (var4 == var0.x && var5 == var0.y) {
                     --var0.pathLength;
                     if (var0.field1211 > 0) {
                        --var0.field1211;
                     }
                  }
               } else {
                  var0.x = var4;
                  var0.y = var5;
                  --var0.pathLength;
                  if (var0.field1211 > 0) {
                     --var0.field1211;
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1192 = 0;
         var0.field1193 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1201 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1201 * 64;
         var0.method2316();
      }

      if (class296.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1192 = 0;
         var0.field1193 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1201 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1201 * 64;
         var0.method2316();
      }

      if (var0.field1205 != 0) {
         if (var0.targetIndex != -1) {
            Object var13 = null;
            var3 = Script.field972 ? 65536 : '耀';
            if (var0.targetIndex < var3) {
               var13 = Client.npcs[var0.targetIndex];
            } else if (var0.targetIndex >= var3) {
               var13 = Client.players[var0.targetIndex - var3];
            }

            if (var13 != null) {
               var4 = var0.x - ((Actor)var13).x;
               var5 = var0.y - ((Actor)var13).y;
               if (var4 != 0 || var5 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var4, (double)var5) * 325.949) & 2047;
               }
            } else if (var0.false0) {
               var0.targetIndex = -1;
               var0.false0 = false;
            }
         }

         if (var0.field1203 != -1 && (var0.pathLength == 0 || var0.field1172 > 0)) {
            var0.orientation = var0.field1203;
            var0.field1203 = -1;
         }

         var11 = var0.orientation - var0.rotation & 2047;
         if (var11 == 0 && var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         if (var11 != 0) {
            ++var0.field1204;
            boolean var14;
            if (var11 > 1024) {
               var0.rotation -= var0.field1173 ? var11 : var0.field1205;
               var14 = true;
               if (var11 < var0.field1205 || var11 > 2048 - var0.field1205) {
                  var0.rotation = var0.orientation;
                  var14 = false;
               }

               if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1204 > 25 || var14)) {
                  if (var0.turnLeftSequence != -1) {
                     var0.movementSequence = var0.turnLeftSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            } else {
               var0.rotation += var0.field1173 ? var11 : var0.field1205;
               var14 = true;
               if (var11 < var0.field1205 || var11 > 2048 - var0.field1205) {
                  var0.rotation = var0.orientation;
                  var14 = false;
               }

               if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1204 > 25 || var14)) {
                  if (var0.turnRightSequence != -1) {
                     var0.movementSequence = var0.turnRightSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            }

            var0.rotation &= 2047;
            var0.field1173 = false;
         } else {
            var0.field1204 = 0;
         }
      }

      GrandExchangeOfferOwnWorldComparator.method1177(var0);
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(ZLqk;I)V",
      garbageValue = "-2107663742"
   )
   @Export("loadRegions")
   static final void loadRegions(boolean var0, PacketBuffer var1) {
      Client.isInInstance = var0;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (!Client.isInInstance) {
         int var2 = var1.readUnsignedShortAdd();
         var3 = var1.readUnsignedShortLE();
         var4 = var1.readUnsignedShort();
         KeyHandler.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               KeyHandler.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         RouteStrategy.regions = new int[var4];
         class143.regionMapArchiveIds = new int[var4];
         class13.regionLandArchiveIds = new int[var4];
         GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var4][];
         class9.regionMapArchives = new byte[var4][];
         var4 = 0;

         for(var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
            for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               RouteStrategy.regions[var4] = var7;
               class143.regionMapArchiveIds[var4] = SecureRandomFuture.archive9.getGroupId("m" + var5 + "_" + var6);
               class13.regionLandArchiveIds[var4] = SecureRandomFuture.archive9.getGroupId("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         CollisionMap.method4019(var2, var3, true);
      } else {
         boolean var15 = var1.readUnsignedByteNeg() == 1;
         var3 = var1.readUnsignedShort();
         var4 = var1.readUnsignedShortLE();
         var5 = var1.readUnsignedShort();
         var1.importIndex();

         int var8;
         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.readBits(1);
                  if (var9 == 1) {
                     Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
                  } else {
                     Client.instanceChunkTemplates[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.exportIndex();
         KeyHandler.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               KeyHandler.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         RouteStrategy.regions = new int[var5];
         class143.regionMapArchiveIds = new int[var5];
         class13.regionLandArchiveIds = new int[var5];
         GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var5][];
         class9.regionMapArchives = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = Client.instanceChunkTemplates[var6][var7][var8];
                  if (var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if (RouteStrategy.regions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        RouteStrategy.regions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class143.regionMapArchiveIds[var5] = SecureRandomFuture.archive9.getGroupId("m" + var13 + "_" + var14);
                        class13.regionLandArchiveIds[var5] = SecureRandomFuture.archive9.getGroupId("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         CollisionMap.method4019(var3, var4, !var15);
      }

   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)Z",
      garbageValue = "-1613148148"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget var0) {
      return var0.isHidden;
   }
}
