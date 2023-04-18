import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = 1550732737
   )
   @Export("height")
   public int height = 1000;

   protected Renderable() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "-112"
   )
   @Export("getModel")
   protected Model getModel() {
      return null;
   }

   @ObfuscatedName("df")
   @Export("draw")
   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.getModel();
      if (var11 != null) {
         this.height = var11.height;
         var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-407537410"
   )
   static void method4701() {
      class186.Tiles_underlays = null;
      Tiles.Tiles_overlays = null;
      Tiles.Tiles_shapes = null;
      Tiles.field999 = null;
      class161.field1782 = null;
      Tiles.Tiles_underlays2 = null;
      Tiles.field996 = null;
      FileSystem.Tiles_hue = null;
      Tiles.Tiles_saturation = null;
      class283.Tiles_lightness = null;
      UserComparator4.Tiles_hueMultiplier = null;
      class31.field176 = null;
   }
}
