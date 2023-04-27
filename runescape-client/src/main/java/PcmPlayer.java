import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1359271235
   )
   public static int field306;
   @ObfuscatedName("ab")
   @Export("PcmPlayer_stereo")
   public static boolean PcmPlayer_stereo;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lbh;"
   )
   @Export("pcmPlayerProvider")
   public static class50 pcmPlayerProvider;
   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   static Archive field316;
   @ObfuscatedName("ai")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lbp;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1670800945
   )
   int field302 = 32;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      longValue = 5466236213624304261L
   )
   @Export("timeMs")
   long timeMs = class96.method2634();
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -896831859
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1331788289
   )
   int field305;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 335978257
   )
   int field297;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -269385131777873879L
   )
   long field307 = 0L;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1667971679
   )
   int field308 = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1982890287
   )
   int field296 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1187659381
   )
   int field310 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = 7119359816026141145L
   )
   long field309 = 0L;
   @ObfuscatedName("ap")
   boolean field312 = true;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -951195189
   )
   int field314 = 0;
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "[Lbp;"
   )
   PcmStream[] field304 = new PcmStream[8];
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "[Lbp;"
   )
   PcmStream[] field315 = new PcmStream[8];

   protected PcmPlayer() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "28"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "182405776"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-654786411"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("ac")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1466449702"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "22"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lbp;I)V",
      garbageValue = "-412033085"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "336870901"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = class96.method2634();

         try {
            if (0L != this.field307) {
               if (var1 < this.field307) {
                  return;
               }

               this.open(this.capacity);
               this.field307 = 0L;
               this.field312 = true;
            }

            int var3 = this.position();
            if (this.field310 - var3 > this.field308) {
               this.field308 = this.field310 - var3;
            }

            int var4 = this.field297 + this.field305;
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
               this.field312 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field297 = var4 - this.field305;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field309) {
               if (!this.field312) {
                  if (this.field308 == 0 && this.field296 == 0) {
                     this.close();
                     this.field307 = 2000L + var1;
                     return;
                  }

                  this.field297 = Math.min(this.field296, this.field308);
                  this.field296 = this.field308;
               } else {
                  this.field312 = false;
               }

               this.field308 = 0;
               this.field309 = var1 + 2000L;
            }

            this.field310 = var3;
         } catch (Exception var7) {
            this.close();
            this.field307 = var1 + 2000L;
         }

         try {
            if (var1 > 500000L + this.timeMs) {
               var1 = this.timeMs;
            }

            while(var1 > 5000L + this.timeMs) {
               this.skip(256);
               this.timeMs += (long)(256000 / (field306 * 586337296));
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1976746918"
   )
   public final void method814() {
      this.field312 = true;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1703203933"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field312 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field307 = class96.method2634() + 2000L;
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (class354.soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == class354.soundSystem.players[var2]) {
               class354.soundSystem.players[var2] = null;
            }

            if (class354.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            SoundSystem.soundSystemExecutor.shutdownNow();
            SoundSystem.soundSystemExecutor = null;
            class354.soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1042309166"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field314 -= var1;
      if (this.field314 < 0) {
         this.field314 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("by")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class384.clearIntArray(var1, 0, var3);
      this.field314 -= var2;
      if (this.stream != null && this.field314 <= 0) {
         this.field314 += field306 * 586337296 >> 4;
         class207.PcmStream_disable(this.stream);
         this.method823(this.stream, this.stream.vmethod1060());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
         label108:
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
                  PcmStream var11 = this.field304[var7];

                  label102:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label102;
                        }

                        AbstractSound var12 = var11.sound;
                        if (var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.vmethod5949();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field302) {
                              break label108;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field365; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method823(var14, var15 * var14.vmethod1060() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field304[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field315[var7] = var10;
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
            PcmStream var16 = this.field304[var6];
            PcmStream[] var17 = this.field304;
            this.field315[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field314 < 0) {
         this.field314 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = class96.method2634();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Lbp;IB)V",
      garbageValue = "-105"
   )
   final void method823(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field315[var3];
      if (var4 == null) {
         this.field304[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field315[var3] = var1;
      var1.field365 = var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1817276364"
   )
   static int method845(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }
}
