import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sf")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("f")
   @Export("RunException_applet")
   public static Applet RunException_applet;
   @ObfuscatedName("w")
   @Export("localPlayerName")
   public static String localPlayerName;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 813753537
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 278843331
   )
   public static int field5089;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -664913567
   )
   @Export("clientType")
   public static int clientType;
   @ObfuscatedName("j")
   @Export("message")
   String message;
   @ObfuscatedName("i")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
