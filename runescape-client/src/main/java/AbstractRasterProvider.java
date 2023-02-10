import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
   @ObfuscatedName("v")
   @Export("pixels")
   public int[] pixels;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1648940081
   )
   @Export("width")
   public int width;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1724467553
   )
   @Export("height")
   public int height;

   protected AbstractRasterProvider() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "44"
   )
   @Export("drawFull")
   public abstract void drawFull(int var1, int var2);

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-68"
   )
   @Export("draw")
   public abstract void draw(int var1, int var2, int var3, int var4);

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1710471348"
   )
   @Export("apply")
   public final void apply() {
      Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
   }
}
