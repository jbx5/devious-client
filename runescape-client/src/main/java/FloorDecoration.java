import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1777058639
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 487195023
   )
   @Export("x")
   int x;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1480835961
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = 3423223696102332293L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1486089441
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "769773533"
   )
   static final int method4398(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIFFFIIIIIIIIIIIIIB)V",
      garbageValue = "12"
   )
   static void method4399(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      Rasterizer3D.field2519.vmethod4954(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(Ldv;III)V",
      garbageValue = "-1059867527"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = ItemContainer.SequenceDefinition_get(var1).field2314;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1184 = 0;
         }

         if (var3 == 2) {
            var0.field1184 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || ItemContainer.SequenceDefinition_get(var1).field2293 >= ItemContainer.SequenceDefinition_get(var0.sequence).field2293) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field1184 = 0;
         var0.field1210 = var0.pathLength;
      }

   }
}
