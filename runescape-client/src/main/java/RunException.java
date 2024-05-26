import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vb")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ak")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1257272621
	)
	public static int field5495;
	@ObfuscatedName("aa")
	@Export("message")
	String message;
	@ObfuscatedName("at")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
