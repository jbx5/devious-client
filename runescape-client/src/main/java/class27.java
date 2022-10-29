import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("an")
public class class27 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
      garbageValue = "-15059834"
   )
   public static Object method398(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "1484271480"
   )
   public static Object method402(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }
}
