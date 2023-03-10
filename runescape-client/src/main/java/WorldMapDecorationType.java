import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3721(0, 0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3710(1, 0),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3711(2, 0),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3729(3, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3713(9, 2),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3714(4, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3715(5, 1),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3716(6, 1),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3717(7, 1),
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3718(8, 1),
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3719(12, 2),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3720(13, 2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3726(14, 2),
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3732(15, 2),
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3723(16, 2),
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3722(17, 2),
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3725(18, 2),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3728(19, 2),
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3727(20, 2),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3712(21, 2),
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3709(10, 2),
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3724(11, 2),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3731(22, 3);

   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -964842831
   )
   @Export("id")
   public final int id;

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   WorldMapDecorationType(int var3, int var4) {
      this.id = var3;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1699192816"
   )
   @Export("Widget_unpackTargetMask")
   public static int Widget_unpackTargetMask(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1370492228"
   )
   @Export("getTileHeight")
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
         int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
         return var8 * (128 - var7) + var9 * var7 >> 7;
      } else {
         return 0;
      }
   }
}
