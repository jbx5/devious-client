import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1464280883
   )
   public static int field292;
   @ObfuscatedName("aq")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   @Export("js5Socket")
   static AbstractSocket js5Socket;
   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   @Export("spriteIds")
   static GraphicsDefaults spriteIds;
   @ObfuscatedName("ay")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lbj;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1741324525
   )
   int field289 = 32;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = -4925716031019377997L
   )
   @Export("timeMs")
   long timeMs = WorldMapSection2.method4844();
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -674134555
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -229392335
   )
   int field285;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 456413397
   )
   int field293;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 8082179839914669633L
   )
   long field294 = 0L;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1554044513
   )
   int field295 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -575095721
   )
   int field296 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1634791103
   )
   int field297 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = -5523156607669087437L
   )
   long field298 = 0L;
   @ObfuscatedName("ad")
   boolean field287 = true;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1227535865
   )
   int field300 = 0;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "[Lbj;"
   )
   PcmStream[] field301 = new PcmStream[8];
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "[Lbj;"
   )
   PcmStream[] field299 = new PcmStream[8];

   protected PcmPlayer() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2134180158"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "84"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("ab")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-5904"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lbj;I)V",
      garbageValue = "1750133787"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1624173078"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = WorldMapSection2.method4844();

         try {
            if (this.field294 != 0L) {
               if (var1 < this.field294) {
                  return;
               }

               this.open(this.capacity);
               this.field294 = 0L;
               this.field287 = true;
            }

            int var3 = this.position();
            if (this.field297 - var3 > this.field295) {
               this.field295 = this.field297 - var3;
            }

            int var4 = this.field285 + this.field293;
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
               this.field287 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field293 = var4 - this.field285;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field298) {
               if (!this.field287) {
                  if (this.field295 == 0 && this.field296 == 0) {
                     this.close();
                     this.field294 = var1 + 2000L;
                     return;
                  }

                  this.field293 = Math.min(this.field296, this.field295);
                  this.field296 = this.field295;
               } else {
                  this.field287 = false;
               }

               this.field295 = 0;
               this.field298 = var1 + 2000L;
            }

            this.field297 = var3;
         } catch (Exception var7) {
            this.close();
            this.field294 = var1 + 2000L;
         }

         try {
            if (var1 > this.timeMs + 500000L) {
               var1 = this.timeMs;
            }

            while(var1 > this.timeMs + 5000L) {
               this.skip(256);
               this.timeMs += (long)(256000 / field292);
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1765565781"
   )
   public final void method817() {
      this.field287 = true;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field287 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field294 = WorldMapSection2.method4844() + 2000L;
      }

   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1555106489"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (class291.soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == class291.soundSystem.players[var2]) {
               class291.soundSystem.players[var2] = null;
            }

            if (class291.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            soundSystemExecutor.shutdownNow();
            soundSystemExecutor = null;
            class291.soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2131967863"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field300 -= var1;
      if (this.field300 < 0) {
         this.field300 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("bk")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (ChatChannel.PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class380.clearIntArray(var1, 0, var3);
      this.field300 -= var2;
      if (this.stream != null && this.field300 <= 0) {
         this.field300 += field292 >> 4;
         AbstractWorldMapIcon.PcmStream_disable(this.stream);
         this.method769(this.stream, this.stream.vmethod1024());
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
                  PcmStream var11 = this.field301[var7];

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
                           int var13 = var11.vmethod5700();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field289) {
                              break label108;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field349; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method769(var14, var15 * var14.vmethod1024() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field301[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field299[var7] = var10;
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
            PcmStream var16 = this.field301[var6];
            PcmStream[] var17 = this.field301;
            this.field299[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field300 < 0) {
         this.field300 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = WorldMapSection2.method4844();
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Lbj;II)V",
      garbageValue = "-1707696429"
   )
   final void method769(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field299[var3];
      if (var4 == null) {
         this.field301[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field299[var3] = var1;
      var1.field349 = var2;
   }

   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IIZI)V",
      garbageValue = "1659869209"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if (var0.widthAlignment == 0) {
         var0.width = var0.rawWidth;
      } else if (var0.widthAlignment == 1) {
         var0.width = var1 - var0.rawWidth;
      } else if (var0.widthAlignment == 2) {
         var0.width = var0.rawWidth * var1 >> 14;
      }

      if (var0.heightAlignment == 0) {
         var0.height = var0.rawHeight;
      } else if (var0.heightAlignment == 1) {
         var0.height = var2 - var0.rawHeight;
      } else if (var0.heightAlignment == 2) {
         var0.height = var2 * var0.rawHeight >> 14;
      }

      if (var0.widthAlignment == 4) {
         var0.width = var0.field3667 * var0.height / var0.field3578;
      }

      if (var0.heightAlignment == 4) {
         var0.height = var0.width * var0.field3578 / var0.field3667;
      }

      if (var0.contentType == 1337) {
         Client.viewportWidget = var0;
      }

      if (var0.type == 12) {
         var0.method6118().method5822(var0.width, var0.height);
      }

      if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = var0;
         var6.args = var0.onResize;
         Client.scriptEvents.addFirst(var6);
      }

   }
}
