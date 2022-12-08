import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1432164919
   )
   int field3362 = 256;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1976332480
   )
   int field3370 = -727379968;
   @ObfuscatedName("x")
   int[] field3359 = new int[16];
   @ObfuscatedName("m")
   int[] field3363 = new int[16];
   @ObfuscatedName("q")
   int[] field3367 = new int[16];
   @ObfuscatedName("f")
   int[] field3361 = new int[16];
   @ObfuscatedName("r")
   int[] field3381 = new int[16];
   @ObfuscatedName("u")
   int[] field3373 = new int[16];
   @ObfuscatedName("b")
   int[] field3364 = new int[16];
   @ObfuscatedName("j")
   int[] field3365 = new int[16];
   @ObfuscatedName("g")
   int[] field3366 = new int[16];
   @ObfuscatedName("t")
   int[] field3356 = new int[16];
   @ObfuscatedName("c")
   int[] field3368 = new int[16];
   @ObfuscatedName("p")
   int[] field3369 = new int[16];
   @ObfuscatedName("d")
   int[] field3358 = new int[16];
   @ObfuscatedName("y")
   int[] field3371 = new int[16];
   @ObfuscatedName("z")
   int[] field3372 = new int[16];
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[[Lkx;"
   )
   MusicPatchNode[][] field3357 = new MusicPatchNode[16][128];
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[[Lkx;"
   )
   MusicPatchNode[][] field3374 = new MusicPatchNode[16][128];
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("ao")
   boolean field3355;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1192963143
   )
   @Export("track")
   int track;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1500458693
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = 2172914929519981185L
   )
   long field3379;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 2756622200726587743L
   )
   long field3380;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lkg;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method5676();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "9"
   )
   @Export("setPcmStreamVolume")
   synchronized void setPcmStreamVolume(int var1) {
      this.field3362 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-278818537"
   )
   int method5650() {
      return this.field3362;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkc;Lly;Laj;II)Z",
      garbageValue = "-1248465768"
   )
   @Export("loadMusicTrack")
   synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method5777();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
         int var8 = (int)var7.key;
         MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
         if (var9 == null) {
            var9 = class338.method6604(var2, var8);
            if (var9 == null) {
               var5 = false;
               continue;
            }

            this.musicPatches.put(var9, (long)var8);
         }

         if (!var9.method5739(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.clear();
      }

      return var5;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("clearAll")
   synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "16022"
   )
   @Export("removeAll")
   synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("r")
   protected synchronized int vmethod5753() {
      return 0;
   }

   @ObfuscatedName("u")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3370 * 1000000 / (PcmPlayer.field325 * 22050);

         do {
            long var5 = (long)var4 * (long)var3 + this.field3379;
            if (this.field3380 - var5 >= 0L) {
               this.field3379 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field3380 - this.field3379) - 1L) / (long)var4);
            this.field3379 += (long)var7 * (long)var4;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5597();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lkc;ZI)V",
      garbageValue = "951999290"
   )
   @Export("setMusicTrack")
   synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3355 = var2;
      this.field3379 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3380 = this.midiFile.method5716(this.trackLength);
   }

   @ObfuscatedName("j")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3370 * 1000000 / (PcmPlayer.field325 * 22050);

         do {
            long var3 = (long)var1 * (long)var2 + this.field3379;
            if (this.field3380 - var3 >= 0L) {
               this.field3379 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field3380 - this.field3379) - 1L) / (long)var2);
            this.field3379 += (long)var5 * (long)var2;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5597();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "20"
   )
   @Export("clear")
   synchronized void clear() {
      this.midiFile.clear();
      this.method5676();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "32"
   )
   @Export("isReady")
   synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "71"
   )
   public synchronized void method5572(int var1, int var2) {
      this.method5573(var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-46"
   )
   void method5573(int var1, int var2) {
      this.field3361[var1] = var2;
      this.field3373[var1] = var2 & -128;
      this.method5574(var1, var2);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-582359120"
   )
   void method5574(int var1, int var2) {
      if (var2 != this.field3381[var1]) {
         this.field3381[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3374[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-477011775"
   )
   void method5575(int var1, int var2, int var3) {
      this.method5622(var1, var2, 64);
      if ((this.field3356[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3427 == var1 && var4.field3415 < 0) {
               this.field3357[var1][var4.field3419] = null;
               this.field3357[var1][var2] = var4;
               int var8 = (var4.field3424 * var4.field3414 >> 12) + var4.field3422;
               var4.field3422 += var2 - var4.field3419 << 8;
               var4.field3414 = var8 - var4.field3422;
               var4.field3424 = 4096;
               var4.field3419 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3381[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field3427 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field3428 = var9.field3400[var2];
            var6.field3418 = var9.field3403[var2];
            var6.field3419 = var2;
            var6.field3423 = var3 * var3 * var9.field3402[var2] * var9.field3401 + 1024 >> 11;
            var6.field3421 = var9.field3405[var2] & 255;
            var6.field3422 = (var2 << 8) - (var9.field3399[var2] & 32767);
            var6.field3425 = 0;
            var6.field3420 = 0;
            var6.field3416 = 0;
            var6.field3415 = -1;
            var6.field3429 = 0;
            if (this.field3358[var1] == 0) {
               var6.stream = RawPcmStream.method1029(var5, this.method5589(var6), this.method5590(var6), this.method5591(var6));
            } else {
               var6.stream = RawPcmStream.method1029(var5, this.method5589(var6), 0, this.method5591(var6));
               this.method5637(var6, var9.field3399[var2] < 0);
            }

            if (var9.field3399[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field3418 >= 0) {
               MusicPatchNode var7 = this.field3374[var1][var6.field3418];
               if (var7 != null && var7.field3415 < 0) {
                  this.field3357[var1][var7.field3419] = null;
                  var7.field3415 = 0;
               }

               this.field3374[var1][var6.field3418] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field3357[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lkx;ZI)V",
      garbageValue = "1046946935"
   )
   void method5637(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field299) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)this.field3358[var1.field3427] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method912();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.field3358[var1.field3427] >> 6);
      }

      var1.stream.method911(var4);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "676426616"
   )
   void method5622(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3357[var1][var2];
      if (var4 != null) {
         this.field3357[var1][var2] = null;
         if ((this.field3356[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var5.field3427 == var4.field3427 && var5.field3415 < 0 && var4 != var5) {
                  var4.field3415 = 0;
                  break;
               }
            }
         } else {
            var4.field3415 = 0;
         }

      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "484115766"
   )
   void method5634(int var1, int var2, int var3) {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1185959546"
   )
   void method5668(int var1, int var2) {
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1772680532"
   )
   void method5580(int var1, int var2) {
      this.field3364[var1] = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1248985050"
   )
   void method5588(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3427 == var1) {
            if (var2.stream != null) {
               var2.stream.method916(PcmPlayer.field325 * 22050 / 100);
               if (var2.stream.method976()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5787();
            }

            if (var2.field3415 < 0) {
               this.field3357[var2.field3427][var2.field3419] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-712942864"
   )
   void method5582(int var1) {
      if (var1 >= 0) {
         this.field3359[var1] = 12800;
         this.field3363[var1] = 8192;
         this.field3367[var1] = 16383;
         this.field3364[var1] = 8192;
         this.field3365[var1] = 0;
         this.field3366[var1] = 8192;
         this.method5685(var1);
         this.method5586(var1);
         this.field3356[var1] = 0;
         this.field3368[var1] = 32767;
         this.field3369[var1] = 256;
         this.field3358[var1] = 0;
         this.method5679(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5582(var1);
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "914760617"
   )
   void method5583(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3427 == var1) && var2.field3415 < 0) {
            this.field3357[var2.field3427][var2.field3419] = null;
            var2.field3415 = 0;
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-17"
   )
   void method5676() {
      this.method5588(-1);
      this.method5582(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3381[var1] = this.field3361[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3373[var1] = this.field3361[var1] & -128;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-992120375"
   )
   void method5685(int var1) {
      if ((this.field3356[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3427 == var1 && this.field3357[var1][var2.field3419] == null && var2.field3415 < 0) {
               var2.field3415 = 0;
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1159932724"
   )
   void method5586(int var1) {
      if ((this.field3356[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3427 == var1) {
               var2.field3434 = 0;
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "27"
   )
   void method5594(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5622(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5575(var3, var4, var5);
         } else {
            this.method5622(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5634(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3373[var3] = (var5 << 14) + (this.field3373[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3373[var3] = (var5 << 7) + (this.field3373[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3365[var3] = (var5 << 7) + (this.field3365[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3365[var3] = var5 + (this.field3365[var3] & -128);
         }

         if (var4 == 5) {
            this.field3366[var3] = (var5 << 7) + (this.field3366[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3366[var3] = var5 + (this.field3366[var3] & -128);
         }

         if (var4 == 7) {
            this.field3359[var3] = (var5 << 7) + (this.field3359[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3359[var3] = var5 + (this.field3359[var3] & -128);
         }

         if (var4 == 10) {
            this.field3363[var3] = (var5 << 7) + (this.field3363[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3363[var3] = var5 + (this.field3363[var3] & -128);
         }

         if (var4 == 11) {
            this.field3367[var3] = (var5 << 7) + (this.field3367[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3367[var3] = var5 + (this.field3367[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3356;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3356;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3356;
               var10000[var3] |= 2;
            } else {
               this.method5685(var3);
               var10000 = this.field3356;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & 127);
         }

         if (var4 == 98) {
            this.field3368[var3] = (this.field3368[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3368[var3] = (this.field3368[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5588(var3);
         }

         if (var4 == 121) {
            this.method5582(var3);
         }

         if (var4 == 123) {
            this.method5583(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3368[var3];
            if (var6 == 16384) {
               this.field3369[var3] = (var5 << 7) + (this.field3369[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3368[var3];
            if (var6 == 16384) {
               this.field3369[var3] = var5 + (this.field3369[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3358[var3] = (var5 << 7) + (this.field3358[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3358[var3] = var5 + (this.field3358[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3356;
               var10000[var3] |= 4;
            } else {
               this.method5586(var3);
               var10000 = this.field3356;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5679(var3, (var5 << 7) + (this.field3371[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5679(var3, var5 + (this.field3371[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5574(var3, var4 + this.field3373[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5668(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5580(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5676();
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "181224742"
   )
   void method5679(int var1, int var2) {
      this.field3371[var1] = var2;
      this.field3372[var1] = (int)(2097152.0 * Math.pow(2.0, (double)var2 * 5.4931640625E-4) + 0.5);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)I",
      garbageValue = "1148770502"
   )
   int method5589(MusicPatchNode var1) {
      int var2 = (var1.field3414 * var1.field3424 >> 12) + var1.field3422;
      var2 += (this.field3364[var1.field3427] - 8192) * this.field3369[var1.field3427] >> 12;
      MusicPatchNode2 var3 = var1.field3428;
      int var4;
      if (var3.field3339 > 0 && (var3.field3338 > 0 || this.field3365[var1.field3427] > 0)) {
         var4 = var3.field3338 << 2;
         int var5 = var3.field3334 << 1;
         if (var1.field3430 < var5) {
            var4 = var4 * var1.field3430 / var5;
         }

         var4 += this.field3365[var1.field3427] >> 7;
         double var6 = Math.sin(0.01227184630308513 * (double)(var1.field3431 & 511));
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, 3.255208333333333E-4 * (double)var2) / (double)(PcmPlayer.field325 * 22050) + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)I",
      garbageValue = "1303045954"
   )
   int method5590(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3428;
      int var3 = this.field3359[var1.field3427] * this.field3367[var1.field3427] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3423 + 16384 >> 15;
      var3 = var3 * this.field3362 + 128 >> 8;
      if (var2.field3335 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var1.field3425 * 1.953125E-5 * (double)var2.field3335) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3337 != null) {
         var4 = var1.field3420;
         var5 = var2.field3337[var1.field3416 * 4 + 1];
         if (var1.field3416 * 4 < var2.field3337.length - 2) {
            var6 = (var2.field3337[var1.field3416 * 4] & 255) << 8;
            var7 = (var2.field3337[var1.field3416 * 4 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3337[var1.field3416 * 4 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field3415 > 0 && var2.field3333 != null) {
         var4 = var1.field3415;
         var5 = var2.field3333[var1.field3429 * 2 + 1];
         if (var1.field3429 * 2 < var2.field3333.length - 2) {
            var6 = (var2.field3333[var1.field3429 * 2] & 255) << 8;
            var7 = (var2.field3333[var1.field3429 * 2 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3333[var1.field3429 * 2 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)I",
      garbageValue = "402004555"
   )
   int method5591(MusicPatchNode var1) {
      int var2 = this.field3363[var1.field3427];
      return var2 < 8192 ? var2 * var1.field3421 + 32 >> 6 : 16384 - ((128 - var1.field3421) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1623545318"
   )
   void method5597() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3380; var2 == this.trackLength; var3 = this.midiFile.method5716(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3355 || var2 == 0) {
                     this.method5676();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5594(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3380 = var3;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)Z",
      garbageValue = "1"
   )
   boolean method5598(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3415 >= 0) {
            var1.remove();
            if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) {
               this.field3374[var1.field3427][var1.field3418] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lkx;[IIIB)Z",
      garbageValue = "-44"
   )
   boolean method5599(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3433 = PcmPlayer.field325 * 22050 / 100;
      if (var1.field3415 < 0 || var1.stream != null && !var1.stream.method919()) {
         int var5 = var1.field3424;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * (double)this.field3366[var1.field3427]) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3424 = var5;
         }

         var1.stream.method917(this.method5589(var1));
         MusicPatchNode2 var6 = var1.field3428;
         boolean var7 = false;
         ++var1.field3430;
         var1.field3431 += var6.field3339;
         double var8 = (double)((var1.field3419 - 60 << 8) + (var1.field3414 * var1.field3424 >> 12)) * 5.086263020833333E-6;
         if (var6.field3335 > 0) {
            if (var6.field3332 > 0) {
               var1.field3425 += (int)(128.0 * Math.pow(2.0, (double)var6.field3332 * var8) + 0.5);
            } else {
               var1.field3425 += 128;
            }
         }

         if (var6.field3337 != null) {
            if (var6.field3340 > 0) {
               var1.field3420 += (int)(128.0 * Math.pow(2.0, (double)var6.field3340 * var8) + 0.5);
            } else {
               var1.field3420 += 128;
            }

            while(var1.field3416 * 4 < var6.field3337.length - 2 && var1.field3420 > (var6.field3337[var1.field3416 * 4 + 2] & 255) << 8) {
               var1.field3416 = var1.field3416 * 4 + 2;
            }

            if (var1.field3416 * 4 == var6.field3337.length - 2 && var6.field3337[var1.field3416 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3415 >= 0 && var6.field3333 != null && (this.field3356[var1.field3427] & 1) == 0 && (var1.field3418 < 0 || var1 != this.field3374[var1.field3427][var1.field3418])) {
            if (var6.field3336 > 0) {
               var1.field3415 += (int)(128.0 * Math.pow(2.0, (double)var6.field3336 * var8) + 0.5);
            } else {
               var1.field3415 += 128;
            }

            while(var1.field3429 * 2 < var6.field3333.length - 2 && var1.field3415 > (var6.field3333[var1.field3429 * 2 + 2] & 255) << 8) {
               var1.field3429 = var1.field3429 * 4 + 4;
            }

            if (var1.field3429 * 2 == var6.field3333.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method916(var1.field3433);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method976()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5787();
            if (var1.field3415 >= 0) {
               var1.remove();
               if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) {
                  this.field3374[var1.field3427][var1.field3418] = null;
               }
            }

            return true;
         } else {
            var1.stream.method915(var1.field3433, this.method5590(var1), this.method5591(var1));
            return false;
         }
      } else {
         var1.method5787();
         var1.remove();
         if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) {
            this.field3374[var1.field3427][var1.field3418] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldp;",
      garbageValue = "-36297467"
   )
   static class124[] method5640() {
      return new class124[]{class124.field1535, class124.field1528, class124.field1529, class124.field1536, class124.field1531};
   }
}
