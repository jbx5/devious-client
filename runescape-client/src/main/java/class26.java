import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bm")
public class class26 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;S)V",
      garbageValue = "18354"
   )
   public static void method381(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
      garbageValue = "-2121620128"
   )
   public static Object method374(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-413765385"
   )
   public static Object method377(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }
}
