import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class343 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnn;"
   )
   static final class343 field3838 = new class343(51, 27, 800, 0, 16, 16);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnn;"
   )
   static final class343 field3837 = new class343(25, 28, 800, 656, 40, 40);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 423459241
   )
   final int field3836;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1829805797
   )
   final int field3839;

   class343(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3836 = var5;
      this.field3839 = var6;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-19"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var2 = new VarbitComposition();
         if (var3 != null) {
            var2.decode(new Buffer(var3));
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
         var1 = var2;
      }

      int var7 = var1.baseVar;
      int var4 = var1.startBit;
      int var5 = var1.endBit;
      int var6 = Varps.Varps_masks[var5 - var4];
      return Varps.Varps_main[var7] >> var4 & var6;
   }
}
