import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wo")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 262317285
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1692865455
	)
	public static int field5551;
	@ObfuscatedName("ao")
	@Export("message")
	String message;
	@ObfuscatedName("am")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
