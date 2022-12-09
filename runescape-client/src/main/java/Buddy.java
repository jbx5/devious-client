import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("Buddy")
public class Buddy extends User {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1767210019
   )
   @Export("world")
   public int world = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1595280059
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -894638573
   )
   @Export("rank")
   public int rank;

   Buddy() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-87975301"
   )
   @Export("set")
   void set(int var1, int var2) {
      this.world = var1;
      this.int2 = var2;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1755298116"
   )
   @Export("getWorld")
   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1364221450"
   )
   @Export("hasWorld")
   public boolean hasWorld() {
      return this.world > 0;
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1992575835"
   )
   static final void method7626(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0 ? var6 : -var6;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8;
      if (var8 < var9) {
         var10 = var9;
      }

      if (var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if (var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
         var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var15 + var7 + var1;
         Rasterizer3D.method4321(var17, var18, var19);
         Rasterizer3D.method4326(var21, var22, var23, var17, var18, var19, var4);
         Rasterizer3D.method4321(var17, var19, var20);
         Rasterizer3D.method4326(var21, var23, var24, var17, var19, var20, var4);
      }
   }
}
