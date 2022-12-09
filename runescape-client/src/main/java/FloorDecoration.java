import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("u")
   @Export("SpriteBuffer_pixels")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 133255249
   )
   @Export("z")
   int z;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 804453261
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1531498091
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhr;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 4180672137059809271L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1420887887
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "(Lct;IB)V",
      garbageValue = "13"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      SequenceDefinition var2;
      int var3;
      int var4;
      SequenceDefinition var12;
      int var14;
      if (var0.field1233 >= Client.cycle) {
         class273.method5479(var0);
      } else {
         int var5;
         int var7;
         int var8;
         if (var0.field1234 >= Client.cycle) {
            boolean var11 = var0.field1234 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
            if (!var11) {
               var12 = AABB.SequenceDefinition_get(var0.sequence);
               if (var12 != null && !var12.isCachedModelIdSet()) {
                  var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame];
               } else {
                  var11 = true;
               }
            }

            if (var11) {
               var3 = var0.field1234 - var0.field1233;
               var4 = Client.cycle - var0.field1233;
               var5 = var0.field1196 * 128 + var0.field1181 * 64;
               int var13 = var0.field1185 * 128 + var0.field1181 * 64;
               var7 = var0.field1230 * 128 + var0.field1181 * 64;
               var8 = var0.field1213 * 128 + var0.field1181 * 64;
               var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3;
               var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3;
            }

            var0.field1239 = 0;
            var0.orientation = var0.field1235;
            var0.rotation = var0.orientation;
         } else {
            var0.movementSequence = var0.idleSequence;
            if (var0.pathLength == 0) {
               var0.field1239 = 0;
            } else {
               label621: {
                  if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                     var2 = AABB.SequenceDefinition_get(var0.sequence);
                     if (var0.field1252 > 0 && var2.field2290 == 0) {
                        ++var0.field1239;
                        break label621;
                     }

                     if (var0.field1252 <= 0 && var2.field2284 == 0) {
                        ++var0.field1239;
                        break label621;
                     }
                  }

                  var14 = var0.x;
                  var3 = var0.y;
                  var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1181 * 64;
                  var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1181 * 64;
                  if (var14 < var4) {
                     if (var3 < var5) {
                        var0.orientation = 1280;
                     } else if (var3 > var5) {
                        var0.orientation = 1792;
                     } else {
                        var0.orientation = 1536;
                     }
                  } else if (var14 > var4) {
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

                  class204 var6 = var0.pathTraversed[var0.pathLength - 1];
                  if (var4 - var14 <= 256 && var4 - var14 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var7 = var0.orientation - var0.rotation & 2047;
                     if (var7 > 1024) {
                        var7 -= 2048;
                     }

                     var8 = var0.walkBackSequence;
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
                        if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1249 != 0) {
                           var9 = 2;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 3) {
                           var9 = 8;
                        }

                        if (var0.field1239 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1239;
                        }
                     } else {
                        if (var0.pathLength > 1) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 8;
                        }

                        if (var0.field1239 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1239;
                        }
                     }

                     if (var6 == class204.field2357) {
                        var9 <<= 1;
                     } else if (var6 == class204.field2356) {
                        var9 >>= 1;
                     }

                     if (var9 >= 8) {
                        if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                           var0.movementSequence = var0.runSequence;
                        } else if (var0.movementSequence == var0.walkBackSequence && var0.field1191 != -1) {
                           var0.movementSequence = var0.field1191;
                        } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1201 != -1) {
                           var0.movementSequence = var0.field1201;
                        } else if (var0.walkRightSequence == var0.movementSequence && var0.field1193 != -1) {
                           var0.movementSequence = var0.field1193;
                        }
                     } else if (var9 <= 1) {
                        if (var0.walkSequence == var0.movementSequence && var0.field1194 != -1) {
                           var0.movementSequence = var0.field1194;
                        } else if (var0.movementSequence == var0.walkBackSequence && var0.field1195 != -1) {
                           var0.movementSequence = var0.field1195;
                        } else if (var0.movementSequence == var0.walkLeftSequence && var0.field1226 != -1) {
                           var0.movementSequence = var0.field1226;
                        } else if (var0.movementSequence == var0.walkRightSequence && var0.field1197 != -1) {
                           var0.movementSequence = var0.field1197;
                        }
                     }

                     if (var4 != var14 || var3 != var5) {
                        if (var14 < var4) {
                           var0.x += var9;
                           if (var0.x > var4) {
                              var0.x = var4;
                           }
                        } else if (var14 > var4) {
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
                        if (var0.field1252 > 0) {
                           --var0.field1252;
                        }
                     }
                  } else {
                     var0.x = var4;
                     var0.y = var5;
                     --var0.pathLength;
                     if (var0.field1252 > 0) {
                        --var0.field1252;
                     }
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1233 = 0;
         var0.field1234 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1181 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1181 * 64;
         var0.method2348();
      }

      if (class155.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1233 = 0;
         var0.field1234 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1181 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1181 * 64;
         var0.method2348();
      }

      FriendSystem.method1862(var0);
      var0.isWalking = false;
      if (var0.movementSequence != -1) {
         var2 = AABB.SequenceDefinition_get(var0.movementSequence);
         if (var2 != null) {
            if (!var2.isCachedModelIdSet() && var2.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  FriendsChat.method7459(var2, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var2.frameIds.length) {
                  if (var2.frameCount > 0) {
                     var0.movementFrame -= var2.frameCount;
                     if (var2.field2298) {
                        ++var0.field1218;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2298 && var0.field1218 >= var2.field2301) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1218 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  FriendsChat.method7459(var2, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var2.isCachedModelIdSet()) {
               ++var0.movementFrame;
               var3 = var2.method4024();
               if (var0.movementFrame < var3) {
                  class20.method293(var2, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var2.frameCount > 0) {
                     var0.movementFrame -= var2.frameCount;
                     if (var2.field2298) {
                        ++var0.field1218;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2298 && var0.field1218 >= var2.field2301) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1218 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  class20.method293(var2, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      if (var0.spotAnimation != -1 && Client.cycle >= var0.field1227) {
         if (var0.spotAnimationFrame < 0) {
            var0.spotAnimationFrame = 0;
         }

         var14 = ClanSettings.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
         if (var14 != -1) {
            var12 = AABB.SequenceDefinition_get(var14);
            if (var12 != null && var12.frameIds != null && !var12.isCachedModelIdSet()) {
               ++var0.spotAnimationFrameCycle;
               if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) {
                  var0.spotAnimationFrameCycle = 1;
                  ++var0.spotAnimationFrame;
                  FriendsChat.method7459(var12, var0.spotAnimationFrame, var0.x, var0.y);
               }

               if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) {
                  var0.spotAnimation = -1;
               }
            } else if (var12.isCachedModelIdSet()) {
               ++var0.spotAnimationFrame;
               var4 = var12.method4024();
               if (var0.spotAnimationFrame < var4) {
                  class20.method293(var12, var0.spotAnimationFrame, var0.x, var0.y);
               } else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) {
                  var0.spotAnimation = -1;
               }
            } else {
               var0.spotAnimation = -1;
            }
         } else {
            var0.spotAnimation = -1;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
         var2 = AABB.SequenceDefinition_get(var0.sequence);
         if (var2.field2290 == 1 && var0.field1252 > 0 && var0.field1233 <= Client.cycle && var0.field1234 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var2 = AABB.SequenceDefinition_get(var0.sequence);
         if (var2 == null) {
            var0.sequence = -1;
         } else if (!var2.isCachedModelIdSet() && var2.frameIds != null) {
            ++var0.sequenceFrameCycle;
            if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) {
               var0.sequenceFrameCycle = 1;
               ++var0.sequenceFrame;
               FriendsChat.method7459(var2, var0.sequenceFrame, var0.x, var0.y);
            }

            if (var0.sequenceFrame >= var2.frameIds.length) {
               var0.sequenceFrame -= var2.frameCount;
               ++var0.field1223;
               if (var0.field1223 >= var2.field2301) {
                  var0.sequence = -1;
               } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) {
                  FriendsChat.method7459(var2, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequence = -1;
               }
            }

            var0.isWalking = var2.field2281;
         } else if (var2.isCachedModelIdSet()) {
            ++var0.sequenceFrame;
            var3 = var2.method4024();
            if (var0.sequenceFrame < var3) {
               class20.method293(var2, var0.sequenceFrame, var0.x, var0.y);
            } else {
               var0.sequenceFrame -= var2.frameCount;
               ++var0.field1223;
               if (var0.field1223 >= var2.field2301) {
                  var0.sequence = -1;
               } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
                  class20.method293(var2, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequence = -1;
               }
            }
         } else {
            var0.sequence = -1;
         }
      }

      if (var0.sequenceDelay > 0) {
         --var0.sequenceDelay;
      }

   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "(III)Lgg;",
      garbageValue = "1330231937"
   )
   static RouteStrategy method4298(int var0, int var1) {
      Client.field805.approxDestinationX = var0;
      Client.field805.approxDestinationY = var1;
      Client.field805.approxDestinationSizeX = 1;
      Client.field805.approxDestinationSizeY = 1;
      return Client.field805;
   }
}
