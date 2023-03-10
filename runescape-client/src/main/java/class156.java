import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public abstract class class156 extends Node {
   class156() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2070491057"
   )
   abstract void vmethod3353(Buffer var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;B)V",
      garbageValue = "-82"
   )
   abstract void vmethod3354(ClanChannel var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "49"
   )
   static int method3300(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)Z",
      garbageValue = "24"
   )
   static final boolean method3298(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ViewportMouse.ViewportMouse_y + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ViewportMouse.ViewportMouse_y - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = ViewportMouse.ViewportMouse_x + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = ViewportMouse.ViewportMouse_x - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }
}
