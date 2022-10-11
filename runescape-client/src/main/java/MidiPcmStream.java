import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("tx")
   @ObfuscatedGetter(
      intValue = 219986407
   )
   static int field3326;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -557063845
   )
   int field3299 = 256;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1550225553
   )
   int field3324 = 1000000;
   @ObfuscatedName("x")
   int[] field3301 = new int[16];
   @ObfuscatedName("h")
   int[] field3298 = new int[16];
   @ObfuscatedName("j")
   int[] field3319 = new int[16];
   @ObfuscatedName("y")
   int[] field3307 = new int[16];
   @ObfuscatedName("d")
   int[] field3305 = new int[16];
   @ObfuscatedName("n")
   int[] field3320 = new int[16];
   @ObfuscatedName("r")
   int[] field3312 = new int[16];
   @ObfuscatedName("l")
   int[] field3308 = new int[16];
   @ObfuscatedName("s")
   int[] field3309 = new int[16];
   @ObfuscatedName("m")
   int[] field3310 = new int[16];
   @ObfuscatedName("q")
   int[] field3311 = new int[16];
   @ObfuscatedName("i")
   int[] field3303 = new int[16];
   @ObfuscatedName("e")
   int[] field3325 = new int[16];
   @ObfuscatedName("g")
   int[] field3314 = new int[16];
   @ObfuscatedName("k")
   int[] field3315 = new int[16];
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[[Lkj;"
   )
   MusicPatchNode[][] field3316 = new MusicPatchNode[16][128];
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[[Lkj;"
   )
   MusicPatchNode[][] field3317 = new MusicPatchNode[16][128];
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljq;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("ah")
   boolean field3313;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2114625077
   )
   @Export("track")
   int track;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 473007987
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 1403801666084551283L
   )
   long field3322;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      longValue = -859009345527054569L
   )
   long field3323;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method5472();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1291938970"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field3299 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-27"
   )
   int method5576() {
      return this.field3299;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkf;Llg;Law;IB)Z",
      garbageValue = "75"
   )
   @Export("loadMusicTrack")
   public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method5661();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
         int var8 = (int)var7.key;
         MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
         if (var9 == null) {
            byte[] var11 = var2.takeFileFlat(var8);
            MusicPatch var10;
            if (var11 == null) {
               var10 = null;
            } else {
               var10 = new MusicPatch(var11);
            }

            var9 = var10;
            if (var10 == null) {
               var5 = false;
               continue;
            }

            this.musicPatches.put(var10, (long)var8);
         }

         if (!var9.method5630(var3, var7.byteArray, var6)) {
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
      garbageValue = "9"
   )
   @Export("clearAll")
   public synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2065502092"
   )
   @Export("removeAll")
   synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("d")
   protected synchronized int vmethod5648() {
      return 0;
   }

   @ObfuscatedName("n")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3324 * -727379968 / SoundCache.field337;

         do {
            long var5 = (long)var3 * (long)var4 + this.field3322;
            if (this.field3323 - var5 >= 0L) {
               this.field3322 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field3323 - this.field3322) - 1L) / (long)var4);
            this.field3322 += (long)var4 * (long)var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5485();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lkf;ZB)V",
      garbageValue = "0"
   )
   @Export("setMusicTrack")
   public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3313 = var2;
      this.field3322 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3323 = this.midiFile.method5595(this.trackLength);
   }

   @ObfuscatedName("l")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3324 * -727379968 / SoundCache.field337;

         do {
            long var3 = this.field3322 + (long)var1 * (long)var2;
            if (this.field3323 - var3 >= 0L) {
               this.field3322 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field3323 - this.field3322) - 1L) / (long)var2);
            this.field3322 += (long)var2 * (long)var5;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5485();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1110522631"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method5472();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-79"
   )
   @Export("isReady")
   public synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1688953858"
   )
   public synchronized void method5480(int var1, int var2) {
      this.method5572(var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-2104178421"
   )
   void method5572(int var1, int var2) {
      this.field3307[var1] = var2;
      this.field3320[var1] = var2 & -128;
      this.method5462(var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "25860"
   )
   void method5462(int var1, int var2) {
      if (var2 != this.field3305[var1]) {
         this.field3305[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3317[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-315683773"
   )
   void method5463(int var1, int var2, int var3) {
      this.method5465(var1, var2, 64);
      if ((this.field3310[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3361 == var1 && var4.field3373 < 0) {
               this.field3316[var1][var4.field3364] = null;
               this.field3316[var1][var2] = var4;
               int var8 = (var4.field3369 * var4.field3368 >> 12) + var4.field3376;
               var4.field3376 += var2 - var4.field3364 << 8;
               var4.field3368 = var8 - var4.field3376;
               var4.field3369 = 4096;
               var4.field3364 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3305[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field3361 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field3374 = var9.field3346[var2];
            var6.field3359 = var9.field3347[var2];
            var6.field3364 = var2;
            var6.field3365 = var3 * var3 * var9.field3344[var2] * var9.field3350 + 1024 >> 11;
            var6.field3366 = var9.field3345[var2] & 255;
            var6.field3376 = (var2 << 8) - (var9.field3343[var2] & 32767);
            var6.field3370 = 0;
            var6.field3379 = 0;
            var6.field3372 = 0;
            var6.field3373 = -1;
            var6.field3371 = 0;
            if (this.field3325[var1] == 0) {
               var6.stream = RawPcmStream.method889(var5, this.method5477(var6), this.method5478(var6), this.method5479(var6));
            } else {
               var6.stream = RawPcmStream.method889(var5, this.method5477(var6), 0, this.method5479(var6));
               this.method5579(var6, var9.field3343[var2] < 0);
            }

            if (var9.field3343[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field3359 >= 0) {
               MusicPatchNode var7 = this.field3317[var1][var6.field3359];
               if (var7 != null && var7.field3373 < 0) {
                  this.field3316[var1][var7.field3364] = null;
                  var7.field3373 = 0;
               }

               this.field3317[var1][var6.field3359] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field3316[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Lkj;ZI)V",
      garbageValue = "-2124213671"
   )
   void method5579(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field284) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)var5 * (long)this.field3325[var1.field3361] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method898();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.field3325[var1.field3361] >> 6);
      }

      var1.stream.method1007(var4);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "863946990"
   )
   void method5465(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3316[var1][var2];
      if (var4 != null) {
         this.field3316[var1][var2] = null;
         if ((this.field3310[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field3361 == var5.field3361 && var5.field3373 < 0 && var4 != var5) {
                  var4.field3373 = 0;
                  break;
               }
            }
         } else {
            var4.field3373 = 0;
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-976368336"
   )
   void method5534(int var1, int var2, int var3) {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-89"
   )
   void method5467(int var1, int var2) {
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "16384"
   )
   void method5468(int var1, int var2) {
      this.field3312[var1] = var2;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1300315147"
   )
   void method5490(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3361 == var1) {
            if (var2.stream != null) {
               var2.stream.method893(SoundCache.field337 / 100);
               if (var2.stream.method895()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5670();
            }

            if (var2.field3373 < 0) {
               this.field3316[var2.field3361][var2.field3364] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1032166120"
   )
   void method5470(int var1) {
      if (var1 >= 0) {
         this.field3301[var1] = 12800;
         this.field3298[var1] = 8192;
         this.field3319[var1] = 16383;
         this.field3312[var1] = 8192;
         this.field3308[var1] = 0;
         this.field3309[var1] = 8192;
         this.method5473(var1);
         this.method5454(var1);
         this.field3310[var1] = 0;
         this.field3311[var1] = 32767;
         this.field3303[var1] = 256;
         this.field3325[var1] = 0;
         this.method5476(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5470(var1);
         }

      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "30459"
   )
   void method5475(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3361 == var1) && var2.field3373 < 0) {
            this.field3316[var2.field3361][var2.field3364] = null;
            var2.field3373 = 0;
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1812466376"
   )
   void method5472() {
      this.method5490(-1);
      this.method5470(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3305[var1] = this.field3307[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3320[var1] = this.field3307[var1] & -128;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "27"
   )
   void method5473(int var1) {
      if ((this.field3310[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3361 == var1 && this.field3316[var1][var2.field3364] == null && var2.field3373 < 0) {
               var2.field3373 = 0;
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1480688586"
   )
   void method5454(int var1) {
      if ((this.field3310[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3361 == var1) {
               var2.field3362 = 0;
            }
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   void method5530(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5465(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5463(var3, var4, var5);
         } else {
            this.method5465(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5534(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3320[var3] = (var5 << 14) + (this.field3320[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3320[var3] = (var5 << 7) + (this.field3320[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3308[var3] = (var5 << 7) + (this.field3308[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3308[var3] = var5 + (this.field3308[var3] & -128);
         }

         if (var4 == 5) {
            this.field3309[var3] = (var5 << 7) + (this.field3309[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3309[var3] = var5 + (this.field3309[var3] & -128);
         }

         if (var4 == 7) {
            this.field3301[var3] = (var5 << 7) + (this.field3301[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3301[var3] = var5 + (this.field3301[var3] & -128);
         }

         if (var4 == 10) {
            this.field3298[var3] = (var5 << 7) + (this.field3298[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3298[var3] = var5 + (this.field3298[var3] & -128);
         }

         if (var4 == 11) {
            this.field3319[var3] = (var5 << 7) + (this.field3319[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3319[var3] = var5 + (this.field3319[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3310;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3310;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3310;
               var10000[var3] |= 2;
            } else {
               this.method5473(var3);
               var10000 = this.field3310;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3311[var3] = (var5 << 7) + (this.field3311[var3] & 127);
         }

         if (var4 == 98) {
            this.field3311[var3] = (this.field3311[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3311[var3] = (var5 << 7) + (this.field3311[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3311[var3] = (this.field3311[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5490(var3);
         }

         if (var4 == 121) {
            this.method5470(var3);
         }

         if (var4 == 123) {
            this.method5475(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3311[var3];
            if (var6 == 16384) {
               this.field3303[var3] = (var5 << 7) + (this.field3303[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3311[var3];
            if (var6 == 16384) {
               this.field3303[var3] = var5 + (this.field3303[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3325[var3] = (var5 << 7) + (this.field3325[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3325[var3] = var5 + (this.field3325[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3310;
               var10000[var3] |= 4;
            } else {
               this.method5454(var3);
               var10000 = this.field3310;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5476(var3, (var5 << 7) + (this.field3314[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5476(var3, var5 + (this.field3314[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5462(var3, var4 + this.field3320[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5467(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5468(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5472();
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-372814053"
   )
   void method5476(int var1, int var2) {
      this.field3314[var1] = var2;
      this.field3315[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lkj;B)I",
      garbageValue = "94"
   )
   int method5477(MusicPatchNode var1) {
      int var2 = (var1.field3369 * var1.field3368 >> 12) + var1.field3376;
      var2 += (this.field3312[var1.field3361] - 8192) * this.field3303[var1.field3361] >> 12;
      MusicPatchNode2 var3 = var1.field3374;
      int var4;
      if (var3.field3287 > 0 && (var3.field3280 > 0 || this.field3308[var1.field3361] > 0)) {
         var4 = var3.field3280 << 2;
         int var5 = var3.field3281 << 1;
         if (var1.field3375 < var5) {
            var4 = var4 * var1.field3375 / var5;
         }

         var4 += this.field3308[var1.field3361] >> 7;
         double var6 = Math.sin((double)(var1.field3363 & 511) * 0.01227184630308513);
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, (double)var2 * 3.255208333333333E-4) / (double)SoundCache.field337 + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lkj;I)I",
      garbageValue = "-1070589370"
   )
   int method5478(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3374;
      int var3 = this.field3301[var1.field3361] * this.field3319[var1.field3361] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3365 + 16384 >> 15;
      var3 = var3 * this.field3299 + 128 >> 8;
      if (var2.field3282 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var2.field3282 * (double)var1.field3370 * 1.953125E-5) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3288 != null) {
         var4 = var1.field3379;
         var5 = var2.field3288[var1.field3372 * 2 + 1];
         if (var1.field3372 * 2 < var2.field3288.length - 2) {
            var6 = (var2.field3288[var1.field3372 * 2] & 255) << 8;
            var7 = (var2.field3288[var1.field3372 * 2 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3288[var1.field3372 * 2 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if (var1.field3373 > 0 && var2.field3286 != null) {
         var4 = var1.field3373;
         var5 = var2.field3286[var1.field3371 * 2 + 1];
         if (var1.field3371 * 2 < var2.field3286.length - 2) {
            var6 = (var2.field3286[var1.field3371 * 2] & 255) << 8;
            var7 = (var2.field3286[var1.field3371 * 2 + 2] & 255) << 8;
            var5 += (var2.field3286[var1.field3371 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lkj;B)I",
      garbageValue = "-4"
   )
   int method5479(MusicPatchNode var1) {
      int var2 = this.field3298[var1.field3361];
      return var2 < 8192 ? var2 * var1.field3366 + 32 >> 6 : 16384 - ((128 - var1.field3366) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-727513121"
   )
   void method5485() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3323; var2 == this.trackLength; var3 = this.midiFile.method5595(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3313 || var2 == 0) {
                     this.method5472();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5530(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3323 = var3;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lkj;B)Z",
      garbageValue = "-59"
   )
   boolean method5486(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3373 >= 0) {
            var1.remove();
            if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) {
               this.field3317[var1.field3361][var1.field3359] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lkj;[IIIB)Z",
      garbageValue = "0"
   )
   boolean method5487(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3378 = SoundCache.field337 / 100;
      if (var1.field3373 < 0 || var1.stream != null && !var1.stream.method905()) {
         int var5 = var1.field3369;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, (double)this.field3309[var1.field3361] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3369 = var5;
         }

         var1.stream.method944(this.method5477(var1));
         MusicPatchNode2 var6 = var1.field3374;
         boolean var7 = false;
         ++var1.field3375;
         var1.field3363 += var6.field3287;
         double var8 = (double)((var1.field3364 - 60 << 8) + (var1.field3368 * var1.field3369 >> 12)) * 5.086263020833333E-6;
         if (var6.field3282 > 0) {
            if (var6.field3285 > 0) {
               var1.field3370 += (int)(128.0 * Math.pow(2.0, (double)var6.field3285 * var8) + 0.5);
            } else {
               var1.field3370 += 128;
            }
         }

         if (var6.field3288 != null) {
            if (var6.field3283 > 0) {
               var1.field3379 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3283) + 0.5);
            } else {
               var1.field3379 += 128;
            }

            while(var1.field3372 * 2 < var6.field3288.length - 2 && var1.field3379 > (var6.field3288[var1.field3372 * 2 + 2] & 255) << 8) {
               var1.field3372 = var1.field3372 * 4 + 4;
            }

            if (var1.field3372 * 2 == var6.field3288.length - 2 && var6.field3288[var1.field3372 * 2 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3373 >= 0 && var6.field3286 != null && (this.field3310[var1.field3361] & 1) == 0 && (var1.field3359 < 0 || var1 != this.field3317[var1.field3361][var1.field3359])) {
            if (var6.field3284 > 0) {
               var1.field3373 += (int)(128.0 * Math.pow(2.0, (double)var6.field3284 * var8) + 0.5);
            } else {
               var1.field3373 += 128;
            }

            while(var1.field3371 * 2 < var6.field3286.length - 2 && var1.field3373 > (var6.field3286[var1.field3371 * 2 + 2] & 255) << 8) {
               var1.field3371 = var1.field3371 * 4 + 4;
            }

            if (var1.field3371 * 2 == var6.field3286.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method893(var1.field3378);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method895()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5670();
            if (var1.field3373 >= 0) {
               var1.remove();
               if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) {
                  this.field3317[var1.field3361][var1.field3359] = null;
               }
            }

            return true;
         } else {
            var1.stream.method884(var1.field3378, this.method5478(var1), this.method5479(var1));
            return false;
         }
      } else {
         var1.method5670();
         var1.remove();
         if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) {
            this.field3317[var1.field3361][var1.field3359] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lgp;",
      garbageValue = "-531059897"
   )
   @Export("ItemDefinition_get")
   public static ItemComposition ItemDefinition_get(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SpriteMask.ItemDefinition_archive.takeFile(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         if (var1.noteTemplate != -1) {
            var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
         }

         if (var1.notedId != -1) {
            var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
         }

         if (var1.placeholderTemplate != -1) {
            var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
         }

         if (!class1.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
            var1.name = "Members object";
            var1.isTradable = false;

            int var3;
            for(var3 = 0; var3 < var1.groundActions.length; ++var3) {
               var1.groundActions[var3] = null;
            }

            for(var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
               if (var3 != 4) {
                  var1.inventoryActions[var3] = null;
               }
            }

            var1.shiftClickIndex = -2;
            var1.team = 0;
            if (var1.params != null) {
               boolean var6 = false;

               for(Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                  ParamComposition var5 = class230.getParamDefinition((int)var4.key);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
