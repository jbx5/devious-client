import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Friend")
public class Friend extends Buddy {
   @ObfuscatedName("a")
   boolean field4472;
   @ObfuscatedName("f")
   boolean field4473;

   Friend() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lnp;I)I",
      garbageValue = "-1267649444"
   )
   @Export("compareToFriend")
   int compareToFriend(Friend var1) {
      if (super.world == Client.worldId && Client.worldId != var1.world) {
         return -1;
      } else if (Client.worldId == var1.world && super.world != Client.worldId) {
         return 1;
      } else if (super.world != 0 && var1.world == 0) {
         return -1;
      } else if (var1.world != 0 && super.world == 0) {
         return 1;
      } else if (this.field4472 && !var1.field4472) {
         return -1;
      } else if (!this.field4472 && var1.field4472) {
         return 1;
      } else if (this.field4473 && !var1.field4473) {
         return -1;
      } else if (!this.field4473 && var1.field4473) {
         return 1;
      } else {
         return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)I",
      garbageValue = "-1675254672"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareToFriend((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.compareToFriend((Friend)var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "-1139134966"
   )
   public static void method7303(AbstractArchive var0) {
      DbRowType.field4848 = var0;
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "34320253"
   )
   static final void method7293(int var0, int var1, int var2, int var3, int var4, int var5) {
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
         Rasterizer3D.method4233(var17, var18, var19);
         Rasterizer3D.method4220(var21, var22, var23, var17, var18, var19, var4);
         Rasterizer3D.method4233(var17, var19, var20);
         Rasterizer3D.method4220(var21, var23, var24, var17, var19, var20, var4);
      }
   }
}
