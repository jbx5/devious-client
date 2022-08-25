import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
@ObfuscatedName("aq")
public class class27 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", garbageValue = "1010358196")
	public static Object method384(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, ((Object[]) (null)));
	}
}