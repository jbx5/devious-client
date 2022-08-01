import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
@ObfuscatedName("ar")
public class class27 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", garbageValue = "60124345")
	public static Object method378(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, ((Object[]) (null)));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = "-72971473")
	public static Object method379(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}