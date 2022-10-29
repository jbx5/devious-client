import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("i")
   @Export("Widget_loadedInterfaces")
   public static boolean[] Widget_loadedInterfaces;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("Widget_spritesArchive")
   public static AbstractArchive Widget_spritesArchive;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljr;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lal;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Ljr;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lkj;[IIIII)V",
      garbageValue = "949061797"
   )
   void method5644(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field3310[var1.field3361] & 4) != 0 && var1.field3373 < 0) {
         int var6 = this.superStream.field3315[var1.field3361] / SoundCache.field337;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3362) / var6;
            if (var7 > var4) {
               var1.field3362 += var6 * var4;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3362 += var6 * var7 - 1048576;
            int var8 = SoundCache.field337 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field3325[var1.field3361] == 0) {
               var1.stream = RawPcmStream.method889(var1.rawSound, var10.method904(), var10.method935(), var10.method896());
            } else {
               var1.stream = RawPcmStream.method889(var1.rawSound, var10.method904(), 0, var10.method896());
               this.superStream.method5579(var1, var1.patch.field3343[var1.field3364] < 0);
               var1.stream.method900(var8, var10.method935());
            }

            if (var1.patch.field3343[var1.field3364] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method893(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method895()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lkj;IS)V",
      garbageValue = "7996"
   )
   void method5657(MusicPatchNode var1, int var2) {
      if ((this.superStream.field3310[var1.field3361] & 4) != 0 && var1.field3373 < 0) {
         int var3 = this.superStream.field3315[var1.field3361] / SoundCache.field337;
         int var4 = (var3 + 1048575 - var1.field3362) / var3;
         var1.field3362 = var3 * var2 + var1.field3362 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field3325[var1.field3361] == 0) {
               var1.stream = RawPcmStream.method889(var1.rawSound, var1.stream.method904(), var1.stream.method935(), var1.stream.method896());
            } else {
               var1.stream = RawPcmStream.method889(var1.rawSound, var1.stream.method904(), 0, var1.stream.method896());
               this.superStream.method5579(var1, var1.patch.field3343[var1.field3364] < 0);
            }

            if (var1.patch.field3343[var1.field3364] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field3362 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
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

   @ObfuscatedName("d")
   protected int vmethod5648() {
      return 0;
   }

   @ObfuscatedName("n")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5486(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3378) {
                  this.method5644(var6, var1, var4, var5, var4 + var5);
                  var6.field3378 -= var5;
                  break;
               }

               this.method5644(var6, var1, var4, var6.field3378, var4 + var5);
               var4 += var6.field3378;
               var5 -= var6.field3378;
            } while(!this.superStream.method5487(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("l")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5486(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3378) {
                  this.method5657(var3, var2);
                  var3.field3378 -= var2;
                  break;
               }

               this.method5657(var3, var3.field3378);
               var2 -= var3.field3378;
            } while(!this.superStream.method5487(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-19"
   )
   public static void method5658() {
      Widget.Widget_cachedSprites.clear();
      Widget.Widget_cachedModels.clear();
      Widget.Widget_cachedFonts.clear();
      Widget.Widget_cachedSpriteMasks.clear();
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1219857711"
   )
   public static boolean method5654() {
      return Client.clickedWidget != null;
   }
}
