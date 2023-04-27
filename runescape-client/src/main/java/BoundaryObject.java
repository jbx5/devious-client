import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1061912079
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1998748175
   )
   @Export("x")
   int x;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1171883603
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -137992079
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 379413203
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = -4009183385476919801L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 347144389
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIFFFIIII)V",
      garbageValue = "-428480375"
   )
   static void method5010(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      Rasterizer3D.field2519.vmethod4970(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }
}
