import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tw")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("aj")
   @Export("RunException_applet")
   public static Applet RunException_applet;
   @ObfuscatedName("al")
   @Export("localPlayerName")
   public static String localPlayerName;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1650862235
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("ao")
   @Export("message")
   String message;
   @ObfuscatedName("av")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
