import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("Strings")
public class Strings {
   @ObfuscatedName("fm")
   public static String field4010 = "Please visit the support page for assistance.";
   @ObfuscatedName("ke")
   public static String field4052 = "";
   @ObfuscatedName("kp")
   public static String field4128 = "Page has opened in the browser.";
   @ObfuscatedName("kk")
   public static String field4146 = "";

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-21"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
