import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qw")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("s")
	@Export("RunException_applet")
	public static Applet RunException_applet;

	@ObfuscatedName("h")
	@Export("localPlayerName")
	public static String localPlayerName;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1126443877)
	@Export("RunException_revision")
	public static int RunException_revision;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1917074983)
	public static int field4847;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1784255921)
	@Export("clientType")
	public static int clientType;

	@ObfuscatedName("q")
	@Export("message")
	String message;

	@ObfuscatedName("i")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}