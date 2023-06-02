import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ud")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("at")
   @Export("RunException_applet")
   public static Applet RunException_applet;
   @ObfuscatedName("an")
   public static String field5176;
   @ObfuscatedName("ap")
   @Export("message")
   String message;
   @ObfuscatedName("ab")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
