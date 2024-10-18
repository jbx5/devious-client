import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wa")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ap")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -797410619
	)
	public static int field5636;
	@ObfuscatedName("ay")
	@Export("message")
	String message;
	@ObfuscatedName("as")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
