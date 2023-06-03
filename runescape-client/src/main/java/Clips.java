import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Clips")
public class Clips {
   @ObfuscatedName("at")
   boolean field2798 = false;
   @ObfuscatedName("an")
   public boolean field2805 = true;
   @ObfuscatedName("av")
   int field2793 = 0;
   @ObfuscatedName("ap")
   public int field2796 = 512;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   @Export("Rasterizer3D_textureLoader")
   public TextureLoader Rasterizer3D_textureLoader;
   @ObfuscatedName("aj")
   int field2803;
   @ObfuscatedName("ad")
   int field2804;
   @ObfuscatedName("ac")
   int field2800;
   @ObfuscatedName("ag")
   int field2806;
   @ObfuscatedName("ar")
   @Export("clipNegativeMidX")
   int clipNegativeMidX;
   @ObfuscatedName("ah")
   int field2808;
   @ObfuscatedName("az")
   @Export("clipNegativeMidY")
   int clipNegativeMidY;
   @ObfuscatedName("au")
   int field2810;
   @ObfuscatedName("ai")
   @Export("Rasterizer3D_rowOffsets")
   int[] Rasterizer3D_rowOffsets = new int[1024];

   Clips() {
   }

   @ObfuscatedName("at")
   void method4956() {
      this.field2803 = this.field2800 / 2;
      this.field2804 = this.field2806 / 2;
      this.clipNegativeMidX = -this.field2803;
      this.field2808 = this.field2800 - this.field2803;
      this.clipNegativeMidY = -this.field2804;
      this.field2810 = this.field2806 - this.field2804;
   }

   @ObfuscatedName("an")
   void method4957(int var1, int var2, int var3, int var4) {
      this.field2803 = var1 - var2;
      this.field2804 = var3 - var4;
      this.clipNegativeMidX = -this.field2803;
      this.field2808 = this.field2800 - this.field2803;
      this.clipNegativeMidY = -this.field2804;
      this.field2810 = this.field2806 - this.field2804;
   }

   @ObfuscatedName("av")
   void method4955(int var1, int var2, int var3) {
      this.field2798 = var1 < 0 || var1 > this.field2800 || var2 < 0 || var2 > this.field2800 || var3 < 0 || var3 > this.field2800;
   }
}
