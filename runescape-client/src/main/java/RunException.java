import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vp")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("am")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ap")
	public static String field5335;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1787554485
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ar")
	@Export("message")
	String message;
	@ObfuscatedName("ag")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
