import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
   @ObfuscatedName("aw")
   @Export("pixels")
   public int[] pixels;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1313069155
   )
   @Export("width")
   public int width;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1695726685
   )
   @Export("height")
   public int height;
   @ObfuscatedName("ab")
   protected float[] field5071;

   protected AbstractRasterProvider() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-893520439"
   )
   @Export("drawFull")
   public abstract void drawFull(int var1, int var2);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "868804024"
   )
   @Export("draw")
   public abstract void draw(int var1, int var2, int var3, int var4);

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("apply")
   public final void apply() {
      Rasterizer2D.method9384(this.pixels, this.width, this.height, this.field5071);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1022741876"
   )
   public final void method9458(boolean var1) {
      this.field5071 = var1 ? new float[this.height * this.width + 1] : null;
   }
}
