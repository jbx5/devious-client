import java.applet.Applet;
import netscape.javascript.JSObject;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("af")
public class class27 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", garbageValue = "-1785455673")
    public static void method394(Applet var0, String var1) throws Throwable {
        JSObject.getWindow(var0).eval(var1);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", garbageValue = "1316092385")
    public static Object method395(Applet var0, String var1) throws Throwable {
        return JSObject.getWindow(var0).call(var1, ((Object[]) (null)));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;", garbageValue = "72")
    public static Object method396(Applet var0, String var1, Object[] var2) throws Throwable {
        return JSObject.getWindow(var0).call(var1, var2);
    }
}