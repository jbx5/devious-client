import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   @Export("clientLanguage")
   static Language clientLanguage;

   TriBool() {
   }
}
