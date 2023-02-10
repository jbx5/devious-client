import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lay;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Lky;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lkv;[IIIIB)V",
      garbageValue = "26"
   )
   void method5795(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field3375[var1.field3436] & 4) != 0 && var1.field3440 < 0) {
         int var6 = this.superStream.field3373[var1.field3436] / class284.field3321;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3446) / var6;
            if (var7 > var4) {
               var1.field3446 += var4 * var6;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3446 += var7 * var6 - 1048576;
            int var8 = class284.field3321 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field3384[var1.field3436] == 0) {
               var1.stream = RawPcmStream.method913(var1.rawSound, var10.method979(), var10.method888(), var10.method933());
            } else {
               var1.stream = RawPcmStream.method913(var1.rawSound, var10.method979(), 0, var10.method933());
               this.superStream.method5659(var1, var1.patch.field3418[var1.field3431] < 0);
               var1.stream.method893(var8, var10.method888());
            }

            if (var1.patch.field3418[var1.field3431] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method895(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method899()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lkv;IB)V",
      garbageValue = "0"
   )
   void method5796(MusicPatchNode var1, int var2) {
      if ((this.superStream.field3375[var1.field3436] & 4) != 0 && var1.field3440 < 0) {
         int var3 = this.superStream.field3373[var1.field3436] / class284.field3321;
         int var4 = (var3 + 1048575 - var1.field3446) / var3;
         var1.field3446 = var3 * var2 + var1.field3446 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field3384[var1.field3436] == 0) {
               var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method979(), var1.stream.method888(), var1.stream.method933());
            } else {
               var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method979(), 0, var1.stream.method933());
               this.superStream.method5659(var1, var1.patch.field3418[var1.field3431] < 0);
            }

            if (var1.patch.field3418[var1.field3431] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field3446 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
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

   @ObfuscatedName("n")
   protected int vmethod5793() {
      return 0;
   }

   @ObfuscatedName("l")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5648(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3445) {
                  this.method5795(var6, var1, var4, var5, var4 + var5);
                  var6.field3445 -= var5;
                  break;
               }

               this.method5795(var6, var1, var4, var6.field3445, var4 + var5);
               var4 += var6.field3445;
               var5 -= var6.field3445;
            } while(!this.superStream.method5626(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("c")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5648(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3445) {
                  this.method5796(var3, var2);
                  var3.field3445 -= var2;
                  break;
               }

               this.method5796(var3, var3.field3445);
               var2 -= var3.field3445;
            } while(!this.superStream.method5626(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "1425861786"
   )
   @Export("setViewportShape")
   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = Client.field773;
      } else if (var5 >= 100) {
         var6 = Client.field774;
      } else {
         var6 = (Client.field774 - Client.field773) * var5 / 100 + Client.field773;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var10;
      if (var7 < Client.field779) {
         var10 = Client.field779;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field778) {
            var6 = Client.field778;
            var8 = var3 * var6 * 512 / (var10 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field780) {
         var10 = Client.field780;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field763) {
            var6 = Client.field763;
            var8 = var10 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      Client.viewportZoom = var3 * var6 / 334;
      if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
         class174.method3525(var2, var3);
      }

      Client.viewportOffsetX = var0;
      Client.viewportOffsetY = var1;
      Client.viewportWidth = var2;
      Client.viewportHeight = var3;
   }
}
