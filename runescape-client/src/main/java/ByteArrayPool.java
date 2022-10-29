import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1718281099
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1986520623
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 233896657
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 842882659
   )
   static int field4384 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -642521471
   )
   static int field4385 = 1000;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 580082705
   )
   static int field4386 = 250;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 327199293
   )
   static int field4387 = 100;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1792853587
   )
   static int field4392 = 50;
   @ObfuscatedName("p")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("b")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("o")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("u")
   static byte[][] field4390 = new byte[50][];
   @ObfuscatedName("m")
   public static ArrayList field4393 = new ArrayList();

   static {
      Skills.method6245();
      new HashMap();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "1189793860"
   )
   @Export("ByteArrayPool_getArrayBool")
   static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
      byte[] var4;
      if (var0 != 100) {
         if (var0 < 100) {
         }
      } else if (ByteArrayPool_smallCount > 0) {
         var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
         ByteArrayPool_small[ByteArrayPool_smallCount] = null;
         return var4;
      }

      if (var0 != 5000) {
         if (var0 < 5000) {
         }
      } else if (ByteArrayPool_mediumCount > 0) {
         var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
         ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
         return var4;
      }

      if (var0 != 10000) {
         if (var0 < 10000) {
         }
      } else if (ByteArrayPool_largeCount > 0) {
         var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
         ByteArrayPool_large[ByteArrayPool_largeCount] = null;
         return var4;
      }

      if (var0 != 30000) {
         if (var0 < 30000) {
         }
      } else if (field4384 > 0) {
         var4 = field4390[--field4384];
         field4390[field4384] = null;
         return var4;
      }

      if (class357.ByteArrayPool_arrays != null) {
         for(int var2 = 0; var2 < BoundaryObject.ByteArrayPool_alternativeSizes.length; ++var2) {
            if (BoundaryObject.ByteArrayPool_alternativeSizes[var2] != var0) {
               if (var0 < BoundaryObject.ByteArrayPool_alternativeSizes[var2]) {
               }
            } else if (class239.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
               byte[] var3 = class357.ByteArrayPool_arrays[var2][--class239.ByteArrayPool_altSizeArrayCounts[var2]];
               class357.ByteArrayPool_arrays[var2][class239.ByteArrayPool_altSizeArrayCounts[var2]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;IIB)Lnl;",
      garbageValue = "-62"
   )
   public static Font method7165(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
      byte[] var5 = var0.takeFile(var2, var3);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         class335.SpriteBuffer_decode(var5);
         var4 = true;
      }

      if (!var4) {
         return null;
      } else {
         byte[] var6 = var1.takeFile(var2, var3);
         Font var8;
         if (var6 == null) {
            var8 = null;
         } else {
            Font var7 = new Font(var6, class451.SpriteBuffer_xOffsets, class319.SpriteBuffer_yOffsets, class450.SpriteBuffer_spriteWidths, class477.SpriteBuffer_spriteHeights, class477.SpriteBuffer_spritePalette, class453.SpriteBuffer_pixels);
            class451.SpriteBuffer_xOffsets = null;
            class319.SpriteBuffer_yOffsets = null;
            class450.SpriteBuffer_spriteWidths = null;
            class477.SpriteBuffer_spriteHeights = null;
            class477.SpriteBuffer_spritePalette = null;
            class453.SpriteBuffer_pixels = null;
            var8 = var7;
         }

         return var8;
      }
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-5"
   )
   static final void method7164(int var0) {
      if (WorldMapManager.loadInterface(var0)) {
         MenuAction.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
      }
   }
}
