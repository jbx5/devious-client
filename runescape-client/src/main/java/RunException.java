import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vf")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ad")
	public static String field5518;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -176146183
	)
	public static int field5517;
	@ObfuscatedName("an")
	@Export("message")
	String message;
	@ObfuscatedName("aj")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
