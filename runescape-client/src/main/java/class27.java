import java.applet.Applet;


import netscape.javascript.JSObject; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class27 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/applet/Applet;Ljava/lang/String;I)V", garbageValue = 
	"-1181474421")

	public static void method416(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = 
	"1991172823")

	public static Object method412(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}