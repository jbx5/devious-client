import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1753740695
   )
   @Export("height")
   public int height = 1000;

   protected Renderable() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lha;",
      garbageValue = "-157507070"
   )
   @Export("getModel")
   protected Model getModel() {
      return null;
   }

   @ObfuscatedName("cq")
   @Export("draw")
   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.getModel();
      if (var11 != null) {
         this.height = var11.height;
         var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "3"
   )
   public static int method4454(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
