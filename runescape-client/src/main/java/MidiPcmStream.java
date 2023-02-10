import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = -524126217
   )
   static int field3381;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -267967717
   )
   int field3366 = 256;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -314546923
   )
   int field3367 = 1000000;
   @ObfuscatedName("z")
   int[] field3368 = new int[16];
   @ObfuscatedName("j")
   int[] field3392 = new int[16];
   @ObfuscatedName("i")
   int[] field3370 = new int[16];
   @ObfuscatedName("n")
   int[] field3388 = new int[16];
   @ObfuscatedName("l")
   int[] field3372 = new int[16];
   @ObfuscatedName("k")
   int[] field3369 = new int[16];
   @ObfuscatedName("c")
   int[] field3374 = new int[16];
   @ObfuscatedName("r")
   int[] field3380 = new int[16];
   @ObfuscatedName("b")
   int[] field3376 = new int[16];
   @ObfuscatedName("x")
   int[] field3375 = new int[16];
   @ObfuscatedName("a")
   int[] field3378 = new int[16];
   @ObfuscatedName("q")
   int[] field3379 = new int[16];
   @ObfuscatedName("d")
   int[] field3384 = new int[16];
   @ObfuscatedName("e")
   int[] field3365 = new int[16];
   @ObfuscatedName("g")
   int[] field3373 = new int[16];
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "[[Lkv;"
   )
   MusicPatchNode[][] field3383 = new MusicPatchNode[16][128];
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[[Lkv;"
   )
   MusicPatchNode[][] field3391 = new MusicPatchNode[16][128];
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lkj;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("ai")
   boolean field3371;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 504327329
   )
   @Export("track")
   int track;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1877242811
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 8647271195752951509L
   )
   long field3389;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = 200143050739431559L
   )
   long field3390;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method5634();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-921376443"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field3366 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-548589206"
   )
   public int method5615() {
      return this.field3366;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkd;Lln;Lah;IB)Z",
      garbageValue = "81"
   )
   @Export("loadMusicTrack")
   public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method5817();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
         int var8 = (int)var7.key;
         MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
         if (var9 == null) {
            var9 = class155.method3333(var2, var8);
            if (var9 == null) {
               var5 = false;
               continue;
            }

            this.musicPatches.put(var9, (long)var8);
         }

         if (!var9.method5779(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.clear();
      }

      return var5;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-128962148"
   )
   @Export("clearAll")
   public synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-693763094"
   )
   @Export("removeAll")
   public synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("n")
   protected synchronized int vmethod5793() {
      return 0;
   }

   @ObfuscatedName("l")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3367 * -727379968 / class284.field3321;

         do {
            long var5 = (long)var4 * (long)var3 + this.field3389;
            if (this.field3390 - var5 >= 0L) {
               this.field3389 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field3390 - this.field3389) - 1L) / (long)var4);
            this.field3389 += (long)var4 * (long)var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5679();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lkd;ZI)V",
      garbageValue = "1213360117"
   )
   @Export("setMusicTrack")
   public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3371 = var2;
      this.field3389 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3390 = this.midiFile.method5741(this.trackLength);
   }

   @ObfuscatedName("c")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3367 * -727379968 / class284.field3321;

         do {
            long var3 = this.field3389 + (long)var1 * (long)var2;
            if (this.field3390 - var3 >= 0L) {
               this.field3389 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field3390 - this.field3389) - 1L) / (long)var2);
            this.field3389 += (long)var2 * (long)var5;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5679();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2145050906"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method5634();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-643635418"
   )
   @Export("isReady")
   public synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "120"
   )
   public synchronized void method5622(int var1, int var2) {
      this.method5623(var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-571066266"
   )
   void method5623(int var1, int var2) {
      this.field3388[var1] = var2;
      this.field3369[var1] = var2 & -128;
      this.method5624(var1, var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1695536423"
   )
   void method5624(int var1, int var2) {
      if (var2 != this.field3372[var1]) {
         this.field3372[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3391[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1757055647"
   )
   void method5625(int var1, int var2, int var3) {
      this.method5627(var1, var2, 64);
      if ((this.field3375[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3436 == var1 && var4.field3440 < 0) {
               this.field3383[var1][var4.field3431] = null;
               this.field3383[var1][var2] = var4;
               int var8 = (var4.field3428 * var4.field3439 >> 12) + var4.field3434;
               var4.field3434 += var2 - var4.field3431 << 8;
               var4.field3428 = var8 - var4.field3434;
               var4.field3439 = 4096;
               var4.field3431 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3372[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field3436 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field3429 = var9.field3408[var2];
            var6.field3430 = var9.field3413[var2];
            var6.field3431 = var2;
            var6.field3432 = var3 * var3 * var9.field3410[var2] * var9.field3412 + 1024 >> 11;
            var6.field3433 = var9.field3411[var2] & 255;
            var6.field3434 = (var2 << 8) - (var9.field3418[var2] & 32767);
            var6.field3437 = 0;
            var6.field3438 = 0;
            var6.field3442 = 0;
            var6.field3440 = -1;
            var6.field3426 = 0;
            if (this.field3384[var1] == 0) {
               var6.stream = RawPcmStream.method913(var5, this.method5639(var6), this.method5640(var6), this.method5613(var6));
            } else {
               var6.stream = RawPcmStream.method913(var5, this.method5639(var6), 0, this.method5613(var6));
               this.method5659(var6, var9.field3418[var2] < 0);
            }

            if (var9.field3418[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field3430 >= 0) {
               MusicPatchNode var7 = this.field3391[var1][var6.field3430];
               if (var7 != null && var7.field3440 < 0) {
                  this.field3383[var1][var7.field3431] = null;
                  var7.field3440 = 0;
               }

               this.field3391[var1][var6.field3430] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field3383[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lkv;ZI)V",
      garbageValue = "1738453403"
   )
   void method5659(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field292) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)this.field3384[var1.field3436] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method911();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.field3384[var1.field3436] >> 6);
      }

      var1.stream.method890(var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "74"
   )
   void method5627(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3383[var1][var2];
      if (var4 != null) {
         this.field3383[var1][var2] = null;
         if ((this.field3375[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var5.field3436 == var4.field3436 && var5.field3440 < 0 && var4 != var5) {
                  var4.field3440 = 0;
                  break;
               }
            }
         } else {
            var4.field3440 = 0;
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2120112247"
   )
   void method5628(int var1, int var2, int var3) {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1370666986"
   )
   void method5629(int var1, int var2) {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1376092933"
   )
   void method5630(int var1, int var2) {
      this.field3374[var1] = var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-110"
   )
   void method5631(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3436 == var1) {
            if (var2.stream != null) {
               var2.stream.method895(class284.field3321 / 100);
               if (var2.stream.method899()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5828();
            }

            if (var2.field3440 < 0) {
               this.field3383[var2.field3436][var2.field3431] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-525596200"
   )
   void method5632(int var1) {
      if (var1 >= 0) {
         this.field3368[var1] = 12800;
         this.field3392[var1] = 8192;
         this.field3370[var1] = 16383;
         this.field3374[var1] = 8192;
         this.field3380[var1] = 0;
         this.field3376[var1] = 8192;
         this.method5635(var1);
         this.method5636(var1);
         this.field3375[var1] = 0;
         this.field3378[var1] = 32767;
         this.field3379[var1] = 256;
         this.field3384[var1] = 0;
         this.method5614(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5632(var1);
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1393661383"
   )
   void method5668(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3436 == var1) && var2.field3440 < 0) {
            this.field3383[var2.field3436][var2.field3431] = null;
            var2.field3440 = 0;
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1548255752"
   )
   void method5634() {
      this.method5631(-1);
      this.method5632(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3372[var1] = this.field3388[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3369[var1] = this.field3388[var1] & -128;
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-446668646"
   )
   void method5635(int var1) {
      if ((this.field3375[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3436 == var1 && this.field3383[var1][var2.field3431] == null && var2.field3440 < 0) {
               var2.field3440 = 0;
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1107503455"
   )
   void method5636(int var1) {
      if ((this.field3375[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3436 == var1) {
               var2.field3446 = 0;
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1277317735"
   )
   void method5637(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5627(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5625(var3, var4, var5);
         } else {
            this.method5627(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5628(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3369[var3] = (var5 << 14) + (this.field3369[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3369[var3] = (var5 << 7) + (this.field3369[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3380[var3] = (var5 << 7) + (this.field3380[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3380[var3] = var5 + (this.field3380[var3] & -128);
         }

         if (var4 == 5) {
            this.field3376[var3] = (var5 << 7) + (this.field3376[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3376[var3] = var5 + (this.field3376[var3] & -128);
         }

         if (var4 == 7) {
            this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3368[var3] = var5 + (this.field3368[var3] & -128);
         }

         if (var4 == 10) {
            this.field3392[var3] = (var5 << 7) + (this.field3392[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3392[var3] = var5 + (this.field3392[var3] & -128);
         }

         if (var4 == 11) {
            this.field3370[var3] = (var5 << 7) + (this.field3370[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3370[var3] = var5 + (this.field3370[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3375;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3375;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3375;
               var10000[var3] |= 2;
            } else {
               this.method5635(var3);
               var10000 = this.field3375;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3378[var3] = (var5 << 7) + (this.field3378[var3] & 127);
         }

         if (var4 == 98) {
            this.field3378[var3] = (this.field3378[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3378[var3] = (var5 << 7) + (this.field3378[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3378[var3] = (this.field3378[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5631(var3);
         }

         if (var4 == 121) {
            this.method5632(var3);
         }

         if (var4 == 123) {
            this.method5668(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3378[var3];
            if (var6 == 16384) {
               this.field3379[var3] = (var5 << 7) + (this.field3379[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3378[var3];
            if (var6 == 16384) {
               this.field3379[var3] = var5 + (this.field3379[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3384[var3] = (var5 << 7) + (this.field3384[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3384[var3] = var5 + (this.field3384[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3375;
               var10000[var3] |= 4;
            } else {
               this.method5636(var3);
               var10000 = this.field3375;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5614(var3, (var5 << 7) + (this.field3365[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5614(var3, var5 + (this.field3365[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5624(var3, var4 + this.field3369[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5629(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5630(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5634();
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-800776544"
   )
   void method5614(int var1, int var2) {
      this.field3365[var1] = var2;
      this.field3373[var1] = (int)(2097152.0 * Math.pow(2.0, (double)var2 * 5.4931640625E-4) + 0.5);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lkv;I)I",
      garbageValue = "-20440613"
   )
   int method5639(MusicPatchNode var1) {
      int var2 = (var1.field3439 * var1.field3428 >> 12) + var1.field3434;
      var2 += (this.field3374[var1.field3436] - 8192) * this.field3379[var1.field3436] >> 12;
      MusicPatchNode2 var3 = var1.field3429;
      int var4;
      if (var3.field3354 > 0 && (var3.field3349 > 0 || this.field3380[var1.field3436] > 0)) {
         var4 = var3.field3349 << 2;
         int var5 = var3.field3350 << 1;
         if (var1.field3441 < var5) {
            var4 = var4 * var1.field3441 / var5;
         }

         var4 += this.field3380[var1.field3436] >> 7;
         double var6 = Math.sin(0.01227184630308513 * (double)(var1.field3443 & 511));
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, (double)var2 * 3.255208333333333E-4) / (double)class284.field3321 + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lkv;B)I",
      garbageValue = "40"
   )
   int method5640(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3429;
      int var3 = this.field3370[var1.field3436] * this.field3368[var1.field3436] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3432 + 16384 >> 15;
      var3 = var3 * this.field3366 + 128 >> 8;
      if (var2.field3345 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var2.field3345 * 1.953125E-5 * (double)var1.field3437) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3353 != null) {
         var4 = var1.field3438;
         var5 = var2.field3353[var1.field3442 * 4 + 1];
         if (var1.field3442 * 4 < var2.field3353.length - 2) {
            var6 = (var2.field3353[var1.field3442 * 4] & 255) << 8;
            var7 = (var2.field3353[var1.field3442 * 4 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3353[var1.field3442 * 4 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if (var1.field3440 > 0 && var2.field3351 != null) {
         var4 = var1.field3440;
         var5 = var2.field3351[var1.field3426 * 4 + 1];
         if (var1.field3426 * 4 < var2.field3351.length - 2) {
            var6 = (var2.field3351[var1.field3426 * 4] & 255) << 8;
            var7 = (var2.field3351[var1.field3426 * 4 + 2] & 255) << 8;
            var5 += (var2.field3351[var1.field3426 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lkv;S)I",
      garbageValue = "3641"
   )
   int method5613(MusicPatchNode var1) {
      int var2 = this.field3392[var1.field3436];
      return var2 < 8192 ? var2 * var1.field3433 + 32 >> 6 : 16384 - ((128 - var1.field3433) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-25173"
   )
   void method5679() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3390; var2 == this.trackLength; var3 = this.midiFile.method5741(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3371 || var2 == 0) {
                     this.method5634();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5637(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3390 = var3;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lkv;I)Z",
      garbageValue = "1287702671"
   )
   boolean method5648(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3440 >= 0) {
            var1.remove();
            if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) {
               this.field3391[var1.field3436][var1.field3430] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lkv;[IIII)Z",
      garbageValue = "-834801053"
   )
   boolean method5626(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3445 = class284.field3321 / 100;
      if (var1.field3440 < 0 || var1.stream != null && !var1.stream.method898()) {
         int var5 = var1.field3439;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, (double)this.field3376[var1.field3436] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3439 = var5;
         }

         var1.stream.method1014(this.method5639(var1));
         MusicPatchNode2 var6 = var1.field3429;
         boolean var7 = false;
         ++var1.field3441;
         var1.field3443 += var6.field3354;
         double var8 = (double)((var1.field3431 - 60 << 8) + (var1.field3439 * var1.field3428 >> 12)) * 5.086263020833333E-6;
         if (var6.field3345 > 0) {
            if (var6.field3352 > 0) {
               var1.field3437 = var1.field3437 * 231489536 + (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3352) + 0.5) * 231489536;
            } else {
               var1.field3437 = var1.field3437 * 231489536 + -434110464;
            }
         }

         if (var6.field3353 != null) {
            if (var6.field3346 > 0) {
               var1.field3438 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3346) + 0.5);
            } else {
               var1.field3438 += 128;
            }

            while(var1.field3442 * 4 < var6.field3353.length - 2 && var1.field3438 > (var6.field3353[var1.field3442 * 4 + 2] & 255) << 8) {
               var1.field3442 = var1.field3442 * 4 + 2;
            }

            if (var1.field3442 * 4 == var6.field3353.length - 2 && var6.field3353[var1.field3442 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3440 >= 0 && var6.field3351 != null && (this.field3375[var1.field3436] & 1) == 0 && (var1.field3430 < 0 || var1 != this.field3391[var1.field3436][var1.field3430])) {
            if (var6.field3347 > 0) {
               var1.field3440 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3347) + 0.5);
            } else {
               var1.field3440 += 128;
            }

            while(var1.field3426 * 4 < var6.field3351.length - 2 && var1.field3440 > (var6.field3351[var1.field3426 * 4 + 2] & 255) << 8) {
               var1.field3426 = var1.field3426 * 4 + 2;
            }

            if (var1.field3426 * 4 == var6.field3351.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method895(var1.field3445);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method899()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5828();
            if (var1.field3440 >= 0) {
               var1.remove();
               if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) {
                  this.field3391[var1.field3436][var1.field3430] = null;
               }
            }

            return true;
         } else {
            var1.stream.method894(var1.field3445, this.method5640(var1), this.method5613(var1));
            return false;
         }
      } else {
         var1.method5828();
         var1.remove();
         if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) {
            this.field3391[var1.field3436][var1.field3430] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "8"
   )
   public static int method5728(int var0) {
      return var0 >>> 4 & class469.field4921;
   }
}
