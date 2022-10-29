import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("ItemDefinition_archive")
   public static AbstractArchive ItemDefinition_archive;
   @ObfuscatedName("fz")
   static String field3386;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -675535187
   )
   @Export("width")
   public final int width;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1355858271
   )
   @Export("height")
   public final int height;
   @ObfuscatedName("c")
   @Export("xWidths")
   public final int[] xWidths;
   @ObfuscatedName("x")
   @Export("xStarts")
   public final int[] xStarts;

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.width = var1;
      this.height = var2;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1742087999"
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
}
