import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vt")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("aq")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aw")
	public static String field5364;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1495779527
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1088946003
	)
	public static int field5366;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -356540177
	)
	public static int field5367;
	@ObfuscatedName("as")
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
