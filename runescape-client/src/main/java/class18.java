import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class18 {
   @ObfuscatedName("hm")
   static int[] field95;
   @ObfuscatedName("oz")
   @ObfuscatedGetter(
      intValue = 1844305955
   )
   @Export("selectedSpellWidget")
   static int selectedSpellWidget;
   @ObfuscatedName("su")
   @Export("ClanChat_inClanChat")
   static boolean ClanChat_inClanChat;
   @ObfuscatedName("aj")
   Future field100;
   @ObfuscatedName("al")
   String field90;

   class18(Future var1) {
      this.field100 = var1;
   }

   class18(String var1) {
      this.method262(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-764874737"
   )
   void method262(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field90 = var1;
      if (this.field100 != null) {
         this.field100.cancel(true);
         this.field100 = null;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2045450839"
   )
   public final String method269() {
      return this.field90;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-26"
   )
   public boolean method272() {
      return this.field90 != null || this.field100 == null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "84"
   )
   public final boolean method264() {
      return this.method272() ? true : this.field100.isDone();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Laf;",
      garbageValue = "15"
   )
   public final class20 method265() {
      if (this.method272()) {
         return new class20(this.field90);
      } else if (!this.method264()) {
         return null;
      } else {
         try {
            return (class20)this.field100.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method262(var2);
            return new class20(var2);
         }
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(CI)B",
      garbageValue = "637215135"
   )
   @Export("charToByteCp1252")
   public static byte charToByteCp1252(char var0) {
      byte var1;
      if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if (var0 == 8364) {
         var1 = -128;
      } else if (var0 == 8218) {
         var1 = -126;
      } else if (var0 == 402) {
         var1 = -125;
      } else if (var0 == 8222) {
         var1 = -124;
      } else if (var0 == 8230) {
         var1 = -123;
      } else if (var0 == 8224) {
         var1 = -122;
      } else if (var0 == 8225) {
         var1 = -121;
      } else if (var0 == 710) {
         var1 = -120;
      } else if (var0 == 8240) {
         var1 = -119;
      } else if (var0 == 352) {
         var1 = -118;
      } else if (var0 == 8249) {
         var1 = -117;
      } else if (var0 == 338) {
         var1 = -116;
      } else if (var0 == 381) {
         var1 = -114;
      } else if (var0 == 8216) {
         var1 = -111;
      } else if (var0 == 8217) {
         var1 = -110;
      } else if (var0 == 8220) {
         var1 = -109;
      } else if (var0 == 8221) {
         var1 = -108;
      } else if (var0 == 8226) {
         var1 = -107;
      } else if (var0 == 8211) {
         var1 = -106;
      } else if (var0 == 8212) {
         var1 = -105;
      } else if (var0 == 732) {
         var1 = -104;
      } else if (var0 == 8482) {
         var1 = -103;
      } else if (var0 == 353) {
         var1 = -102;
      } else if (var0 == 8250) {
         var1 = -101;
      } else if (var0 == 339) {
         var1 = -100;
      } else if (var0 == 382) {
         var1 = -98;
      } else if (var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ILmy;IIIII[FI)Lmy;",
      garbageValue = "-860762282"
   )
   static Widget method260(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0;
      var8.parentId = var1.id;
      var8.childIndex = var2;
      var8.isIf3 = true;
      var8.xAlignment = var3;
      var8.yAlignment = var4;
      var8.widthAlignment = var5;
      var8.heightAlignment = var6;
      var8.rawX = (int)((float)var1.width * var7[0]);
      var8.rawY = (int)(var7[1] * (float)var1.height);
      var8.rawWidth = (int)((float)var1.width * var7[2]);
      var8.rawHeight = (int)((float)var1.height * var7[3]);
      return var8;
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "(Ldq;B)V",
      garbageValue = "-65"
   )
   static final void method273(Actor var0) {
      var0.movementSequence = var0.idleSequence;
      if (var0.pathLength == 0) {
         var0.field1214 = 0;
      } else {
         if (var0.sequence != -1 && var0.sequenceDelay == 0) {
            SequenceDefinition var1 = Coord.SequenceDefinition_get(var0.sequence);
            if (var0.field1215 > 0 && var1.field2277 == 0) {
               ++var0.field1214;
               return;
            }

            if (var0.field1215 <= 0 && var1.field2255 == 0) {
               ++var0.field1214;
               return;
            }
         }

         int var10 = var0.x;
         int var2 = var0.y;
         int var3 = var0.field1142 * -1172500480 + var0.pathX[var0.pathLength - 1] * 128;
         int var4 = var0.field1142 * -1172500480 + var0.pathY[var0.pathLength - 1] * 128;
         if (var10 < var3) {
            if (var2 < var4) {
               var0.orientation = 1280;
            } else if (var2 > var4) {
               var0.orientation = 1792;
            } else {
               var0.orientation = 1536;
            }
         } else if (var10 > var3) {
            if (var2 < var4) {
               var0.orientation = 768;
            } else if (var2 > var4) {
               var0.orientation = 256;
            } else {
               var0.orientation = 512;
            }
         } else if (var2 < var4) {
            var0.orientation = 1024;
         } else if (var2 > var4) {
            var0.orientation = 0;
         }

         class211 var5 = var0.pathTraversed[var0.pathLength - 1];
         if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            int var6 = var0.orientation - var0.rotation & 2047;
            if (var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var0.walkBackSequence;
            if (var6 >= -256 && var6 <= 256) {
               var7 = var0.walkSequence;
            } else if (var6 >= 256 && var6 < 768) {
               var7 = var0.walkRightSequence;
            } else if (var6 >= -768 && var6 <= -256) {
               var7 = var0.walkLeftSequence;
            }

            if (var7 == -1) {
               var7 = var0.walkSequence;
            }

            var0.movementSequence = var7;
            int var8 = 4;
            boolean var9 = true;
            if (var0 instanceof NPC) {
               var9 = ((NPC)var0).definition.isClickable;
            }

            if (var9) {
               if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1209 != 0) {
                  var8 = 2;
               }

               if (var0.pathLength > 2) {
                  var8 = 6;
               }

               if (var0.pathLength > 3) {
                  var8 = 8;
               }

               if (var0.field1214 > 0 && var0.pathLength > 1) {
                  var8 = 8;
                  --var0.field1214;
               }
            } else {
               if (var0.pathLength > 1) {
                  var8 = 6;
               }

               if (var0.pathLength > 2) {
                  var8 = 8;
               }

               if (var0.field1214 > 0 && var0.pathLength > 1) {
                  var8 = 8;
                  --var0.field1214;
               }
            }

            if (var5 == class211.field2335) {
               var8 <<= 1;
            } else if (var5 == class211.field2333) {
               var8 >>= 1;
            }

            if (var8 >= 8) {
               if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                  var0.movementSequence = var0.runSequence;
               } else if (var0.walkBackSequence == var0.movementSequence && var0.field1152 != -1) {
                  var0.movementSequence = var0.field1152;
               } else if (var0.movementSequence == var0.walkLeftSequence && var0.field1153 != -1) {
                  var0.movementSequence = var0.field1153;
               } else if (var0.walkRightSequence == var0.movementSequence && var0.field1154 != -1) {
                  var0.movementSequence = var0.field1154;
               }
            } else if (var8 <= 1) {
               if (var0.walkSequence == var0.movementSequence && var0.field1155 != -1) {
                  var0.movementSequence = var0.field1155;
               } else if (var0.walkBackSequence == var0.movementSequence && var0.field1200 != -1) {
                  var0.movementSequence = var0.field1200;
               } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1212 != -1) {
                  var0.movementSequence = var0.field1212;
               } else if (var0.walkRightSequence == var0.movementSequence && var0.field1158 != -1) {
                  var0.movementSequence = var0.field1158;
               }
            }

            if (var10 != var3 || var2 != var4) {
               if (var10 < var3) {
                  var0.x += var8;
                  if (var0.x > var3) {
                     var0.x = var3;
                  }
               } else if (var10 > var3) {
                  var0.x -= var8;
                  if (var0.x < var3) {
                     var0.x = var3;
                  }
               }

               if (var2 < var4) {
                  var0.y += var8;
                  if (var0.y > var4) {
                     var0.y = var4;
                  }
               } else if (var2 > var4) {
                  var0.y -= var8;
                  if (var0.y < var4) {
                     var0.y = var4;
                  }
               }
            }

            if (var3 == var0.x && var4 == var0.y) {
               --var0.pathLength;
               if (var0.field1215 > 0) {
                  --var0.field1215;
               }
            }

         } else {
            var0.x = var3;
            var0.y = var4;
            --var0.pathLength;
            if (var0.field1215 > 0) {
               --var0.field1215;
            }

         }
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2099476931"
   )
   static final void method276() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints > 0) {
            --var0.hitpoints;
         }

         boolean var1;
         int var2;
         int var3;
         ObjectComposition var4;
         if (var0.hitpoints == 0) {
            if (var0.objectId >= 0) {
               var2 = var0.objectId;
               var3 = var0.field1130;
               var4 = WallDecoration.getObjectDefinition(var2);
               if (var3 == 11) {
                  var3 = 10;
               }

               if (var3 >= 5 && var3 <= 8) {
                  var3 = 4;
               }

               var1 = var4.method3868(var3);
               if (!var1) {
                  continue;
               }
            }

            class149.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1128, var0.field1130, var0.field1133);
            var0.remove();
         } else {
            if (var0.delay > 0) {
               --var0.delay;
            }

            if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
               if (var0.field1135 >= 0) {
                  var2 = var0.field1135;
                  var3 = var0.field1132;
                  var4 = WallDecoration.getObjectDefinition(var2);
                  if (var3 == 11) {
                     var3 = 10;
                  }

                  if (var3 >= 5 && var3 <= 8) {
                     var3 = 4;
                  }

                  var1 = var4.method3868(var3);
                  if (!var1) {
                     continue;
                  }
               }

               class149.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.field1135, var0.field1131, var0.field1132, var0.field1133);
               var0.delay = -1;
               if (var0.objectId == var0.field1135 && var0.objectId == -1) {
                  var0.remove();
               } else if (var0.field1135 == var0.objectId && var0.field1128 == var0.field1131 && var0.field1132 == var0.field1130) {
                  var0.remove();
               }
            }
         }
      }

   }
}
