import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class26 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "-40"
	)
	public static void method358(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}
}
