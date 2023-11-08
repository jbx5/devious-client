import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vf")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("at")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1219120229
	)
	public static int field5301;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -992143871
	)
	public static int field5299;
	@ObfuscatedName("au")
	@Export("message")
	String message;
	@ObfuscatedName("aa")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
