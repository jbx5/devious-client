import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class358 {
	@ObfuscatedName("lf")
	@ObfuscatedSignature(descriptor = 
	"(Lky;II)Ljava/lang/String;", garbageValue = 
	"-707928815")

	static String method6583(Widget var0, int var1) {
		int var3 = class326.getWidgetFlags(var0);
		boolean var2 = ((var3 >> (var1 + 1)) & 1) != 0;
		if ((!var2) && (var0.onOp == null)) {
			return null;
		} else {
			return (((var0.actions != null) && (var0.actions.length > var1)) && (var0.actions[var1] != null)) && (var0.actions[var1].trim().length() != 0) ? var0.actions[var1] : null;
		}
	}
}