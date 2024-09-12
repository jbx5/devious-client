import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wc")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ac")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -541487827
	)
	public static int field5583;
	@ObfuscatedName("aq")
	@Export("message")
	String message;
	@ObfuscatedName("af")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
