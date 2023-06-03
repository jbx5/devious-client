import java.util.Iterator;
import java.util.PriorityQueue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 677776113
   )
   int field3410 = 256;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 189518113
   )
   int field3409 = 1000000;
   @ObfuscatedName("as")
   int[] field3412 = new int[16];
   @ObfuscatedName("ax")
   int[] field3427 = new int[16];
   @ObfuscatedName("ap")
   int[] field3431 = new int[16];
   @ObfuscatedName("ab")
   int[] field3415 = new int[16];
   @ObfuscatedName("ak")
   int[] field3416 = new int[16];
   @ObfuscatedName("ae")
   int[] field3417 = new int[16];
   @ObfuscatedName("af")
   int[] field3418 = new int[16];
   @ObfuscatedName("ao")
   int[] field3414 = new int[16];
   @ObfuscatedName("aa")
   int[] field3420 = new int[16];
   @ObfuscatedName("au")
   int[] field3421 = new int[16];
   @ObfuscatedName("ai")
   int[] field3422 = new int[16];
   @ObfuscatedName("aq")
   int[] field3423 = new int[16];
   @ObfuscatedName("aw")
   int[] field3424 = new int[16];
   @ObfuscatedName("ay")
   int[] field3425 = new int[16];
   @ObfuscatedName("al")
   int[] field3430 = new int[16];
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "[[Lma;"
   )
   MusicPatchNode[][] field3436 = new MusicPatchNode[16][128];
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "[[Lma;"
   )
   MusicPatchNode[][] field3428 = new MusicPatchNode[16][128];
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Llr;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("bj")
   boolean field3411;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1055138713
   )
   @Export("track")
   int track;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 698650773
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      longValue = -3703653601253318223L
   )
   long field3433;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      longValue = 3529635704974986047L
   )
   long field3434;
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lmi;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);
   @ObfuscatedName("ba")
   public PriorityQueue field3419 = new PriorityQueue(5, new class306());

   public MidiPcmStream() {
      this.method5814();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "18"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field3410 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-111377530"
   )
   public int method5737() {
      return this.field3410;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lmv;Lnq;Lbz;B)Z",
      garbageValue = "6"
   )
   synchronized boolean method5806(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
      boolean var4 = true;

      for(class316 var5 = (class316)var1.field3473.first(); var5 != null; var5 = (class316)var1.field3473.next()) {
         int var6 = (int)var5.key;
         MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var6);
         if (var7 == null) {
            byte[] var9 = var2.takeFileFlat(var6);
            MusicPatch var8;
            if (var9 == null) {
               var8 = null;
            } else {
               var8 = new MusicPatch(var9);
            }

            var7 = var8;
            if (var8 == null) {
               var4 = false;
               continue;
            }

            this.musicPatches.put(var8, (long)var6);
         }

         if (!var7.method5912(var3, var5.field3500)) {
            var4 = false;
         } else if (this.field3419 != null) {
            Iterator var10 = var7.field3466.iterator();

            while(var10.hasNext()) {
               class53 var11 = (class53)var10.next();
               this.field3419.add(new class310(var5.field3499, var11));
            }
         }
      }

      return var4;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "16"
   )
   synchronized void method5739() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "923743711"
   )
   @Export("removeAll")
   public synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("ak")
   protected synchronized int vmethod5920() {
      return 0;
   }

   @ObfuscatedName("ae")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3409 * -727379968 / PcmPlayer.field291;

         do {
            long var5 = this.field3433 + (long)var4 * (long)var3;
            if (this.field3434 - var5 >= 0L) {
               this.field3433 = var5;
               break;
            }

            int var7 = (int)((this.field3434 - this.field3433 + (long)var4 - 1L) / (long)var4);
            this.field3433 += (long)var7 * (long)var4;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5807();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lmv;ZI)V",
      garbageValue = "-907641791"
   )
   @Export("setMusicTrack")
   synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3411 = var2;
      this.field3433 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3434 = this.midiFile.method5877(this.trackLength);
   }

   @ObfuscatedName("ao")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3409 * -727379968 / PcmPlayer.field291;

         do {
            long var3 = this.field3433 + (long)var2 * (long)var1;
            if (this.field3434 - var3 >= 0L) {
               this.field3433 = var3;
               break;
            }

            int var5 = (int)((this.field3434 - this.field3433 + (long)var2 - 1L) / (long)var2);
            this.field3433 += (long)var5 * (long)var2;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5807();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1496424318"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method5814();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-4147255"
   )
   @Export("isReady")
   public synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1457303388"
   )
   public synchronized void method5769(int var1, int var2) {
      this.method5783(var1, var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-15"
   )
   void method5783(int var1, int var2) {
      this.field3415[var1] = var2;
      this.field3417[var1] = var2 & -128;
      this.method5834(var1, var2);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "326324678"
   )
   void method5834(int var1, int var2) {
      if (var2 != this.field3416[var1]) {
         this.field3416[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3428[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2066005019"
   )
   void method5746(int var1, int var2, int var3) {
      this.method5749(var1, var2, 64);
      if ((this.field3421[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3490 == var1 && var4.field3489 < 0) {
               this.field3436[var1][var4.field3480] = null;
               this.field3436[var1][var2] = var4;
               int var8 = (var4.field3485 * var4.field3484 >> 12) + var4.field3491;
               var4.field3491 += var2 - var4.field3480 << 8;
               var4.field3484 = var8 - var4.field3491;
               var4.field3485 = 4096;
               var4.field3480 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3416[var1]);
      if (var9 != null) {
         if (var9.rawSounds[var2] != null) {
            RawSound var5 = var9.rawSounds[var2].method1038();
            if (var5 != null) {
               MusicPatchNode var6 = new MusicPatchNode();
               var6.field3490 = var1;
               var6.table = var9;
               var6.rawSound = var5;
               var6.field3498 = var9.field3465[var2];
               var6.field3479 = var9.field3459[var2];
               var6.field3480 = var2;
               var6.field3481 = var3 * var3 * var9.field3463[var2] * var9.field3464 + 1024 >> 11;
               var6.field3482 = var9.field3468[var2] & 255;
               var6.field3491 = (var2 << 8) - (var9.field3462[var2] & 32767);
               var6.field3486 = 0;
               var6.field3487 = 0;
               var6.field3488 = 0;
               var6.field3489 = -1;
               var6.field3495 = 0;
               if (this.field3424[var1] == 0) {
                  var6.stream = RawPcmStream.method949(var5, this.method5761(var6), this.method5762(var6), this.method5763(var6));
               } else {
                  var6.stream = RawPcmStream.method949(var5, this.method5761(var6), 0, this.method5763(var6));
                  this.method5781(var6, var9.field3462[var2] < 0);
               }

               if (var9.field3462[var2] < 0) {
                  var6.stream.setNumLoops(-1);
               }

               if (var6.field3479 >= 0) {
                  MusicPatchNode var7 = this.field3428[var1][var6.field3479];
                  if (var7 != null && var7.field3489 < 0) {
                     this.field3436[var1][var7.field3480] = null;
                     var7.field3489 = 0;
                  }

                  this.field3428[var1][var6.field3479] = var6;
               }

               this.patchStream.queue.addFirst(var6);
               this.field3436[var1][var2] = var6;
            }
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lma;ZB)V",
      garbageValue = "20"
   )
   void method5781(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field267) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)this.field3424[var1.field3490] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method859();
         }
      } else {
         var4 = (int)((long)this.field3424[var1.field3490] * (long)var3 >> 6);
      }

      var1.stream.method858(var4);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1654252881"
   )
   void method5749(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3436[var1][var2];
      if (var4 != null) {
         this.field3436[var1][var2] = null;
         if ((this.field3421[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field3490 == var5.field3490 && var5.field3489 < 0 && var5 != var4) {
                  var4.field3489 = 0;
                  break;
               }
            }
         } else {
            var4.field3489 = 0;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-733972794"
   )
   void method5750(int var1, int var2, int var3) {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-2133532598"
   )
   void method5751(int var1, int var2) {
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "688083182"
   )
   void method5756(int var1, int var2) {
      this.field3418[var1] = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   void method5753(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3490 == var1) {
            if (var2.stream != null) {
               var2.stream.method863(PcmPlayer.field291 / 100);
               if (var2.stream.method944()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5948();
            }

            if (var2.field3489 < 0) {
               this.field3436[var2.field3490][var2.field3480] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "13497"
   )
   void method5788(int var1) {
      if (var1 >= 0) {
         this.field3412[var1] = 12800;
         this.field3427[var1] = 8192;
         this.field3431[var1] = 16383;
         this.field3418[var1] = 8192;
         this.field3414[var1] = 0;
         this.field3420[var1] = 8192;
         this.method5757(var1);
         this.method5813(var1);
         this.field3421[var1] = 0;
         this.field3422[var1] = 32767;
         this.field3423[var1] = 256;
         this.field3424[var1] = 0;
         this.method5760(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5788(var1);
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1903106973"
   )
   void method5755(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3490 == var1) && var2.field3489 < 0) {
            this.field3436[var2.field3490][var2.field3480] = null;
            var2.field3489 = 0;
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1073460150"
   )
   void method5814() {
      this.method5753(-1);
      this.method5788(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3416[var1] = this.field3415[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3417[var1] = this.field3415[var1] & -128;
      }

   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1165288902"
   )
   void method5757(int var1) {
      if ((this.field3421[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3490 == var1 && this.field3436[var1][var2.field3480] == null && var2.field3489 < 0) {
               var2.field3489 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1448952082"
   )
   void method5813(int var1) {
      if ((this.field3421[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3490 == var1) {
               var2.field3483 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1513062170"
   )
   void method5759(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5749(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5746(var3, var4, var5);
         } else {
            this.method5749(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5750(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3417[var3] = (var5 << 14) + (this.field3417[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3417[var3] = (var5 << 7) + (this.field3417[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3414[var3] = (var5 << 7) + (this.field3414[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3414[var3] = var5 + (this.field3414[var3] & -128);
         }

         if (var4 == 5) {
            this.field3420[var3] = (var5 << 7) + (this.field3420[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3420[var3] = var5 + (this.field3420[var3] & -128);
         }

         if (var4 == 7) {
            this.field3412[var3] = (var5 << 7) + (this.field3412[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3412[var3] = var5 + (this.field3412[var3] & -128);
         }

         if (var4 == 10) {
            this.field3427[var3] = (var5 << 7) + (this.field3427[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3427[var3] = var5 + (this.field3427[var3] & -128);
         }

         if (var4 == 11) {
            this.field3431[var3] = (var5 << 7) + (this.field3431[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3431[var3] = var5 + (this.field3431[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3421;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3421;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3421;
               var10000[var3] |= 2;
            } else {
               this.method5757(var3);
               var10000 = this.field3421;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127);
         }

         if (var4 == 98) {
            this.field3422[var3] = (this.field3422[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3422[var3] = (this.field3422[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5753(var3);
         }

         if (var4 == 121) {
            this.method5788(var3);
         }

         if (var4 == 123) {
            this.method5755(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3422[var3];
            if (var6 == 16384) {
               this.field3423[var3] = (var5 << 7) + (this.field3423[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3422[var3];
            if (var6 == 16384) {
               this.field3423[var3] = var5 + (this.field3423[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3424[var3] = var5 + (this.field3424[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3421;
               var10000[var3] |= 4;
            } else {
               this.method5813(var3);
               var10000 = this.field3421;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5760(var3, (var5 << 7) + (this.field3425[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5760(var3, var5 + (this.field3425[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5834(var3, var4 + this.field3417[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5751(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5756(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5814();
         }
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "37"
   )
   void method5760(int var1, int var2) {
      this.field3425[var1] = var2;
      this.field3430[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(Lma;B)I",
      garbageValue = "1"
   )
   int method5761(MusicPatchNode var1) {
      int var2 = (var1.field3484 * var1.field3485 >> 12) + var1.field3491;
      var2 += (this.field3418[var1.field3490] - 8192) * this.field3423[var1.field3490] >> 12;
      MusicPatchNode2 var3 = var1.field3498;
      int var4;
      if (var3.field3372 > 0 && (var3.field3378 > 0 || this.field3414[var1.field3490] > 0)) {
         var4 = var3.field3378 << 2;
         int var5 = var3.field3377 << 1;
         if (var1.field3493 < var5) {
            var4 = var4 * var1.field3493 / var5;
         }

         var4 += this.field3414[var1.field3490] >> 7;
         double var6 = Math.sin((double)(var1.field3492 & 511) * 0.01227184630308513);
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, (double)var2 * 3.255208333333333E-4) / (double)PcmPlayer.field291 + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Lma;I)I",
      garbageValue = "-305726576"
   )
   int method5762(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3498;
      int var3 = this.field3412[var1.field3490] * this.field3431[var1.field3490] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3481 + 16384 >> 15;
      var3 = var3 * this.field3410 + 128 >> 8;
      if (var2.field3373 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var2.field3373 * 1.953125E-5 * (double)var1.field3486) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3374 != null) {
         var4 = var1.field3487;
         var5 = var2.field3374[var1.field3488 * 4 + 1];
         if (var1.field3488 * 4 < var2.field3374.length - 2) {
            var6 = (var2.field3374[var1.field3488 * 4] & 255) << 8;
            var7 = (var2.field3374[var1.field3488 * 4 + 2] & 255) << 8;
            var5 += (var2.field3374[var1.field3488 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if (var1.field3489 > 0 && var2.field3381 != null) {
         var4 = var1.field3489;
         var5 = var2.field3381[var1.field3495 * 4 + 1];
         if (var1.field3495 * 4 < var2.field3381.length - 2) {
            var6 = (var2.field3381[var1.field3495 * 4] & 255) << 8;
            var7 = (var2.field3381[var1.field3495 * 4 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3381[var1.field3495 * 4 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Lma;B)I",
      garbageValue = "9"
   )
   int method5763(MusicPatchNode var1) {
      int var2 = this.field3427[var1.field3490];
      return var2 < 8192 ? var2 * var1.field3482 + 32 >> 6 : 16384 - ((128 - var1.field3482) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method5807() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3434; var2 == this.trackLength; var3 = this.midiFile.method5877(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3411 || var2 == 0) {
                     this.method5814();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5759(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3434 = var3;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Lma;I)Z",
      garbageValue = "1497880317"
   )
   boolean method5770(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3489 >= 0) {
            var1.remove();
            if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) {
               this.field3428[var1.field3490][var1.field3479] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Lma;[IIIB)Z",
      garbageValue = "-28"
   )
   boolean method5771(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3494 = PcmPlayer.field291 / 100;
      if (var1.field3489 < 0 || var1.stream != null && !var1.stream.method951()) {
         int var5 = var1.field3485;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, (double)this.field3420[var1.field3490] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3485 = var5;
         }

         var1.stream.method864(this.method5761(var1));
         MusicPatchNode2 var6 = var1.field3498;
         boolean var7 = false;
         ++var1.field3493;
         var1.field3492 += var6.field3372;
         double var8 = (double)((var1.field3480 - 60 << 8) + (var1.field3485 * var1.field3484 >> 12)) * 5.086263020833333E-6;
         if (var6.field3373 > 0) {
            if (var6.field3379 > 0) {
               var1.field3486 += (int)(128.0 * Math.pow(2.0, (double)var6.field3379 * var8) + 0.5);
            } else {
               var1.field3486 += 128;
            }
         }

         if (var6.field3374 != null) {
            if (var6.field3375 > 0) {
               var1.field3487 += (int)(128.0 * Math.pow(2.0, (double)var6.field3375 * var8) + 0.5);
            } else {
               var1.field3487 += 128;
            }

            while(var1.field3488 * 4 < var6.field3374.length - 2 && var1.field3487 > (var6.field3374[var1.field3488 * 4 + 2] & 255) << 8) {
               var1.field3488 = var1.field3488 * 4 + 2;
            }

            if (var1.field3488 * 4 == var6.field3374.length - 2 && var6.field3374[var1.field3488 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3489 >= 0 && var6.field3381 != null && (this.field3421[var1.field3490] & 1) == 0 && (var1.field3479 < 0 || var1 != this.field3428[var1.field3490][var1.field3479])) {
            if (var6.field3376 > 0) {
               var1.field3489 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3376) + 0.5);
            } else {
               var1.field3489 += 128;
            }

            while(var1.field3495 * 4 < var6.field3381.length - 2 && var1.field3489 > (var6.field3381[var1.field3495 * 4 + 2] & 255) << 8) {
               var1.field3495 = var1.field3495 * 4 + 2;
            }

            if (var1.field3495 * 4 == var6.field3381.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method863(var1.field3494);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method944()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5948();
            if (var1.field3489 >= 0) {
               var1.remove();
               if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) {
                  this.field3428[var1.field3490][var1.field3479] = null;
               }
            }

            return true;
         } else {
            var1.stream.method862(var1.field3494, this.method5762(var1), this.method5763(var1));
            return false;
         }
      } else {
         var1.method5948();
         var1.remove();
         if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) {
            this.field3428[var1.field3490][var1.field3479] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1033246315"
   )
   static int method5848(int var0, Script var1, boolean var2) {
      return 2;
   }
}
