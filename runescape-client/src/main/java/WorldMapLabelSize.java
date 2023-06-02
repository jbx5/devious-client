import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   @Export("WorldMapLabelSize_small")
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   @Export("WorldMapLabelSize_medium")
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   @Export("WorldMapLabelSize_large")
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
   @ObfuscatedName("jo")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 976233299
   )
   final int field2861;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1012793205
   )
   final int field2868;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1283115681
   )
   final int field2865;

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.field2861 = var1;
      this.field2868 = var2;
      this.field2865 = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(FB)Z",
      garbageValue = "89"
   )
   boolean method5061(float var1) {
      return var1 >= (float)this.field2865;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lhy;",
      garbageValue = "272884166"
   )
   @Export("SequenceDefinition_get")
   public static SequenceDefinition SequenceDefinition_get(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
         var1 = new SequenceDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-1040672320"
   )
   @Export("drawScrollBar")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
      class411.scrollBarSprites[0].drawAt(var0, var1);
      class411.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field582);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field799);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field799);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field799);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field799);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field584);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field584);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field584);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field584);
   }
}
