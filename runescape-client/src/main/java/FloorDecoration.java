import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 928393193
   )
   @Export("gameCyclesToDo")
   static int gameCyclesToDo;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -627434731
   )
   @Export("z")
   int z;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2034286499
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2003533247
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 8575640378544341353L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1065531589
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }

   @ObfuscatedName("j")
   public static int method4136(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "126"
   )
   static void method4135(int var0, int var1) {
      if (BufferedSink.clientPreferences.method2391() != 0 && var0 != -1) {
         class18.method266(class7.field32, var0, 0, BufferedSink.clientPreferences.method2391(), false);
         Client.playingJingle = true;
      }

   }

   @ObfuscatedName("kc")
   static final void method4134(double var0) {
      Rasterizer3D.Rasterizer3D_setBrightness(var0);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
      class34.method503();
      BufferedSink.clientPreferences.method2389(var0);
   }
}
