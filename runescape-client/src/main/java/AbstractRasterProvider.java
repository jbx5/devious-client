import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
   @ObfuscatedName("av")
   @Export("pixels")
   public int[] pixels;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1177182169
   )
   @Export("width")
   public int width;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1088746481
   )
   @Export("height")
   public int height;
   @ObfuscatedName("ap")
   protected float[] field5095;

   protected AbstractRasterProvider() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "500"
   )
   @Export("drawFull")
   public abstract void drawFull(int var1, int var2);

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-494525788"
   )
   @Export("draw")
   public abstract void draw(int var1, int var2, int var3, int var4);

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1370361703"
   )
   @Export("apply")
   public final void apply() {
      Rasterizer2D.method9246(this.pixels, this.width, this.height, this.field5095);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1054168130"
   )
   public final void method9342(boolean var1) {
      this.field5095 = var1 ? new float[this.width * this.height + 1] : null;
   }
}
