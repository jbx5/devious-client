import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ve")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("al")
	public static String field5296;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2014456727
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 137315333
	)
	public static int field5294;
	@ObfuscatedName("ah")
	@Export("message")
	String message;
	@ObfuscatedName("ar")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
