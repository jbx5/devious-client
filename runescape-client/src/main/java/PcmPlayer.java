import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("j")
   @Export("PcmPlayer_stereo")
   protected static boolean PcmPlayer_stereo;
   @ObfuscatedName("n")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;
   @ObfuscatedName("m")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 502378549
   )
   int field310 = 32;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = 8306176507750216733L
   )
   @Export("timeMs")
   long timeMs = class153.method3317();
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1116036099
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -839102897
   )
   int field313;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -679047829
   )
   int field324;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 9103786008147036381L
   )
   long field306 = 0L;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1593097243
   )
   int field316 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 382614027
   )
   int field317 = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1237732405
   )
   int field318 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 1189070885184433193L
   )
   long field319 = 0L;
   @ObfuscatedName("y")
   boolean field307 = true;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1016835193
   )
   int field322 = 0;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lan;"
   )
   PcmStream[] field323 = new PcmStream[8];
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lan;"
   )
   PcmStream[] field314 = new PcmStream[8];

   protected PcmPlayer() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1600330502"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "742720329"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1573553273"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("s")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-892812272"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1285037243"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lan;I)V",
      garbageValue = "-116833836"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1435721898"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = class153.method3317();

         try {
            if (0L != this.field306) {
               if (var1 < this.field306) {
                  return;
               }

               this.open(this.capacity);
               this.field306 = 0L;
               this.field307 = true;
            }

            int var3 = this.position();
            if (this.field318 - var3 > this.field316) {
               this.field316 = this.field318 - var3;
            }

            int var4 = this.field324 + this.field313;
            if (var4 + 256 > 16384) {
               var4 = 16128;
            }

            if (var4 + 256 > this.capacity) {
               this.capacity += 1024;
               if (this.capacity > 16384) {
                  this.capacity = 16384;
               }

               this.close();
               this.open(this.capacity);
               var3 = 0;
               this.field307 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field324 = var4 - this.field313;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field319) {
               if (!this.field307) {
                  if (this.field316 == 0 && this.field317 == 0) {
                     this.close();
                     this.field306 = 2000L + var1;
                     return;
                  }

                  this.field324 = Math.min(this.field317, this.field316);
                  this.field317 = this.field316;
               } else {
                  this.field307 = false;
               }

               this.field316 = 0;
               this.field319 = 2000L + var1;
            }

            this.field318 = var3;
         } catch (Exception var7) {
            this.close();
            this.field306 = 2000L + var1;
         }

         try {
            if (var1 > this.timeMs + 500000L) {
               var1 = this.timeMs;
            }

            while(var1 > 5000L + this.timeMs) {
               this.skip(256);
               this.timeMs += (long)(256000 / class284.field3321);
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1131218520"
   )
   public final void method783() {
      this.field307 = true;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1800360111"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field307 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field306 = class153.method3317() + 2000L;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-16415"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (class266.soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == class266.soundSystem.players[var2]) {
               class266.soundSystem.players[var2] = null;
            }

            if (class266.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            soundSystemExecutor.shutdownNow();
            soundSystemExecutor = null;
            class266.soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1488629152"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field322 -= var1;
      if (this.field322 < 0) {
         this.field322 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("ai")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class377.clearIntArray(var1, 0, var3);
      this.field322 -= var2;
      if (this.stream != null && this.field322 <= 0) {
         this.field322 += class284.field3321 >> 4;
         class31.PcmStream_disable(this.stream);
         this.method786(this.stream, this.stream.vmethod1026());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
         label107:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  PcmStream var11 = this.field323[var7];

                  label101:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label101;
                        }

                        AbstractSound var12 = var11.sound;
                        if (var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.vmethod5793();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field310) {
                              break label107;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field369; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method786(var14, var15 * var14.vmethod1026() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field323[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field314[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            PcmStream var16 = this.field323[var6];
            PcmStream[] var17 = this.field323;
            this.field314[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field322 < 0) {
         this.field322 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = class153.method3317();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lan;II)V",
      garbageValue = "-967266641"
   )
   final void method786(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field314[var3];
      if (var4 == null) {
         this.field323[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field314[var3] = var1;
      var1.field369 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "-55"
   )
   public static int method838(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1346222802"
   )
   static int method826() {
      return class28.KeyHandler_keyCodes.length;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "2137110263"
   )
   static int method837(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(Lcb;II)V",
      garbageValue = "163232913"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      SequenceDefinition var2;
      int var3;
      int var4;
      int var5;
      int var11;
      SequenceDefinition var12;
      if (var0.field1215 >= Client.cycle) {
         var11 = Math.max(1, var0.field1215 - Client.cycle);
         var3 = var0.field1211 * 128 + var0.field1163 * 64;
         var4 = var0.field1213 * 128 + var0.field1163 * 64;
         var0.x += (var3 - var0.x) / var11;
         var0.y += (var4 - var0.y) / var11;
         var0.field1175 = 0;
         var0.orientation = var0.field1217;
      } else {
         int var7;
         int var8;
         if (var0.field1189 >= Client.cycle) {
            boolean var16 = var0.field1189 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
            if (!var16) {
               var12 = class85.SequenceDefinition_get(var0.sequence);
               if (var12 != null && !var12.isCachedModelIdSet()) {
                  var16 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame];
               } else {
                  var16 = true;
               }
            }

            if (var16) {
               var3 = var0.field1189 - var0.field1215;
               var4 = Client.cycle - var0.field1215;
               var5 = var0.field1211 * 128 + var0.field1163 * 64;
               int var13 = var0.field1213 * 128 + var0.field1163 * 64;
               var7 = var0.field1212 * 128 + var0.field1163 * 64;
               var8 = var0.field1214 * 128 + var0.field1163 * 64;
               var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3;
               var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3;
            }

            var0.field1175 = 0;
            var0.orientation = var0.field1217;
            var0.rotation = var0.orientation;
         } else {
            var0.movementSequence = var0.idleSequence;
            if (var0.pathLength == 0) {
               var0.field1175 = 0;
            } else {
               label756: {
                  if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                     var2 = class85.SequenceDefinition_get(var0.sequence);
                     if (var0.field1230 > 0 && var2.field2307 == 0) {
                        ++var0.field1175;
                        break label756;
                     }

                     if (var0.field1230 <= 0 && var2.field2301 == 0) {
                        ++var0.field1175;
                        break label756;
                     }
                  }

                  var11 = var0.x;
                  var3 = var0.y;
                  var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1163 * 64;
                  var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1163 * 64;
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

                  class208 var6 = var0.pathTraversed[var0.pathLength - 1];
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
                        if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1228 != 0) {
                           var9 = 2;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 3) {
                           var9 = 8;
                        }

                        if (var0.field1175 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1175;
                        }
                     } else {
                        if (var0.pathLength > 1) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 8;
                        }

                        if (var0.field1175 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field1175;
                        }
                     }

                     if (var6 == class208.field2362) {
                        var9 <<= 1;
                     } else if (var6 == class208.field2366) {
                        var9 >>= 1;
                     }

                     if (var9 >= 8) {
                        if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                           var0.movementSequence = var0.runSequence;
                        } else if (var0.movementSequence == var0.walkBackSequence && var0.field1173 != -1) {
                           var0.movementSequence = var0.field1173;
                        } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1174 != -1) {
                           var0.movementSequence = var0.field1174;
                        } else if (var0.movementSequence == var0.walkRightSequence && var0.field1168 != -1) {
                           var0.movementSequence = var0.field1168;
                        }
                     } else if (var9 <= 1) {
                        if (var0.walkSequence == var0.movementSequence && var0.field1187 != -1) {
                           var0.movementSequence = var0.field1187;
                        } else if (var0.movementSequence == var0.walkBackSequence && var0.field1172 != -1) {
                           var0.movementSequence = var0.field1172;
                        } else if (var0.walkLeftSequence == var0.movementSequence && var0.field1178 != -1) {
                           var0.movementSequence = var0.field1178;
                        } else if (var0.movementSequence == var0.walkRightSequence && var0.field1179 != -1) {
                           var0.movementSequence = var0.field1179;
                        }
                     }

                     if (var4 != var11 || var5 != var3) {
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
                        if (var0.field1230 > 0) {
                           --var0.field1230;
                        }
                     }
                  } else {
                     var0.x = var4;
                     var0.y = var5;
                     --var0.pathLength;
                     if (var0.field1230 > 0) {
                        --var0.field1230;
                     }
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1215 = 0;
         var0.field1189 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1163 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1163 * 64;
         var0.method2423();
      }

      if (class387.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1215 = 0;
         var0.field1189 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1163 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1163 * 64;
         var0.method2423();
      }

      if (var0.field1228 != 0) {
         if (var0.targetIndex != -1) {
            Object var14 = null;
            var3 = class323.isLargePlayerInfo ? 65536 : '耀';
            if (var0.targetIndex < var3) {
               var14 = Client.npcs[var0.targetIndex];
            } else if (var0.targetIndex >= var3) {
               var14 = Client.players[var0.targetIndex - var3];
            }

            if (var14 != null) {
               var4 = var0.x - ((Actor)var14).x;
               var5 = var0.y - ((Actor)var14).y;
               if (var4 != 0 || var5 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var4, (double)var5) * 325.949) & 2047;
               }
            } else if (var0.false0) {
               var0.targetIndex = -1;
               var0.false0 = false;
            }
         }

         if (var0.field1195 != -1 && (var0.pathLength == 0 || var0.field1175 > 0)) {
            var0.orientation = var0.field1195;
            var0.field1195 = -1;
         }

         var11 = var0.orientation - var0.rotation & 2047;
         if (var11 == 0 && var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         if (var11 != 0) {
            ++var0.field1191;
            boolean var15;
            if (var11 > 1024) {
               var0.rotation -= var0.field1196 ? var11 : var0.field1228;
               var15 = true;
               if (var11 < var0.field1228 || var11 > 2048 - var0.field1228) {
                  var0.rotation = var0.orientation;
                  var15 = false;
               }

               if (!var0.field1196 && var0.movementSequence == var0.idleSequence && (var0.field1191 > 25 || var15)) {
                  if (var0.turnLeftSequence != -1) {
                     var0.movementSequence = var0.turnLeftSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            } else {
               var0.rotation += var0.field1196 ? var11 : var0.field1228;
               var15 = true;
               if (var11 < var0.field1228 || var11 > 2048 - var0.field1228) {
                  var0.rotation = var0.orientation;
                  var15 = false;
               }

               if (!var0.field1196 && var0.movementSequence == var0.idleSequence && (var0.field1191 > 25 || var15)) {
                  if (var0.turnRightSequence != -1) {
                     var0.movementSequence = var0.turnRightSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            }

            var0.rotation &= 2047;
            var0.field1196 = false;
         } else {
            var0.field1191 = 0;
         }
      }

      var0.isWalking = false;
      if (var0.movementSequence != -1) {
         var2 = class85.SequenceDefinition_get(var0.movementSequence);
         if (var2 != null) {
            if (!var2.isCachedModelIdSet() && var2.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  SoundCache.method868(var2, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var2.frameIds.length) {
                  if (var2.frameCount > 0) {
                     var0.movementFrame -= var2.frameCount;
                     if (var2.field2297) {
                        ++var0.field1200;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2297 && var0.field1200 >= var2.field2304) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1200 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  SoundCache.method868(var2, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var2.isCachedModelIdSet()) {
               ++var0.movementFrame;
               var3 = var2.method4055();
               if (var0.movementFrame < var3) {
                  StudioGame.method6440(var2, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var2.frameCount > 0) {
                     var0.movementFrame -= var2.frameCount;
                     if (var2.field2297) {
                        ++var0.field1200;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2297 && var0.field1200 >= var2.field2304) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1200 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  StudioGame.method6440(var2, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      if (var0.spotAnimation != -1 && Client.cycle >= var0.field1207) {
         if (var0.spotAnimationFrame < 0) {
            var0.spotAnimationFrame = 0;
         }

         var11 = MouseRecorder.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
         if (var11 != -1) {
            var12 = class85.SequenceDefinition_get(var11);
            if (var12 != null && var12.frameIds != null && !var12.isCachedModelIdSet()) {
               ++var0.spotAnimationFrameCycle;
               if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) {
                  var0.spotAnimationFrameCycle = 1;
                  ++var0.spotAnimationFrame;
                  SoundCache.method868(var12, var0.spotAnimationFrame, var0.x, var0.y);
               }

               if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) {
                  var0.spotAnimation = -1;
               }
            } else if (var12.isCachedModelIdSet()) {
               ++var0.spotAnimationFrame;
               var4 = var12.method4055();
               if (var0.spotAnimationFrame < var4) {
                  StudioGame.method6440(var12, var0.spotAnimationFrame, var0.x, var0.y);
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
         var2 = class85.SequenceDefinition_get(var0.sequence);
         if (var2.field2307 == 1 && var0.field1230 > 0 && var0.field1215 <= Client.cycle && var0.field1189 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var2 = class85.SequenceDefinition_get(var0.sequence);
         if (var2 == null) {
            var0.sequence = -1;
         } else if (!var2.isCachedModelIdSet() && var2.frameIds != null) {
            ++var0.sequenceFrameCycle;
            if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) {
               var0.sequenceFrameCycle = 1;
               ++var0.sequenceFrame;
               SoundCache.method868(var2, var0.sequenceFrame, var0.x, var0.y);
            }

            if (var0.sequenceFrame >= var2.frameIds.length) {
               var0.sequenceFrame -= var2.frameCount;
               ++var0.field1205;
               if (var0.field1205 >= var2.field2304) {
                  var0.sequence = -1;
               } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) {
                  SoundCache.method868(var2, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequence = -1;
               }
            }

            var0.isWalking = var2.field2293;
         } else if (var2.isCachedModelIdSet()) {
            ++var0.sequenceFrame;
            var3 = var2.method4055();
            if (var0.sequenceFrame < var3) {
               StudioGame.method6440(var2, var0.sequenceFrame, var0.x, var0.y);
            } else {
               var0.sequenceFrame -= var2.frameCount;
               ++var0.field1205;
               if (var0.field1205 >= var2.field2304) {
                  var0.sequence = -1;
               } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
                  StudioGame.method6440(var2, var0.sequenceFrame, var0.x, var0.y);
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

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1696311323"
   )
   static void method803() {
      if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
         Decimator.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
      }

   }
}
