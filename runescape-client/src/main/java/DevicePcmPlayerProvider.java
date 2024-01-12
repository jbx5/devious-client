import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ax")
	public static short[][] field113;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lbb;",
		garbageValue = "2032414365"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}
}
