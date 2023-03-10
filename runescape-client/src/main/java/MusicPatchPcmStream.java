import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive15")
   static Archive archive15;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lbc;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Llz;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Llp;[IIIII)V",
      garbageValue = "527103595"
   )
   void method5719(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field3350[var1.field3417] & 4) != 0 && var1.field3413 < 0) {
         int var6 = this.superStream.field3351[var1.field3417] / PcmPlayer.field292;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3410) / var6;
            if (var7 > var4) {
               var1.field3410 += var4 * var6;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3410 += var7 * var6 - 1048576;
            int var8 = PcmPlayer.field292 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field3353[var1.field3417] == 0) {
               var1.stream = RawPcmStream.method866(var1.rawSound, var10.method881(), var10.method872(), var10.method928());
            } else {
               var1.stream = RawPcmStream.method866(var1.rawSound, var10.method881(), 0, var10.method928());
               this.superStream.method5593(var1, var1.patch.field3379[var1.field3401] < 0);
               var1.stream.method877(var8, var10.method872());
            }

            if (var1.patch.field3379[var1.field3401] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method879(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method1018()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Llp;II)V",
      garbageValue = "-1330466061"
   )
   void method5704(MusicPatchNode var1, int var2) {
      if ((this.superStream.field3350[var1.field3417] & 4) != 0 && var1.field3413 < 0) {
         int var3 = this.superStream.field3351[var1.field3417] / PcmPlayer.field292;
         int var4 = (var3 + 1048575 - var1.field3410) / var3;
         var1.field3410 = var3 * var2 + var1.field3410 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field3353[var1.field3417] == 0) {
               var1.stream = RawPcmStream.method866(var1.rawSound, var1.stream.method881(), var1.stream.method872(), var1.stream.method928());
            } else {
               var1.stream = RawPcmStream.method866(var1.rawSound, var1.stream.method881(), 0, var1.stream.method928());
               this.superStream.method5593(var1, var1.patch.field3379[var1.field3401] < 0);
            }

            if (var1.patch.field3379[var1.field3401] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field3410 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedName("aq")
   protected int vmethod5700() {
      return 0;
   }

   @ObfuscatedName("ap")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5556(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3415) {
                  this.method5719(var6, var1, var4, var5, var4 + var5);
                  var6.field3415 -= var5;
                  break;
               }

               this.method5719(var6, var1, var4, var6.field3415, var5 + var4);
               var4 += var6.field3415;
               var5 -= var6.field3415;
            } while(!this.superStream.method5557(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("ak")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5556(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3415) {
                  this.method5704(var3, var2);
                  var3.field3415 -= var2;
                  break;
               }

               this.method5704(var3, var3.field3415);
               var2 -= var3.field3415;
            } while(!this.superStream.method5557(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-338349699"
   )
   @Export("isCharPrintable")
   public static boolean isCharPrintable(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
