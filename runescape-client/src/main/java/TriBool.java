import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 1640118701
   )
   static int field4600;

   TriBool() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   public static int method7974(int var0) {
      return class439.field4719[var0 & 16383];
   }
}
