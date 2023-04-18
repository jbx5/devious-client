import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1380277371
   )
   int field3416 = 256;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 437930689
   )
   int field3394 = 1000000;
   @ObfuscatedName("ac")
   int[] field3403 = new int[16];
   @ObfuscatedName("au")
   int[] field3411 = new int[16];
   @ObfuscatedName("ab")
   int[] field3397 = new int[16];
   @ObfuscatedName("aq")
   int[] field3398 = new int[16];
   @ObfuscatedName("al")
   int[] field3404 = new int[16];
   @ObfuscatedName("at")
   int[] field3400 = new int[16];
   @ObfuscatedName("aa")
   int[] field3401 = new int[16];
   @ObfuscatedName("ay")
   int[] field3399 = new int[16];
   @ObfuscatedName("ao")
   int[] field3420 = new int[16];
   @ObfuscatedName("as")
   int[] field3405 = new int[16];
   @ObfuscatedName("aj")
   int[] field3406 = new int[16];
   @ObfuscatedName("ak")
   int[] field3395 = new int[16];
   @ObfuscatedName("az")
   int[] field3408 = new int[16];
   @ObfuscatedName("ad")
   int[] field3409 = new int[16];
   @ObfuscatedName("ae")
   int[] field3410 = new int[16];
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "[[Llq;"
   )
   MusicPatchNode[][] field3392 = new MusicPatchNode[16][128];
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "[[Llq;"
   )
   MusicPatchNode[][] field3412 = new MusicPatchNode[16][128];
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("bi")
   boolean field3419;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -2130330853
   )
   @Export("track")
   int track;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 2049666181
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      longValue = 8370013022464380265L
   )
   long field3417;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      longValue = -8691691867109044431L
   )
   long field3396;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method5784();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "19"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field3416 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "29"
   )
   public int method5867() {
      return this.field3416;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lld;Lnm;Lba;II)Z",
      garbageValue = "-1174424990"
   )
   @Export("loadMusicTrack")
   public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method5971();
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

         if (!var9.method5937(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.clear();
      }

      return var5;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-371554309"
   )
   @Export("clearAll")
   public synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "34803635"
   )
   @Export("removeAll")
   public synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("al")
   protected synchronized int vmethod5949() {
      return 0;
   }

   @ObfuscatedName("at")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3394 * -727379968 / (PcmPlayer.field306 * 586337296);

         do {
            long var5 = (long)var3 * (long)var4 + this.field3417;
            if (this.field3396 - var5 >= 0L) {
               this.field3417 = var5;
               break;
            }

            int var7 = (int)((this.field3396 - this.field3417 + (long)var4 - 1L) / (long)var4);
            this.field3417 += (long)var4 * (long)var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5797();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lld;ZI)V",
      garbageValue = "-972368442"
   )
   @Export("setMusicTrack")
   public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3419 = var2;
      this.field3417 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3396 = this.midiFile.method5903(this.trackLength);
   }

   @ObfuscatedName("ay")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3394 * -727379968 / (PcmPlayer.field306 * 586337296);

         do {
            long var3 = this.field3417 + (long)var2 * (long)var1;
            if (this.field3396 - var3 >= 0L) {
               this.field3417 = var3;
               break;
            }

            int var5 = (int)((this.field3396 - this.field3417 + (long)var2 - 1L) / (long)var2);
            this.field3417 += (long)var5 * (long)var2;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5797();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "4"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method5784();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1577692860"
   )
   @Export("isReady")
   public synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-114"
   )
   public synchronized void method5772(int var1, int var2) {
      this.method5773(var1, var2);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-22"
   )
   void method5773(int var1, int var2) {
      this.field3398[var1] = var2;
      this.field3400[var1] = var2 & -128;
      this.method5839(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1627005536"
   )
   void method5839(int var1, int var2) {
      if (var2 != this.field3404[var1]) {
         this.field3404[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3412[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1380723164"
   )
   void method5775(int var1, int var2, int var3) {
      this.method5777(var1, var2, 64);
      if ((this.field3405[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3467 == var1 && var4.field3464 < 0) {
               this.field3392[var1][var4.field3454] = null;
               this.field3392[var1][var2] = var4;
               int var8 = (var4.field3459 * var4.field3458 >> 12) + var4.field3470;
               var4.field3470 += var2 - var4.field3454 << 8;
               var4.field3458 = var8 - var4.field3470;
               var4.field3459 = 4096;
               var4.field3454 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3404[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field3467 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field3452 = var9.field3440[var2];
            var6.field3450 = var9.field3441[var2];
            var6.field3454 = var2;
            var6.field3455 = var3 * var3 * var9.field3438[var2] * var9.field3437 + 1024 >> 11;
            var6.field3456 = var9.field3439[var2] & 255;
            var6.field3470 = (var2 << 8) - (var9.field3436[var2] & 32767);
            var6.field3460 = 0;
            var6.field3461 = 0;
            var6.field3468 = 0;
            var6.field3464 = -1;
            var6.field3449 = 0;
            if (this.field3408[var1] == 0) {
               var6.stream = RawPcmStream.method978(var5, this.method5789(var6), this.method5790(var6), this.method5791(var6));
            } else {
               var6.stream = RawPcmStream.method978(var5, this.method5789(var6), 0, this.method5791(var6));
               this.method5805(var6, var9.field3436[var2] < 0);
            }

            if (var9.field3436[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field3450 >= 0) {
               MusicPatchNode var7 = this.field3412[var1][var6.field3450];
               if (var7 != null && var7.field3464 < 0) {
                  this.field3392[var1][var7.field3454] = null;
                  var7.field3464 = 0;
               }

               this.field3412[var1][var6.field3450] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field3392[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Llq;ZI)V",
      garbageValue = "2143076996"
   )
   void method5805(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field280) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)this.field3408[var1.field3467] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method912();
         }
      } else {
         var4 = (int)((long)this.field3408[var1.field3467] * (long)var3 >> 6);
      }

      var1.stream.method911(var4);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "71"
   )
   void method5777(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3392[var1][var2];
      if (var4 != null) {
         this.field3392[var1][var2] = null;
         if ((this.field3405[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var5.field3467 == var4.field3467 && var5.field3464 < 0 && var5 != var4) {
                  var4.field3464 = 0;
                  break;
               }
            }
         } else {
            var4.field3464 = 0;
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-939740093"
   )
   void method5778(int var1, int var2, int var3) {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1736841186"
   )
   void method5846(int var1, int var2) {
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1611025845"
   )
   void method5780(int var1, int var2) {
      this.field3401[var1] = var2;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1037039964"
   )
   void method5781(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3467 == var1) {
            if (var2.stream != null) {
               var2.stream.method916(PcmPlayer.field306 * 586337296 / 100);
               if (var2.stream.method1021()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5986();
            }

            if (var2.field3464 < 0) {
               this.field3392[var2.field3467][var2.field3454] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1613137555"
   )
   void method5782(int var1) {
      if (var1 >= 0) {
         this.field3403[var1] = 12800;
         this.field3411[var1] = 8192;
         this.field3397[var1] = 16383;
         this.field3401[var1] = 8192;
         this.field3399[var1] = 0;
         this.field3420[var1] = 8192;
         this.method5819(var1);
         this.method5786(var1);
         this.field3405[var1] = 0;
         this.field3406[var1] = 32767;
         this.field3395[var1] = 256;
         this.field3408[var1] = 0;
         this.method5788(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5782(var1);
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2058759132"
   )
   void method5765(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3467 == var1) && var2.field3464 < 0) {
            this.field3392[var2.field3467][var2.field3454] = null;
            var2.field3464 = 0;
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-964267539"
   )
   void method5784() {
      this.method5781(-1);
      this.method5782(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3404[var1] = this.field3398[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3400[var1] = this.field3398[var1] & -128;
      }

   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-109"
   )
   void method5819(int var1) {
      if ((this.field3405[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3467 == var1 && this.field3392[var1][var2.field3454] == null && var2.field3464 < 0) {
               var2.field3464 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1437271181"
   )
   void method5786(int var1) {
      if ((this.field3405[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3467 == var1) {
               var2.field3469 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1376449037"
   )
   void method5787(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5777(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5775(var3, var4, var5);
         } else {
            this.method5777(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5778(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3400[var3] = (var5 << 14) + (this.field3400[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3400[var3] = (var5 << 7) + (this.field3400[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3399[var3] = (var5 << 7) + (this.field3399[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3399[var3] = var5 + (this.field3399[var3] & -128);
         }

         if (var4 == 5) {
            this.field3420[var3] = (var5 << 7) + (this.field3420[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3420[var3] = var5 + (this.field3420[var3] & -128);
         }

         if (var4 == 7) {
            this.field3403[var3] = (var5 << 7) + (this.field3403[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3403[var3] = var5 + (this.field3403[var3] & -128);
         }

         if (var4 == 10) {
            this.field3411[var3] = (var5 << 7) + (this.field3411[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3411[var3] = var5 + (this.field3411[var3] & -128);
         }

         if (var4 == 11) {
            this.field3397[var3] = (var5 << 7) + (this.field3397[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3397[var3] = var5 + (this.field3397[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3405;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3405;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3405;
               var10000[var3] |= 2;
            } else {
               this.method5819(var3);
               var10000 = this.field3405;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3406[var3] = (var5 << 7) + (this.field3406[var3] & 127);
         }

         if (var4 == 98) {
            this.field3406[var3] = (this.field3406[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3406[var3] = (var5 << 7) + (this.field3406[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3406[var3] = (this.field3406[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5781(var3);
         }

         if (var4 == 121) {
            this.method5782(var3);
         }

         if (var4 == 123) {
            this.method5765(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3406[var3];
            if (var6 == 16384) {
               this.field3395[var3] = (var5 << 7) + (this.field3395[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3406[var3];
            if (var6 == 16384) {
               this.field3395[var3] = var5 + (this.field3395[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3408[var3] = (var5 << 7) + (this.field3408[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3408[var3] = var5 + (this.field3408[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3405;
               var10000[var3] |= 4;
            } else {
               this.method5786(var3);
               var10000 = this.field3405;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5788(var3, (var5 << 7) + (this.field3409[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5788(var3, var5 + (this.field3409[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5839(var3, var4 + this.field3400[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5846(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5780(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5784();
         }
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1731550836"
   )
   void method5788(int var1, int var2) {
      this.field3409[var1] = var2;
      this.field3410[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Llq;I)I",
      garbageValue = "1667221549"
   )
   int method5789(MusicPatchNode var1) {
      int var2 = (var1.field3458 * var1.field3459 >> 12) + var1.field3470;
      var2 += (this.field3401[var1.field3467] - 8192) * this.field3395[var1.field3467] >> 12;
      MusicPatchNode2 var3 = var1.field3452;
      int var4;
      if (var3.field3380 > 0 && (var3.field3379 > 0 || this.field3399[var1.field3467] > 0)) {
         var4 = var3.field3379 << 2;
         int var5 = var3.field3377 << 1;
         if (var1.field3465 < var5) {
            var4 = var4 * var1.field3465 / var5;
         }

         var4 += this.field3399[var1.field3467] >> 7;
         double var6 = Math.sin(0.01227184630308513 * (double)(var1.field3457 & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, 3.255208333333333E-4 * (double)var2) / (double)(PcmPlayer.field306 * 586337296) + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Llq;I)I",
      garbageValue = "-606314672"
   )
   int method5790(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3452;
      int var3 = this.field3403[var1.field3467] * this.field3397[var1.field3467] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3455 + 16384 >> 15;
      var3 = var3 * this.field3416 + 128 >> 8;
      if (var2.field3375 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var2.field3375 * (double)var1.field3460 * 1.953125E-5) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3374 != null) {
         var4 = var1.field3461;
         var5 = var2.field3374[var1.field3468 * 4 + 1];
         if (var1.field3468 * 4 < var2.field3374.length - 2) {
            var6 = (var2.field3374[var1.field3468 * 4] & 255) << 8;
            var7 = (var2.field3374[var1.field3468 * 4 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field3374[var1.field3468 * 4 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if (var1.field3464 > 0 && var2.field3373 != null) {
         var4 = var1.field3464;
         var5 = var2.field3373[var1.field3449 * 4 + 1];
         if (var1.field3449 * 4 < var2.field3373.length - 2) {
            var6 = (var2.field3373[var1.field3449 * 4] & 255) << 8;
            var7 = (var2.field3373[var1.field3449 * 4 + 2] & 255) << 8;
            var5 += (var2.field3373[var1.field3449 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Llq;I)I",
      garbageValue = "-941309509"
   )
   int method5791(MusicPatchNode var1) {
      int var2 = this.field3411[var1.field3467];
      return var2 < 8192 ? var2 * var1.field3456 + 32 >> 6 : 16384 - ((128 - var1.field3456) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "486029060"
   )
   void method5797() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3396; var2 == this.trackLength; var3 = this.midiFile.method5903(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3419 || var2 == 0) {
                     this.method5784();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5787(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3396 = var3;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Llq;S)Z",
      garbageValue = "3954"
   )
   boolean method5878(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3464 >= 0) {
            var1.remove();
            if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) {
               this.field3412[var1.field3467][var1.field3450] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Llq;[IIII)Z",
      garbageValue = "769270888"
   )
   boolean method5798(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3462 = PcmPlayer.field306 * 586337296 / 100;
      if (var1.field3464 < 0 || var1.stream != null && !var1.stream.method988()) {
         int var5 = var1.field3459;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, (double)this.field3420[var1.field3467] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3459 = var5;
         }

         var1.stream.method917(this.method5789(var1));
         MusicPatchNode2 var6 = var1.field3452;
         boolean var7 = false;
         ++var1.field3465;
         var1.field3457 += var6.field3380;
         double var8 = 5.086263020833333E-6 * (double)((var1.field3454 - 60 << 8) + (var1.field3458 * var1.field3459 >> 12));
         if (var6.field3375 > 0) {
            if (var6.field3378 > 0) {
               var1.field3460 += (int)(128.0 * Math.pow(2.0, (double)var6.field3378 * var8) + 0.5);
            } else {
               var1.field3460 += 128;
            }
         }

         if (var6.field3374 != null) {
            if (var6.field3376 > 0) {
               var1.field3461 += (int)(128.0 * Math.pow(2.0, (double)var6.field3376 * var8) + 0.5);
            } else {
               var1.field3461 += 128;
            }

            while(var1.field3468 * 4 < var6.field3374.length - 2 && var1.field3461 > (var6.field3374[var1.field3468 * 4 + 2] & 255) << 8) {
               var1.field3468 = var1.field3468 * 4 + 2;
            }

            if (var1.field3468 * 4 == var6.field3374.length - 2 && var6.field3374[var1.field3468 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3464 >= 0 && var6.field3373 != null && (this.field3405[var1.field3467] & 1) == 0 && (var1.field3450 < 0 || var1 != this.field3412[var1.field3467][var1.field3450])) {
            if (var6.field3381 > 0) {
               var1.field3464 += (int)(128.0 * Math.pow(2.0, (double)var6.field3381 * var8) + 0.5);
            } else {
               var1.field3464 += 128;
            }

            while(var1.field3449 * 4 < var6.field3373.length - 2 && var1.field3464 > (var6.field3373[var1.field3449 * 4 + 2] & 255) << 8) {
               var1.field3449 = var1.field3449 * 4 + 2;
            }

            if (var1.field3449 * 4 == var6.field3373.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method916(var1.field3462);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method1021()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5986();
            if (var1.field3464 >= 0) {
               var1.remove();
               if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) {
                  this.field3412[var1.field3467][var1.field3450] = null;
               }
            }

            return true;
         } else {
            var1.stream.method915(var1.field3462, this.method5790(var1), this.method5791(var1));
            return false;
         }
      } else {
         var1.method5986();
         var1.remove();
         if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) {
            this.field3412[var1.field3467][var1.field3450] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V",
      garbageValue = "-2144469370"
   )
   public static void method5891(AbstractArchive var0) {
      EnumComposition.EnumDefinition_archive = var0;
   }
}
