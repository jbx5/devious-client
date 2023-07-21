import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bd")
public class class26 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-2105892284"
	)
	public static void method381(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-865413810"
	)
	public static Object method383(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}
