import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
   @ObfuscatedName("c")
   @Export("pixels")
   public int[] pixels;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 552635229
   )
   @Export("width")
   public int width;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2090636631
   )
   @Export("height")
   public int height;

   protected AbstractRasterProvider() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "-12424"
   )
   @Export("drawFull")
   public abstract void drawFull(int var1, int var2);

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-918954081"
   )
   @Export("draw")
   public abstract void draw(int var1, int var2, int var3, int var4);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "31"
   )
   @Export("apply")
   public final void apply() {
      Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
   }
}
