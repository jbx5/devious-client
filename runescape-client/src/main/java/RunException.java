import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tr")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("an")
   public static String field5158;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 2027530319
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -891448341
   )
   @Export("clientType")
   public static int clientType;
   @ObfuscatedName("ab")
   @Export("message")
   String message;
   @ObfuscatedName("aq")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
