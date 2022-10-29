import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rx")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("a")
   @Export("RunException_applet")
   public static Applet RunException_applet;
   @ObfuscatedName("f")
   @Export("localPlayerName")
   public static String localPlayerName;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -281156187
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 202043855
   )
   public static int field5018;
   @ObfuscatedName("j")
   @Export("message")
   String message;
   @ObfuscatedName("y")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
