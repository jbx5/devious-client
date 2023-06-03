import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bs")
public class class26 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
      garbageValue = "645796695"
   )
   public static Object method378(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }
}
