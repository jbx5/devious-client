import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -2085912871
   )
   static int field268;
   @ObfuscatedName("bj")
   protected static String field269;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1600861545
   )
   @Export("id")
   int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -153242533
   )
   @Export("size")
   int size;
   @ObfuscatedName("aw")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("ac")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("au")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("ab")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("aq")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("al")
   @Export("arguments")
   byte[][][] arguments;

   ReflectionCheck() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V",
      garbageValue = "-1333163047"
   )
   public static void method724(AbstractArchive var0) {
      DbTableType.field4961 = var0;
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(Lde;IB)V",
      garbageValue = "-110"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      SequenceDefinition var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var11;
      int var13;
      if (var0.spotAnimation >= Client.cycle) {
         var11 = Math.max(1, var0.spotAnimation - Client.cycle);
         var3 = var0.field1187 * 128 + var0.field1140 * 64;
         var4 = var0.field1189 * 128 + var0.field1140 * 64;
         var0.x += (var3 - var0.x) / var11;
         var0.y += (var4 - var0.y) / var11;
         var0.field1209 = 0;
         var0.orientation = var0.field1193;
      } else {
         int var8;
         if (var0.field1192 >= Client.cycle) {
            boolean var18 = var0.field1192 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
            if (!var18) {
               SequenceDefinition var12 = ItemContainer.SequenceDefinition_get(var0.sequence);
               if (var12 != null && !var12.isCachedModelIdSet()) {
                  var18 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame];
               } else {
                  var18 = true;
               }
            }

            if (var18) {
               var3 = var0.field1192 - var0.spotAnimation;
               var4 = Client.cycle - var0.spotAnimation;
               var5 = var0.field1187 * 128 + var0.field1140 * 64;
               var13 = var0.field1189 * 128 + var0.field1140 * 64;
               var7 = var0.field1188 * 128 + var0.field1140 * 64;
               var8 = var0.field1207 * 128 + var0.field1140 * 64;
               var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3;
               var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3;
            }

            var0.field1209 = 0;
            var0.orientation = var0.field1193;
            var0.rotation = var0.orientation;
         } else {
            var0.movementSequence = var0.idleSequence;
            if (var0.pathLength == 0) {
               var0.field1209 = 0;
            } else {
               label490: {
                  if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                     var2 = ItemContainer.SequenceDefinition_get(var0.sequence);
                     if (var0.field1210 > 0 && var2.field2312 == 0) {
                        ++var0.field1209;
                        break label490;
                     }

                     if (var0.field1210 <= 0 && var2.field2313 == 0) {
                        ++var0.field1209;
                        break label490;
                     }
                  }

                  var11 = var0.x;
                  var3 = var0.y;
                  var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1140 * 64;
                  var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1140 * 64;
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

                  class210 var6 = var0.pathTraversed[var0.pathLength - 1];
                  if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
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
                        if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1190 != 0) {
                           var9 = 2;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 3) {
                           var9 = 8;
                        }

                        if (var0.field1209 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1209;
                        }
                     } else {
                        if (var0.pathLength > 1) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 8;
                        }

                        if (var0.field1209 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1209;
                        }
                     }

                     if (var6 == class210.field2387) {
                        var9 <<= 1;
                     } else if (var6 == class210.field2388) {
                        var9 >>= 1;
                     }

                     if (var9 >= 8) {
                        if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                           var0.movementSequence = var0.runSequence;
                        } else if (var0.movementSequence == var0.walkBackSequence && var0.field1150 != -1) {
                           var0.movementSequence = var0.field1150;
                        } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1151 != -1) {
                           var0.movementSequence = var0.field1151;
                        } else if (var0.walkRightSequence == var0.movementSequence && var0.field1152 != -1) {
                           var0.movementSequence = var0.field1152;
                        }
                     } else if (var9 <= 1) {
                        if (var0.walkSequence == var0.movementSequence && var0.field1153 != -1) {
                           var0.movementSequence = var0.field1153;
                        } else if (var0.walkBackSequence == var0.movementSequence && var0.field1196 != -1) {
                           var0.movementSequence = var0.field1196;
                        } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1155 != -1) {
                           var0.movementSequence = var0.field1155;
                        } else if (var0.movementSequence == var0.walkRightSequence && var0.field1157 != -1) {
                           var0.movementSequence = var0.field1157;
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
                        if (var0.field1210 > 0) {
                           --var0.field1210;
                        }
                     }
                  } else {
                     var0.x = var4;
                     var0.y = var5;
                     --var0.pathLength;
                     if (var0.field1210 > 0) {
                        --var0.field1210;
                     }
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = 0;
         var0.field1192 = 0;
         var0.clearSpotAnimations();
         var0.x = var0.pathX[0] * 128 + var0.field1140 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1140 * 64;
         var0.method2388();
      }

      if (MusicPatchNode.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = 0;
         var0.field1192 = 0;
         var0.clearSpotAnimations();
         var0.x = var0.pathX[0] * 128 + var0.field1140 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1140 * 64;
         var0.method2388();
      }

      if (var0.targetIndex != -1) {
         var2 = null;
         var3 = 65536;
         Object var15;
         if (var0.targetIndex < var3) {
            var15 = Client.npcs[var0.targetIndex];
         } else {
            var15 = Client.players[var0.targetIndex - var3];
         }

         if (var15 != null) {
            var4 = var0.x - ((Actor)var15).x;
            var5 = var0.y - ((Actor)var15).y;
            if (var4 != 0 || var5 != 0) {
               var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167) & 2047;
               var0.orientation = var7;
            }
         } else if (var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }
      }

      if (var0.pathLength == 0 || var0.field1209 > 0) {
         var11 = -1;
         if (var0.field1197 != -1 && var0.field1174 != -1) {
            var3 = var0.field1197 * 128 - WorldMapData_0.baseX * 8192 + 64;
            var4 = var0.field1174 * 128 - GameObject.baseY * 8192 + 64;
            var5 = var0.x - var3;
            var13 = var0.y - var4;
            if (var5 != 0 || var13 != 0) {
               var7 = (int)(Math.atan2((double)var5, (double)var13) * 325.94932345220167) & 2047;
               var11 = var7;
            }
         } else if (var0.field1172 != -1) {
            var11 = var0.field1172;
         }

         if (var11 != -1) {
            var0.orientation = var11;
            if (var0.field1142) {
               var0.rotation = var0.orientation;
            }
         }

         var0.method2370();
      }

      var11 = var0.orientation - var0.rotation & 2047;
      if (var11 != 0) {
         boolean var16 = true;
         boolean var17 = true;
         ++var0.field1203;
         var5 = var11 > 1024 ? -1 : 1;
         var0.rotation += var5 * var0.field1190;
         boolean var19 = true;
         if (var11 < var0.field1190 || var11 > 2048 - var0.field1190) {
            var0.rotation = var0.orientation;
            var19 = false;
         }

         if (var0.field1190 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1203 > 25 || var19)) {
            if (var5 == -1 && var0.turnLeftSequence != -1) {
               var0.movementSequence = var0.turnLeftSequence;
            } else if (var5 == 1 && var0.turnRightSequence != -1) {
               var0.movementSequence = var0.turnRightSequence;
            } else {
               var0.movementSequence = var0.walkSequence;
            }
         }

         var0.rotation &= 2047;
      } else {
         if (var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         var0.field1203 = 0;
      }

      NetFileRequest.method6684(var0);
   }

   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-631543188"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (SoundSystem.loadInterface(var0)) {
         ViewportMouse.updateInterface(VerticalAlignment.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
