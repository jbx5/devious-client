import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();

   TriBool() {
   }
}
