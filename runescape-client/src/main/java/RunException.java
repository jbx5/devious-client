import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rr")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("c")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("p")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2052977205
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("w")
	@Export("message")
	String message;
	@ObfuscatedName("s")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 28
		this.throwable = var1; // L: 29
	} // L: 30
}
