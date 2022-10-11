import java.applet.Applet;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class29 {
	@ObfuscatedName("c")
	static Applet field179;
	@ObfuscatedName("p")
	static String field172;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("gd")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("gj")
	static int[] field176;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static class393 field182;

	static {
		field179 = null; // L: 10
		field172 = ""; // L: 11
	}
}
