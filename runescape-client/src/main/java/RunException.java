import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rw")
@Implements("RunException")
public class RunException extends RuntimeException {
   @ObfuscatedName("e")
   @Export("localPlayerName")
   public static String localPlayerName;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1972222199
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 164996615
   )
   public static int field5065;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1618152889
   )
   @Export("clientType")
   public static int clientType;
   @ObfuscatedName("q")
   @Export("message")
   String message;
   @ObfuscatedName("f")
   @Export("throwable")
   Throwable throwable;

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
