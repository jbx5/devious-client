import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("vo")
   @ObfuscatedSignature(
      descriptor = "Lpv;"
   )
   @Export("masterDisk")
   static ArchiveDisk masterDisk;
   @ObfuscatedName("uo")
   @ObfuscatedGetter(
      intValue = -1282789779
   )
   static int field3361;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1964431473
   )
   int field3335 = 256;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -346441309
   )
   int field3336 = 1000000;
   @ObfuscatedName("ab")
   int[] field3337 = new int[16];
   @ObfuscatedName("an")
   int[] field3352 = new int[16];
   @ObfuscatedName("ao")
   int[] field3339 = new int[16];
   @ObfuscatedName("av")
   int[] field3340 = new int[16];
   @ObfuscatedName("aq")
   int[] field3341 = new int[16];
   @ObfuscatedName("ap")
   int[] field3334 = new int[16];
   @ObfuscatedName("ar")
   int[] field3343 = new int[16];
   @ObfuscatedName("ak")
   int[] field3360 = new int[16];
   @ObfuscatedName("ax")
   int[] field3338 = new int[16];
   @ObfuscatedName("at")
   int[] field3350 = new int[16];
   @ObfuscatedName("af")
   int[] field3347 = new int[16];
   @ObfuscatedName("ai")
   int[] field3348 = new int[16];
   @ObfuscatedName("aw")
   int[] field3353 = new int[16];
   @ObfuscatedName("aa")
   int[] field3342 = new int[16];
   @ObfuscatedName("ah")
   int[] field3351 = new int[16];
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "[[Llp;"
   )
   MusicPatchNode[][] field3356 = new MusicPatchNode[16][128];
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "[[Llp;"
   )
   MusicPatchNode[][] field3349 = new MusicPatchNode[16][128];
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("bo")
   boolean field3355;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 873878831
   )
   @Export("track")
   int track;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1308416127
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      longValue = -1406500278912290481L
   )
   long field3358;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      longValue = 3417130340268019577L
   )
   long field3359;
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method5542();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2026232471"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field3335 = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1058020738"
   )
   public int method5526() {
      return this.field3335;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Llh;Lne;Lbb;II)Z",
      garbageValue = "-1261281110"
   )
   @Export("loadMusicTrack")
   synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method5724();
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

         if (!var9.method5693(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.clear();
      }

      return var5;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1680529445"
   )
   @Export("clearAll")
   synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1951099218"
   )
   @Export("removeAll")
   public synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("aq")
   protected synchronized int vmethod5700() {
      return 0;
   }

   @ObfuscatedName("ap")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field3336 * -727379968 / PcmPlayer.field292;

         do {
            long var5 = this.field3358 + (long)var4 * (long)var3;
            if (this.field3359 - var5 >= 0L) {
               this.field3358 = var5;
               break;
            }

            int var7 = (int)((this.field3359 - this.field3358 + (long)var4 - 1L) / (long)var4);
            this.field3358 += (long)var4 * (long)var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5555();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Llh;ZB)V",
      garbageValue = "-41"
   )
   @Export("setMusicTrack")
   synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field3355 = var2;
      this.field3358 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field3359 = this.midiFile.method5655(this.trackLength);
   }

   @ObfuscatedName("ak")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field3336 * -727379968 / PcmPlayer.field292;

         do {
            long var3 = this.field3358 + (long)var1 * (long)var2;
            if (this.field3359 - var3 >= 0L) {
               this.field3358 = var3;
               break;
            }

            int var5 = (int)((this.field3359 - this.field3358 + (long)var2 - 1L) / (long)var2);
            this.field3358 += (long)var5 * (long)var2;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method5555();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1515299645"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method5542();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "16"
   )
   @Export("isReady")
   public synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1455017401"
   )
   public synchronized void method5530(int var1, int var2) {
      this.method5531(var1, var2);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-6"
   )
   void method5531(int var1, int var2) {
      this.field3340[var1] = var2;
      this.field3334[var1] = var2 & -128;
      this.method5611(var1, var2);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "1"
   )
   void method5611(int var1, int var2) {
      if (var2 != this.field3341[var1]) {
         this.field3341[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field3349[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-164791979"
   )
   void method5637(int var1, int var2, int var3) {
      this.method5533(var1, var2, 64);
      if ((this.field3350[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field3417 == var1 && var4.field3413 < 0) {
               this.field3356[var1][var4.field3401] = null;
               this.field3356[var1][var2] = var4;
               int var8 = (var4.field3406 * var4.field3405 >> 12) + var4.field3404;
               var4.field3404 += var2 - var4.field3401 << 8;
               var4.field3405 = var8 - var4.field3404;
               var4.field3406 = 4096;
               var4.field3401 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3341[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field3417 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field3399 = var9.field3378[var2];
            var6.field3396 = var9.field3382[var2];
            var6.field3401 = var2;
            var6.field3416 = var3 * var3 * var9.field3383[var2] * var9.field3381 + 1024 >> 11;
            var6.field3403 = var9.field3380[var2] & 255;
            var6.field3404 = (var2 << 8) - (var9.field3379[var2] & 32767);
            var6.field3402 = 0;
            var6.field3408 = 0;
            var6.field3409 = 0;
            var6.field3413 = -1;
            var6.field3411 = 0;
            if (this.field3353[var1] == 0) {
               var6.stream = RawPcmStream.method866(var5, this.method5547(var6), this.method5548(var6), this.method5549(var6));
            } else {
               var6.stream = RawPcmStream.method866(var5, this.method5547(var6), 0, this.method5549(var6));
               this.method5593(var6, var9.field3379[var2] < 0);
            }

            if (var9.field3379[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field3396 >= 0) {
               MusicPatchNode var7 = this.field3349[var1][var6.field3396];
               if (var7 != null && var7.field3413 < 0) {
                  this.field3356[var1][var7.field3401] = null;
                  var7.field3413 = 0;
               }

               this.field3349[var1][var6.field3396] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field3356[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Llp;ZB)V",
      garbageValue = "109"
   )
   void method5593(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field269) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)var5 * (long)this.field3353[var1.field3417] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method875();
         }
      } else {
         var4 = (int)((long)this.field3353[var1.field3417] * (long)var3 >> 6);
      }

      var1.stream.method964(var4);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "2075556238"
   )
   void method5533(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field3356[var1][var2];
      if (var4 != null) {
         this.field3356[var1][var2] = null;
         if ((this.field3350[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field3417 == var5.field3417 && var5.field3413 < 0 && var4 != var5) {
                  var4.field3413 = 0;
                  break;
               }
            }
         } else {
            var4.field3413 = 0;
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2110724161"
   )
   void method5536(int var1, int var2, int var3) {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "-11303"
   )
   void method5537(int var1, int var2) {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1657999339"
   )
   void method5538(int var1, int var2) {
      this.field3343[var1] = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-23831"
   )
   void method5535(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field3417 == var1) {
            if (var2.stream != null) {
               var2.stream.method879(PcmPlayer.field292 / 100);
               if (var2.stream.method1018()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method5736();
            }

            if (var2.field3413 < 0) {
               this.field3356[var2.field3417][var2.field3401] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-569264191"
   )
   void method5588(int var1) {
      if (var1 >= 0) {
         this.field3337[var1] = 12800;
         this.field3352[var1] = 8192;
         this.field3339[var1] = 16383;
         this.field3343[var1] = 8192;
         this.field3360[var1] = 0;
         this.field3338[var1] = 8192;
         this.method5570(var1);
         this.method5544(var1);
         this.field3350[var1] = 0;
         this.field3347[var1] = 32767;
         this.field3348[var1] = 256;
         this.field3353[var1] = 0;
         this.method5546(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5588(var1);
         }

      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1716555008"
   )
   void method5534(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field3417 == var1) && var2.field3413 < 0) {
            this.field3356[var2.field3417][var2.field3401] = null;
            var2.field3413 = 0;
         }
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-434781812"
   )
   void method5542() {
      this.method5535(-1);
      this.method5588(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field3341[var1] = this.field3340[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field3334[var1] = this.field3340[var1] & -128;
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "45"
   )
   void method5570(int var1) {
      if ((this.field3350[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3417 == var1 && this.field3356[var1][var2.field3401] == null && var2.field3413 < 0) {
               var2.field3413 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1624323475"
   )
   void method5544(int var1) {
      if ((this.field3350[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field3417 == var1) {
               var2.field3410 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "25010659"
   )
   void method5545(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5533(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method5637(var3, var4, var5);
         } else {
            this.method5533(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method5536(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field3334[var3] = (var5 << 14) + (this.field3334[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field3334[var3] = (var5 << 7) + (this.field3334[var3] & -16257);
         }

         if (var4 == 1) {
            this.field3360[var3] = (var5 << 7) + (this.field3360[var3] & -16257);
         }

         if (var4 == 33) {
            this.field3360[var3] = var5 + (this.field3360[var3] & -128);
         }

         if (var4 == 5) {
            this.field3338[var3] = (var5 << 7) + (this.field3338[var3] & -16257);
         }

         if (var4 == 37) {
            this.field3338[var3] = var5 + (this.field3338[var3] & -128);
         }

         if (var4 == 7) {
            this.field3337[var3] = (var5 << 7) + (this.field3337[var3] & -16257);
         }

         if (var4 == 39) {
            this.field3337[var3] = var5 + (this.field3337[var3] & -128);
         }

         if (var4 == 10) {
            this.field3352[var3] = (var5 << 7) + (this.field3352[var3] & -16257);
         }

         if (var4 == 42) {
            this.field3352[var3] = var5 + (this.field3352[var3] & -128);
         }

         if (var4 == 11) {
            this.field3339[var3] = (var5 << 7) + (this.field3339[var3] & -16257);
         }

         if (var4 == 43) {
            this.field3339[var3] = var5 + (this.field3339[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.field3350;
               var10000[var3] |= 1;
            } else {
               var10000 = this.field3350;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.field3350;
               var10000[var3] |= 2;
            } else {
               this.method5570(var3);
               var10000 = this.field3350;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field3347[var3] = (var5 << 7) + (this.field3347[var3] & 127);
         }

         if (var4 == 98) {
            this.field3347[var3] = (this.field3347[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field3347[var3] = (var5 << 7) + (this.field3347[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field3347[var3] = (this.field3347[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method5535(var3);
         }

         if (var4 == 121) {
            this.method5588(var3);
         }

         if (var4 == 123) {
            this.method5534(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field3347[var3];
            if (var6 == 16384) {
               this.field3348[var3] = (var5 << 7) + (this.field3348[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field3347[var3];
            if (var6 == 16384) {
               this.field3348[var3] = var5 + (this.field3348[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field3353[var3] = (var5 << 7) + (this.field3353[var3] & -16257);
         }

         if (var4 == 48) {
            this.field3353[var3] = var5 + (this.field3353[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               var10000 = this.field3350;
               var10000[var3] |= 4;
            } else {
               this.method5544(var3);
               var10000 = this.field3350;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method5546(var3, (var5 << 7) + (this.field3342[var3] & -16257));
         }

         if (var4 == 49) {
            this.method5546(var3, var5 + (this.field3342[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5611(var3, var4 + this.field3334[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method5537(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5538(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method5542();
         }
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "0"
   )
   void method5546(int var1, int var2) {
      this.field3342[var1] = var2;
      this.field3351[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Llp;B)I",
      garbageValue = "0"
   )
   int method5547(MusicPatchNode var1) {
      int var2 = (var1.field3405 * var1.field3406 >> 12) + var1.field3404;
      var2 += (this.field3343[var1.field3417] - 8192) * this.field3348[var1.field3417] >> 12;
      MusicPatchNode2 var3 = var1.field3399;
      int var4;
      if (var3.field3313 > 0 && (var3.field3320 > 0 || this.field3360[var1.field3417] > 0)) {
         var4 = var3.field3320 << 2;
         int var5 = var3.field3317 << 1;
         if (var1.field3412 < var5) {
            var4 = var4 * var1.field3412 / var5;
         }

         var4 += this.field3360[var1.field3417] >> 7;
         double var6 = Math.sin(0.01227184630308513 * (double)(var1.field3400 & 511));
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0, (double)var2 * 3.255208333333333E-4) / (double)PcmPlayer.field292 + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Llp;B)I",
      garbageValue = "0"
   )
   int method5548(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field3399;
      int var3 = this.field3339[var1.field3417] * this.field3337[var1.field3417] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field3416 + 16384 >> 15;
      var3 = var3 * this.field3335 + 128 >> 8;
      if (var2.field3315 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)var2.field3315 * 1.953125E-5 * (double)var1.field3402) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field3319 != null) {
         var4 = var1.field3408;
         var5 = var2.field3319[var1.field3409 * 4 + 1];
         if (var1.field3409 * 4 < var2.field3319.length - 2) {
            var6 = (var2.field3319[var1.field3409 * 4] & 255) << 8;
            var7 = (var2.field3319[var1.field3409 * 4 + 2] & 255) << 8;
            var5 += (var2.field3319[var1.field3409 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field3413 > 0 && var2.field3314 != null) {
         var4 = var1.field3413;
         var5 = var2.field3314[var1.field3411 * 4 + 1];
         if (var1.field3411 * 4 < var2.field3314.length - 2) {
            var6 = (var2.field3314[var1.field3411 * 4] & 255) << 8;
            var7 = (var2.field3314[var1.field3411 * 4 + 2] & 255) << 8;
            var5 += (var2.field3314[var1.field3411 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Llp;I)I",
      garbageValue = "-1478359391"
   )
   int method5549(MusicPatchNode var1) {
      int var2 = this.field3352[var1.field3417];
      return var2 < 8192 ? var2 * var1.field3403 + 32 >> 6 : 16384 - ((128 - var1.field3403) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "1307"
   )
   void method5555() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field3359; var2 == this.trackLength; var3 = this.midiFile.method5655(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field3355 || var2 == 0) {
                     this.method5542();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method5545(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field3359 = var3;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Llp;I)Z",
      garbageValue = "-561025908"
   )
   boolean method5556(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field3413 >= 0) {
            var1.remove();
            if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) {
               this.field3349[var1.field3417][var1.field3396] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Llp;[IIII)Z",
      garbageValue = "-189241326"
   )
   boolean method5557(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field3415 = PcmPlayer.field292 / 100;
      if (var1.field3413 < 0 || var1.stream != null && !var1.stream.method923()) {
         int var5 = var1.field3406;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * (double)this.field3338[var1.field3417]) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field3406 = var5;
         }

         var1.stream.method880(this.method5547(var1));
         MusicPatchNode2 var6 = var1.field3399;
         boolean var7 = false;
         ++var1.field3412;
         var1.field3400 += var6.field3313;
         double var8 = 5.086263020833333E-6 * (double)((var1.field3401 - 60 << 8) + (var1.field3405 * var1.field3406 >> 12));
         if (var6.field3315 > 0) {
            if (var6.field3318 > 0) {
               var1.field3402 = var1.field3402 * -1797767168 + (int)(128.0 * Math.pow(2.0, (double)var6.field3318 * var8) + 0.5) * -1797767168;
            } else {
               var1.field3402 = var1.field3402 * -1797767168 + 1814036480;
            }
         }

         if (var6.field3319 != null) {
            if (var6.field3316 > 0) {
               var1.field3408 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3316) + 0.5);
            } else {
               var1.field3408 += 128;
            }

            while(var1.field3409 * 4 < var6.field3319.length - 2 && var1.field3408 > (var6.field3319[var1.field3409 * 4 + 2] & 255) << 8) {
               var1.field3409 = var1.field3409 * 4 + 2;
            }

            if (var1.field3409 * 4 == var6.field3319.length - 2 && var6.field3319[var1.field3409 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field3413 >= 0 && var6.field3314 != null && (this.field3350[var1.field3417] & 1) == 0 && (var1.field3396 < 0 || var1 != this.field3349[var1.field3417][var1.field3396])) {
            if (var6.field3321 > 0) {
               var1.field3413 += (int)(128.0 * Math.pow(2.0, var8 * (double)var6.field3321) + 0.5);
            } else {
               var1.field3413 += 128;
            }

            while(var1.field3411 * 4 < var6.field3314.length - 2 && var1.field3413 > (var6.field3314[var1.field3411 * 4 + 2] & 255) << 8) {
               var1.field3411 = var1.field3411 * 4 + 2;
            }

            if (var1.field3411 * 4 == var6.field3314.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method879(var1.field3415);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method1018()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method5736();
            if (var1.field3413 >= 0) {
               var1.remove();
               if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) {
                  this.field3349[var1.field3417][var1.field3396] = null;
               }
            }

            return true;
         } else {
            var1.stream.method878(var1.field3415, this.method5548(var1), this.method5549(var1));
            return false;
         }
      } else {
         var1.method5736();
         var1.remove();
         if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) {
            this.field3349[var1.field3417][var1.field3396] = null;
         }

         return true;
      }
   }
}
