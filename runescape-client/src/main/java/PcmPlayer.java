import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   @Export("soundSystem")
   static SoundSystem soundSystem;
   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("qa")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static class448 HitSplatDefinition_cachedSprites;
   @ObfuscatedName("b")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lay;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1473504645
   )
   int field300 = 32;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -2802413428054542971L
   )
   @Export("timeMs")
   long timeMs = UserComparator8.method2748();
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 61027143
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1492111259
   )
   int field303;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -600741535
   )
   int field304;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -8410672408092661703L
   )
   long field305 = 0L;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1648747053
   )
   int field306 = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2111705421
   )
   int field307 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1486182231
   )
   int field308 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      longValue = -335238723578473881L
   )
   long field297 = 0L;
   @ObfuscatedName("v")
   boolean field299 = true;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 954407483
   )
   int field311 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "[Lay;"
   )
   PcmStream[] field312 = new PcmStream[8];
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "[Lay;"
   )
   PcmStream[] field313 = new PcmStream[8];

   protected PcmPlayer() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1886684155"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-13"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1692273069"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("x")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1178676683"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "117"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lay;I)V",
      garbageValue = "-101862616"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1278116824"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = UserComparator8.method2748();

         try {
            if (this.field305 != 0L) {
               if (var1 < this.field305) {
                  return;
               }

               this.open(this.capacity);
               this.field305 = 0L;
               this.field299 = true;
            }

            int var3 = this.position();
            if (this.field308 - var3 > this.field306) {
               this.field306 = this.field308 - var3;
            }

            int var4 = this.field304 + this.field303;
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
               this.field299 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field304 = var4 - this.field303;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field297) {
               if (!this.field299) {
                  if (this.field306 == 0 && this.field307 == 0) {
                     this.close();
                     this.field305 = 2000L + var1;
                     return;
                  }

                  this.field304 = Math.min(this.field307, this.field306);
                  this.field307 = this.field306;
               } else {
                  this.field299 = false;
               }

               this.field306 = 0;
               this.field297 = 2000L + var1;
            }

            this.field308 = var3;
         } catch (Exception var7) {
            this.close();
            this.field305 = 2000L + var1;
         }

         try {
            if (var1 > 500000L + this.timeMs) {
               var1 = this.timeMs;
            }

            while(var1 > this.timeMs + 5000L) {
               this.skip(256);
               this.timeMs += (long)(256000 / SoundCache.field337);
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2050982607"
   )
   public final void method808() {
      this.field299 = true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1570480130"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field299 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field305 = UserComparator8.method2748() + 2000L;
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "776117996"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == soundSystem.players[var2]) {
               soundSystem.players[var2] = null;
            }

            if (soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            class354.soundSystemExecutor.shutdownNow();
            class354.soundSystemExecutor = null;
            soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "84"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field311 -= var1;
      if (this.field311 < 0) {
         this.field311 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("ac")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (class157.PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class370.clearIntArray(var1, 0, var3);
      this.field311 -= var2;
      if (this.stream != null && this.field311 <= 0) {
         this.field311 += SoundCache.field337 >> 4;
         SecureRandomFuture.PcmStream_disable(this.stream);
         this.method832(this.stream, this.stream.vmethod1019());
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
                  PcmStream var11 = this.field312[var7];

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
                           int var13 = var11.vmethod5648();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field300) {
                              break label108;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field364; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method832(var14, var15 * var14.vmethod1019() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field312[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field313[var7] = var10;
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
            PcmStream var16 = this.field312[var6];
            PcmStream[] var17 = this.field312;
            this.field313[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field311 < 0) {
         this.field311 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = UserComparator8.method2748();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lay;II)V",
      garbageValue = "2139894290"
   )
   final void method832(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field313[var3];
      if (var4 == null) {
         this.field312[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field313[var3] = var1;
      var1.field364 = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lqp;",
      garbageValue = "57607815"
   )
   @Export("getDbTableType")
   public static DbTableType getDbTableType(int var0) {
      DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbTableType.field4841.takeFile(39, var0);
         var1 = new DbTableType();
         if (var2 != null) {
            var1.method8282(new Buffer(var2));
         }

         var1.method8284();
         DbTableType.DBTableType_cache.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2130903475"
   )
   static void method830() {
      if (Login.Login_username == null || Login.Login_username.length() <= 0) {
         if (BufferedSink.clientPreferences.method2397() != null) {
            Login.Login_username = BufferedSink.clientPreferences.method2397();
            Client.Login_isUsernameRemembered = true;
         } else {
            Client.Login_isUsernameRemembered = false;
         }

      }
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "115"
   )
   static int method829() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field588;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-2685"
   )
   static void method841(int var0) {
      Client.oculusOrbState = var0;
   }
}
