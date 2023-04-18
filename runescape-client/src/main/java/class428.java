import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public enum class428 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   field4692(1, 1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   field4694(2, 2),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   field4693(0, 3),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   field4691(3, 10);

   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1750512657
   )
   final int field4695;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 2023077401
   )
   final int field4696;

   class428(int var3, int var4) {
      this.field4695 = var3;
      this.field4696 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4696;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lit;IIIIB)Z",
      garbageValue = "11"
   )
   static final boolean method8278(Model var0, int var1, int var2, int var3, int var4) {
      boolean var5 = ViewportMouse.ViewportMouse_isInViewport;
      if (!var5) {
         return false;
      } else {
         class122.method3045();
         AABB var6 = (AABB)var0.aabb.get(var1);
         int var7 = var2 + var6.xMid;
         int var8 = var3 + var6.yMid;
         int var9 = var4 + var6.zMid;
         int var10 = var6.xMidOffset;
         int var11 = var6.yMidOffset;
         int var12 = var6.zMidOffset;
         int var13 = ViewportMouse.field2767 - var7;
         int var14 = class294.field3366 - var8;
         int var15 = ViewportMouse.field2768 - var9;
         if (Math.abs(var13) > var10 + EnumComposition.field1979) {
            return false;
         } else if (Math.abs(var14) > var11 + ViewportMouse.field2771) {
            return false;
         } else if (Math.abs(var15) > var12 + class9.field44) {
            return false;
         } else if (Math.abs(var15 * UserComparator8.field1418 - var14 * ReflectionCheck.field268) > var11 * class9.field44 + var12 * ViewportMouse.field2771) {
            return false;
         } else if (Math.abs(var13 * ReflectionCheck.field268 - var15 * ViewportMouse.field2769) > var12 * EnumComposition.field1979 + var10 * class9.field44) {
            return false;
         } else {
            return Math.abs(var14 * ViewportMouse.field2769 - var13 * UserComparator8.field1418) <= var11 * EnumComposition.field1979 + var10 * ViewportMouse.field2771;
         }
      }
   }
}
