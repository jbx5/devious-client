import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uy")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("au")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ae")
	public static String field5263;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -671342643
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1869469455
	)
	public static int field5266;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -522148493
	)
	public static int field5267;
	@ObfuscatedName("jy")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ai")
	@Export("message")
	String message;
	@ObfuscatedName("az")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
