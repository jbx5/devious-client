import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
@ObfuscatedName("le")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("p")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive")
	public Archive archive;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -196698659)
	@Export("crc")
	public int crc;

	@ObfuscatedName("q")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Ljava/security/SecureRandom;", garbageValue = "-1298247103")
	static SecureRandom method5843() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}