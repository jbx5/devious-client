import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();

   TriBool() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-470729212"
   )
   public static void method7466(int var0, int var1) {
      VarbitComposition var2 = class453.method8258(var0);
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
