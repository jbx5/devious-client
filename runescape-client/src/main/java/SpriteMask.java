import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1325150283
   )
   @Export("width")
   public final int width;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -606386499
   )
   @Export("height")
   public final int height;
   @ObfuscatedName("ac")
   @Export("xWidths")
   public final int[] xWidths;
   @ObfuscatedName("ab")
   @Export("xStarts")
   public final int[] xStarts;

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.width = var1;
      this.height = var2;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-2050749327"
   )
   @Export("contains")
   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.xStarts.length) {
         int var3 = this.xStarts[var2];
         if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([Lnt;IB)Lnt;",
      garbageValue = "108"
   )
   @Export("findEnumerated")
   public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
      MouseWheel[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         MouseWheel var4 = var2[var3];
         if (var1 == var4.rsOrdinal()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1516793225"
   )
   public static void method5743() {
      ByteArrayPool.field4424.clear();
      ByteArrayPool.field4424.add(100);
      ByteArrayPool.field4424.add(5000);
      ByteArrayPool.field4424.add(10000);
      ByteArrayPool.field4424.add(30000);
   }
}
