import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uf")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("aw")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ay")
	public static String field5234;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 731925397
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1353695173
	)
	public static int field5235;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 95742107
	)
	public static int field5236;
	@ObfuscatedName("aj")
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
