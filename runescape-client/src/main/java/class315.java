import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class315 {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -1512224128
	)
	static int field3269;

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static final String method6164(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return HttpAuthenticationHeader.colorStartTag(16711680);
		} else if (var2 < -6) {
			return HttpAuthenticationHeader.colorStartTag(16723968);
		} else if (var2 < -3) {
			return HttpAuthenticationHeader.colorStartTag(16740352);
		} else if (var2 < 0) {
			return HttpAuthenticationHeader.colorStartTag(16756736);
		} else if (var2 > 9) {
			return HttpAuthenticationHeader.colorStartTag(65280);
		} else if (var2 > 6) {
			return HttpAuthenticationHeader.colorStartTag(4259584);
		} else if (var2 > 3) {
			return HttpAuthenticationHeader.colorStartTag(8453888);
		} else {
			return var2 > 0 ? HttpAuthenticationHeader.colorStartTag(12648192) : HttpAuthenticationHeader.colorStartTag(16776960);
		}
	}
}
