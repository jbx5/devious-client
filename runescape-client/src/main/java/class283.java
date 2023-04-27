import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class283 {
   @ObfuscatedName("ao")
   @Export("Tiles_lightness")
   static int[] Tiles_lightness;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsw;I)I",
      garbageValue = "-740837934"
   )
   static final int method5686(LoginType var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch (var0.field4915) {
            case 5:
               return 20;
            default:
               return 12;
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1369065577"
   )
   public static void method5685(int var0, int var1) {
      VarbitComposition var2 = class158.method3409(var0);
      int var3 = var2.baseVar;
      int var4 = var2.startBit;
      int var5 = var2.endBit;
      int var6 = Varps.Varps_masks[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
   }
}
