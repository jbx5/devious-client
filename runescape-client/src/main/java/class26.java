import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bu")
public class class26 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "124"
	)
	public static void method357(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}
}
