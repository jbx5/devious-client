import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vr")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("az")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ah")
	public static String field5389;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1504962715
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ao")
	@Export("message")
	String message;
	@ObfuscatedName("ab")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
